/**
 * 
 */
package com.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.testCases.RestAPITests;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

/**
 * @author 3789246
 *
 */
public class Utilities {

	//Getting property values corresponding to key
	public static String getProp(String key) throws FileNotFoundException, IOException
	{
		Properties pro=new Properties();
		pro.load(new FileInputStream("./TestCasesRepository.properties"));
		return pro.getProperty(key);
	}

	//Setting values in property
	public static void setProp(String key,String value) throws FileNotFoundException, IOException
	{
		Properties pro=new Properties();
		pro.load(new FileInputStream("./TestCasesRepository.properties"));
		pro.setProperty(key, value);
	}

	//Getting entire test data from excel
	public static Map<String,List<String>> testDatafromExcel(String sheetName) throws FileNotFoundException, IOException
	{
		DataFormatter formatter = new DataFormatter();
		Map<String,List<String>> testData=new LinkedHashMap<String,List<String>>();
		XSSFWorkbook wb= new XSSFWorkbook(new FileInputStream(Utilities.getProp("filepath")));
		XSSFSheet sh = wb.getSheet(sheetName);

		//Getting data starting from rowNumber 1 till the last row 
		for(int rowNumber=1;rowNumber<=sh.getLastRowNum();rowNumber++)
		{
			List rowTestRecord=new ArrayList();
			for(int columnNumber=0;columnNumber<=sh.getRow(rowNumber).getLastCellNum()-1;columnNumber++)
			{
				if(columnNumber==2||columnNumber==3||columnNumber==4||columnNumber==5)
					continue;
				else
					rowTestRecord.add(formatter.formatCellValue(sh.getRow(rowNumber).getCell(columnNumber)));
			}
			testData.put("Row"+rowNumber, rowTestRecord);	
		}
		wb.close();
		return testData;
	}

	//Writing results into excel
	public static void resultsIntoExcel(Response actualResponse,int rowNumber,String sheetName) throws IOException
	{
		Workbook wb=null;
		String responseAsString=actualResponse.asString();
		String transactionID=null;
		try 
		{
			FileInputStream fis=new FileInputStream(Utilities.getProp("filepath"));
			wb=WorkbookFactory.create(fis);		
			Sheet sh = wb.getSheet(sheetName);		
			Cell c1=sh.getRow(rowNumber).createCell(3);
			if(actualResponse.getStatusCode()==200)
				c1.setCellValue("status 200");
			else if(actualResponse.getStatusCode()==201)
				c1.setCellValue("status 201");
			else if(actualResponse.getStatusCode()==403)
				c1.setCellValue("status 403");
			else if(actualResponse.getStatusCode()==400)
				c1.setCellValue("status 400");
			else if(actualResponse.getStatusCode()==400)
				c1.setCellValue("status 401");
			else if(actualResponse.getStatusCode()==503)
				c1.setCellValue("status 503");
			else if(actualResponse.getStatusCode()==500)
				c1.setCellValue("status 500");
			else
			{
				c1.setCellValue(responseAsString);
			
				int beginIndex=responseAsString.indexOf("transactionId");
				int endIndex=responseAsString.indexOf("transactionId");
				transactionID=responseAsString.substring(beginIndex,endIndex);
				
				String expectedColumn=sh.getRow(rowNumber).getCell(4).getStringCellValue();
				String updatedColumnValue=expectedColumn.replace(expectedColumn.substring(beginIndex,endIndex),transactionID);
				Cell expectedResult=sh.getRow(rowNumber).createCell(4);
				expectedResult.setCellValue(updatedColumnValue);
			}
			
			Cell c2=sh.getRow(rowNumber).createCell(5);
			if(sh.getRow(rowNumber).getCell(4).getStringCellValue().equals(sh.getRow(rowNumber).getCell(3).getStringCellValue()))
				c2.setCellValue("Pass");
			else
				c2.setCellValue("Fail");
			fis.close();
			FileOutputStream fout=new FileOutputStream(Utilities.getProp("filepath"));
			wb.write(fout);
			fout.close();
		} 
		catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			wb.close();
		}
	}

	//Getting request specifications using spec
	public static RequestSpecification payloadInitialSetup()
	{
		return new RequestSpecBuilder().
				addHeaders(RestAPITests.tokenAndCookie).
				addHeader("Content-Type","application/json").build();
	}

}
