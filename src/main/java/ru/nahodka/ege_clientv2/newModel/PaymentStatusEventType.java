
package ru.nahodka.ege_clientv2.newModel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Статус начисления
 *             
 * 
 * <p>Java class for PaymentStatusEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentStatusEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="status" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-16"/>
 *         &lt;element name="payment" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}PaymentType" maxOccurs="10"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentStatusEventType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "status",
    "payment"
})
public class PaymentStatusEventType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected String status;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected List<PaymentType> payment;

    /**
     * Gets the value of the status property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * Sets the value of the status property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * Gets the value of the payment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the payment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentType }
     * 
     * 
     */
    public List<PaymentType> getPayment() {
        if (payment == null) {
            payment = new ArrayList<PaymentType>();
        }
        return this.payment;
    }

}
