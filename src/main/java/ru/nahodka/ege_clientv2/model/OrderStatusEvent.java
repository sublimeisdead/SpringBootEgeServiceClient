
package ru.nahodka.ege_clientv2.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Изменения статуса заявки в ЛК
 *             
 * 
 * <p>Java class for OrderStatusEvent complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="OrderStatusEvent">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="statusCode">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="techCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="cancelAllowed" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OrderStatusEvent", namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0", propOrder = {
    "statusCode",
    "cancelAllowed"
})
public class OrderStatusEvent {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0", required = true)
    protected OrderStatusEvent.StatusCode statusCode;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0")
    protected Boolean cancelAllowed;

    /**
     * Gets the value of the statusCode property.
     * 
     * @return
     *     possible object is
     *     {@link OrderStatusEvent.StatusCode }
     *     
     */
    public OrderStatusEvent.StatusCode getStatusCode() {
        return statusCode;
    }

    /**
     * Sets the value of the statusCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link OrderStatusEvent.StatusCode }
     *     
     */
    public void setStatusCode(OrderStatusEvent.StatusCode value) {
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
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="techCode" type="{http://www.w3.org/2001/XMLSchema}long"/>
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
        "techCode"
    })
    public static class StatusCode {

        @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/PROD/3.1.0")
        protected Long techCode;

        /**
         * Gets the value of the techCode property.
         * 
         * @return
         *     possible object is
         *     {@link Long }
         *     
         */
        public Long getTechCode() {
            return techCode;
        }

        /**
         * Sets the value of the techCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link Long }
         *     
         */
        public void setTechCode(Long value) {
            this.techCode = value;
        }

    }

}
