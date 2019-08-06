import com.sun.org.apache.xerces.internal.impl.xs.opti.AttrImpl;
import com.sun.org.apache.xml.internal.security.signature.XMLSignatureInput;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolverContext;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolverException;
import com.sun.org.apache.xml.internal.security.utils.resolver.ResourceResolverSpi;
import com.sun.org.apache.xml.internal.security.utils.resolver.implementations.ResolverAnonymous;
import org.w3c.dom.Attr;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Exp4 {

    private static final Logger logger = Logger.getGlobal();

    public void accept(String baseUri, String content) throws IOException, ResourceResolverException {
        String encode = URLEncoder.encode(baseUri, "utf-8");
        logger.logrb(Level.INFO, "class", "method", ResourceBundle.getBundle("bundleName"), "accept" + content, new Throwable());
        ResourceResolverSpi resolver = new ResolverAnonymous("resolver");
        Attr attr = new AttrImpl();
        attr.setValue(encode);
        XMLSignatureInput input = null;
        // engineCanResolve(ResourceResolverContext.attr, ResourceResolverContext.baseUri );
        ResourceResolverContext context = new ResourceResolverContext(attr,baseUri,true);
        if (resolver.engineCanResolveURI(context))
            input = resolver.engineResolveURI(context);
        // ...
    }

    public void send(String encoderURL, String content) throws UnsupportedEncodingException {
        String url = URLDecoder.decode(encoderURL, "utf-8");
        logger.logrb(Level.INFO, "class", "method", ResourceBundle.getBundle("bubdleName"), "send" + content, new Throwable());
        // send operations
    }
}
