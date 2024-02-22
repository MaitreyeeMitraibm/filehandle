package ibm.com.Filehandle;

import Filehandling.XmlJsonParser;

public class App {
    public static void main(String[] args) {
        String xmlFilePath = "C:\\Users\\MaitreyeeMitra\\eclipse-workspace\\Filehandle\\src\\main\\java\\Filehandling\\student.xml";
        try {
            // Convert XML to JSON and parse it
            XmlJsonParser.XmlToJsonAndPrintData(xmlFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
