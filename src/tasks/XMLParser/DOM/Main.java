package tasks.XMLParser.DOM;

import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File fileXml = new File("D:\\Навчання\\Colections\\src\\tasks\\XMLParser\\DOM\\test.xml");
        DOMParseXMLOrder parser = new DOMParseXMLOrder(fileXml);
        try {
            ArrayList<AddresaOrder> addresaOrders = parser.geOrdera();
            for (AddresaOrder a:addresaOrders) {
                System.out.println(a);
            }
        } catch (ParserConfigurationException | IOException | SAXException e) {
            e.printStackTrace();
        }
    }
}
