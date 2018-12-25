
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Новый статус заявления
 *             
 * 
 * <p>Java class for statusCodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="statusCodeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="orgCode" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-20"/>
 *         &lt;element name="techCode" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "statusCodeType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "orgCode",
    "techCode"
})
public class StatusCodeType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected String orgCode;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected Short techCode;

    /**
     * Gets the value of the orgCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrgCode() {
        return orgCode;
    }

    /**
     * Sets the value of the orgCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrgCode(String value) {
        this.orgCode = value;
    }

    /**
     * Gets the value of the techCode property.
     * 
     * @return
     *     possible object is
     *     {@link Short }
     *     
     */
    public Short getTechCode() {
        return techCode;
    }

    /**
     * Sets the value of the techCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link Short }
     *     
     */
    public void setTechCode(Short value) {
        this.techCode = value;
    }

}
