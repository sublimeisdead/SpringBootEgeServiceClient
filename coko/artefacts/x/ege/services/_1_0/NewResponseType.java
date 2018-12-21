
package coko.artefacts.x.ege.services._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GetDictionaryContentResponse" type="{urn://x-artefacts-coko/ege/services/1.0.0}DictionaryContentType"/>
 *         &lt;element name="GetEgeResultsResponse" type="{urn://x-artefacts-coko/ege/services/1.0.0}EgeResultsResponseType"/>
 *         &lt;element name="AppealCancelResponse" type="{urn://x-artefacts-coko/ege/services/1.0.0}AppealCancelResponseType"/>
 *         &lt;element name="AppealResponse" type="{urn://x-artefacts-coko/ege/services/1.0.0}AppealResponseType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewResponseType", propOrder = {
    "getDictionaryContentResponse",
    "getEgeResultsResponse",
    "appealCancelResponse",
    "appealResponse"
})
public class NewResponseType {

    @XmlElement(name = "GetDictionaryContentResponse")
    protected DictionaryContentType getDictionaryContentResponse;
    @XmlElement(name = "GetEgeResultsResponse")
    protected EgeResultsResponseType getEgeResultsResponse;
    @XmlElement(name = "AppealCancelResponse")
    protected AppealCancelResponseType appealCancelResponse;
    @XmlElement(name = "AppealResponse")
    protected AppealResponseType appealResponse;

    /**
     * Gets the value of the getDictionaryContentResponse property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryContentType }
     *     
     */
    public DictionaryContentType getGetDictionaryContentResponse() {
        return getDictionaryContentResponse;
    }

    /**
     * Sets the value of the getDictionaryContentResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryContentType }
     *     
     */
    public void setGetDictionaryContentResponse(DictionaryContentType value) {
        this.getDictionaryContentResponse = value;
    }

    /**
     * Gets the value of the getEgeResultsResponse property.
     * 
     * @return
     *     possible object is
     *     {@link EgeResultsResponseType }
     *     
     */
    public EgeResultsResponseType getGetEgeResultsResponse() {
        return getEgeResultsResponse;
    }

    /**
     * Sets the value of the getEgeResultsResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link EgeResultsResponseType }
     *     
     */
    public void setGetEgeResultsResponse(EgeResultsResponseType value) {
        this.getEgeResultsResponse = value;
    }

    /**
     * Gets the value of the appealCancelResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AppealCancelResponseType }
     *     
     */
    public AppealCancelResponseType getAppealCancelResponse() {
        return appealCancelResponse;
    }

    /**
     * Sets the value of the appealCancelResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealCancelResponseType }
     *     
     */
    public void setAppealCancelResponse(AppealCancelResponseType value) {
        this.appealCancelResponse = value;
    }

    /**
     * Gets the value of the appealResponse property.
     * 
     * @return
     *     possible object is
     *     {@link AppealResponseType }
     *     
     */
    public AppealResponseType getAppealResponse() {
        return appealResponse;
    }

    /**
     * Sets the value of the appealResponse property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealResponseType }
     *     
     */
    public void setAppealResponse(AppealResponseType value) {
        this.appealResponse = value;
    }

}
