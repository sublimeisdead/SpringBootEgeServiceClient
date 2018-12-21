
package coko.artefacts.x.ege.services._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NewRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NewRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="GetDictionaryContentRequest" type="{urn://x-artefacts-coko/ege/services/1.0.0}DictionaryContentRequestType"/>
 *         &lt;element name="GetEgeResultsRequest" type="{urn://x-artefacts-coko/ege/services/1.0.0}EgeResultsRequestType"/>
 *         &lt;element name="AppealCancelRequest" type="{urn://x-artefacts-coko/ege/services/1.0.0}AppealCancelRequestType"/>
 *         &lt;element name="AppealRequest" type="{urn://x-artefacts-coko/ege/services/1.0.0}AppealRequestType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NewRequestType", propOrder = {
    "getDictionaryContentRequest",
    "getEgeResultsRequest",
    "appealCancelRequest",
    "appealRequest"
})
public class NewRequestType {

    @XmlElement(name = "GetDictionaryContentRequest")
    protected DictionaryContentRequestType getDictionaryContentRequest;
    @XmlElement(name = "GetEgeResultsRequest")
    protected EgeResultsRequestType getEgeResultsRequest;
    @XmlElement(name = "AppealCancelRequest")
    protected AppealCancelRequestType appealCancelRequest;
    @XmlElement(name = "AppealRequest")
    protected AppealRequestType appealRequest;

    /**
     * Gets the value of the getDictionaryContentRequest property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryContentRequestType }
     *     
     */
    public DictionaryContentRequestType getGetDictionaryContentRequest() {
        return getDictionaryContentRequest;
    }

    /**
     * Sets the value of the getDictionaryContentRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryContentRequestType }
     *     
     */
    public void setGetDictionaryContentRequest(DictionaryContentRequestType value) {
        this.getDictionaryContentRequest = value;
    }

    /**
     * Gets the value of the getEgeResultsRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EgeResultsRequestType }
     *     
     */
    public EgeResultsRequestType getGetEgeResultsRequest() {
        return getEgeResultsRequest;
    }

    /**
     * Sets the value of the getEgeResultsRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EgeResultsRequestType }
     *     
     */
    public void setGetEgeResultsRequest(EgeResultsRequestType value) {
        this.getEgeResultsRequest = value;
    }

    /**
     * Gets the value of the appealCancelRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AppealCancelRequestType }
     *     
     */
    public AppealCancelRequestType getAppealCancelRequest() {
        return appealCancelRequest;
    }

    /**
     * Sets the value of the appealCancelRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealCancelRequestType }
     *     
     */
    public void setAppealCancelRequest(AppealCancelRequestType value) {
        this.appealCancelRequest = value;
    }

    /**
     * Gets the value of the appealRequest property.
     * 
     * @return
     *     possible object is
     *     {@link AppealRequestType }
     *     
     */
    public AppealRequestType getAppealRequest() {
        return appealRequest;
    }

    /**
     * Sets the value of the appealRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealRequestType }
     *     
     */
    public void setAppealRequest(AppealRequestType value) {
        this.appealRequest = value;
    }

}
