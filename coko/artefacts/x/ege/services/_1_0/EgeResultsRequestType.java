
package coko.artefacts.x.ege.services._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for EgeResultsRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EgeResultsRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EgeResultRequest">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Service_FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="IdApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DateApplication" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="app_type" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *                   &lt;element name="SNILS" type="{urn://x-artefacts-coko/ege/services/1.0.0}SNILSType"/>
 *                   &lt;element name="ApplicantSurname">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LastName">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="LastName_gr">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ApplicantName">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FirstName">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="FirstName_gr">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ApplicantPatronymic">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="second_name">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="second_name_gr">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;maxLength value="255"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ApplicantPassportSeries">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PasSer" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
 *                             &lt;element name="PasSer_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ApplicantPassportNumber">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PasNum" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
 *                             &lt;element name="PasNum_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="EmailAddress" type="{urn://x-artefacts-coko/ege/services/1.0.0}EmailAddressType"/>
 *                   &lt;element name="ApplicantPasDate">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PasDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="PasDate_gr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ApplicantPasOrg">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PasOrg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PasOrg_gr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MobilePhone" type="{urn://x-artefacts-coko/ege/services/1.0.0}PhoneNumberRFType"/>
 *                   &lt;element name="YearExam">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                         &lt;minInclusive value="2000"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CodeSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="SubjectText">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
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
@XmlType(name = "EgeResultsRequestType", propOrder = {
    "egeResultRequest"
})
public class EgeResultsRequestType {

    @XmlElement(name = "EgeResultRequest", required = true)
    protected EgeResultsRequestType.EgeResultRequest egeResultRequest;

    /**
     * Gets the value of the egeResultRequest property.
     * 
     * @return
     *     possible object is
     *     {@link EgeResultsRequestType.EgeResultRequest }
     *     
     */
    public EgeResultsRequestType.EgeResultRequest getEgeResultRequest() {
        return egeResultRequest;
    }

    /**
     * Sets the value of the egeResultRequest property.
     * 
     * @param value
     *     allowed object is
     *     {@link EgeResultsRequestType.EgeResultRequest }
     *     
     */
    public void setEgeResultRequest(EgeResultsRequestType.EgeResultRequest value) {
        this.egeResultRequest = value;
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
     *         &lt;element name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Service_FullName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="IdApplication" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DateApplication" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="app_type" type="{http://www.w3.org/2001/XMLSchema}short"/>
     *         &lt;element name="SNILS" type="{urn://x-artefacts-coko/ege/services/1.0.0}SNILSType"/>
     *         &lt;element name="ApplicantSurname">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LastName">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="LastName_gr">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ApplicantName">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FirstName">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="FirstName_gr">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ApplicantPatronymic">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="second_name">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="second_name_gr">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;maxLength value="255"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ApplicantPassportSeries">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PasSer" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
     *                   &lt;element name="PasSer_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ApplicantPassportNumber">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PasNum" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
     *                   &lt;element name="PasNum_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="EmailAddress" type="{urn://x-artefacts-coko/ege/services/1.0.0}EmailAddressType"/>
     *         &lt;element name="ApplicantPasDate">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PasDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="PasDate_gr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ApplicantPasOrg">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PasOrg" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PasOrg_gr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MobilePhone" type="{urn://x-artefacts-coko/ege/services/1.0.0}PhoneNumberRFType"/>
     *         &lt;element name="YearExam">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *               &lt;minInclusive value="2000"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CodeSubject" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="SubjectText">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
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
    @XmlType(name = "", propOrder = {
        "serviceCode",
        "serviceFullName",
        "idApplication",
        "dateApplication",
        "appType",
        "snils",
        "applicantSurname",
        "applicantName",
        "applicantPatronymic",
        "applicantPassportSeries",
        "applicantPassportNumber",
        "emailAddress",
        "applicantPasDate",
        "applicantPasOrg",
        "mobilePhone",
        "yearExam",
        "codeSubject",
        "subjectText"
    })
    public static class EgeResultRequest {

        @XmlElement(name = "ServiceCode", required = true)
        protected String serviceCode;
        @XmlElement(name = "Service_FullName", required = true)
        protected String serviceFullName;
        @XmlElement(name = "IdApplication", required = true)
        protected String idApplication;
        @XmlElement(name = "DateApplication", required = true, defaultValue = "1900-01-01", nillable = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateApplication;
        @XmlElement(name = "app_type", defaultValue = "-2")
        protected short appType;
        @XmlElement(name = "SNILS", required = true)
        protected String snils;
        @XmlElement(name = "ApplicantSurname", required = true)
        protected EgeResultsRequestType.EgeResultRequest.ApplicantSurname applicantSurname;
        @XmlElement(name = "ApplicantName", required = true)
        protected EgeResultsRequestType.EgeResultRequest.ApplicantName applicantName;
        @XmlElement(name = "ApplicantPatronymic", required = true)
        protected EgeResultsRequestType.EgeResultRequest.ApplicantPatronymic applicantPatronymic;
        @XmlElement(name = "ApplicantPassportSeries", required = true)
        protected EgeResultsRequestType.EgeResultRequest.ApplicantPassportSeries applicantPassportSeries;
        @XmlElement(name = "ApplicantPassportNumber", required = true)
        protected EgeResultsRequestType.EgeResultRequest.ApplicantPassportNumber applicantPassportNumber;
        @XmlElement(name = "EmailAddress", required = true)
        protected String emailAddress;
        @XmlElement(name = "ApplicantPasDate", required = true)
        protected EgeResultsRequestType.EgeResultRequest.ApplicantPasDate applicantPasDate;
        @XmlElement(name = "ApplicantPasOrg", required = true)
        protected EgeResultsRequestType.EgeResultRequest.ApplicantPasOrg applicantPasOrg;
        @XmlElement(name = "MobilePhone", required = true)
        protected String mobilePhone;
        @XmlElement(name = "YearExam", defaultValue = "3000")
        protected short yearExam;
        @XmlElement(name = "CodeSubject", required = true)
        protected String codeSubject;
        @XmlElement(name = "SubjectText", required = true)
        protected String subjectText;

        /**
         * Gets the value of the serviceCode property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceCode() {
            return serviceCode;
        }

        /**
         * Sets the value of the serviceCode property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceCode(String value) {
            this.serviceCode = value;
        }

        /**
         * Gets the value of the serviceFullName property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceFullName() {
            return serviceFullName;
        }

        /**
         * Sets the value of the serviceFullName property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceFullName(String value) {
            this.serviceFullName = value;
        }

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

        /**
         * Gets the value of the dateApplication property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateApplication() {
            return dateApplication;
        }

        /**
         * Sets the value of the dateApplication property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateApplication(XMLGregorianCalendar value) {
            this.dateApplication = value;
        }

        /**
         * Gets the value of the appType property.
         * 
         */
        public short getAppType() {
            return appType;
        }

        /**
         * Sets the value of the appType property.
         * 
         */
        public void setAppType(short value) {
            this.appType = value;
        }

        /**
         * Gets the value of the snils property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSNILS() {
            return snils;
        }

        /**
         * Sets the value of the snils property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSNILS(String value) {
            this.snils = value;
        }

        /**
         * Gets the value of the applicantSurname property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantSurname }
         *     
         */
        public EgeResultsRequestType.EgeResultRequest.ApplicantSurname getApplicantSurname() {
            return applicantSurname;
        }

        /**
         * Sets the value of the applicantSurname property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantSurname }
         *     
         */
        public void setApplicantSurname(EgeResultsRequestType.EgeResultRequest.ApplicantSurname value) {
            this.applicantSurname = value;
        }

        /**
         * Gets the value of the applicantName property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantName }
         *     
         */
        public EgeResultsRequestType.EgeResultRequest.ApplicantName getApplicantName() {
            return applicantName;
        }

        /**
         * Sets the value of the applicantName property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantName }
         *     
         */
        public void setApplicantName(EgeResultsRequestType.EgeResultRequest.ApplicantName value) {
            this.applicantName = value;
        }

        /**
         * Gets the value of the applicantPatronymic property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPatronymic }
         *     
         */
        public EgeResultsRequestType.EgeResultRequest.ApplicantPatronymic getApplicantPatronymic() {
            return applicantPatronymic;
        }

        /**
         * Sets the value of the applicantPatronymic property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPatronymic }
         *     
         */
        public void setApplicantPatronymic(EgeResultsRequestType.EgeResultRequest.ApplicantPatronymic value) {
            this.applicantPatronymic = value;
        }

        /**
         * Gets the value of the applicantPassportSeries property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPassportSeries }
         *     
         */
        public EgeResultsRequestType.EgeResultRequest.ApplicantPassportSeries getApplicantPassportSeries() {
            return applicantPassportSeries;
        }

        /**
         * Sets the value of the applicantPassportSeries property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPassportSeries }
         *     
         */
        public void setApplicantPassportSeries(EgeResultsRequestType.EgeResultRequest.ApplicantPassportSeries value) {
            this.applicantPassportSeries = value;
        }

        /**
         * Gets the value of the applicantPassportNumber property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPassportNumber }
         *     
         */
        public EgeResultsRequestType.EgeResultRequest.ApplicantPassportNumber getApplicantPassportNumber() {
            return applicantPassportNumber;
        }

        /**
         * Sets the value of the applicantPassportNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPassportNumber }
         *     
         */
        public void setApplicantPassportNumber(EgeResultsRequestType.EgeResultRequest.ApplicantPassportNumber value) {
            this.applicantPassportNumber = value;
        }

        /**
         * Gets the value of the emailAddress property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmailAddress() {
            return emailAddress;
        }

        /**
         * Sets the value of the emailAddress property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmailAddress(String value) {
            this.emailAddress = value;
        }

        /**
         * Gets the value of the applicantPasDate property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPasDate }
         *     
         */
        public EgeResultsRequestType.EgeResultRequest.ApplicantPasDate getApplicantPasDate() {
            return applicantPasDate;
        }

        /**
         * Sets the value of the applicantPasDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPasDate }
         *     
         */
        public void setApplicantPasDate(EgeResultsRequestType.EgeResultRequest.ApplicantPasDate value) {
            this.applicantPasDate = value;
        }

        /**
         * Gets the value of the applicantPasOrg property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPasOrg }
         *     
         */
        public EgeResultsRequestType.EgeResultRequest.ApplicantPasOrg getApplicantPasOrg() {
            return applicantPasOrg;
        }

        /**
         * Sets the value of the applicantPasOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsRequestType.EgeResultRequest.ApplicantPasOrg }
         *     
         */
        public void setApplicantPasOrg(EgeResultsRequestType.EgeResultRequest.ApplicantPasOrg value) {
            this.applicantPasOrg = value;
        }

        /**
         * Gets the value of the mobilePhone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMobilePhone() {
            return mobilePhone;
        }

        /**
         * Sets the value of the mobilePhone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMobilePhone(String value) {
            this.mobilePhone = value;
        }

        /**
         * Gets the value of the yearExam property.
         * 
         */
        public short getYearExam() {
            return yearExam;
        }

        /**
         * Sets the value of the yearExam property.
         * 
         */
        public void setYearExam(short value) {
            this.yearExam = value;
        }

        /**
         * Gets the value of the codeSubject property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeSubject() {
            return codeSubject;
        }

        /**
         * Sets the value of the codeSubject property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeSubject(String value) {
            this.codeSubject = value;
        }

        /**
         * Gets the value of the subjectText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubjectText() {
            return subjectText;
        }

        /**
         * Sets the value of the subjectText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubjectText(String value) {
            this.subjectText = value;
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
         *         &lt;element name="FirstName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="FirstName_gr">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "firstName",
            "firstNameGr"
        })
        public static class ApplicantName {

            @XmlElement(name = "FirstName", required = true)
            protected String firstName;
            @XmlElement(name = "FirstName_gr", required = true)
            protected String firstNameGr;

            /**
             * Gets the value of the firstName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstName() {
                return firstName;
            }

            /**
             * Sets the value of the firstName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstName(String value) {
                this.firstName = value;
            }

            /**
             * Gets the value of the firstNameGr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFirstNameGr() {
                return firstNameGr;
            }

            /**
             * Sets the value of the firstNameGr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFirstNameGr(String value) {
                this.firstNameGr = value;
            }

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
         *         &lt;element name="PasDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="PasDate_gr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
            "pasDate",
            "pasDateGr"
        })
        public static class ApplicantPasDate {

            @XmlElement(name = "PasDate", defaultValue = "1900-01-01")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar pasDate;
            @XmlElement(name = "PasDate_gr", defaultValue = "1900-01-01")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar pasDateGr;

            /**
             * Gets the value of the pasDate property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPasDate() {
                return pasDate;
            }

            /**
             * Sets the value of the pasDate property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPasDate(XMLGregorianCalendar value) {
                this.pasDate = value;
            }

            /**
             * Gets the value of the pasDateGr property.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getPasDateGr() {
                return pasDateGr;
            }

            /**
             * Sets the value of the pasDateGr property.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setPasDateGr(XMLGregorianCalendar value) {
                this.pasDateGr = value;
            }

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
         *         &lt;element name="PasOrg" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PasOrg_gr" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "pasOrg",
            "pasOrgGr"
        })
        public static class ApplicantPasOrg {

            @XmlElement(name = "PasOrg", required = true)
            protected String pasOrg;
            @XmlElement(name = "PasOrg_gr", required = true)
            protected String pasOrgGr;

            /**
             * Gets the value of the pasOrg property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPasOrg() {
                return pasOrg;
            }

            /**
             * Sets the value of the pasOrg property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPasOrg(String value) {
                this.pasOrg = value;
            }

            /**
             * Gets the value of the pasOrgGr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPasOrgGr() {
                return pasOrgGr;
            }

            /**
             * Sets the value of the pasOrgGr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPasOrgGr(String value) {
                this.pasOrgGr = value;
            }

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
         *         &lt;element name="PasNum" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
         *         &lt;element name="PasNum_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
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
            "pasNum",
            "pasNumGr"
        })
        public static class ApplicantPassportNumber {

            @XmlElement(name = "PasNum", required = true)
            protected String pasNum;
            @XmlElement(name = "PasNum_gr", required = true)
            protected String pasNumGr;

            /**
             * Gets the value of the pasNum property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPasNum() {
                return pasNum;
            }

            /**
             * Sets the value of the pasNum property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPasNum(String value) {
                this.pasNum = value;
            }

            /**
             * Gets the value of the pasNumGr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPasNumGr() {
                return pasNumGr;
            }

            /**
             * Sets the value of the pasNumGr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPasNumGr(String value) {
                this.pasNumGr = value;
            }

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
         *         &lt;element name="PasSer" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
         *         &lt;element name="PasSer_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
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
            "pasSer",
            "pasSerGr"
        })
        public static class ApplicantPassportSeries {

            @XmlElement(name = "PasSer", required = true)
            protected String pasSer;
            @XmlElement(name = "PasSer_gr", required = true)
            protected String pasSerGr;

            /**
             * Gets the value of the pasSer property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPasSer() {
                return pasSer;
            }

            /**
             * Sets the value of the pasSer property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPasSer(String value) {
                this.pasSer = value;
            }

            /**
             * Gets the value of the pasSerGr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPasSerGr() {
                return pasSerGr;
            }

            /**
             * Sets the value of the pasSerGr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPasSerGr(String value) {
                this.pasSerGr = value;
            }

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
         *         &lt;element name="second_name">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="second_name_gr">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "secondName",
            "secondNameGr"
        })
        public static class ApplicantPatronymic {

            @XmlElement(name = "second_name", required = true)
            protected String secondName;
            @XmlElement(name = "second_name_gr", required = true)
            protected String secondNameGr;

            /**
             * Gets the value of the secondName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecondName() {
                return secondName;
            }

            /**
             * Sets the value of the secondName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecondName(String value) {
                this.secondName = value;
            }

            /**
             * Gets the value of the secondNameGr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSecondNameGr() {
                return secondNameGr;
            }

            /**
             * Sets the value of the secondNameGr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSecondNameGr(String value) {
                this.secondNameGr = value;
            }

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
         *         &lt;element name="LastName">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="LastName_gr">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;maxLength value="255"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
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
        @XmlType(name = "", propOrder = {
            "lastName",
            "lastNameGr"
        })
        public static class ApplicantSurname {

            @XmlElement(name = "LastName", required = true)
            protected String lastName;
            @XmlElement(name = "LastName_gr", required = true)
            protected String lastNameGr;

            /**
             * Gets the value of the lastName property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastName() {
                return lastName;
            }

            /**
             * Sets the value of the lastName property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastName(String value) {
                this.lastName = value;
            }

            /**
             * Gets the value of the lastNameGr property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLastNameGr() {
                return lastNameGr;
            }

            /**
             * Sets the value of the lastNameGr property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLastNameGr(String value) {
                this.lastNameGr = value;
            }

        }

    }

}
