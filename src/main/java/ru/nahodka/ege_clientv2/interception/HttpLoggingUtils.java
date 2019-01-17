package ru.nahodka.ege_clientv2.interception;

import org.springframework.ws.WebServiceMessage;
import org.springframework.xml.transform.TransformerObjectSupport;

import javax.xml.transform.Result;
import javax.xml.transform.Source;
import java.io.IOException;
import java.io.OutputStream;


public class HttpLoggingUtils extends TransformerObjectSupport {

    private static final org.apache.log4j.Logger logger= org.apache.log4j.Logger.getLogger(HttpLoggingUtils.class);

    private static final String NEW_LINE = "\n";

    private HttpLoggingUtils() {}

    public static void logMessage(String id, WebServiceMessage webServiceMessage) {
        try {

            ByteArrayTransportOutputStream byteArrayTransportOutputStream =
                    new ByteArrayTransportOutputStream();
            webServiceMessage.writeTo(byteArrayTransportOutputStream);

            String httpMessage = new String(byteArrayTransportOutputStream.toByteArray());
            logger.info(NEW_LINE + "----------------------------" + NEW_LINE + id + NEW_LINE
                    + "----------------------------" + NEW_LINE + httpMessage + NEW_LINE);
        } catch (Exception e) {
            logger.error("Unable to log HTTP message.", e);

        }
    }
}
