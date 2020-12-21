/**
 * 
 */
package com.utilities;

import java.util.Map;

/**
 * @author 3789246
 *
 */
public class PayloadFields {
	
		//Splitting Map to obtain test data
		public static String[] splitMapData(Map.Entry mapEntry)
		{
			String[] testDataFromExcel=mapEntry.getValue().toString().split(",");
			testDataFromExcel[testDataFromExcel.length-1].replace(']',' ');
			testDataFromExcel[0].replace('[',' ');
			return testDataFromExcel;
		}
	
		//Getting Base URL from excel
		public static String getBaseURL(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[2].trim();	
		}

		//Getting Resource from excel
		public static String getResorce(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[3].trim();	
		}

		//Getting execution status if yes or no
		public static String getExecutionStatus(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[1].trim();
		}

		//Getting service name to be processed 
		public static String getServiceName(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[0].trim();
		}

		//Getting FedExAccountNumber from excel
		public static String getFedExAccountNumber(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[4].trim();
		}

		//Getting site from excel
		public static String getSite(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[5].trim();
		}
		//Getting Prod instanceId1 from excel
		public static String getProdinstanceId1(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[6].trim();
		}
		//Getting Prod instanceId2 from excel
		public static String getProdinstanceId2(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[7].trim();
		}
		//Getting Prod qty1 from excel
		public static String getProdqty1(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[8].trim();
		}
		//Getting Prod qty2 from excel
		public static String getProdqty2(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[9].trim();
		}
		//Getting catalogProductId1 from excel
		public static String getCatalogProductId1(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[10].trim();
		}
		//Getting version1 from excel
		public static String getVersion1(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[11].trim();
		}
		//Getting catalogProductId2 from excel
		public static String getCatalogProductId2(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[12].trim();
		}
		//Getting Version2 from excel
		public static String getVersion2(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[13].trim();
		}
		//Getting usage1 from excel
		public static String getUsage1(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[14].trim();
		}
		//Getting usage2 from excel
		public static String getUsage2(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[15].trim();
		}
		//Getting ShipmentDeliveryHoldUntilDate from excel
		public static String getShipmentDeliveryHoldUntilDate(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[16].trim();
		}
		//Getting shipmentDeliveryServiceType from excel
		public static String getShipmentDeliveryServiceType(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[17].trim();
		}
		//Getting shipmentDeliveryFedExAccountNumber from excel
		public static String getShipmentDeliveryFedExAccountNumber(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[18].trim();
		}
		//Getting productAssociations_id1 from excel
		public static String getProductAssociations_id1(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[19].trim();
		}
		//Getting ProductAssociations_qty1 from excel
		public static String getProductAssociations_qty1(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[20].trim();
		}
		//Getting productAssociations_id2 from excel
		public static String getProductAssociations_id2(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[21].trim();
		}
		//Getting ProductAssociations_qty2 from excel
		public static String getProductAssociations_qty2(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[22].trim();
		}
		//Getting loyaltyCode from excel
		public static String getLoyaltyCode(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[23].trim();
		}
		//Getting coupons from excel
		public static String getCoupons(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[24].trim();
		}
		//Getting coupons from excel
		public static String getPhoneNumber(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[25].trim();
		}
		//Getting ContactID from excel
		public static String getContactID(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[26].trim();
		}
		//Getting extension from excel
		public static String getExtension(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[27].trim();
		}
		//Getting email from excel
		public static String getEmail(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[28].trim();
		}
		//Getting company from excel
		public static String getCompany(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[29].trim();
		}
		//Getting Recipient_firstName from excel
		public static String getRecipient_firstName(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[30].trim();
		}
		//Getting Recipient_lastName from excel
		public static String getRecipient_lastName(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[31].trim();
		}
		//Getting Recipient_reference from excel
		public static String getRecipient_reference(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[32].trim();
		}
		//Getting Properties_value from excel
		public static String getProperties_value(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[33].trim();
		}
		//Getting Properties_name from excel
		public static String getProperties_name(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[34].trim();
		}
		//Getting userProductNam from excel
		public static String getuserProductNam(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[35].trim();
		}
		//Getting Product_Name from excel
		public static String getProduct_Name(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[36].trim();
		}
		//Getting attention from excel
		public static String getAttention(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[37].trim();
		}
		//Getting deliveryInstructions from excel
		public static String getDeliveryInstructions(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[38].trim();
		}
		//Getting sd_streetLines from excel
		public static String getSd_StreetLines(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[39].trim();
		}
		//Getting sd_city from excel
		public static String getSd_City(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[40].trim();
		}
		//Getting sd_stateCode from excel
		public static String getSd_StateCode(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[41].trim();
		}
		//Getting sd_postalCode from excel
		public static String getSd_PostalCode(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[42].trim();
		}
		//Getting sd_cntyCode from excel
		public static String getSd_CntyCode(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[43].trim();
		}
		//Getting specialInstructions from excel
		public static String getSpecialInstructions(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[44].trim();
		}
		//Getting ParentDocId from excel
		public static String getParentDocId(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[45].trim();
		}
		//Getting ContentDocId from excel
		public static String getContentDocId(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[46].trim();
		}
		//Getting Products_ID from excel
		public static String getProducts_ID(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[47].trim();
		}
		//Getting profileCreditCardId from excel
		public static String getprofileCreditCardId(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[48].trim();
		}
		//Getting encryptedCreditCard from excel
		public static String getencryptedCreditCard(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[49].trim();
		}
		//Getting cardNumber from excel
		public static String getcardNumber(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[50].trim();
		}
		//Getting expirationMonth from excel
		public static String getExpirationMonth(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[51].trim();
		}
		//Getting expirationYear from excel
		public static String getexpirationYear(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[52].trim();
		}
		//Getting cvv from excel
		public static String getcvv(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[53].trim();
		}
		//Getting cardHolderName from excel
		public static String getCardHolderName(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[54].trim();
		}
		//Getting ba_streetLines from excel
		public static String getba_streetLines(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[55].trim();
		}
		//Getting ba_city from excel
		public static String getba_city(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[56].trim();
		}
		//Getting ba_stateOrProvinceCode from excel
		public static String getba_stateOrProvinceCode(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[57].trim();
		}
		//Getting ba_postalCode from excel
		public static String getba_postalCode(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[58].trim();
		}
		//Getting ba_countryCode from excel
		public static String getba_countryCode(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[59].trim();
		}
		//Getting Credit CardType from excel
		public static String getcreditCardType(Map.Entry mapEntry)
		{
			return splitMapData(mapEntry)[60].trim();
		}
		//Getting textValue from excel
				public static String getTextValue(Map.Entry mapEntry)
				{
					return splitMapData(mapEntry)[61].trim();
				}
				//Getting CustomizedFields_id1 from excel
//				public static String getCustomizedFields_id1(Map.Entry mapEntry)
//				{
//					return splitMapData(mapEntry)[62].trim();
//				}
//				//Getting CustomizedFields_id2 from excel
//				public static String getCustomizedFields_id2(Map.Entry mapEntry)
//				{
//					return splitMapData(mapEntry)[63].trim();
//				}
//				//Getting CustomizedFields_id3 from excel
//				public static String getCustomizedFields_id3(Map.Entry mapEntry)
//				{
//					return splitMapData(mapEntry)[64].trim();
//				}
//				//Getting CustomizedFields_id4 from excel
//				public static String getCustomizedFields_id4(Map.Entry mapEntry)
//				{
//					return splitMapData(mapEntry)[65].trim();
//				}
//				//Getting Image Value from excel
//				public static String getImageValue(Map.Entry mapEntry)
//				{
//					return splitMapData(mapEntry)[66].trim();
//				}
				//Getting Pricable Value from excel
//				public static String getPricableFlagValue(Map.Entry mapEntry)
//				{
//					return splitMapData(mapEntry)[67].trim();
//				}


}
