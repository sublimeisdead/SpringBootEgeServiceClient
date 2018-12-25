
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Тип события: статус заявления, информация о начислении, информационное событие, текстовое сообщение, приглашение записаться на приём
 *             
 * 
 * <p>Java class for EventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="orderStatusEvent" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}OrderStatusEventType"/>
 *         &lt;element name="paymentStatusEvent" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}PaymentStatusEventType"/>
 *         &lt;element name="infoEvent" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}InfoEventType"/>
 *         &lt;element name="textMessageEvent" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}TextMessageEventType"/>
 *         &lt;element name="equeueEvent" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}EqueueEventType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "orderStatusEvent",
    "paymentStatusEvent",
    "infoEvent",
    "textMessageEvent",
    "equeueEvent"
})
public class EventType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected OrderStatusEventType orderStatusEvent;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected PaymentStatusEventType paymentStatusEvent;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected InfoEventType infoEvent;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected TextMessageEventType textMessageEvent;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected EqueueEventType equeueEvent;

    /**
     * Gets the value of the orderStatusEvent property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusEventType }
     *     
     */
    public OrderStatusEventType getOrderStatusEvent() {
        return orderStatusEvent;
    }

    /**
     * Sets the value of the orderStatusEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusEventType }
     *     
     */
    public void setOrderStatusEvent(OrderStatusEventType value) {
        this.orderStatusEvent = value;
    }

    /**
     * Gets the value of the paymentStatusEvent property.
     * 
     * @return
     *     possible object is
     *     {@link PaymentStatusEventType }
     *     
     */
    public PaymentStatusEventType getPaymentStatusEvent() {
        return paymentStatusEvent;
    }

    /**
     * Sets the value of the paymentStatusEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentStatusEventType }
     *     
     */
    public void setPaymentStatusEvent(PaymentStatusEventType value) {
        this.paymentStatusEvent = value;
    }

    /**
     * Gets the value of the infoEvent property.
     * 
     * @return
     *     possible object is
     *     {@link InfoEventType }
     *     
     */
    public InfoEventType getInfoEvent() {
        return infoEvent;
    }

    /**
     * Sets the value of the infoEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfoEventType }
     *     
     */
    public void setInfoEvent(InfoEventType value) {
        this.infoEvent = value;
    }

    /**
     * Gets the value of the textMessageEvent property.
     * 
     * @return
     *     possible object is
     *     {@link TextMessageEventType }
     *     
     */
    public TextMessageEventType getTextMessageEvent() {
        return textMessageEvent;
    }

    /**
     * Sets the value of the textMessageEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link TextMessageEventType }
     *     
     */
    public void setTextMessageEvent(TextMessageEventType value) {
        this.textMessageEvent = value;
    }

    /**
     * Gets the value of the equeueEvent property.
     * 
     * @return
     *     possible object is
     *     {@link EqueueEventType }
     *     
     */
    public EqueueEventType getEqueueEvent() {
        return equeueEvent;
    }

    /**
     * Sets the value of the equeueEvent property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqueueEventType }
     *     
     */
    public void setEqueueEvent(EqueueEventType value) {
        this.equeueEvent = value;
    }

}
