
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * 
 *                 Запрос передачи события по заявлению в ЛК ЕПГУ
 *             
 * 
 * <p>Java class for EventServiceRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventServiceRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventComment" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-2048" minOccurs="0"/>
 *         &lt;element name="eventAuthor" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-256" minOccurs="0"/>
 *         &lt;element name="event" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}EventType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="env" use="required" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}EnvType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventServiceRequestType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "orderId",
    "eventDate",
    "eventComment",
    "eventAuthor",
    "event"
})
public class EventServiceRequestType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected long orderId;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected String eventComment;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected String eventAuthor;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected EventType event;
    @XmlAttribute(name = "env", required = true)
    protected EnvType env;

    /**
     * Gets the value of the orderId property.
     * 
     */
    public long getOrderId() {
        return orderId;
    }

    /**
     * Sets the value of the orderId property.
     * 
     */
    public void setOrderId(long value) {
        this.orderId = value;
    }

    /**
     * Gets the value of the eventDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEventDate() {
        return eventDate;
    }

    /**
     * Sets the value of the eventDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEventDate(XMLGregorianCalendar value) {
        this.eventDate = value;
    }

    /**
     * Gets the value of the eventComment property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventComment() {
        return eventComment;
    }

    /**
     * Sets the value of the eventComment property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventComment(String value) {
        this.eventComment = value;
    }

    /**
     * Gets the value of the eventAuthor property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEventAuthor() {
        return eventAuthor;
    }

    /**
     * Sets the value of the eventAuthor property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEventAuthor(String value) {
        this.eventAuthor = value;
    }

    /**
     * Gets the value of the event property.
     * 
     * @return
     *     possible object is
     *     {@link EventType }
     *     
     */
    public EventType getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventType }
     *     
     */
    public void setEvent(EventType value) {
        this.event = value;
    }

    /**
     * Gets the value of the env property.
     * 
     * @return
     *     possible object is
     *     {@link EnvType }
     *     
     */
    public EnvType getEnv() {
        return env;
    }

    /**
     * Sets the value of the env property.
     * 
     * @param value
     *     allowed object is
     *     {@link EnvType }
     *     
     */
    public void setEnv(EnvType value) {
        this.env = value;
    }

}
