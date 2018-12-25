
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Ответ в случае успешной обработки события
 *             
 * 
 * <p>Java class for EventServiceResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EventServiceResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="message" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-256"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EventServiceResponseType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "code",
    "message"
})
public class EventServiceResponseType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected byte code;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected String message;

    /**
     * Gets the value of the code property.
     * 
     */
    public byte getCode() {
        return code;
    }

    /**
     * Sets the value of the code property.
     * 
     */
    public void setCode(byte value) {
        this.code = value;
    }

    /**
     * Gets the value of the message property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessage() {
        return message;
    }

    /**
     * Sets the value of the message property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessage(String value) {
        this.message = value;
    }

}
