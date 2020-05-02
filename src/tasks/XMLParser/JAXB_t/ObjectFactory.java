package tasks.XMLParser.JAXB_t;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

@XmlRegistry
public class ObjectFactory {

    private final static QName QNAME = new QName(XMLConstants.NULL_NS_URI, "data");

    @XmlElementDecl(name = "dataObj")
    public JAXBElement<DataObject> createData(DataObject value){
        return new JAXBElement<DataObject>(QNAME, DataObject.class,null,value);
    }
}
