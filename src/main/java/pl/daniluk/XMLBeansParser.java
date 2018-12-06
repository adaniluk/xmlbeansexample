package pl.daniluk;

import org.apache.xmlbeans.XmlException;
import org.apache.xmlbeans.XmlObject;

import java.io.File;
import java.io.IOException;

public class XMLBeansParser {

    public static void main(String[] args) {
        System.out.println("Hello World!"); // Display the string.

        File xmlFile = new File("/home/artix/DEV/java/xmlbeans-example/src/main/resources/input/test.xml");
        XmlObject xml = null;
        try {
            xml = XmlObject.Factory.parse(xmlFile);
        } catch (XmlException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(xml);
    }
}

