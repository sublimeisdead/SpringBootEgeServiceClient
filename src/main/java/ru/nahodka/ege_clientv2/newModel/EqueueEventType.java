
package ru.nahodka.ege_clientv2.newModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Приглашение записаться на приём или флаг отмены приглашения
 *             
 * 
 * <p>Java class for EqueueEventType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EqueueEventType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="equeueInvitation" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}equeueInvitationType"/>
 *         &lt;element name="equeueClosed" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}equeueClosedType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EqueueEventType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "equeueInvitation",
    "equeueClosed"
})
public class EqueueEventType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected EqueueInvitationType equeueInvitation;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected EqueueClosedType equeueClosed;

    /**
     * Gets the value of the equeueInvitation property.
     * 
     * @return
     *     possible object is
     *     {@link EqueueInvitationType }
     *     
     */
    public EqueueInvitationType getEqueueInvitation() {
        return equeueInvitation;
    }

    /**
     * Sets the value of the equeueInvitation property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqueueInvitationType }
     *     
     */
    public void setEqueueInvitation(EqueueInvitationType value) {
        this.equeueInvitation = value;
    }

    /**
     * Gets the value of the equeueClosed property.
     * 
     * @return
     *     possible object is
     *     {@link EqueueClosedType }
     *     
     */
    public EqueueClosedType getEqueueClosed() {
        return equeueClosed;
    }

    /**
     * Sets the value of the equeueClosed property.
     * 
     * @param value
     *     allowed object is
     *     {@link EqueueClosedType }
     *     
     */
    public void setEqueueClosed(EqueueClosedType value) {
        this.equeueClosed = value;
    }

}
