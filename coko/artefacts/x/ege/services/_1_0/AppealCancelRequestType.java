
package coko.artefacts.x.ege.services._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *                 Запрос на отмену запроса на апелляцию
 *             
 * 
 * <p>Java class for AppealCancelRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppealCancelRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="IdApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AppealCancelRequestType", propOrder = {
    "idApplication"
})
public class AppealCancelRequestType {

    @XmlElement(name = "IdApplication", required = true)
    protected String idApplication;

    /**
     * Gets the value of the idApplication property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdApplication() {
        return idApplication;
    }

    /**
     * Sets the value of the idApplication property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdApplication(String value) {
        this.idApplication = value;
    }

}
