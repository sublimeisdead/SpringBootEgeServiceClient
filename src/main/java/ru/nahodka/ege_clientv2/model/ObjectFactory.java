
package ru.nahodka.ege_clientv2.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _EventServiceRequest_QNAME = new QName("http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0", "eventServiceRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link OrderStatusEvent }
     * 
     */
    public OrderStatusEvent createOrderStatusEvent() {
        return new OrderStatusEvent();
    }

    /**
     * Create an instance of {@link EventObject }
     * 
     */
    public EventObject createEventObject() {
        return new EventObject();
    }

    /**
     * Create an instance of {@link Response }
     * 
     */
    public Response createResponse() {
        return new Response();
    }

    /**
     * Create an instance of {@link OrderStatusEvent.StatusCode }
     * 
     */
    public OrderStatusEvent.StatusCode createOrderStatusEventStatusCode() {
        return new OrderStatusEvent.StatusCode();
    }

    /**
     * Create an instance of {@link EventObject.Event }
     * 
     */
    public EventObject.Event createEventObjectEvent() {
        return new EventObject.Event();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventObject }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0", name = "eventServiceRequest")
    public JAXBElement<EventObject> createEventServiceRequest(EventObject value) {
        return new JAXBElement<EventObject>(_EventServiceRequest_QNAME, EventObject.class, null, value);
    }

}
