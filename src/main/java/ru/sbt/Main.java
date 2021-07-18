package ru.sbt;

import generated.People;
import org.springframework.core.io.InputStreamResource;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.xml.sax.SAXException;

import javax.naming.spi.ObjectFactory;
import javax.xml.XMLConstants;
import javax.xml.bind.*;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) throws JAXBException, SAXException {
        JAXBContext jaxbContext = JAXBContext.newInstance(People.class);

        //Create Unmarshaller
        Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

        //Setup schema validator
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema employeeSchema = sf.newSchema(new File("C:\\Users\\Bogdan\\MyProjects\\h2-db-work-project\\src\\main\\resources\\employee.xsd"));
        jaxbUnmarshaller.setSchema(employeeSchema);

        //Unmarshal xml file
        People employee = (People) jaxbUnmarshaller.unmarshal(new File("C:\\Users\\Bogdan\\MyProjects\\h2-db-work-project\\src\\main\\resources\\employee.xml"));

        System.out.println(employee);
    }
}
