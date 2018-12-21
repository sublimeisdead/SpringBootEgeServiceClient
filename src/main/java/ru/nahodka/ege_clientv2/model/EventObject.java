
package ru.nahodka.ege_clientv2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EventObject complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventObject">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="orderId" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *         &lt;element name="eventDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="eventComment" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="eventAuthor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="event">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="orderStatusEvent" type="{http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0}OrderStatusEvent"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventObject", namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0", propOrder = {
    "orderId",
    "eventDate",
    "eventComment",
    "eventAuthor",
    "event"
})
public class EventObject {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0")
    protected long orderId;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar eventDate;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0")
    protected String eventComment;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0")
    protected String eventAuthor;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0", required = true)
    protected EventObject.Event event;

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
     *     {@link EventObject.Event }
     *     
     */
    public EventObject.Event getEvent() {
        return event;
    }

    /**
     * Sets the value of the event property.
     * 
     * @param value
     *     allowed object is
     *     {@link EventObject.Event }
     *     
     */
    public void setEvent(EventObject.Event value) {
        this.event = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="orderStatusEvent" type="{http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0}OrderStatusEvent"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "orderStatusEvent"
    })
    public static class Event {

        @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0")
        protected OrderStatusEvent orderStatusEvent;

        /**
         * Gets the value of the orderStatusEvent property.
         * 
         * @return
         *     possible object is
         *     {@link OrderStatusEvent }
         *     
         */
        public OrderStatusEvent getOrderStatusEvent() {
            return orderStatusEvent;
        }

        /**
         * Sets the value of the orderStatusEvent property.
         * 
         * @param value
         *     allowed object is
         *     {@link OrderStatusEvent }
         *     
         */
        public void setOrderStatusEvent(OrderStatusEvent value) {
            this.orderStatusEvent = value;
        }

    }

}
