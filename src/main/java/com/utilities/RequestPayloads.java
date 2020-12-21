/**
 * 
 */
package com.utilities;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Map;

/**
 * @author 3789246
 *
 */
public class RequestPayloads {

	// Getting payload for Login request as string
	public static String Login() throws FileNotFoundException, IOException {
		String postBody = "{" + " \"loginParameters\": { " + " \"userName\": " + Utilities.getProp("Username") + ", "
				+ " \"password\": " + Utilities.getProp("Password") + " " + "}" + "}";
		return postBody;
	}

	// Getting payload for RateOrder request as string
	public static String Rate(Map.Entry mapEntry) {
		String postBody = "{" +

				" \"rateRequest\": { " +

				"  \"fedExAccountNumber\":" + PayloadFields.getFedExAccountNumber(mapEntry) + ", " +

				" \"site\": " + PayloadFields.getSite(mapEntry) + ", " +

				" \"products\": [ " +

				"{" +

				" \"id\": 0, " +

				" \"name\": null, " +

				" \"version\": 0, " +

				" \"instanceId\": " + PayloadFields.getProdinstanceId1(mapEntry) + ", " +

				" \"userProductName\": null, " +

				"  \"qty\": " + PayloadFields.getProdqty1(mapEntry) + ", " +

				"  \"properties\": [ " +

				"{" +

				" \"id\": 0, " +

				"  \"name\": null, " +

				" \"value\": null " +

				"}" +

				"]," +

				" \"catalogReference\": { " +

				"  \"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + ", " +

				" \"version\": " + PayloadFields.getVersion1(mapEntry) + " " +

				"}" +

				"}," +

				" {" +

				"\"id\": 0, " +

				"\"name\": null, " +

				"\"version\": 0, " +

				"\"instanceId\": " + PayloadFields.getProdinstanceId2(mapEntry) + "," +

				"\"userProductName\": null, " +

				"\"qty\": " + PayloadFields.getProdqty2(mapEntry) + ", " +

				"\"properties\": [ " +

				" {" +

				"\"id\": 0, " +

				"\"name\": null, " +

				"\"value\": null " +

				" }" +

				" ]," +

				"\"catalogReference\": {" +

				"\"catalogProductId\": " + PayloadFields.getCatalogProductId2(mapEntry) + "," +

				"\"version\": " + PayloadFields.getVersion2(mapEntry) + " " +

				"}" +

				"}" +

				"]," +

				"\"recipients\": [" +

				"{" +

				"\"reference\": " + PayloadFields.getRecipient_reference(mapEntry) + ", " +

				"\"contact\": {" +

				"\"contactId\": " + PayloadFields.getContactID(mapEntry) + "," +

				"\"personName\": {" +

				"\"firstName\": " + PayloadFields.getRecipient_firstName(mapEntry) + "," +

				"\"lastName\": " + PayloadFields.getRecipient_lastName(mapEntry) + " " +

				"}," +

				"\"company\": {" +

				"\"name\": " + PayloadFields.getCompany(mapEntry) + " " +

				"}," +

				"\"emailDetail\": {" +

				"\"emailAddress\": " + PayloadFields.getEmail(mapEntry) + "" +

				"}," +

				"\"phoneNumberDetails\": [" +

				"{" +

				"\"phoneNumber\": {" +

				"\"number\": " + PayloadFields.getPhoneNumber(mapEntry) + "," +

				"\"extension\": " + PayloadFields.getExtension(mapEntry) + "" +

				"}," +

				"\"usage\":" + PayloadFields.getUsage1(mapEntry) + " " +

				"}," +

				"{" +

				"\"phoneNumber\": {" +

				"\"number\": " + PayloadFields.getPhoneNumber(mapEntry) + "," +

				"\"extension\": " + PayloadFields.getExtension(mapEntry) + "" +

				"}," +

				"\"usage\": " + PayloadFields.getUsage2(mapEntry) + " " +

				"}" +

				"]" +

				"}," +

				"\"attention\": " + PayloadFields.getAttention(mapEntry) + "," +

				"\"shipmentDelivery\": {" +

				"\"address\" : {" +

				"\"streetLines\":[\"" + PayloadFields.getSd_StreetLines(mapEntry) + "\"]," +

				"\"city\": " + PayloadFields.getSd_City(mapEntry) + "," +

				"\"stateOrProvinceCode\":" + PayloadFields.getSd_StateCode(mapEntry) + "," +

				"\"postalCode\": " + PayloadFields.getSd_PostalCode(mapEntry) + "," +

				"\"countryCode\":" + PayloadFields.getSd_CntyCode(mapEntry) + "," +

				"\"addressClassification\":\"\" " +

				"}," +

				"\"holdUntilDate\": " + PayloadFields.getShipmentDeliveryHoldUntilDate(mapEntry) + "," +

				"\"serviceType\": " + PayloadFields.getShipmentDeliveryServiceType(mapEntry) + "," +

				"\"fedExAccountNumber\": " + PayloadFields.getShipmentDeliveryFedExAccountNumber(mapEntry) + "," +

				"\"deliveryInstructions\": " + PayloadFields.getDeliveryInstructions(mapEntry) + "" +

				"}," +

				"\"productAssociations\": [ " +

				"{" +

				"\"id\": " + PayloadFields.getProductAssociations_id1(mapEntry) + "," +

				"\"quantity\": " + PayloadFields.getProductAssociations_qty1(mapEntry) + "" +

				"}," +

				"{" +

				"\"id\": " + PayloadFields.getProductAssociations_id2(mapEntry) + "," +

				"\"quantity\": " + PayloadFields.getProductAssociations_qty2(mapEntry) + "" +

				"}" +

				" ]" +

				"}" +

				"]," +

				" \"loyaltyCode\": " + PayloadFields.getLoyaltyCode(mapEntry) + ", " +

				" \"specialInstructions\": " + PayloadFields.getSpecialInstructions(mapEntry) + ", " +

				" \"coupons\": [ " +

				"]" +

				"}" +

				"}";// ";

		return postBody;
	}

	public static String Delivery(Map.Entry mapEntry) {
		String postBody = "{" + "\"deliveryOptionsRequest\": {" + "\"fedExAccountNumber\": "
				+ PayloadFields.getFedExAccountNumber(mapEntry) + "," + "\"site\": " + PayloadFields.getSite(mapEntry)
				+ "," + "\"products\": [ " + "{" + "\"id\": " + PayloadFields.getProdinstanceId1(mapEntry) + ","
				+ "\"name\": \"string\"," + "\"version\": 1," + "\"instanceId\": "
				+ PayloadFields.getProductAssociations_id1(mapEntry) + "," + "\"userProductName\": \"string\","
				+ "\"qty\": " + PayloadFields.getProductAssociations_qty1(mapEntry) + "," + "\"catalogReference\": {"
				+ "\"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + "," + "\"version\": "
				+ PayloadFields.getVersion1(mapEntry) + " " + "}" + "}" + "]," + "\"deliveries\": [ " + "{"
				+ "\"deliveryReference\": \"abcd\", " + "\"address\": { " + "\"streetLines\":[\""
				+ PayloadFields.getSd_StreetLines(mapEntry) + "\"]," + "\"city\": " + PayloadFields.getSd_City(mapEntry)
				+ ", " + "\"stateOrProvinceCode\":" + PayloadFields.getSd_StateCode(mapEntry) + ", "
				+ "\"postalCode\": " + PayloadFields.getSd_PostalCode(mapEntry) + ", " + "\"countryCode\":"
				+ PayloadFields.getSd_CntyCode(mapEntry) + ", " + "\"addressClassification\": \"BUSINESS\" " + "},"
				+ "\"holdUntilDate\":" + PayloadFields.getShipmentDeliveryHoldUntilDate(mapEntry) + ","
				+ "\"requestedDeliveryTypes\": {" + "\"requestedPickup\": {" + "\"resultsRequested\": 5,"
				+ "\"searchRadius\": {" + "\"value\": 200," + "\"unit\": \"MILES\" " + "}" + "}" + "},"
				+ "\"productAssociations\": [" + "{" + "\"id\": " + PayloadFields.getProductAssociations_id1(mapEntry)
				+ "," + "\"quantity\": " + PayloadFields.getProductAssociations_qty1(mapEntry) + "" + "}" + "]" + "}"
				+ "]" + "}" + "}";

		return postBody;
	}

	public static String OrderSubmit_FedEXAC(Map.Entry mapEntry) {
		String postBody = "{" +

				"\"orderSubmissionRequest\": {" + "\"fedExAccountNumber\": "
				+ PayloadFields.getFedExAccountNumber(mapEntry) + "," + "\"orderContact\": {" + "\"contact\": {"
				+ "\"contactId\": null," + "\"personName\": {" + "\"firstName\": \"contactFirstName\","
				+ "\"lastName\": \"contactLastName\"" + "}," + "\"company\": {" + "\"name\": \"myCompany\"" + "},"
				+ "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\"" + "}," + "\"phoneNumberDetails\": ["
				+ "{" + "\"phoneNumber\": {" + "\"number\": \"4699804371\"," + "\"extension\": \"\"" + "},"
				+ "\"usage\": \"PRIMARY\"" + "}," + "{" + "\"phoneNumber\": {" + "\"number\": \"4699804371\","
				+ "\"extension\": \"1234567\"" + "}," + "\"usage\": \"SECONDARY\"" + "}" + "]" + "},"
				+ "\"attention\": \"Mr\"" + "}," + " \"site\": " + PayloadFields.getSite(mapEntry) + ", "
				+ "\"products\": [" + "{" + "\"name\": \"string\"," + "\"version\": 2,"
				+ "\"userProductName\": \"string\"," + "\"qty\": 1," + "\"id\": 1456773326927,"
				+ "\"instanceId\": \"0\"," + " \"catalogReference\": { " +

				"\"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + "," + "\"version\": "
				+ PayloadFields.getVersion1(mapEntry) + " " +

				"}" + "}" + "]," + "\"recipients\": [" + "{" + "\"reference\": \"Abcd\"," + "\"contact\": {"
				+ "\"contactId\": null," + "\"personName\": {" + "\"firstName\": \"recpFirstName\","
				+ "\"lastName\": \"recpLastName\"" + "}," + "\"company\": {" + "\"name\": \"\"" + "},"
				+ "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\"" + "}," + "\"phoneNumberDetails\": ["
				+ "{" + "\"phoneNumber\": {" + "\"number\": \"4694493693\"," + "\"extension\": \"string\"" + "},"
				+ "\"usage\": \"Primary\"" + "}," + "{" + "\"phoneNumber\": {" + "\"number\": \"4694493692\","
				+ "\"extension\": \"string\"" + "}," + "\"usage\": \"Secondary\"" + "}" + "]" + "},"
				+ "\"attention\": \"string\"," + "\"shipmentDelivery\": {" + "\"address\" : {"
				+ "\"streetLines\":[\"4152 Spring Creek Pkwy\"]," + "\"city\": \"Plano\","
				+ "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\"," + "\"countryCode\":\"US\","
				+ "\"addressClassification\":\"BUSINESS\"" + "}," +

				"\"serviceType\": \"LOCAL_DELIVERY_AM\"," +

				"\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\": [" + "{" + "\"id\": \"0\"," + "\"quantity\": 1" + "}" + "]" + "}"
				+ "]," + "\"loyaltyCode\": null," + "\"specialInstructions\": \"This is user entered instruction\","
				+ "\"coupons\": null," + "\"payments\": [" + "{" + "\"poNumber\": \"1234\"" + "}" + "]" +

				"}" +

				"}";
		return postBody;
	}

	public static String CustomDoc(Map.Entry mapEntry) {
		String postBody = "{" +

				"\"productCustomizationRequest\": {" + "\"site\": " + PayloadFields.getSite(mapEntry) + ", "
				+ " \"catalogReference\": { " +

				"  \"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + ", " +

				" \"version\": " + PayloadFields.getVersion1(mapEntry) + " " +

				"}," + "\"customizedFields\": [" + "{" + "\"id\": \"MTUyODAzOTk5NDM=\"," + "\"sequence\": 1," +

				"\"textValue\": \"abc\" " + "}," + "{" + "\"id\": \"MTUyODAzOTk5NDk=\"," + "\"sequence\": 1," +

				"\"textValue\": \"abc\" " + "}," + "{" + "\"id\": \"MTUyODAzOTk5NTE=\"," + "\"sequence\": 1," +

				"\"textValue\": \"abc\" " + "}," + "{" + "\"id\": \"MTUyODAzOTk5NTM=\"," + "\"sequence\": 1," +

				"\"textValue\": \"abc\" " + "}" +

				"]" + "}" + "}";

		return postBody;
	}

	public static String Delivery_PricableFlag_True(Map.Entry mapEntry) {
		String postBody = "{" + "\"deliveryOptionsRequest\": {" + "\"fedExAccountNumber\": "
				+ PayloadFields.getFedExAccountNumber(mapEntry) + "," + "\"site\": " + PayloadFields.getSite(mapEntry)
				+ "," + "\"products\": [" + "{" + "\"userProductName\": \"MultipageDoc_01.docx\","
				+ "\"id\": \"1456773326927\"," + "\"version\": 1," + "\"name\": \"Multi Sheet\"," + "\"qty\": 1,"
				+ "\"priceable\": false," + "\"instanceId\": 1560177425253," + "\"proofRequired\": false,"
				+ "\"isOutSourced\": false," + "\"features\": [" + "{" + "\"id\": \"1448981549109\","
				+ "\"name\": \"Paper Size\"," + "\"choice\": {" + "\"id\": \"1448986650332\"," + "\"name\": \"8.5x11\","
				+ "\"properties\": [" + "{" + "\"id\": \"1449069906033\"," + "\"name\": \"MEDIA_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1449069908929\"," + "\"name\": \"MEDIA_WIDTH\","
				+ "\"value\": \"8.5\"" + "}" + "]" + "}" + "}," + "{" + "\"id\": \"1448981549741\","
				+ "\"name\": \"Paper Type\"," + "\"choice\": {" + "\"id\": \"1448988664295\","
				+ "\"name\": \"Laser (32 lb.)\"," + "\"properties\": [" + "{" + "\"id\": \"1450324098012\","
				+ "\"name\": \"MEDIA_TYPE\"," + "\"value\": \"E32\"" + "}," + "{" + "\"id\": \"1453234015081\","
				+ "\"name\": \"PAPER_COLOR\"," + "\"value\": \"#FFFFFF\"" + "}," + "{" + "\"id\": \"1471275182312\","
				+ "\"name\": \"MEDIA_CATEGORY\"," + "\"value\": \"RESUME\"" + "}" + "]" + "}" + "}," + "{"
				+ "\"id\": \"1448981549581\"," + "\"name\": \"Print Color\"," + "\"choice\": {"
				+ "\"id\": \"1448988600611\"," + "\"name\": \"Full Color\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453242778807\"," + "\"name\": \"PRINT_COLOR\"," + "\"value\": \"COLOR\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448981549269\"," + "\"name\": \"Sides\"," + "\"choice\": {"
				+ "\"id\": \"1448988124560\"," + "\"name\": \"Single-Sided\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1461774376168\"," + "\"name\": \"SIDE\"," + "\"value\": \"SINGLE\"" + "}," + "{"
				+ "\"id\": \"1471294217799\"," + "\"name\": \"SIDE_VALUE\"," + "\"value\": \"1\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448984679218\"," + "\"name\": \"Orientation\"," + "\"choice\": {"
				+ "\"id\": \"1449000016192\"," + "\"name\": \"Vertical\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453260266287\"," + "\"name\": \"PAGE_ORIENTATION\"," + "\"value\": \"PORTRAIT\"" + "}"
				+ "]" + "}" + "}," + "{" + "\"id\": \"1448981554101\"," + "\"name\": \"Prints Per Page\","
				+ "\"choice\": {" + "\"id\": \"1448990257151\"," + "\"name\": \"One\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1455387404922\"," + "\"name\": \"PRINTS_PER_PAGE\"," + "\"value\": \"ONE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448984877869\"," + "\"name\": \"Cutting\"," + "\"choice\": {"
				+ "\"id\": \"1448999392195\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981555573\"," + "\"name\": \"Hole Punching\"," + "\"choice\": {"
				+ "\"id\": \"1448999902070\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448984877645\"," + "\"name\": \"Folding\"," + "\"choice\": {"
				+ "\"id\": \"1448999720595\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981532145\"," + "\"name\": \"Collation\"," + "\"choice\": {"
				+ "\"id\": \"1448986654687\"," + "\"name\": \"Collated\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1449069945785\"," + "\"name\": \"COLLATION_TYPE\"," + "\"value\": \"MACHINE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448981554597\"," + "\"name\": \"Binding\"," + "\"choice\": {"
				+ "\"id\": \"1448997199553\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}" + "],"
				+ "\"addOns\": []," + "\"inserts\": []," + "\"exceptions\": []," + "\"pageExceptions\": [],"
				+ "\"contentAssociations\": [" + "{"
				+ "\"parentContentReference\": \"15770735384116409840618834100401180099362\","
				+ "\"contentReference\": \"15770736202050175371604715355470281154186\"," + "\"contentType\": \"WORD\","
				+ "\"fileName\": \"MultipageDoc_01.docx\"," + "\"contentReqId\": \"1483999952979\","
				+ "\"name\": \"Multi Sheet\"," + "\"desc\": null," + "\"purpose\": \"MAIN_CONTENT\","
				+ "\"printReady\": true," + "\"pageGroups\": [" + "{" + "\"start\": 1," + "\"end\": 4,"
				+ "\"width\": 8.5," + "\"height\": 11," + "\"orientation\": \"PORTRAIT\"" + "}" + "]" + "}" + "],"
				+ "\"properties\": [" + "{" + "\"id\": \"1453242488328\"," + "\"name\": \"ZOOM_PERCENTAGE\","
				+ "\"value\": \"60\"" + "}," + "{" + "\"id\": \"1453243262198\"," + "\"name\": \"ENCODE_QUALITY\","
				+ "\"value\": \"100\"" + "}," + "{" + "\"id\": \"1453894861756\","
				+ "\"name\": \"LOCK_CONTENT_ORIENTATION\"," + "\"value\": false" + "}," + "{"
				+ "\"id\": \"1453895478444\"," + "\"name\": \"MIN_DPI\"," + "\"value\": \"150.0\"" + "}," + "{"
				+ "\"id\": \"1454950109636\"," + "\"name\": \"USER_SPECIAL_INSTRUCTIONS\"," + "\"value\": null" + "},"
				+ "{" + "\"id\": \"1455050109636\"," + "\"name\": \"DEFAULT_IMAGE_WIDTH\"," + "\"value\": \"8.5\""
				+ "}," + "{" + "\"id\": \"1455050109631\"," + "\"name\": \"DEFAULT_IMAGE_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1494365340946\"," + "\"name\": \"PREVIEW_TYPE\","
				+ "\"value\": \"DYNAMIC\"" + "}," + "{" + "\"id\": \"1470151626854\"," + "\"name\": \"SYSTEM_SI\","
				+ "\"value\": null" + "}," + "{" + "\"id\": \"1470151737965\"," + "\"name\": \"TEMPLATE_AVAILABLE\","
				+ "\"value\": \"NO\"" + "}," + "{" + "\"id\": \"1490292304798\"," + "\"name\": \"MIGRATED_PRODUCT\","
				+ "\"value\": \"true\"" + "}" + "],"
				+ "\"_cuid\": \"fxo_e30018bd-52d5-e9cf-22cd-dcb8ba32c593@@1560177448590\","
				+ "\"lastModifiedTime\": 1560177448586,"
				+ "\"docIdImage\": \"15770736202050175371604715355470281154186\"" + "}" + "]," + "\"deliveries\": ["
				+ "{" + "\"deliveryReference\": \"abcd\"," + "\"address\": {" + "\"streetLines\":[\"6820 Preston rd\"],"
				+ "\"city\": \"Plano\"," + "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\","
				+ "\"countryCode\":\"US\"," + "\"addressClassification\":\"BUSINESS\"" + "}," + "\"holdUntilDate\":"
				+ PayloadFields.getShipmentDeliveryHoldUntilDate(mapEntry) + "," + "\"requestedDeliveryTypes\": {"
				+ "\"requestedPickup\": {" + "\"resultsRequested\":2," + "\"searchRadius\": {" + "\"value\": 100 ,"
				+ "\"unit\": \"MILES\"" + "} " +

				"}," + "\"requestedShipment\":{}" + "}," + "\"productAssociations\": [" + " {"
				+ "\"id\": \"1560177425253\"," + "\"quantity\": 1" + "}" + "]" + "}" + "]" + "}" + "}";

		return postBody;

	}

	public static String Delivery_PricableFlag_False(Map.Entry mapEntry) {
		String postBody = "{" + "\"deliveryOptionsRequest\": {" + "\"fedExAccountNumber\": "
				+ PayloadFields.getFedExAccountNumber(mapEntry) + "," + "\"site\": " + PayloadFields.getSite(mapEntry)
				+ "," + "\"products\": [" + "{" + "\"id\": \"150878483890000\"," + "\"name\": \"\"," + "\"version\": 0,"
				+ "\"instanceId\":1508784838900 ," + "\"qty\": 1," +

				"\"contentAssociations\": [" + "{"
				+ "\"parentContentReference\":\"15770374288178197255501965019741183127724\","
				+ "\"contentReference\":\"15770373577105092907603798339162123675970\"," + "\"contentType\":\"WORD\","
				+ "\"fileName\":\"singlePageUploadDoc.docx\"," + "\"contentReqId\":\"1455709847200\","
				+ "\"name\":\"Front_Side\"," + "\"desc\":null," + "\"purpose\":\"SINGLE_SHEET_FRONT\","
				+ "\"printReady\":true," + "\"pageGroups\":[" + "{" + "\"start\":1," + "\"end\":1," + "\"width\":8.5,"
				+ "\"height\":11," + "\"orientation\":\"PORTRAIT\"" + "}" + "]" + "}" + "]" +

				"\"deliveries\": [" + "{" + "\"deliveryReference\": \"abcd\"," + "\"address\": {"
				+ "\"streetLines\":[\"6820 Preston rd\"]," + "\"city\": \"Plano \"," + "\"stateOrProvinceCode\":\"TX\","
				+ "\"postalCode\": \"75024\"," + "\"countryCode\":\"US\"," + "\"addressClassification\":\"BUSINESS\""
				+ "}," + "\"holdUntilDate\": \"\"," + "\"requestedDeliveryTypes\": {" + "\"requestedPickup\": {"
				+ "\"resultsRequested\":2," + "\"searchRadius\": {" + "\"value\": 100 ," + "\"unit\": \"MILES\"" + "} "
				+

				"}," + "\"requestedShipment\":{}" + "}," + "\"productAssociations\": [" + "{"
				+ "\"id\": \"1508784838900\"," + "\"quantity\": 1" +

				"}" + "]" + "}" + "]" + "}" + "}";

		return postBody;

	}

	public static String Order_PricableFlag_True(Map.Entry mapEntry) {
		String postBody = "{" + "\"orderSubmissionRequest\": {" + "\"fedExAccountNumber\":\"0617773880\","
				+ "\"orderContact\": {" + "\"contact\": {" + "\"contactId\": null," + "\"personName\": {"
				+ "\"firstName\": \"contactFirstName\"," + "\"lastName\": \"cintactLastName\"" + "}," + "\"company\": {"
				+ "\"name\": \"myCompany\"" + "}," + "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\""
				+ "}," + "\"phoneNumberDetails\": [" + "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\","
				+ "\"extension\": null" + "}," + "\"usage\": \"PRIMARY\"" + "}" + "]" + "}," + "\"attention\": null"
				+ "}," + "\"site\": \"\"," +

				"\"products\": [" + "{" + "\"userProductName\": \"Keyboard_shortcuts_(3.0).pdf\","
				+ "\"id\": \"1456773326927\"," + "\"version\": 1," + "\"name\": \"Multi Sheet\"," + "\"qty\": 1,"
				+ "\"priceable\": true," + "\"instanceId\": 1560496226441," + "\"proofRequired\": false,"
				+ "\"isOutSourced\": false," + "\"features\": [" + "{" + "\"id\": \"1448981549109\","
				+ "\"name\": \"Paper Size\"," + "\"choice\": {" + "\"id\": \"1448986650332\"," + "\"name\": \"8.5x11\","
				+ "\"properties\": [" + "{" + "\"id\": \"1449069906033\"," + "\"name\": \"MEDIA_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1449069908929\"," + "\"name\": \"MEDIA_WIDTH\","
				+ "\"value\": \"8.5\"" + "}" + "]" + "}" + "}," + "{" + "\"id\": \"1448981549741\","
				+ "\"name\": \"Paper Type\"," + "\"choice\": {" + "\"id\": \"1448988664295\","
				+ "\"name\": \"Laser (32 lb.)\"," + "\"properties\": [" + "{" + "\"id\": \"1450324098012\","
				+ "\"name\": \"MEDIA_TYPE\"," + "\"value\": \"E32\"" + "}," + "{" + "\"id\": \"1453234015081\","
				+ "\"name\": \"PAPER_COLOR\"," + "\"value\": \"#FFFFFF\"" + "}," + "{" + "\"id\": \"1471275182312\","
				+ "\"name\": \"MEDIA_CATEGORY\"," + "\"value\": \"RESUME\"" + "}" + "]" + "}" + "}," + "{"
				+ "\"id\": \"1448981549581\"," + "\"name\": \"Print Color\"," + "\"choice\": {"
				+ "\"id\": \"1448988600611\"," + "\"name\": \"Full Color\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453242778807\"," + "\"name\": \"PRINT_COLOR\"," + "\"value\": \"COLOR\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448981549269\"," + "\"name\": \"Sides\"," + "\"choice\": {"
				+ "\"id\": \"1448988124560\"," + "\"name\": \"Single-Sided\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1461774376168\"," + "\"name\": \"SIDE\"," + "\"value\": \"SINGLE\"" + "}," + "{"
				+ "\"id\": \"1471294217799\"," + "\"name\": \"SIDE_VALUE\"," + "\"value\": \"1\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448984679218\"," + "\"name\": \"Orientation\"," + "\"choice\": {"
				+ "\"id\": \"1449000016192\"," + "\"name\": \"Vertical\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453260266287\"," + "\"name\": \"PAGE_ORIENTATION\"," + "\"value\": \"PORTRAIT\"" + "}"
				+ "]" + "}" + "}," + "{" + "\"id\": \"1448981554101\"," + "\"name\": \"Prints Per Page\","
				+ "\"choice\": {" + "\"id\": \"1448990257151\"," + "\"name\": \"One\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1455387404922\"," + "\"name\": \"PRINTS_PER_PAGE\"," + "\"value\": \"ONE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448984877869\"," + "\"name\": \"Cutting\"," + "\"choice\": {"
				+ "\"id\": \"1448999392195\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981555573\"," + "\"name\": \"Hole Punching\"," + "\"choice\": {"
				+ "\"id\": \"1448999902070\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448984877645\"," + "\"name\": \"Folding\"," + "\"choice\": {"
				+ "\"id\": \"1448999720595\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981532145\"," + "\"name\": \"Collation\"," + "\"choice\": {"
				+ "\"id\": \"1448986654687\"," + "\"name\": \"Collated\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1449069945785\"," + "\"name\": \"COLLATION_TYPE\"," + "\"value\": \"MACHINE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448981554597\"," + "\"name\": \"Binding\"," + "\"choice\": {"
				+ "\"id\": \"1448997199553\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}" + "],"
				+ "\"addOns\": []," + "\"inserts\": []," + "\"exceptions\": []," + "\"pageExceptions\": [],"
				+ "\"contentAssociations\": [" + " {"
				+ "\"parentContentReference\": \"12676310920040907285319087867590234083555\","
				+ "\"contentReference\": \"12676310921167964959004314841450720689525\"," + "\"contentType\": \"PDF\","
				+ "\"fileName\": \"Keyboard_shortcuts_(3.0).pdf\"," + "\"contentReqId\": \"1483999952979\","
				+ "\"name\": \"Multi Sheet\"," + "\"desc\": null," + "\"purpose\": \"MAIN_CONTENT\","
				+ "\"printReady\": true," + "\"pageGroups\": [" + "{" + "\"start\": 1," + "\"end\": 2,"
				+ "\"width\": 8.5," + "\"height\": 11," + "\"orientation\": \"PORTRAIT\"" + "}" + "]" + "}" + "],"
				+ "\"properties\": [" + "{" + "\"id\": \"1453242488328\"," + "\"name\": \"ZOOM_PERCENTAGE\","
				+ "\"value\": \"60\"" + "}," + "{" + "\"id\": \"1453243262198\"," + "\"name\": \"ENCODE_QUALITY\","
				+ "\"value\": \"100\"" + "}," + "{" + "\"id\": \"1453894861756\","
				+ "\"name\": \"LOCK_CONTENT_ORIENTATION\"," + "\"value\": false" + "}," + " {"
				+ "\"id\": \"1453895478444\"," + "\"name\": \"MIN_DPI\"," + "\"value\": \"150.0\"" + "}," + "{"
				+ "\"id\": \"1454950109636\"," + "\"name\": \"USER_SPECIAL_INSTRUCTIONS\"," + "\"value\": null" + "},"
				+ "{" + "\"id\": \"1455050109636\"," + "\"name\": \"DEFAULT_IMAGE_WIDTH\"," + "\"value\": \"8.5\""
				+ "}," + "{" + "\"id\": \"1455050109631\"," + "\"name\": \"DEFAULT_IMAGE_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1494365340946\"," + "\"name\": \"PREVIEW_TYPE\","
				+ "\"value\": \"DYNAMIC\"" + "}," + "{" + "\"id\": \"1470151626854\"," + "\"name\": \"SYSTEM_SI\","
				+ "\"value\": null" + "}," + "{" + "\"id\": \"1470151737965\"," + "\"name\": \"TEMPLATE_AVAILABLE\","
				+ "\"value\": \"NO\"" + "}," + "{" + "\"id\": \"1490292304798\"," + "\"name\": \"MIGRATED_PRODUCT\","
				+ "\"value\": \"true\"" + "}" + "],"
				+ "\"_cuid\": \"fxo_f74b53a5-ddcb-34e7-cf15-103fa952b1b0@@1560496240914\","
				+ "\"lastModifiedTime\": 1560496240910,"
				+ "\"docIdImage\": \"12676310921167964959004314841450720689525\"" + " }" + "]," + "\"recipients\": ["
				+ "{" + "\"ref\": \"string\"," + "\"contact\": {" + "\"contactId\": null," + "\"personName\": {"
				+ "\"firstName\": \"recpFirstName\"," + "\"lastName\": \"recpLastName\"" + "}," + "\"company\": {"
				+ "\"name\": \"\"" + "}," + "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\"" + "},"
				+ "\"phoneNumberDetails\": [" + "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\","
				+ "\"extension\": \"string\"" + "}," + "\"usage\": \"PRIMARY\"" + "}" + "]" + "},"
				+ "\"attention\": \"string\"," +

				"\"shipmentDelivery\": {" + "\"address\" : {" + "\"streetLines\":[\"79 Legacy Drive\"],"
				+ "\"city\": \"Plano\"," + "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\","
				+ "\"countryCode\":\"US\"," + "\"addressClassification\":\"HOME\"" + "}," + "\"holdUntilDate\": \"\","
				+ "\"fedExAccountNumber\":null," + "\"serviceType\": \"LOCAL_DELIVERY_AM\","
				+ "\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\": [" +

				"{" + "\"id\": 1560496226441," + "\"quantity\": 1" + "}" + "]" + "}" + "]," + "\"loyaltyCode\": null,"
				+ "\"specialInstructions\": null," + "\"coupons\": null," + "\"payments\": [" + "{" + "\"invoice\":{"
				+ "\"siteProvided\": true" + "}" + "}" +

				"]," + "\"notificationRegistration\" :{" + "\"webhook\" :{"
				+ "\"url\": \"http://www.fedex.com/notify\"," + "\"auth\": \"jhgvzd\"" + "}" + "}" +

				"}" + "}";

		return postBody;

	}

	public static String Order_PricableFlag_False(Map.Entry mapEntry) {
		String postBody = "{" + "\"orderSubmissionRequest\": {" + "\"fedExAccountNumber\":\"0617773880\","
				+ "\"orderContact\": {" + "\"contact\": {" + "\"contactId\": null," + "\"personName\": {"
				+ "\"firstName\": \"contactFirstName\"," + "\"lastName\": \"cintactLastName\"" + "}," + "\"company\": {"
				+ "\"name\": \"myCompany\"" + "}," + "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\""
				+ "}," + "\"phoneNumberDetails\": [" + "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\","
				+ "\"extension\": null" + "}," + "\"usage\": \"PRIMARY\"" + "}" + "]" + "}," + "\"attention\": null"
				+ "}," + "\"site\": \"\"," +

				"\"products\": [" + "{"
				+ "\"userProductName\": \"AddCatalogService- folder id authorization and validation changes.doc\","
				+ "\"id\": \"1456773326927\"," + "\"version\": 1," + "\"name\": \"Multi Sheet\"," + "\"qty\": 1,"
				+ "\"priceable\": false," + "\"instanceId\": 1560752038640," + "\"proofRequired\": false,"
				+ "\"isOutSourced\": false," + "\"features\": [" + "{" + "\"id\": \"1448981549109\","
				+ "\"name\": \"Paper Size\"," + "\"choice\": {" + "\"id\": \"1448986650332\"," + "\"name\": \"8.5x11\","
				+ "\"properties\": [" + "{" + "\"id\": \"1449069906033\"," + "\"name\": \"MEDIA_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1449069908929\"," + "\"name\": \"MEDIA_WIDTH\","
				+ "\"value\": \"8.5\"" + "}" + "]" + "}" + "}," + "{" + "\"id\": \"1448981549741\","
				+ "\"name\": \"Paper Type\"," + "\"choice\": {" + "\"id\": \"1448988664295\","
				+ "\"name\": \"Laser (32 lb.)\"," + "\"properties\": [" + "{" + "\"id\": \"1450324098012\","
				+ "\"name\": \"MEDIA_TYPE\"," + "\"value\": \"E32\"" + "}," + "{" + "\"id\": \"1453234015081\","
				+ "\"name\": \"PAPER_COLOR\"," + "\"value\": \"#FFFFFF\"" + "}," + "{" + "\"id\": \"1471275182312\","
				+ "\"name\": \"MEDIA_CATEGORY\"," + "\"value\": \"RESUME\"" + "}" + "]" + "}" + "}," + "{"
				+ "\"id\": \"1448981549581\"," + "\"name\": \"Print Color\"," + "\"choice\": {"
				+ "\"id\": \"1448988600611\"," + "\"name\": \"Full Color\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453242778807\"," + "\"name\": \"PRINT_COLOR\"," + "\"value\": \"COLOR\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448981549269\"," + "\"name\": \"Sides\"," + "\"choice\": {"
				+ "\"id\": \"1448988124560\"," + "\"name\": \"Single-Sided\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1461774376168\"," + "\"name\": \"SIDE\"," + "\"value\": \"SINGLE\"" + "}," + "{"
				+ "\"id\": \"1471294217799\"," + "\"name\": \"SIDE_VALUE\"," + "\"value\": \"1\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448984679218\"," + "\"name\": \"Orientation\"," + "\"choice\": {"
				+ "\"id\": \"1449000016192\"," + "\"name\": \"Vertical\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453260266287\"," + "\"name\": \"PAGE_ORIENTATION\"," + "\"value\": \"PORTRAIT\"" + "}"
				+ "]" + "}" + "}," + "{" + "\"id\": \"1448981554101\"," + "\"name\": \"Prints Per Page\","
				+ "\"choice\": {" + "\"id\": \"1448990257151\"," + "\"name\": \"One\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1455387404922\"," + "\"name\": \"PRINTS_PER_PAGE\"," + "\"value\": \"ONE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448984877869\"," + "\"name\": \"Cutting\"," + "\"choice\": {"
				+ "\"id\": \"1448999392195\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981555573\"," + "\"name\": \"Hole Punching\"," + "\"choice\": {"
				+ "\"id\": \"1448999902070\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," +

				"{" + "\"id\": \"1448981532145\"," + "\"name\": \"Collation\"," + "\"choice\": {"
				+ "\"id\": \"1448986654687\"," + "\"name\": \"Collated\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1449069945785\"," + "\"name\": \"COLLATION_TYPE\"," + "\"value\": \"MACHINE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448981554597\"," + "\"name\": \"Binding\"," + "\"choice\": {"
				+ "\"id\": \"1448997199553\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}" + "],"
				+ "\"addOns\": []," + "\"inserts\": []," + "\"exceptions\": []," + "\"pageExceptions\": [],"
				+ "\"contentAssociations\": [" + " {"
				+ "\"parentContentReference\": \"12677787200183513748315520575440477896629\","
				+ "\"contentReference\": \"12677787201057583833202574713181171940462\"," + "\"contentType\": \"WORD\","
				+ "\"fileName\": \"AddCatalogService- folder id authorization and validation changes.doc\","
				+ "\"contentReqId\": \"1483999952979\"," + "\"name\": \"Multi Sheet\"," + "\"desc\": null,"
				+ "\"purpose\": \"MAIN_CONTENT\"," + "\"printReady\": true," + "\"pageGroups\": [" + "{"
				+ "\"start\": 1," + "\"end\": 6," + "\"width\": 8.5," + "\"height\": 11,"
				+ "\"orientation\": \"PORTRAIT\"" + "}" + "]" + "}" + "]," + "\"properties\": [" + "{"
				+ "\"id\": \"1453242488328\"," + "\"name\": \"ZOOM_PERCENTAGE\"," + "\"value\": \"60\"" + "}," + "{"
				+ "\"id\": \"1453243262198\"," + "\"name\": \"ENCODE_QUALITY\"," + "\"value\": \"100\"" + "}," + "{"
				+ "\"id\": \"1453894861756\"," + "\"name\": \"LOCK_CONTENT_ORIENTATION\"," + "\"value\": false" + "},"
				+ " {" + "\"id\": \"1453895478444\"," + "\"name\": \"MIN_DPI\"," + "\"value\": \"150.0\"" + "}," + "{"
				+ "\"id\": \"1454950109636\"," + "\"name\": \"USER_SPECIAL_INSTRUCTIONS\","
				+ "\"value\": \"need all text to be in different colours\"" + "}," + "{" + "\"id\": \"1455050109636\","
				+ "\"name\": \"DEFAULT_IMAGE_WIDTH\"," + "\"value\": \"8.5\"" + "}," + "{"
				+ "\"id\": \"1455050109631\"," + "\"name\": \"DEFAULT_IMAGE_HEIGHT\"," + "\"value\": \"11\"" + "},"
				+ "{" + "\"id\": \"1494365340946\"," + "\"name\": \"PREVIEW_TYPE\"," + "\"value\": \"DYNAMIC\"" + "},"
				+ "{" + "\"id\": \"1470151626854\"," + "\"name\": \"SYSTEM_SI\"," + "\"value\": null" + "}," + "{"
				+ "\"id\": \"1470151737965\"," + "\"name\": \"TEMPLATE_AVAILABLE\"," + "\"value\": \"NO\"" + "}," + "{"
				+ "\"id\": \"1490292304798\"," + "\"name\": \"MIGRATED_PRODUCT\"," + "\"value\": \"true\"" + "}" + "],"
				+ "\"_cuid\": \"fxo_cdf5cae0-6aaa-ee89-b8c3-0547418b447f@@1560752088259\","
				+ "\"lastModifiedTime\": 1560752145415,"
				+ "\"docIdImage\": \"12677787201057583833202574713181171940462\"" + " }" + "]," + "\"recipients\": ["
				+ "{" + "\"ref\": \"string\"," + "\"contact\": {" + "\"contactId\": null," + "\"personName\": {"
				+ "\"firstName\": \"recpFirstName\"," + "\"lastName\": \"recpLastName\"" + "}," + "\"company\": {"
				+ "\"name\": \"\"" + "}," + "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\"" + "},"
				+ "\"phoneNumberDetails\": [" + "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\","
				+ "\"extension\": \"string\"" + "}," + "\"usage\": \"PRIMARY\"" + "}" + "]" + "},"
				+ "\"attention\": \"string\"," +

				"\"shipmentDelivery\": {" + "\"address\" : {" + "\"streetLines\":[\"79 Legacy Drive\"],"
				+ "\"city\": \"Plano\"," + "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\","
				+ "\"countryCode\":\"US\"," + "\"addressClassification\":\"HOME\"" + "}," + "\"holdUntilDate\": \"\","
				+ "\"fedExAccountNumber\":null," + "\"serviceType\": \"LOCAL_DELIVERY_AM\","
				+ "\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\": [" +

				"{" + "\"id\": 1560752038640," + "\"quantity\": 1" + "}" + "]" + "}" + "]," + "\"loyaltyCode\": null,"
				+ "\"specialInstructions\": null," + "\"coupons\": null," + "\"payments\": [" + "{" + "\"invoice\":{"
				+ "\"siteProvided\": true" + "}" + "}" +

				"]," + "\"notificationRegistration\" :{" + "\"webhook\" :{"
				+ "\"url\": \"http://www.fedex.com/notify\"," + "\"auth\": \"jhgvzd\"" + "}" + "}" +

				"}" + "}";
		return postBody;

	}

	public static String Rate_PricableFlag_True(Map.Entry mapEntry) {
		String postBody = "{" + "\"rateRequest\": {" + "\"fedExAccountNumber\":null," +

				"\"products\": [" + "{" + "\"userProductName\": \"Keyboard_shortcuts_(3.0).pdf\","
				+ "\"id\": \"1456773326927\"," + "\"version\": 1," + "\"name\": \"Multi Sheet\"," + "\"qty\": 1,"
				+ "\"priceable\": true," + "\"instanceId\": 1560496226441," + "\"proofRequired\": false,"
				+ "\"isOutSourced\": false," + "\"features\": [" + "{" + "\"id\": \"1448981549109\","
				+ "\"name\": \"Paper Size\"," + "\"choice\": {" + "\"id\": \"1448986650332\"," + "\"name\": \"8.5x11\","
				+ "\"properties\": [" + "{" + "\"id\": \"1449069906033\"," + "\"name\": \"MEDIA_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1449069908929\"," + "\"name\": \"MEDIA_WIDTH\","
				+ "\"value\": \"8.5\"" + "}" + "]" + "}" + "}," + "{" + "\"id\": \"1448981549741\","
				+ "\"name\": \"Paper Type\"," + "\"choice\": {" + "\"id\": \"1448988664295\","
				+ "\"name\": \"Laser (32 lb.)\"," + "\"properties\": [" + "{" + "\"id\": \"1450324098012\","
				+ "\"name\": \"MEDIA_TYPE\"," + "\"value\": \"E32\"" + "}," + "{" + "\"id\": \"1453234015081\","
				+ "\"name\": \"PAPER_COLOR\"," + "\"value\": \"#FFFFFF\"" + "}," + "{" + "\"id\": \"1471275182312\","
				+ "\"name\": \"MEDIA_CATEGORY\"," + "\"value\": \"RESUME\"" + "}" + "]" + "}" + "}," + "{"
				+ "\"id\": \"1448981549581\"," + "\"name\": \"Print Color\"," + "\"choice\": {"
				+ "\"id\": \"1448988600611\"," + "\"name\": \"Full Color\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453242778807\"," + "\"name\": \"PRINT_COLOR\"," + "\"value\": \"COLOR\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448981549269\"," + "\"name\": \"Sides\"," + "\"choice\": {"
				+ "\"id\": \"1448988124560\"," + "\"name\": \"Single-Sided\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1461774376168\"," + "\"name\": \"SIDE\"," + "\"value\": \"SINGLE\"" + "}," + "{"
				+ "\"id\": \"1471294217799\"," + "\"name\": \"SIDE_VALUE\"," + "\"value\": \"1\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448984679218\"," + "\"name\": \"Orientation\"," + "\"choice\": {"
				+ "\"id\": \"1449000016192\"," + "\"name\": \"Vertical\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453260266287\"," + "\"name\": \"PAGE_ORIENTATION\"," + "\"value\": \"PORTRAIT\"" + "}"
				+ "]" + "}" + "}," + "{" + "\"id\": \"1448981554101\"," + "\"name\": \"Prints Per Page\","
				+ "\"choice\": {" + "\"id\": \"1448990257151\"," + "\"name\": \"One\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1455387404922\"," + "\"name\": \"PRINTS_PER_PAGE\"," + "\"value\": \"ONE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448984877869\"," + "\"name\": \"Cutting\"," + "\"choice\": {"
				+ "\"id\": \"1448999392195\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981555573\"," + "\"name\": \"Hole Punching\"," + "\"choice\": {"
				+ "\"id\": \"1448999902070\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448984877645\"," + "\"name\": \"Folding\"," + "\"choice\": {"
				+ "\"id\": \"1448999720595\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981532145\"," + "\"name\": \"Collation\"," + "\"choice\": {"
				+ "\"id\": \"1448986654687\"," + "\"name\": \"Collated\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1449069945785\"," + "\"name\": \"COLLATION_TYPE\"," + "\"value\": \"MACHINE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448981554597\"," + "\"name\": \"Binding\"," + "\"choice\": {"
				+ "\"id\": \"1448997199553\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}" + "],"
				+ "\"addOns\": []," + "\"inserts\": []," + "\"exceptions\": []," + "\"pageExceptions\": [],"
				+ "\"contentAssociations\": [" + "{"
				+ "\"parentContentReference\": \"12676310920040907285319087867590234083555\","
				+ "\"contentReference\": \"12676310921167964959004314841450720689525\"," + "\"contentType\": \"PDF\","
				+ "\"fileName\": \"Keyboard_shortcuts_(3.0).pdf\"," + "\"contentReqId\": \"1483999952979\","
				+ "\"name\": \"Multi Sheet\"," + "\"desc\": null," + "\"purpose\": \"MAIN_CONTENT\","
				+ "\"printReady\": true," + "\"pageGroups\": [" + "{" + "\"start\": 1," + "\"end\": 2,"
				+ "\"width\": 8.5," + "\"height\": 11," + "\"orientation\": \"PORTRAIT\"" + "}" + "]" + "}" + "],"
				+ "\"properties\": [" + "{" + "\"id\": \"1453242488328\"," + "\"name\": \"ZOOM_PERCENTAGE\","
				+ "\"value\": \"60\"" + "}," + "{" + "\"id\": \"1453243262198\"," + "\"name\": \"ENCODE_QUALITY\","
				+ "\"value\": \"100\"" + "}," + "{" + "\"id\": \"1453894861756\","
				+ "\"name\": \"LOCK_CONTENT_ORIENTATION\"," + "\"value\": false" + "}," + "{"
				+ "\"id\": \"1453895478444\"," + "\"name\": \"MIN_DPI\"," + "\"value\": \"150.0\"" + "}," + "{"
				+ "\"id\": \"1454950109636\"," + "\"name\": \"USER_SPECIAL_INSTRUCTIONS\"," + "\"value\": null" + "},"
				+ "{" + "\"id\": \"1455050109636\"," + "\"name\": \"DEFAULT_IMAGE_WIDTH\"," + "\"value\": \"8.5\""
				+ "}," + "{" + "\"id\": \"1455050109631\"," + "\"name\": \"DEFAULT_IMAGE_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1494365340946\"," + "\"name\": \"PREVIEW_TYPE\","
				+ "\"value\": \"DYNAMIC\"" + "}," + "{" + "\"id\": \"1470151626854\"," + "\"name\": \"SYSTEM_SI\","
				+ "\"value\": null" + "}," + "{" + "\"id\": \"1470151737965\"," + "\"name\": \"TEMPLATE_AVAILABLE\","
				+ "\"value\": \"NO\"" + "}," + "{" + "\"id\": \"1490292304798\"," + "\"name\": \"MIGRATED_PRODUCT\","
				+ "\"value\": \"true\"" + "}" + "],"
				+ "\"_cuid\": \"fxo_f74b53a5-ddcb-34e7-cf15-103fa952b1b0@@1560496240914\","
				+ "\"lastModifiedTime\": 1560496240910,"
				+ "\"docIdImage\": \"12676310921167964959004314841450720689525\"" + "}" + "]," +

				"\"recipients\": [" + "{" + "\"ref\": \"string\"," + "\"contact\": {" + "\"contactId\": null,"
				+ "\"personName\": {" + "\"firstName\": \"recpFirstName\"," + "\"lastName\": \"recpLastName\"" + "},"
				+ "\"company\": {" + "\"name\": \"\"" + "}," + "\"emailDetail\": {"
				+ "\"emailAddress\": \"5197047@fedex.com\"" + "}," + "\"phoneNumberDetails\": [" + "{"
				+ "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\"," + "\"extension\": \"\"" + "},"
				+ "\"usage\": \"PRIMARY\"" + "}" + "]" + "}," + "\"attention\": \"string\"," +

				"\"shipmentDelivery\": {" + "\"address\" : {" + "\"streetLines\":[\"79 Legacy Drive\"],"
				+ "\"city\": \"Plano\"," + "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\","
				+ "\"countryCode\":\"US\"," + "\"addressClassification\":\"HOME\"" + "}," +

				"\"fedExAccountNumber\":null," + "\"serviceType\": \"LOCAL_DELIVERY_PM\","
				+ "\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\": [" +

				"{" + "\"id\": 1560496226441," + "\"quantity\": 1" + "}" + "]" + "}" + "]," + "\"loyaltyCode\": null,"
				+ "\"specialInstructions\": null," + "\"coupons\": null" + "}" + "}";
		return postBody;
	}

	public static String Rate_PricableFlag_False(Map.Entry mapEntry) {
		String postBody = "{" + "\"rateRequest\": {" + "\"fedExAccountNumber\":null," +

				"\"products\": [" + "{"
				+ "\"userProductName\": \"AddCatalogService- folder id authorization and validation changes.doc\","
				+ "\"id\": \"1456773326927\"," + "\"version\": 1," + "\"name\": \"Multi Sheet\"," + "\"qty\": 1,"
				+ "\"priceable\": false," + "\"instanceId\": 1560752038640," + "\"proofRequired\": false,"
				+ "\"isOutSourced\": false," + "\"features\": [" + "{" + "\"id\": \"1448981549109\","
				+ "\"name\": \"Paper Size\"," + "\"choice\": {" + "\"id\": \"1448986650332\"," + "\"name\": \"8.5x11\","
				+ "\"properties\": [" + "{" + "\"id\": \"1449069906033\"," + "\"name\": \"MEDIA_HEIGHT\","
				+ "\"value\": \"11\"" + "}," + "{" + "\"id\": \"1449069908929\"," + "\"name\": \"MEDIA_WIDTH\","
				+ "\"value\": \"8.5\"" + "}" + "]" + "}" + "}," + "{" + "\"id\": \"1448981549741\","
				+ "\"name\": \"Paper Type\"," + "\"choice\": {" + "\"id\": \"1448988664295\","
				+ "\"name\": \"Laser (32 lb.)\"," + "\"properties\": [" + "{" + "\"id\": \"1450324098012\","
				+ "\"name\": \"MEDIA_TYPE\"," + "\"value\": \"E32\"" + "}," + "{" + "\"id\": \"1453234015081\","
				+ "\"name\": \"PAPER_COLOR\"," + "\"value\": \"#FFFFFF\"" + "}," + "{" + "\"id\": \"1471275182312\","
				+ "\"name\": \"MEDIA_CATEGORY\"," + "\"value\": \"RESUME\"" + "}" + "]" + "}" + "}," + "{"
				+ "\"id\": \"1448981549581\"," + "\"name\": \"Print Color\"," + "\"choice\": {"
				+ "\"id\": \"1448988600611\"," + "\"name\": \"Full Color\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453242778807\"," + "\"name\": \"PRINT_COLOR\"," + "\"value\": \"COLOR\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448981549269\"," + "\"name\": \"Sides\"," + "\"choice\": {"
				+ "\"id\": \"1448988124560\"," + "\"name\": \"Single-Sided\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1461774376168\"," + "\"name\": \"SIDE\"," + "\"value\": \"SINGLE\"" + "}," + "{"
				+ "\"id\": \"1471294217799\"," + "\"name\": \"SIDE_VALUE\"," + "\"value\": \"1\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\": \"1448984679218\"," + "\"name\": \"Orientation\"," + "\"choice\": {"
				+ "\"id\": \"1449000016192\"," + "\"name\": \"Vertical\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1453260266287\"," + "\"name\": \"PAGE_ORIENTATION\"," + "\"value\": \"PORTRAIT\"" + "}"
				+ "]" + "}" + "}," + "{" + "\"id\": \"1448981554101\"," + "\"name\": \"Prints Per Page\","
				+ "\"choice\": {" + "\"id\": \"1448990257151\"," + "\"name\": \"One\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1455387404922\"," + "\"name\": \"PRINTS_PER_PAGE\"," + "\"value\": \"ONE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448984877869\"," + "\"name\": \"Cutting\"," + "\"choice\": {"
				+ "\"id\": \"1448999392195\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981555573\"," + "\"name\": \"Hole Punching\"," + "\"choice\": {"
				+ "\"id\": \"1448999902070\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}," + "{"
				+ "\"id\": \"1448981532145\"," + "\"name\": \"Collation\"," + "\"choice\": {"
				+ "\"id\": \"1448986654687\"," + "\"name\": \"Collated\"," + "\"properties\": [" + "{"
				+ "\"id\": \"1449069945785\"," + "\"name\": \"COLLATION_TYPE\"," + "\"value\": \"MACHINE\"" + "}" + "]"
				+ "}" + "}," + "{" + "\"id\": \"1448981554597\"," + "\"name\": \"Binding\"," + "\"choice\": {"
				+ "\"id\": \"1448997199553\"," + "\"name\": \"None\"," + "\"properties\": []" + "}" + "}" + "],"
				+ "\"addOns\": []," + "\"inserts\": []," + "\"exceptions\": []," + "\"pageExceptions\": [],"
				+ "\"contentAssociations\": [" + "{"
				+ "\"parentContentReference\": \"12677787200183513748315520575440477896629\","
				+ "\"contentReference\": \"12677787201057583833202574713181171940462\"," + "\"contentType\": \"WORD\","
				+ "\"fileName\": \"AddCatalogService- folder id authorization and validation changes.doc\","
				+ "\"contentReqId\": \"1483999952979\"," + "\"name\": \"Multi Sheet\"," + "\"desc\": null,"
				+ "\"purpose\": \"MAIN_CONTENT\"," + "\"printReady\": true," + "\"pageGroups\": [" + "{"
				+ "\"start\": 1," + "\"end\": 6," + "\"width\": 8.5," + "\"height\": 11,"
				+ "\"orientation\": \"PORTRAIT\"" + "}" + "]" + "}" + "]," + "\"properties\": [" + "{"
				+ "\"id\": \"1453242488328\"," + "\"name\": \"ZOOM_PERCENTAGE\"," + "\"value\": \"60\"" + "}," + "{"
				+ "\"id\": \"1453243262198\"," + "\"name\": \"ENCODE_QUALITY\"," + "\"value\": \"100\"" + "}," + "{"
				+ "\"id\": \"1453894861756\"," + "\"name\": \"LOCK_CONTENT_ORIENTATION\"," + "\"value\": false" + "},"
				+ "{" + "\"id\": \"1453895478444\"," + "\"name\": \"MIN_DPI\"," + "\"value\": \"150.0\"" + "}," + "{"
				+ "\"id\": \"1454950109636\"," + "\"name\": \"USER_SPECIAL_INSTRUCTIONS\","
				+ "\"value\": \"need all text to be in different colours\"" + "}," + "{" + "\"id\": \"1455050109636\","
				+ "\"name\": \"DEFAULT_IMAGE_WIDTH\"," + "\"value\": \"8.5\"" + "}," + "{"
				+ "\"id\": \"1455050109631\"," + "\"name\": \"DEFAULT_IMAGE_HEIGHT\"," + "\"value\": \"11\"" + "},"
				+ "{" + "\"id\": \"1494365340946\"," + "\"name\": \"PREVIEW_TYPE\"," + "\"value\": \"DYNAMIC\"" + "},"
				+ "{" + "\"id\": \"1470151626854\"," + "\"name\": \"SYSTEM_SI\"," + "\"value\": null" + "}," + "{"
				+ "\"id\": \"1470151737965\"," + "\"name\": \"TEMPLATE_AVAILABLE\"," + "\"value\": \"NO\"" + "}," + "{"
				+ "\"id\": \"1490292304798\"," + "\"name\": \"MIGRATED_PRODUCT\"," + "\"value\": \"true\"" + "}" + "],"
				+ "\"_cuid\": \"fxo_cdf5cae0-6aaa-ee89-b8c3-0547418b447f@@1560752088259\","
				+ "\"lastModifiedTime\": 1560752145415,"
				+ "\"docIdImage\": \"12677787201057583833202574713181171940462\"" + "}" + "]," +

				"\"recipients\": [" + "{" + "\"ref\": \"string\"," + "\"contact\": {" + "\"contactId\": null,"
				+ "\"personName\": {" + "\"firstName\": \"recpFirstName\"," + "\"lastName\": \"recpLastName\"" + "},"
				+ "\"company\": {" + "\"name\": \"\"" + "}," + "\"emailDetail\": {"
				+ "\"emailAddress\": \"5197047@fedex.com\"" + "}," + "\"phoneNumberDetails\": [" + "{"
				+ "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\"," + "\"extension\": \"\"" + "},"
				+ "\"usage\": \"PRIMARY\"" + "}" + "]" + "}," + "\"attention\": \"string\"," +

				"\"shipmentDelivery\": {" + "\"address\" : {" + "\"streetLines\":[\"79 Legacy Drive\"],"
				+ "\"city\": \"Plano\"," + "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\","
				+ "\"countryCode\":\"US\"," + "\"addressClassification\":\"HOME\"" + "}," +

				"\"fedExAccountNumber\":null," + "\"serviceType\": \"LOCAL_DELIVERY_PM\","
				+ "\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\": [" +

				"{" + "\"id\": 1560752038640," + "\"quantity\": 1" + "}" + "]" + "}" + "]," + "\"loyaltyCode\": null,"
				+ "\"specialInstructions\": null," + "\"coupons\": null" + "}" + "}";
		return postBody;
	}

	public static String Order_Shipping_Reference(Map.Entry mapEntry) {
		String postBody = "{" + "\"orderSubmissionRequest\": {" + "\"fedExAccountNumber\": \"0617773880\",  "
				+ " \"site\": " + PayloadFields.getSite(mapEntry) + ", " + "\"orderContact\": {" + "\"contact\": {"
				+ "\"contactId\": null," + "\"personName\": {" + "\"firstName\": \"manish123\","
				+ "\"lastName\": \"kumar\"" + "}," + "\"company\": {" + "\"name\": \"myCompany\"" + "},"
				+ "\"emailDetail\": {" + "\"emailAddress\": \"manish123@mail.com\"" + "}," + "\"phoneNumberDetails\": ["
				+ "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\"," + "\"extension\": null" + "},"
				+ "\"usage\": \"PRIMARY\"" + "}," + "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\","
				+ "\"extension\": null" + "}," + "\"usage\": \"SECONDARY\"" + "}" + "]" + "}," + "\"attention\": null"
				+ "}," + "\"products\": [" + "{" + "\"id\": \"\"," + "\"name\": \"\"," + "\"version\": 0,"
				+ "\"instanceId\":\"1508784838901\" ," + "\"qty\": 1," + " \"catalogReference\": { " +

				"  \"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + ", " +

				" \"version\": " + PayloadFields.getVersion1(mapEntry) + " " +

				"}" + "}" + "]," + "\"recipients\": [" + "{" + "\"reference\": \"1234\"," + "\"contact\": {"
				+ "\"contactId\": null," + "\"personName\": {" + "\"firstName\": \"manish123\","
				+ "\"lastName\": \"kumar\"" + "}," + "\"company\": {" + "\"name\": \"company\"" + "},"
				+ "\"emailDetail\": {" + "\"emailAddress\": \"manish123@mail.com\"" + "}," + "\"phoneNumberDetails\": ["
				+ "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\"," + "\"extension\": \"string\"" + "},"
				+ "\"usage\": \"PRIMARY\"" + "}," + "{" + "\"phoneNumber\": {" + "\"number\": \"(986) 786-7856\","
				+ "\"extension\": \"string\"" + "}," + "\"usage\": \"SECONDARY\"" + "}" + "]" + "},"
				+ "\"attention\": null," + "\"shipmentDelivery\": {" + "\"address\" : {"
				+ "\"streetLines\":[\"7900 Legacy Drive\"]," + "\"city\": \"Plano\","
				+ "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\"," + "\"countryCode\":\"US\","
				+ "\"addressClassification\":\"HOME\"" + "}," + "\"holdUntilDate\": null,"
				+ "\"fedExAccountNumber\": null," + "\"serviceType\": \"GROUND_US\"," +

				"\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\": [" + "{" + "\"id\": \"1508784838901\"," + "\"quantity\": 1" + "}"
				+ "]" + "}" + "]," + "\"loyaltyCode\": null," + "\"specialInstructions\": \"string\","
				+ "\"coupons\": null," + "\"payments\":null," + "\"notificationRegistration\": {" + "\"webhook\" : {"
				+ "\"url\" :\"https://webhook.site/fd4c08c7-0049-4463-8f5e-2be4e9d68e22\"" + "}" + "}" + "}" + "}";
		return postBody;
	}

	public static String OrderSubmit_Using_CC(Map.Entry mapEntry) {
		String postBody = "{" + "\"orderSubmissionRequest\":{" + "\"fedExAccountNumber\":null," + "\"site\":"
				+ PayloadFields.getSite(mapEntry) + "," + "\"products\":[" + "{\"userProductName\":\"Flyers\","
				+ "\"id\":\"1447174746733\"," + "\"version\":1," + "\"name\":\"Flyer\"," + "\"qty\":1,"
				+ "\"priceable\":true," + "\"instanceId\":\"0\"," + "\"proofRequired\":false,"
				+ "\"isOutSourced\":false," + "\"features\":[" + "{" + "\"id\":\"1448981549109\","
				+ "\"name\":\"Paper Size\"," + "\"choice\":{" + "\"id\":\"1448986650332\"," + "\"name\":\"8.5x11\","
				+ "\"properties\":[" + "{\"id\":\"1449069906033\"," + "\"name\":\"MEDIA_HEIGHT\"," + "\"value\":\"11\""
				+ "}," + "{\"id\":\"1449069908929\"," + "\"name\":\"MEDIA_WIDTH\"," + "\"value\":\"8.5\"" + "}," + "{"
				+ "\"id\":\"1571841122054\"," + "\"name\":\"DISPLAY_HEIGHT\"," + "\"value\":\"11\"" + "}," + "{"
				+ "\"id\":\"1571841164815\"," + "\"name\":\"DISPLAY_WIDTH\"," + "\"value\":\"8.5\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\":\"1448981549741\"," + "\"name\":\"Paper Type\"," + "\"choice\":{"
				+ "\"id\":\"1448988661630\"," + "\"name\":\"Laser(24 lb.)\"," + "\"properties\":[" + "{"
				+ "\"id\":\"1450324098012\"," + "\"name\":\"MEDIA_TYPE\"," + "\"value\":\"LZ\"" + "}," + "{"
				+ "\"id\":\"1453234015081\"," + "\"name\":\"PAPER_COLOR\"," + "\"value\":\"#FFFFFF\"}," + "{"
				+ "\"id\":\"1471275182312\"," + "\"name\":\"MEDIA_CATEGORY\"," + "\"value\":\"PASTEL_BRIGHTS\"" + "}"
				+ "]" + "}" + "}," + "{" + "\"id\":\"1448981549581\"," + "\"name\":\"Print Color\"," + "\"choice\":{"
				+ "\"id\":\"1448988600611\"," + "\"name\":\"Full Color\"," + "\"properties\":[" + "{"
				+ "\"id\":\"1453242778807\"," + "\"name\":\"PRINT_COLOR\"," + "\"value\":\"COLOR\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\":\"1448981554101\"," + "\"name\":\"Prints Per Page\"," + "\"choice\":{"
				+ "\"id\":\"1448990257151\"," + "\"name\":\"One\"," + "\"properties\":[" + "{"
				+ "\"id\":\"1455387404922\"," + "\"name\":\"PRINTS_PER_PAGE\"," + "\"value\":\"1\"" + "}" + "]" + "}"
				+ "}," + "{" + "\"id\":\"1448984679218\"," + "\"name\":\"Orientation\"," + "\"choice\":{"
				+ "\"id\":\"1449000016327\"," + "\"name\":\"Horizontal\"," + "\"properties\":["
				+ "{\"id\":\"1453260266287\"," + "\"name\":\"PAGE_ORIENTATION\"," + "\"value\":\"LANDSCAPE\"" + "}"
				+ "]" + "}" + "}," + "{\"id\":\"1448981549269\"," + "\"name\":\"Sides\"," + "\"choice\":{"
				+ "\"id\":\"1448988124560\"," + "\"name\":\"Single-Sided\"," + "\"properties\":["
				+ "{\"id\":\"1461774376168\"," + "\"name\":\"SIDE\"," + "\"value\":\"SINGLE\"" + "}," + "{"
				+ "\"id\":\"1471294217799\"," + "\"name\":\"SIDE_VALUE\"," + "\"value\":\"1\"" + "}" + "]" + "}" + "},"
				+ "{" + "\"id\":\"1448984877869\"," + "\"name\":\"Cutting\"," + "\"choice\":{"
				+ "\"id\":\"1448999392195\"," + "\"name\":\"None\"," + "\"properties\":[" + "]" + "}" + "}," + "{"
				+ "\"id\":\"1448984679442\"," + "\"name\":\"Lamination\"," + "\"choice\":{"
				+ "\"id\":\"1448999458409\"," + "\"name\":\"None\"," + "\"properties\":[" + "]" + "}" + "}," + "{"
				+ "\"id\":\"1448981555573\"," + "\"name\":\"Hole Punching\"," + "\"choice\":{"
				+ "\"id\":\"1448999902070\"," + "\"name\":\"None\"," + "\"properties\":[" + "]" + "}" + "}," + "{"
				+ "\"id\":\"1448984877645\"," + "\"name\":\"Folding\"," + "\"choice\":{" + "\"id\":\"1448999720595\","
				+ "\"name\":\"None\"," + "\"properties\":[" + "]" + "}" + "}" + "]," + "\"pageExceptions\":[" + "],"
				+ "\"contentAssociations\":[" + "{"
				+ "\"parentContentReference\":\"17010485241106848107713474961641118282589\","
				+ "\"contentReference\":\"17010485366007647547618153294812105888191\"," + "\"contentType\":\"IMAGE\","
				+ "\"fileName\":\"Capture 1.PNG\"," + "\"contentReqId\":\"1455709847200\"," + "\"name\":\"Front_Side\","
				+ "\"desc\":null," + "\"purpose\":\"SINGLE_SHEET_FRONT\"," + "\"specialInstructions\":\"\","
				+ "\"printReady\":true," + "\"pageGroups\":[" + "{" + "\"start\":1," + "\"end\":1," + "\"width\":11,"
				+ "\"height\":8.5," + "\"orientation\":\"LANDSCAPE\"" + "}" + "]" + "}" + "]," + "\"properties\":["
				+ "{" + "\"id\":\"1453242488328\"," + "\"name\":\"ZOOM_PERCENTAGE\"," + "\"value\":\"50\"" + "}," + "{"
				+ "\"id\":\"1453243262198\"," + "\"name\":\"ENCODE_QUALITY\"," + "\"value\":\"100\"" + "}," + "{"
				+ "\"id\":\"1453894861756\"," + "\"name\":\"LOCK_CONTENT_ORIENTATION\"," + "\"value\":false" + "},"
				+ "{" + "\"id\":\"1453895478444\"," + "\"name\":\"MIN_DPI\"," + "\"value\":\"150.0\"" + "}," + "{"
				+ "\"id\":\"1454606828294\"," + "\"name\":\"SPC_TYPE_ID\"," + "\"value\":\"4\"" + "},"
				+ "{\"id\":\"1454606860996\"," + "\"name\":\"SPC_MODEL_ID\"," + "\"value\":\"3\"" + "}," + "{"
				+ "\"id\":\"1454606876712\"," + "\"name\":\"SPC_VERSION_ID\"," + "\"value\":\"3\"" + "},"
				+ "{\"id\":\"1454950109636\"," + "\"name\":\"USER_SPECIAL_INSTRUCTIONS\"," + "\"value\":null" + "},"
				+ "{\"id\":\"1455050109636\"," + "\"name\":\"DEFAULT_IMAGE_WIDTH\"," + "\"value\":\"8.5\"" + "}," + "{"
				+ "\"id\":\"1455050109631\"," + "\"name\":\"DEFAULT_IMAGE_HEIGHT\"," + "\"value\":\"11\"" + "}," + "{"
				+ "\"id\":\"1494365340946\"," + "\"name\":\"PREVIEW_TYPE\"," + "\"value\":\"DYNAMIC\"" + "}," + "{"
				+ "\"id\":\"1470151626854\"," + "\"name\":\"SYSTEM_SI\"," + "\"value\":null" + "}," + "{"
				+ "\"id\":\"1470151737965\"," + "\"name\":\"TEMPLATE_AVAILABLE\"," + "\"value\":\"YES\"" + "}," + "{"
				+ "\"id\":\"1490292304798\"," + "\"name\":\"MIGRATED_PRODUCT\"," + "\"value\":\"true\"" + "}," + "{"
				+ "\"id\":\"1558382273340\"," + "\"name\":\"PNI_TEMPLATE\"," + "\"value\":\"NO\"" + "}" + "]" + "}"
				+ "]," + "\"profileAccountId\":null," + "\"recipients\":[" + "{" + "\"reference\":\"\","
				+ "\"contact\":{" + "\"contactId\":null," + "\"personName\":{" + "\"firstName\":\"ghjgj\","
				+ "\"lastName\":\"jjhkj\"" + "}," + "\"company\":{" + "\"name\":\"\"" + "}," + "\"emailDetail\":{"
				+ "\"emailAddress\":\"jhkjH@KJhkjh.com\"" + "}," + "\"phoneNumberDetails\":[" + "{"
				+ "\"phoneNumber\":{" + "\"number\":\"8979879879\"," + "\"extension\":\"\"" + "},"
				+ "\"usage\":\"PRIMARY\"" + "}" + "]" + "}," + "\"attention\":null," + "\"shipmentDelivery\":{"
				+ "\"address\":{" + "\"streetLines\":[\"" + PayloadFields.getSd_StreetLines(mapEntry) + "\"],"
				+ "\"city\": " + PayloadFields.getSd_City(mapEntry) + "," + "\"stateOrProvinceCode\": "
				+ PayloadFields.getSd_StateCode(mapEntry) + "," + "\"postalCode\": "
				+ PayloadFields.getSd_PostalCode(mapEntry) + "," + "\"countryCode\": \"US\","
				+ "\"addressClassification\": \"BUSINESS\"" + "}," + "\"holdUntilDate\": "
				+ PayloadFields.getShipmentDeliveryHoldUntilDate(mapEntry) + "," + "\"fedExAccountNumber\": null,"
				+ "\"serviceType\":\"LOCAL_DELIVERY_AM\","
				+ "\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\":[" + "{" + "\"id\":0," + "\"quantity\":1" + "}" + "]" + "}" + "],"
				+ "\"loyaltyCode\":null," + "\"specialInstructions\":\"\"," + "\"coupons\":[]," + "\"orderContact\":{"
				+ "\"contact\":{" + "\"contactId\":null," + "\"personName\":{" + "\"firstName\":\"Fedex12\","
				+ "\"lastName\":\"User12\"" + "}," + "\"company\":{" + "\"name\":\"\"" + "}," + "\"emailDetail\":{"
				+ "\"emailAddress\":\"busa_kavyapurnima@syntelinc.com\"" + "}," + "\"phoneNumberDetails\":[" + "{"
				+ "\"phoneNumber\":{" + "\"number\":\"8802627709\"," + "\"extension\":null" + "},"
				+ "\"usage\":\"PRIMARY\"" + "}" + "]" + "}," + "\"attention\":\"\"" + "}," + "\"payments\":[" + "{"
				+ "\"creditCard\":{" + "\"siteProvided\":false," + "\"profileCreditCardId\":null,"
				+ "\"encryptedCreditCard\":\"sA6HmRE8hLCIliCuNhU5HCIVHcE161H80vWgnjqdNVjmm26TThPW9HspLoLplBYExbCtNQ4zu3X2YVvGHKtDlYbgVfuxap8uijej7ptfeoWfaXv3MHEgMOz0IPzeOomQY6JBzkTNH0iNN40WfUC7Q2cvAYDdZ6iAsX45uGoA8Olhlz6HFx5qVFCu6iw/j06wf72uBk9OeOnebsYMevkYC2j3p/rmX+HH5hqAMGcwb+zRalaaJRAVoZuh4gDqeHlXHUwGQD7kMMVHFPobfl/W2PYR2XSRMg4vG32zgPKob/EJRekzpqXB6tphXhHS6a1QD9NfZb2C79803gB3xnItSQ==\","
				+ "\"cardNumber\":null," + "\"expirationMonth\":\"01\"," + "\"expirationYear\":\"2021\","
				+ "\"cvv\":null," + "\"cardHolderName\":\"test card\"," + "\"billingAddress\":{"
				+ "\"streetLines\":[\"7900 Legacy Dr\",null]," + "\"city\":\"Plano\","
				+ "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\":\"75024\","
				+ "\"countryCode\":\"United States of America\"," + "\"addressClassification\":null" + "},"
				+ "\"type\":\"VISA\"" + "}," + "\"poNumber\":null," + "" + "\"billingFields\":[]," + "\"invoice\":null"
				+ "}" + "]" + "}" +

				"}";
		return postBody;
	}

	public static String OrderSubmit_PickUP(Map.Entry mapEntry) {
		String postBody = "{" + "\"orderSubmissionRequest\":{" + "\"fedExAccountNumber\":"
				+ PayloadFields.getFedExAccountNumber(mapEntry) + "," + "\"site\":" + PayloadFields.getSite(mapEntry)
				+ "," + "\"products\":[" + "{" + "\"id\":\"1508784838900\"," + "\"name\":\"Legacy Catalog\","
				+ "\"qty\":\"1\"," + "\"catalogReference\":{" + "  \"catalogProductId\": "
				+ PayloadFields.getCatalogProductId1(mapEntry) + ", " + " \"version\": "
				+ PayloadFields.getVersion1(mapEntry) + " " + "}," + "\"instanceId\":\"0\"" + "}" + "],"
				+ "\"recipients\":[" + "{" + "\"reference\":\"\"," + "\"contact\":{" + "\"contactId\":null,"
				+ "\"personName\":{" + "\"firstName\":\"test\"," + "\"lastName\":\"test\"" + "}," + "\"company\":{"
				+ "\"name\":\"\"" + "}," + "\"emailDetail\":{" + "\"emailAddress\":\"test@test.com\"" + "},"
				+ "\"phoneNumberDetails\":[" + "{" + "\"phoneNumber\":{" + "\"number\":\"8956858958\","
				+ "\"extension\":\"\"" + "}," + "\"usage\":\"PRIMARY\"" + "}" + "]" + "}," + "\"attention\":null,"
				+ "\"pickUpDelivery\":{" + "\"location\":{" + "\"id\":\"9914\"" + "},"
				+ "\"requestedPickupLocalTime\":\"2020-12-30T09:00:00\"" + "}," + "\"productAssociations\":[" + "{"
				+ "\"id\":0," + "\"quantity\":\"1\"" + "}" + "]" + "}" + "]," + "\"loyaltyCode\":null,"
				+ "\"specialInstructions\":\"\"," + "\"coupons\":null," + "\"orderContact\":{" + "\"contact\":{"
				+ "\"contactId\":null," + "\"personName\":{" + "\"firstName\":\"test\"," + "\"lastName\":\"test\""
				+ "}," + "\"company\":{" + "\"name\":\"\"" + "}," + "\"emailDetail\":{"
				+ "\"emailAddress\":\"test@test.com\"" + "}," + "\"phoneNumberDetails\":[" + "{" + "\"phoneNumber\":{"
				+ "\"number\":\"8956858958\"," + "\"extension\":\"\"" + "}," + "\"usage\":\"PRIMARY\"" + "}" + "]"
				+ "}," + "\"attention\":\"\"" + "}," + "\"payments\":[" + "{" + "\"poNumber\":null," + "\"invoice\":{"
				+ "\"siteProvided\":false" + "}," + "\"creditCard\":null," + "\"billingFields\":[" + "]" + "}" + "]"
				+ "}" +

				"}";
		return postBody;
	}

	public static String Rate_Order_Shipment_Delivery(Map.Entry mapEntry) {
		String postBody = "{" +

				"\"rateRequest\": {" + "\"fedExAccountNumber\": " + PayloadFields.getFedExAccountNumber(mapEntry) + ","
				+ "\"site\": " + PayloadFields.getSite(mapEntry) + "," + "\"products\": [" + "{"
				+ "\"id\": 1508784838900," + "\"name\": \"string\"," + "\"version\": 1," + "\"instanceId\": 123456789,"
				+ "\"userProductName\": \"string\"," + "\"qty\": 1," +

				" \"catalogReference\": { " +

				"  \"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + ", " +

				" \"version\": " + PayloadFields.getVersion1(mapEntry) + " " + "}," + "}" + "}" + "],"
				+ "\"recipients\": [" + "{" + "\"reference\": \"Abcd\"," + "\"contact\": null,"
				+ "\"attention\": \"string\"," + "\"shipmentDelivery\": {" + "\"address\" : {" + "\"streetLines\":[\""
				+ PayloadFields.getSd_StreetLines(mapEntry) + "\"]," + "\"city\": " + PayloadFields.getSd_City(mapEntry)
				+ "," + "\"stateOrProvinceCode\": " + PayloadFields.getSd_StateCode(mapEntry) + "," + "\"postalCode\": "
				+ PayloadFields.getSd_PostalCode(mapEntry) + "," + "\"countryCode\": "
				+ PayloadFields.getba_countryCode(mapEntry) + "," + "\"addressClassification\": \"BUSINESS\"" + "},"
				+ "\"holdUntilDate\": " + PayloadFields.getShipmentDeliveryHoldUntilDate(mapEntry) + ","
				+ "\"serviceType\": " + PayloadFields.getShipmentDeliveryServiceType(mapEntry) + ","
				+ "\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}, " + "\"productAssociations\": [" + "{" + "\"id\": \"123456789\"," + "\"quantity\": 1" + "}" + "]"
				+ "}" + "]," + "\"loyaltyCode\": null," + "\"specialInstructions\": \"string\"," + "\"coupons\": null"
				+ "}" +

				"}";
		return postBody;
	}

	public static String RateOrder_without_Recipient(Map.Entry mapEntry) {

		String postBody = "{" + "\"rateRequest\": {" + "\"fedExAccountNumber\": "
				+ PayloadFields.getFedExAccountNumber(mapEntry) + "," + "\"site\": " + PayloadFields.getSite(mapEntry)
				+ "," + "\"products\": [" + "{" + "\"id\": 1508784838900," + "\"name\": \"string\"," + "\"version\": 1,"
				+ "\"instanceId\": \"1234567890\"," + "\"userProductName\": null," + "\"qty\": 1," + "\"properties\": ["
				+ "{" + "\"id\": 0," + "\"name\": null," + "\"value\": null" + "}" + "]," +

				" \"catalogReference\": { " +

				"  \"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + ", " +

				" \"version\": " + PayloadFields.getVersion1(mapEntry) + " " + "}" + "}" + "]," + "\"recipients\":null,"
				+ "\"loyaltyCode\": null," + "\"specialInstructions\": null," + "\"coupons\": [" +

				"]" + "}" + "}";
		return postBody;
	}

	public static String Rate_Coupon_Code(Map.Entry mapEntry) {
		String postBody = "{" +

				" \"rateRequest\": { " +

				"  \"fedExAccountNumber\":" + PayloadFields.getFedExAccountNumber(mapEntry) + ", " +

				" \"site\": " + PayloadFields.getSite(mapEntry) + ", " +

				" \"products\": [ " +

				"{" +

				" \"id\": 0, " +

				" \"name\": null, " +

				" \"version\": 0, " +

				" \"instanceId\": " + PayloadFields.getProdinstanceId1(mapEntry) + ", " +

				" \"userProductName\": null, " +

				"  \"qty\": " + PayloadFields.getProdqty1(mapEntry) + ", " +

				"  \"properties\": [ " +

				"{" +

				" \"id\": 0, " +

				"  \"name\": null, " +

				" \"value\": null " +

				"}" +

				"]," +

				" \"catalogReference\": { " +

				"  \"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + ", " +

				" \"version\": " + PayloadFields.getVersion1(mapEntry) + " " +

				"}" +

				"}," +

				" {" +

				"\"id\": 0, " +

				"\"name\": null, " +

				"\"version\": 0, " +

				"\"instanceId\": " + PayloadFields.getProdinstanceId2(mapEntry) + "," +

				"\"userProductName\": null, " +

				"\"qty\": " + PayloadFields.getProdqty2(mapEntry) + ", " +

				"\"properties\": [ " +

				" {" +

				"\"id\": 0, " +

				"\"name\": null, " +

				"\"value\": null " +

				" }" +

				" ]," +

				"\"catalogReference\": {" +

				"\"catalogProductId\": " + PayloadFields.getCatalogProductId2(mapEntry) + "," +

				"\"version\": " + PayloadFields.getVersion2(mapEntry) + " " +

				"}" +

				"}" +

				"]," +

				"\"recipients\": [" +

				"{" +

				"\"reference\": " + PayloadFields.getRecipient_reference(mapEntry) + ", " +

				"\"contact\": {" +

				"\"contactId\": " + PayloadFields.getContactID(mapEntry) + "," +

				"\"personName\": {" +

				"\"firstName\": " + PayloadFields.getRecipient_firstName(mapEntry) + "," +

				"\"lastName\": " + PayloadFields.getRecipient_lastName(mapEntry) + " " +

				"}," +

				"\"company\": {" +

				"\"name\": " + PayloadFields.getCompany(mapEntry) + " " +

				"}," +

				"\"emailDetail\": {" +

				"\"emailAddress\": " + PayloadFields.getEmail(mapEntry) + "" +

				"}," +

				"\"phoneNumberDetails\": [" +

				"{" +

				"\"phoneNumber\": {" +

				"\"number\": " + PayloadFields.getPhoneNumber(mapEntry) + "," +

				"\"extension\": " + PayloadFields.getExtension(mapEntry) + "" +

				"}," +

				"\"usage\":" + PayloadFields.getUsage1(mapEntry) + " " +

				"}," +

				"{" +

				"\"phoneNumber\": {" +

				"\"number\": " + PayloadFields.getPhoneNumber(mapEntry) + "," +

				"\"extension\": " + PayloadFields.getExtension(mapEntry) + "" +

				"}," +

				"\"usage\": " + PayloadFields.getUsage2(mapEntry) + " " +

				"}" +

				"]" +

				"}," +

				"\"attention\": " + PayloadFields.getAttention(mapEntry) + "," +

				"\"shipmentDelivery\": {" +

				"\"address\" : {" +

				"\"streetLines\":[\"" + PayloadFields.getSd_StreetLines(mapEntry) + "\"]," +

				"\"city\": " + PayloadFields.getSd_City(mapEntry) + "," +

				"\"stateOrProvinceCode\":" + PayloadFields.getSd_StateCode(mapEntry) + "," +

				"\"postalCode\": " + PayloadFields.getSd_PostalCode(mapEntry) + "," +

				"\"countryCode\":" + PayloadFields.getSd_CntyCode(mapEntry) + "," +

				"\"addressClassification\":\"\" " +

				"}," +

				"\"holdUntilDate\": " + PayloadFields.getShipmentDeliveryHoldUntilDate(mapEntry) + "," +

				"\"serviceType\": " + PayloadFields.getShipmentDeliveryServiceType(mapEntry) + "," +

				"\"fedExAccountNumber\": " + PayloadFields.getShipmentDeliveryFedExAccountNumber(mapEntry) + "," +

				"\"deliveryInstructions\": " + PayloadFields.getDeliveryInstructions(mapEntry) + "" +

				"}," +

				"\"productAssociations\": [ " +

				"{" +

				"\"id\": " + PayloadFields.getProductAssociations_id1(mapEntry) + "," +

				"\"quantity\": " + PayloadFields.getProductAssociations_qty1(mapEntry) + "" +

				"}," +

				"{" +

				"\"id\": " + PayloadFields.getProductAssociations_id2(mapEntry) + "," +

				"\"quantity\": " + PayloadFields.getProductAssociations_qty2(mapEntry) + "" +

				"}" +

				" ]" +

				"}" +

				"]," +

				" \"loyaltyCode\": " + PayloadFields.getLoyaltyCode(mapEntry) + ", " +

				" \"specialInstructions\": " + PayloadFields.getSpecialInstructions(mapEntry) + ", " +

				" \"coupons\": [ " + "{" + "\"code\":\"AAT456\"" + "}" +

				"]" +

				"}" +

				"}";// ";

		return postBody;
	}

	public static String OrderSubmit_CouponCode(Map.Entry mapEntry) {
		String postBody = "{" + "\"orderSubmissionRequest\": {" + "\"fedExAccountNumber\": "
				+ PayloadFields.getFedExAccountNumber(mapEntry) + "," + "\"orderContact\": {" + "\"contact\": {"
				+ "\"contactId\": null," + "\"personName\": {" + "\"firstName\": \"contactFirstName\","
				+ "\"lastName\": \"contactLastName\"" + "}," + "\"company\": {" + "\"name\": \"myCompany\"" + "},"
				+ "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\"" + "}," + "\"phoneNumberDetails\": ["
				+ "{" + "\"phoneNumber\": {" + "\"number\": \"4699804371\"," + "\"extension\": \"\"" + "},"
				+ "\"usage\": \"PRIMARY\"" + "}," + "{" + "\"phoneNumber\": {" + "\"number\": \"4699804371\","
				+ "\"extension\": \"1234567\"" + "}," + "\"usage\": \"SECONDARY\"" + "}" + "]" + "},"
				+ "\"attention\": \"Mr\"" + "}," + " \"site\": " + PayloadFields.getSite(mapEntry) + ", "
				+ "\"products\": [" + "{" + "\"name\": \"string\"," + "\"version\": 2,"
				+ "\"userProductName\": \"string\"," + "\"qty\": 1," + "\"id\": 1456773326927,"
				+ "\"instanceId\": \"0\"," + " \"catalogReference\": { " +

				"\"catalogProductId\": " + PayloadFields.getCatalogProductId1(mapEntry) + "," + "\"version\": "
				+ PayloadFields.getVersion1(mapEntry) + " " +

				"}" + "}" + "]," + "\"recipients\": [" + "{" + "\"reference\": \"Abcd\"," + "\"contact\": {"
				+ "\"contactId\": null," + "\"personName\": {" + "\"firstName\": \"recpFirstName\","
				+ "\"lastName\": \"recpLastName\"" + "}," + "\"company\": {" + "\"name\": \"\"" + "},"
				+ "\"emailDetail\": {" + "\"emailAddress\": \"5197047@fedex.com\"" + "}," + "\"phoneNumberDetails\": ["
				+ "{" + "\"phoneNumber\": {" + "\"number\": \"4694493693\"," + "\"extension\": \"string\"" + "},"
				+ "\"usage\": \"Primary\"" + "}," + "{" + "\"phoneNumber\": {" + "\"number\": \"4694493692\","
				+ "\"extension\": \"string\"" + "}," + "\"usage\": \"Secondary\"" + "}" + "]" + "},"
				+ "\"attention\": \"string\"," + "\"shipmentDelivery\": {" + "\"address\" : {"
				+ "\"streetLines\":[\"4152 Spring Creek Pkwy\"]," + "\"city\": \"Plano\","
				+ "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\"," + "\"countryCode\":\"US\","
				+ "\"addressClassification\":\"BUSINESS\"" + "}," +

				"\"serviceType\": \"LOCAL_DELIVERY_AM\"," +

				"\"deliveryInstructions\": \"Contains any detailed instructions or requests that the customer wishes to specify.\""
				+ "}," + "\"productAssociations\": [" + "{" + "\"id\": \"0\"," + "\"quantity\": 1" + "}" + "]" + "}"
				+ "]," + "\"loyaltyCode\": null," + "\"specialInstructions\": \"This is user entered instruction\","
				+ " \"coupons\": [ " + "{" + "\"code\":\"AAT457\"" + "}" +

				"]," + "\"payments\": [" + "{" + "\"poNumber\": \"1234\"" + "}" + "]" +

				"}" +

				"}";
		return postBody;
	}

	public static String RateNew(Map.Entry mapEntry) {
		String postBody = "{" + "\"rateRequest\":{" + "\"fedExAccountNumber\":\"0705532559\","
				+ "\"site\":\"infogain\"," + "\"products\":[" + "{" + "\"id\":\"1508784838900\","
				+ "\"name\":\"Legacy Catalog\"," + "\"qty\":\"1\"," + "\"catalogReference\":{"
				+ "\"catalogProductId\": \"b5714891-15a4-410c-b573-f4c9a3febab2\","
				+ "\"version\": \"DOC_20190716_14727708513_1\"" + "}," + "\"instanceId\":\"0\"" + "}" + "],"
				+ "\"recipients\":[" + "{" + "\"contact\":{" + "\"contactId\":\"\"," + "\"personName\":{"
				+ "\"firstName\":\"fdgfd\"," + "\"lastName\":\"gfdgfd\"" + "}," + "\"company\":{" + "\"name\":\"\""
				+ "}," + "\"emailDetail\":{" + "\"emailAddress\":\"gfdgdfg@dgd.com\"" + "},"
				+ "\"phoneNumberDetails\":[" + "{" + "\"phoneNumber\":{" + "\"number\":\"8758458956\","
				+ "\"extension\":\"\"" + "}," + "\"usage\":\"PRIMARY\"" + "}" + "]" + "}," + "\"reference\":\"\","
				+ "\"attention\":null," + "\"shipmentDelivery\": {" + "\"address\" : {"
				+ "\"streetLines\":[\"4152 Spring Creek Pkwy\"]," + "\"city\": \"Plano\","
				+ "\"stateOrProvinceCode\":\"TX\"," + "\"postalCode\": \"75024\"," + "\"countryCode\":\"US\","
				+ "\"addressClassification\":\"BUSINESS\"" + "}," + "\"holdUntilDate\":\"2020-10-30\","
				+ "\"serviceType\":\"LOCAL_DELIVERY_AM\"" +

				"}," + "\"productAssociations\":[" + "{" + "\"id\":0," + "\"quantity\":\"1\"" + "}" + "]" + "}" + "],"
				+ "\"loyaltyCode\":null," + "\"specialInstructions\":null," + "\"coupons\":[]" + "}" +

				"}";
		return postBody;
	}

	public static String billingFieldsWithRegEX(Map.Entry mapEntry) {

		String postBody =

				"{" + "\"billingFields\":[{\"label\":\"string\"," + "\"defaultValue\":\"string\"," + "\"hidden\":true,"
						+ "\"userEntryAllowed\":true," + "\"values\":[\"string\"]," + "\"required\":true,"
						+ "\"regEx\":null," + "\"errorMessage\":\"string\","
						+ "\"valueRequirements\":{\"required\":true," + "\"regEx\":\"string\","
						+ "\"errorMessage\":\"string\"" + "}" + "}" + "]" + "}";

		return postBody;
	}

	public static String billingFieldsWithOutRegEX(Map.Entry mapEntry) {

		String postBody =

				"{" + "\"billingFields\":[{\"label\":\"string\"," + "\"defaultValue\":\"string\"," + "\"hidden\":true,"
						+ "\"userEntryAllowed\":true," + "\"values\":[\"string\"]," + "\"required\":true,"
						+ "\"regEx\":null," + "\"errorMessage\":\"string\","
						+ "\"valueRequirements\":{\"required\":true," + "\"regEx\":\"string\","
						+ "\"errorMessage\":\"string\"" + "}" + "}" + "]" + "}";

		return postBody;
	}

	public static String CreditCardOptions(Map.Entry mapEntry) {
		String postBody = "{" + "\"creditCardOptions\":{\"allowUserProvided\":false,"
				+ "\"allowSiteProvided\":false,\"poNumberRequirements\":{\"label\":\"string\","
				+ "\"defaultValue\":\"string\",\"hidden\":true,\"userEntryAllowed\":true,"
				+ "\"values\":[\"string\"],\"required\":true,\"regEx\":\"string\",\"errorMessage\":\"string\","
				+ "\"valueRequirements\":{\"required\":true,\"regEx\":\"string\",\"errorMessage\":\"string\"}},"
				+ "\"creditCards\":[{\"type\":\"DISCOVER\","
				+ "\"encryptedCreditCard\":\"JEKfOuLUG4A7RR8+sUvzOiLZ+4/n0QjQbCSTm1ccQIZPz4JURwdUrZAu6ARa2/bOA36neGxPmmuOrXBe1v8BbmK8l18fySleRPdsgSINkKj4A9U6ZIfgHRjr21K9Fyckmd7PIZWn2RSvSjUyTTJe/lDPBGUJGE91xtrUv3OqZGRLyD9ZpR8kINie5UYHnOoWQk5upFvpcBpQHnlIX/88NYvO0MpqZwcBzWlRTtQXJ+B5U7DKKUmgYQoNuwQoGJmC5cw1L05RTMFgMgw3M8clk4JhYS8kNvdw13RYGOIhwbjoKoS/a2XVl87BoCovNYBE0Dtba/97mThylCuql0EWTw==\","
				+ "\"expirationMonth\":\"04\",\"expirationYear\":\"2020\",\"cardHolderName\":\"string\","
				+ "\"billingAddress\":{\"streetLines\":[\"7900 legacy drive\"],\"city\":\"plano\",\"stateOrProvinceCode\":\"TX\","
				+ "\"postalCode\":\"75024\",\"countryCode\":\"US\",\"addressClassification\":\"HOME\"},\"default\":true"
				+ "}" + "]" + "}" + "}";

		return postBody;

	}
}
