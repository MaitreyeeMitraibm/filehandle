package Filehandling;

import org.json.JSONObject;

public class XmlJsonParser {

    public static void XmlToJsonAndPrintData(String xmlFilePath) throws Exception {
        // Convert XML to JSON
        JSONObject jsonObject = XmlToJsonConverter.convertXmlToJson(xmlFilePath);

        // Print JSON object
        System.out.println(jsonObject.toString(4)); // Indented JSON output
    }
}
