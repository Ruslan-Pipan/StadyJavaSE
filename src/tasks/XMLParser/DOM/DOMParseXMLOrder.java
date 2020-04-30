package tasks.XMLParser.DOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class DOMParseXMLOrder {
    private File fileXml;


    public DOMParseXMLOrder(File fileXml) {
        this.fileXml = fileXml;
    }

    public ArrayList<AddresaOrder> geOrdera() throws ParserConfigurationException, IOException, SAXException {
        ArrayList<AddresaOrder> addresaOrderList = new ArrayList<>();;

        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = dbf.newDocumentBuilder();
        Document doc = db.parse(fileXml);

        Element rootEle = doc.getDocumentElement();

        NodeList nodeList = rootEle.getChildNodes();

        for (int i = 0; i < nodeList.getLength(); i++){
            Node node = nodeList.item(i);
           if (node.getNodeType() == Node.ELEMENT_NODE && node.getNodeName().equals("Address")){

               Element element = (Element) node;
               String type = ((Element) node).getAttribute("Type");
               NodeList nodaName = element.getElementsByTagName("Name");
               NodeList nodaStreet = element.getElementsByTagName("Street");
               NodeList nodaCity = element.getElementsByTagName("City");
               NodeList nodeState = element.getElementsByTagName("State");
               NodeList nodeZip = element.getElementsByTagName("Zip");
               NodeList nodeCountry = element.getElementsByTagName("Country");

               String name = nodaName.item(0).getChildNodes().item(0).getNodeValue();
               String street = nodaStreet.item(0).getChildNodes().item(0).getNodeValue();
               String city = nodaCity.item(0).getChildNodes().item(0).getNodeValue();
               String state = nodeState.item(0).getChildNodes().item(0).getNodeValue();
               int zip = Integer.parseInt(nodeZip.item(0).getChildNodes().item(0).getNodeValue());
               String country = nodeCountry.item(0).getChildNodes().item(0).getNodeValue();

               addresaOrderList.add(new AddresaOrder(type,name,street,city,state,zip,country));
           }
        }

        return addresaOrderList;
    }

}
