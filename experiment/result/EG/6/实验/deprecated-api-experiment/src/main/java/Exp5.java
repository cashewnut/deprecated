import com.sun.xml.internal.messaging.saaj.soap.name.NameImpl;

import javax.xml.soap.*;
import javax.xml.stream.XMLInputFactory;
import java.net.MalformedURLException;
import java.rmi.server.RMIClassLoader;

public class Exp5 {

    public void fun() throws MalformedURLException, ClassNotFoundException, SOAPException {

        Class<Exp1> clazz = (Class<Exp1>) RMIClassLoader.loadClass("HashMap");
        XMLInputFactory.newFactory("factory", RMIClassLoader.getClassLoader("HashMap"));
        SOAPElementFactory factory = SOAPElementFactory.newInstance();

        SOAPFactory soapFactory = SOAPFactory.newInstance();
        SOAPElement soapElement1 = soapFactory.createElement("soap");
        Name name = NameImpl.create("localname","prefix","uri");
        SOAPElement soapElement2 = soapFactory.createElement(name);
        SOAPElement soapElement3 = soapFactory.createElement("localname","prefix","uri");

    }

}
