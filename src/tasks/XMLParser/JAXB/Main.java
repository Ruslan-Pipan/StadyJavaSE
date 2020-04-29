package tasks.XMLParser.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            File file = new File("D:\\Навчання\\Colections\\src\\tasks\\XMLParser\\JAXB\\test.fxml");
            List<String> list = new ArrayList<>();
            list.add("LOL");
            list.add("fdsa fds");
            list.add("Pedro");
            list.add("Ruslan");

            DataObject dataObject = new DataObject(4, list);
            JAXBContext jc = JAXBContext.newInstance(DataObject.class);
            Marshaller m = jc.createMarshaller();
            Unmarshaller um = jc.createUnmarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            m.marshal(dataObject, file);

            DataObject unData = (DataObject) um.unmarshal(file);

            System.out.println(unData);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
