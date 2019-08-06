import com.sun.org.apache.xerces.internal.impl.xs.opti.AttrImpl;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolverException;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolverSpi;
import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverAnonymous;
import org.w3c.dom.Attr;

import java.io.IOException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exp4 {

    private final static Logger logger = Logger.getGlobal();

    public void accept(String baseUri, String content) throws IOException, ResourceResolverException {

        String encode = URLEncoder.encode(baseUri);
        logger.logrb(Level.INFO, "class", "method", "bundleName", "accept" + content, new Throwable());
        ResourceResolverSpi resolver = new ResolverAnonymous("resolver");
        Attr attr = new AttrImpl();
        attr.setValue(encode);
        XMLSignatureInput input = null;
        if (resolver.engineCanResolve(attr, baseUri))
            input = resolver.engineResolve(attr, baseUri);
        //...
    }

    public void send(String encoderURL, String content) {
        String url = URLDecoder.decode(encoderURL);
        logger.logrb(Level.INFO, "class", "method", "bundleName", "send" + content, new Throwable());
        //send operations
    }

}
