package tasks.XMLParser.SAX;

import org.xml.sax.SAXException;
import tasks.XMLParser.DOM.AddresaOrder;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        File file = new File("D:\\Навчання\\Colections\\src\\tasks\\XMLParser\\SAX\\test.xml");
        SAXParserFactory parsesF = SAXParserFactory.newInstance();
        SimpleParser simpleParser = new SimpleParser();
        try {
            SAXParser parser= parsesF.newSAXParser();
            parser.parse(file,simpleParser);
            ArrayList<AddresaOrder> list = simpleParser.getListOrder();
            for (AddresaOrder a:list) {
                System.out.println(a);
            }
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }
}
