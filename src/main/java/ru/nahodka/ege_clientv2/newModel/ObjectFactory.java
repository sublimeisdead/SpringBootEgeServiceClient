
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ru.nahodka.ege_clientv2.newModel package. 
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

    private final static QName _EventServiceRequest_QNAME = new QName("http://epgu.gosuslugi.ru/lk/order/event/3.1.1", "eventServiceRequest");
    private final static QName _EventServiceResponse_QNAME = new QName("http://epgu.gosuslugi.ru/lk/order/event/3.1.1", "eventServiceResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ru.nahodka.ege_clientv2.newModel
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link EventServiceResponseType }
     * 
     */
    public EventServiceResponseType createEventServiceResponseType() {
        return new EventServiceResponseType();
    }

    /**
     * Create an instance of {@link EventServiceRequestType }
     * 
     */
    public EventServiceRequestType createEventServiceRequestType() {
        return new EventServiceRequestType();
    }

    /**
     * Create an instance of {@link TextMessageEventType }
     * 
     */
    public TextMessageEventType createTextMessageEventType() {
        return new TextMessageEventType();
    }

    /**
     * Create an instance of {@link EventType }
     * 
     */
    public EventType createEventType() {
        return new EventType();
    }

    /**
     * Create an instance of {@link StatusCodeType }
     * 
     */
    public StatusCodeType createStatusCodeType() {
        return new StatusCodeType();
    }

    /**
     * Create an instance of {@link OrganizationDataType }
     * 
     */
    public OrganizationDataType createOrganizationDataType() {
        return new OrganizationDataType();
    }

    /**
     * Create an instance of {@link PaymentStatusEventType }
     * 
     */
    public PaymentStatusEventType createPaymentStatusEventType() {
        return new PaymentStatusEventType();
    }

    /**
     * Create an instance of {@link OrderStatusEventType }
     * 
     */
    public OrderStatusEventType createOrderStatusEventType() {
        return new OrderStatusEventType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link EqueueEventType }
     * 
     */
    public EqueueEventType createEqueueEventType() {
        return new EqueueEventType();
    }

    /**
     * Create an instance of {@link EqueueClosedType }
     * 
     */
    public EqueueClosedType createEqueueClosedType() {
        return new EqueueClosedType();
    }

    /**
     * Create an instance of {@link InfoEventType }
     * 
     */
    public InfoEventType createInfoEventType() {
        return new InfoEventType();
    }

    /**
     * Create an instance of {@link EqueueInvitationType }
     * 
     */
    public EqueueInvitationType createEqueueInvitationType() {
        return new EqueueInvitationType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventServiceRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", name = "eventServiceRequest")
    public JAXBElement<EventServiceRequestType> createEventServiceRequest(EventServiceRequestType value) {
        return new JAXBElement<EventServiceRequestType>(_EventServiceRequest_QNAME, EventServiceRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventServiceResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", name = "eventServiceResponse")
    public JAXBElement<EventServiceResponseType> createEventServiceResponse(EventServiceResponseType value) {
        return new JAXBElement<EventServiceResponseType>(_EventServiceResponse_QNAME, EventServiceResponseType.class, null, value);
    }

}
