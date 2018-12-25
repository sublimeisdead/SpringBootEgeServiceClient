
package ru.nahodka.ege_clientv2.newModel;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Код подразделения и перечень кодов кабинетов/специалистов
 *             
 * 
 * <p>Java class for organizationDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="organizationDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="organizationId" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-50"/>
 *         &lt;element name="areaId" type="{http://epgu.gosuslugi.ru/lk/order/event/3.1.1}string-50" maxOccurs="10" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "organizationDataType", namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", propOrder = {
    "organizationId",
    "areaId"
})
public class OrganizationDataType {

    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1", required = true)
    protected String organizationId;
    @XmlElement(namespace = "http://epgu.gosuslugi.ru/lk/order/event/3.1.1")
    protected List<String> areaId;

    /**
     * Gets the value of the organizationId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganizationId() {
        return organizationId;
    }

    /**
     * Sets the value of the organizationId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganizationId(String value) {
        this.organizationId = value;
    }

    /**
     * Gets the value of the areaId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the areaId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAreaId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAreaId() {
        if (areaId == null) {
            areaId = new ArrayList<String>();
        }
        return this.areaId;
    }

}
