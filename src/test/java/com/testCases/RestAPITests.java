package com.testCases;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utilities.PayloadFields;
import com.utilities.RequestPayloads;
import com.utilities.Utilities;

//import com.utilities.PayLoad;
//import com.utilities.RequestPayloads;
//import com.utilities.Utilities;
//import com.utilities.Utility;

import io.restassured.RestAssured;
import io.restassured.http.Cookie;
import io.restassured.response.Response;

public class RestAPITests {
	
//	ExtentHtmlReporter htmlReporter;
//	ExtentReports extent;
//	ExtentTest test;
	
	public static Map<String,String> tokenAndCookie= new HashMap<String,String>();
	
	@BeforeTest
	public void loginAndAuthentication() throws FileNotFoundException, IOException
	{
		// start reporters
//		  htmlReporter = new ExtentHtmlReporter("extent.html");
//		 // create ExtentReports and attach reporter(s)
//		 extent = new ExtentReports();
//		 extent.attachReporter(htmlReporter);
//		 test = extent.createTest("RestAPITests", "Sample description");
		 
//		 Reporter.log("Test Execution Started.", true);
		 
		RestAssured.baseURI=Utilities.getProp("EnvBaseUrl");
		Response auth=given().
					queryParam("grant_type","client_credentials").
					queryParam("client_id","l7xxbdfc90d4877545f482048498a2c5ec4e").
					queryParam("client_secret","8166a073a6e64506b6fd7c6f57e47bea").
					queryParam("scope","oob").
					when(). 
					post(Utilities.getProp("authResource")).then().log().all().extract().response();
		String token="Bearer "+auth.jsonPath().getString("access_token");
		tokenAndCookie.put("Authorization",token);

		Response login=given().
					header("Authorization",token).
					header("Content-Type","application/json").
					body(RequestPayloads.Login()).
					when().
					post(Utilities.getProp("loginResource")).then().log().all().extract().response();
		Cookie ck1=login.getDetailedCookie("FXOSESSIONID");
		Cookie ck2=login.getDetailedCookie("FXOLBSESSIONID");
		String cookie=ck1.toString().substring(0,ck1.toString().indexOf(";"))+";"+ck2.toString().substring(0,ck2.toString().indexOf(";"));
		tokenAndCookie.put("Cookie",cookie);
	}
	
	@Test(enabled=true, priority=1, description="Running testcases from excel")
	public void API_dataDriven()	
	{
		//test = extent.createTest("MyFirstTest", "Sample description");
		
		try{
				for(Map.Entry mapEntry:Utilities.testDatafromExcel(Utilities.getProp("SheetName")).entrySet())
				{
					if(PayloadFields.getExecutionStatus(mapEntry).contains("Y"))
				{
					RestAssured.baseURI=PayloadFields.getBaseURL(mapEntry);	
					Response actualResponse=null;
					if(PayloadFields.getServiceName(mapEntry).contains("Rate"))
				{
						// log
					//	test.pass("Custom Doc. Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Rate(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();					
					// log
				//	test.pass("Rate Test Cases execution has been completed Successfully.");
					
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("Delivery"))
					{
						// log
				//		test.pass("Delivery Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Delivery(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("OrderSubmit_FedEXAC"))
					{
						// log
					//	test.pass("OrderSubmit using FedEX A/C Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.OrderSubmit_FedEXAC(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					
					else if(PayloadFields.getServiceName(mapEntry).contains("CustomDoc"))
					{
						// log
					//	test.pass("Custom Doc. Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.CustomDoc(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					
					else if(PayloadFields.getServiceName(mapEntry).contains("Delivery_PricableFlag_True"))
					{
						// log
					//	test.pass("Delivery_Pricable_Flag_True Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Delivery_PricableFlag_True(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					
					else if(PayloadFields.getServiceName(mapEntry).contains("Delivery_PricableFlag_False"))
					{
						// log
					//	test.pass("Delivery_Pricable_Flag_False Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Delivery_PricableFlag_False(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("Order_PricableFlag_True"))
					{
						// log
					//	test.pass("Order_Pricable_Flag_True Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Order_PricableFlag_True(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("Order_PricableFlag_False"))
					{
						// log
					//	test.pass("Order_Pricable_Flage_False Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Order_PricableFlag_False(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("Rate_PricableFlag_True"))
					{
						// log
					//	test.pass("Rate pricable_Flag_True Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Rate_PricableFlag_True(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("Rate_PricableFlag_False"))
					{
						// log
					//	test.pass("Rate_Pricable_Flag_False Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Rate_PricableFlag_False(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("Order_Shipping_Reference"))
					{
						// log
					//	test.pass("OrderShipping_Reference Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Order_Shipping_Reference(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("OrderSubmit_Using_CC"))
					{
						// log
					//	test.pass("OrderSubmit_Using_CC Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.OrderSubmit_Using_CC(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("OrderSubmit_PickUP"))
						{
							// log
						//	test.pass("Order_PickUP Test Cases execution has been started Successfully.");
						actualResponse=given().
									spec(Utilities.payloadInitialSetup()).
									body(RequestPayloads.OrderSubmit_PickUP(mapEntry)).
									when().
									post(PayloadFields.getResorce(mapEntry)).
									then().log().all().
									extract().response();
						}
					else if(PayloadFields.getServiceName(mapEntry).contains("Rate_Order_Shipment_Delivery"))
					{
						// log
					//	test.pass("Order_PickUP Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Rate_Order_Shipment_Delivery(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("RateOrder_without_Recipient"))
					{
						// log
					//	test.pass("Order_PickUP Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.RateOrder_without_Recipient(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("Rate_Coupon_Code"))
					{
						// log
					//	test.pass("Order_PickUP Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.Rate_Coupon_Code(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("OrderSubmit_CouponCode"))
					{
						// log
					//	test.pass("Order_PickUP Test Cases execution has been started Successfully.");
					actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.OrderSubmit_CouponCode(mapEntry)).
								when().
								post(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					// Get Request type
					else if(PayloadFields.getServiceName(mapEntry).contains("PreferencesAPI"))
					{ 
						actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								when().
								get(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("CatalogAPI_With_Site"))
					{ 
						actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								when().
								get(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}			
					else if(PayloadFields.getServiceName(mapEntry).contains("SiteDetails"))
					{ 
						actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								when().
								get(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("billingFieldsWithRegEX"))
					{ 
						actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.billingFieldsWithRegEX(mapEntry)).
								when().
								put(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("billingFieldsWithOutRegEX"))
					{ 
						actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.billingFieldsWithOutRegEX(mapEntry)).
								when().
								put(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					else if(PayloadFields.getServiceName(mapEntry).contains("CreditCardOptions"))
					{ 
						actualResponse=given().
								spec(Utilities.payloadInitialSetup()).
								body(RequestPayloads.CreditCardOptions(mapEntry)).
								when().
								put(PayloadFields.getResorce(mapEntry)).
								then().log().all().
								extract().response();
					}
					
					int rowNum=Integer.parseInt(mapEntry.getKey().toString().substring(mapEntry.getKey().toString().indexOf("w")+1));
					Utilities.resultsIntoExcel(actualResponse, rowNum,Utilities.getProp("SheetName"));					
					}
				}
			} 
		catch(Exception e)
			{
				e.printStackTrace();
			} 			
	}
	

	
	@AfterMethod
	public void tearDown(ITestResult result){
		
		if(result.getStatus()==ITestResult.FAILURE) {
	//	test.log(Status.FAIL, result.getThrowable());
	 }
		
		else if(result.getStatus()==ITestResult.SUCCESS) {
		//	test.log(Status.PASS, result.getName()+ " is pass.");
		 }
		
		else if(result.getStatus()==ITestResult.SKIP) {
		//	test.log(Status.PASS, result.getThrowable());
		 }
	
		
     //   extent.flush();
		       
        Reporter.log("Test Completed >>> Report generated.", true);
	}
//	@Test(enabled=false, description="Running testcases from excel")
//	public void dataDrivenTestUpdated1()
//	{
//		try{
//				for(Map.Entry mapEntry:Utilities.testDatafromExcel(Utilities.getProp("SheetName")).entrySet())
//				{
//					if(PayloadFields.getExecutionStatus(mapEntry).contains("Y"))
//					{
//					RestAssured.baseURI=PayloadFields.getBaseURL(mapEntry);					
//					Response actualResponse=given().
//								spec(Utilities.payloadInitialSetup()).
//								body(RequestPayloads.Rate(mapEntry)).
//								when().
//								post(PayloadFields.getResorce(mapEntry)).
//								then().log().all().
//								extract().response();
//					
//					int rowNum=Integer.parseInt(mapEntry.getKey().toString().substring(mapEntry.getKey().toString().indexOf("w")+1));
//					Utilities.resultsIntoExcel(actualResponse, rowNum,Utilities.getProp("SheetName"));					
//					}
//				}
//			} 
//		catch(Exception e)
//			{
//				e.printStackTrace();
//			} 
//	}
	
}
