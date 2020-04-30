package tasks.XMLParser.SAX;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;
import tasks.XMLParser.DOM.AddresaOrder;

import java.util.ArrayList;


public class SimpleParser extends DefaultHandler{
    private String thisElement = null;
    private ArrayList<AddresaOrder> listOrder = new ArrayList<>();

    private String type,name,streat,sity,statel,country = null;
    private int zipe = 0;

    @Override
    public void startElement(String namespaceURI, String localName, String qName, Attributes atts) throws SAXException{
        thisElement = qName;
        if (thisElement.equals("Address"))
            type = atts.getValue("Type");
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException{
        String information = new String(ch,start,length);
        information = information.replace("\n","").trim();
        if (!information.isEmpty()){
            if (thisElement.equals("Name"))
                name = information;
            if (thisElement.equals("Street"))
                streat = information;
            if (thisElement.equals("City"))
                sity = information;
            if (thisElement.equals("State"))
                statel  = information;
            if (thisElement.equals("Zip"))
                zipe = Integer.parseInt(information);
            if (thisElement.equals("Country"))
                country = information;
        }
    }
    @Override
    public void endElement (String uri, String localName, String qName){
        if (type!= null && name != null && streat != null && sity !=null && statel != null && zipe !=0 && country!=null){
            listOrder.add(new AddresaOrder(type,name,streat,sity,statel,zipe,country));
            type = name = streat = sity = statel = country = null;
            zipe = 0;
        }

    }

    public ArrayList<AddresaOrder> getListOrder(){
        return listOrder;
    }
}
