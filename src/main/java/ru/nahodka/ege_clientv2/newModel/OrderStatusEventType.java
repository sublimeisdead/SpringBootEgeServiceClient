
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Статус заявления
 *             
 * 
 * <p>Java class for OrderStatusEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}statusCodeType"/>
 *         &lt;element name="cancelAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="sendMessageAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusEventType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "statusCode",
    "cancelAllowed",
    "sendMessageAllowed"
})
public class OrderStatusEventType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected StatusCodeType statusCode;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected Boolean cancelAllowed;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected Boolean sendMessageAllowed;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link StatusCodeType }
     *     
     */
    public StatusCodeType getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link StatusCodeType }
     *     
     */
    public void setStatusCode(StatusCodeType value) {
        this.statusCode = value;
    }

    /**
     * Gets the value of the cancelAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelAllowed() {
        return cancelAllowed;
    }

    /**
     * Sets the value of the cancelAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelAllowed(Boolean value) {
        this.cancelAllowed = value;
    }

    /**
     * Gets the value of the sendMessageAllowed property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSendMessageAllowed() {
        return sendMessageAllowed;
    }

    /**
     * Sets the value of the sendMessageAllowed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSendMessageAllowed(Boolean value) {
        this.sendMessageAllowed = value;
    }

}
