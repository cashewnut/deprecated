//import com.sun.xml.internal.messaging.saaj.soap.name.NameImpl;
//
//import javax.xml.soap.Name;
//import javax.xml.soap.SOAPElement;
//import javax.xml.soap.SOAPElementFactory;
//import javax.xml.soap.SOAPException;
//import javax.xml.stream.XMLInputFactory;
//import java.net.MalformedURLException;
//import java.rmi.server.RMIClassLoader;
//
//public class Exp5 {
//
//    public void fun() throws MalformedURLException, ClassNotFoundException, SOAPException {
//
//        Class<Exp1> clazz = (Class<Exp1>) RMIClassLoader.loadClass("HashMap");
//        XMLInputFactory.newInstance("factory", RMIClassLoader.getClassLoader("HashMap"));
//        SOAPElementFactory factory = SOAPElementFactory.newInstance();
//        SOAPElement soapElement1 = factory.create("soap");
//        Name name = NameImpl.create("localname","prefix","uri");
//        SOAPElement soapElement2 = factory.create(name);
//        SOAPElement soapElement3 = factory.create("localname","prefix","uri");
//
//    }
//
//}
//
//


import com.sun.xml.internal.messaging.saaj.soap.name.NameImpl;
import javax.xml.soap.Name;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPElementFactory;
import javax.xml.soap.SOAPException;
import javax.xml.stream.XMLInputFactory;
import java.net.MalformedURLException;
import java.rmi.server.RMIClassLoader;
import javax.xml.soap.SOAPFactory;

public class Exp5 {

    public void fun() throws MalformedURLException, ClassNotFoundException, SOAPException {
        Class<Exp1> clazz = (Class<Exp1>) RMIClassLoader.loadClass((String) null, "HashMap");
        XMLInputFactory.newFactory("factory", RMIClassLoader.getClassLoader("HashMap"));
        SOAPElementFactory factory = SOAPElementFactory.newInstance();
        SOAPFactory s=SOAPFactory.newInstance();
        SOAPElement soapElement1 = s.createElement("soap");
        Name name = NameImpl.create("localname", "prefix", "uri");
        SOAPElement soapElement2 = s.createElement(name);
        SOAPElement soapElement3 = s.createElement("localname", "prefix", "uri");
    }
}
