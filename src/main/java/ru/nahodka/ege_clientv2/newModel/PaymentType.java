
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Информация о начислении
 *             
 * 
 * <p>Java class for PaymentType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PaymentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="source" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-16"/>
 *         &lt;element name="uin" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-256"/>
 *         &lt;element name="description" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-210"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "source",
    "uin",
    "description"
})
public class PaymentType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected String source;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected String uin;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected String description;

    /**
     * Gets the value of the source property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * Sets the value of the source property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * Gets the value of the uin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUin() {
        return uin;
    }

    /**
     * Sets the value of the uin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUin(String value) {
        this.uin = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

}
