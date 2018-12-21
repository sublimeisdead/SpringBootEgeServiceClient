
package coko.artefacts.x.ege.services._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for DictionaryContentRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DictionaryContentRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Dictionary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dictionaryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DictionaryContentRequestType", propOrder = {
    "dictionary"
})
public class DictionaryContentRequestType {

    @XmlElement(name = "Dictionary", required = true)
    protected DictionaryContentRequestType.Dictionary dictionary;

    /**
     * Gets the value of the dictionary property.
     * 
     * @return
     *     possible object is
     *     {@link DictionaryContentRequestType.Dictionary }
     *     
     */
    public DictionaryContentRequestType.Dictionary getDictionary() {
        return dictionary;
    }

    /**
     * Sets the value of the dictionary property.
     * 
     * @param value
     *     allowed object is
     *     {@link DictionaryContentRequestType.Dictionary }
     *     
     */
    public void setDictionary(DictionaryContentRequestType.Dictionary value) {
        this.dictionary = value;
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
     *       &lt;sequence>
     *         &lt;element name="dictionaryName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "dictionaryName"
    })
    public static class Dictionary {

        @XmlElement(required = true)
        protected String dictionaryName;

        /**
         * Gets the value of the dictionaryName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDictionaryName() {
            return dictionaryName;
        }

        /**
         * Sets the value of the dictionaryName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDictionaryName(String value) {
            this.dictionaryName = value;
        }

    }

}
