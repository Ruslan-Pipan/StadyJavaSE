package tasks.XMLParser.JAXB;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "dataObj")
public class DataObject {
    @XmlElement
    private int i;

    @XmlElement
    @XmlElementWrapper(name = "hold")
    List<String> strings;

    public DataObject(){}

    public DataObject(int i, List<String> strings) {
        this.i = i;
        this.strings = strings;
    }

    @Override
    public String toString() {
        return "DataObject{" +
                "i=" + i +
                ", strings=" + strings +
                '}';
    }
}
