
package coko.artefacts.x.ege.services._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for AppealRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AppealRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Appeal">
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
 *                   &lt;element name="SecondName">
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
 *                             &lt;element name="pas_ser" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
 *                             &lt;element name="pas_ser_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
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
 *                             &lt;element name="pas_num" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
 *                             &lt;element name="pas_num_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="email_address" type="{urn://x-artefacts-coko/ege/services/1.0.0}EmailAddressType"/>
 *                   &lt;element name="phone" type="{urn://x-artefacts-coko/ege/services/1.0.0}PhoneNumberRFType"/>
 *                   &lt;element name="ApplicantPasDate">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="pas_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                             &lt;element name="pas_date_gr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
 *                             &lt;element name="pas_org" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="pas_org_gr" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="Cod_sub" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="edu_sub">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;maxLength value="255"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="date_exam" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="code_school" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="code_place_exam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="place_exam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ap_rev" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   &lt;element name="ap_rev_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "AppealRequestType", propOrder = {
    "appeal"
})
public class AppealRequestType {

    @XmlElement(name = "Appeal", required = true)
    protected AppealRequestType.Appeal appeal;

    /**
     * Gets the value of the appeal property.
     * 
     * @return
     *     possible object is
     *     {@link AppealRequestType.Appeal }
     *     
     */
    public AppealRequestType.Appeal getAppeal() {
        return appeal;
    }

    /**
     * Sets the value of the appeal property.
     * 
     * @param value
     *     allowed object is
     *     {@link AppealRequestType.Appeal }
     *     
     */
    public void setAppeal(AppealRequestType.Appeal value) {
        this.appeal = value;
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
     *         &lt;element name="SecondName">
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
     *                   &lt;element name="pas_ser" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
     *                   &lt;element name="pas_ser_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
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
     *                   &lt;element name="pas_num" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
     *                   &lt;element name="pas_num_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="email_address" type="{urn://x-artefacts-coko/ege/services/1.0.0}EmailAddressType"/>
     *         &lt;element name="phone" type="{urn://x-artefacts-coko/ege/services/1.0.0}PhoneNumberRFType"/>
     *         &lt;element name="ApplicantPasDate">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="pas_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *                   &lt;element name="pas_date_gr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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
     *                   &lt;element name="pas_org" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="pas_org_gr" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="region" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="Cod_sub" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="edu_sub">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;maxLength value="255"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="date_exam" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="code_school" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="school" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="code_place_exam" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="place_exam" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ap_rev" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         &lt;element name="ap_rev_text" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "secondName",
        "applicantPassportSeries",
        "applicantPassportNumber",
        "emailAddress",
        "phone",
        "applicantPasDate",
        "applicantPasOrg",
        "region",
        "codSub",
        "eduSub",
        "dateExam",
        "codeSchool",
        "school",
        "codePlaceExam",
        "placeExam",
        "apRev",
        "apRevText"
    })
    public static class Appeal {

        @XmlElement(name = "ServiceCode", required = true)
        protected String serviceCode;
        @XmlElement(name = "Service_FullName", required = true)
        protected String serviceFullName;
        @XmlElement(name = "IdApplication", required = true)
        protected String idApplication;
        @XmlElement(name = "DateApplication", required = true, defaultValue = "1900-01-01")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateApplication;
        @XmlElement(name = "app_type", defaultValue = "-2")
        protected short appType;
        @XmlElement(name = "SNILS", required = true)
        protected String snils;
        @XmlElement(name = "ApplicantSurname", required = true)
        protected AppealRequestType.Appeal.ApplicantSurname applicantSurname;
        @XmlElement(name = "ApplicantName", required = true)
        protected AppealRequestType.Appeal.ApplicantName applicantName;
        @XmlElement(name = "SecondName", required = true)
        protected AppealRequestType.Appeal.SecondName secondName;
        @XmlElement(name = "ApplicantPassportSeries", required = true)
        protected AppealRequestType.Appeal.ApplicantPassportSeries applicantPassportSeries;
        @XmlElement(name = "ApplicantPassportNumber", required = true)
        protected AppealRequestType.Appeal.ApplicantPassportNumber applicantPassportNumber;
        @XmlElement(name = "email_address", required = true)
        protected String emailAddress;
        @XmlElement(required = true)
        protected String phone;
        @XmlElement(name = "ApplicantPasDate", required = true)
        protected AppealRequestType.Appeal.ApplicantPasDate applicantPasDate;
        @XmlElement(name = "ApplicantPasOrg", required = true)
        protected AppealRequestType.Appeal.ApplicantPasOrg applicantPasOrg;
        @XmlElement(defaultValue = "43")
        protected int region;
        @XmlElement(name = "Cod_sub", required = true)
        protected String codSub;
        @XmlElement(name = "edu_sub", required = true)
        protected String eduSub;
        @XmlElement(name = "date_exam", required = true, defaultValue = "1900-01-01")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar dateExam;
        @XmlElement(name = "code_school", required = true)
        protected String codeSchool;
        @XmlElement(required = true)
        protected String school;
        @XmlElement(name = "code_place_exam", required = true)
        protected String codePlaceExam;
        @XmlElement(name = "place_exam", required = true)
        protected String placeExam;
        @XmlElement(name = "ap_rev", defaultValue = "-2")
        protected int apRev;
        @XmlElement(name = "ap_rev_text", required = true)
        protected String apRevText;

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
         *     {@link AppealRequestType.Appeal.ApplicantSurname }
         *     
         */
        public AppealRequestType.Appeal.ApplicantSurname getApplicantSurname() {
            return applicantSurname;
        }

        /**
         * Sets the value of the applicantSurname property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealRequestType.Appeal.ApplicantSurname }
         *     
         */
        public void setApplicantSurname(AppealRequestType.Appeal.ApplicantSurname value) {
            this.applicantSurname = value;
        }

        /**
         * Gets the value of the applicantName property.
         * 
         * @return
         *     possible object is
         *     {@link AppealRequestType.Appeal.ApplicantName }
         *     
         */
        public AppealRequestType.Appeal.ApplicantName getApplicantName() {
            return applicantName;
        }

        /**
         * Sets the value of the applicantName property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealRequestType.Appeal.ApplicantName }
         *     
         */
        public void setApplicantName(AppealRequestType.Appeal.ApplicantName value) {
            this.applicantName = value;
        }

        /**
         * Gets the value of the secondName property.
         * 
         * @return
         *     possible object is
         *     {@link AppealRequestType.Appeal.SecondName }
         *     
         */
        public AppealRequestType.Appeal.SecondName getSecondName() {
            return secondName;
        }

        /**
         * Sets the value of the secondName property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealRequestType.Appeal.SecondName }
         *     
         */
        public void setSecondName(AppealRequestType.Appeal.SecondName value) {
            this.secondName = value;
        }

        /**
         * Gets the value of the applicantPassportSeries property.
         * 
         * @return
         *     possible object is
         *     {@link AppealRequestType.Appeal.ApplicantPassportSeries }
         *     
         */
        public AppealRequestType.Appeal.ApplicantPassportSeries getApplicantPassportSeries() {
            return applicantPassportSeries;
        }

        /**
         * Sets the value of the applicantPassportSeries property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealRequestType.Appeal.ApplicantPassportSeries }
         *     
         */
        public void setApplicantPassportSeries(AppealRequestType.Appeal.ApplicantPassportSeries value) {
            this.applicantPassportSeries = value;
        }

        /**
         * Gets the value of the applicantPassportNumber property.
         * 
         * @return
         *     possible object is
         *     {@link AppealRequestType.Appeal.ApplicantPassportNumber }
         *     
         */
        public AppealRequestType.Appeal.ApplicantPassportNumber getApplicantPassportNumber() {
            return applicantPassportNumber;
        }

        /**
         * Sets the value of the applicantPassportNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealRequestType.Appeal.ApplicantPassportNumber }
         *     
         */
        public void setApplicantPassportNumber(AppealRequestType.Appeal.ApplicantPassportNumber value) {
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
         * Gets the value of the phone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhone() {
            return phone;
        }

        /**
         * Sets the value of the phone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhone(String value) {
            this.phone = value;
        }

        /**
         * Gets the value of the applicantPasDate property.
         * 
         * @return
         *     possible object is
         *     {@link AppealRequestType.Appeal.ApplicantPasDate }
         *     
         */
        public AppealRequestType.Appeal.ApplicantPasDate getApplicantPasDate() {
            return applicantPasDate;
        }

        /**
         * Sets the value of the applicantPasDate property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealRequestType.Appeal.ApplicantPasDate }
         *     
         */
        public void setApplicantPasDate(AppealRequestType.Appeal.ApplicantPasDate value) {
            this.applicantPasDate = value;
        }

        /**
         * Gets the value of the applicantPasOrg property.
         * 
         * @return
         *     possible object is
         *     {@link AppealRequestType.Appeal.ApplicantPasOrg }
         *     
         */
        public AppealRequestType.Appeal.ApplicantPasOrg getApplicantPasOrg() {
            return applicantPasOrg;
        }

        /**
         * Sets the value of the applicantPasOrg property.
         * 
         * @param value
         *     allowed object is
         *     {@link AppealRequestType.Appeal.ApplicantPasOrg }
         *     
         */
        public void setApplicantPasOrg(AppealRequestType.Appeal.ApplicantPasOrg value) {
            this.applicantPasOrg = value;
        }

        /**
         * Gets the value of the region property.
         * 
         */
        public int getRegion() {
            return region;
        }

        /**
         * Sets the value of the region property.
         * 
         */
        public void setRegion(int value) {
            this.region = value;
        }

        /**
         * Gets the value of the codSub property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodSub() {
            return codSub;
        }

        /**
         * Sets the value of the codSub property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodSub(String value) {
            this.codSub = value;
        }

        /**
         * Gets the value of the eduSub property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEduSub() {
            return eduSub;
        }

        /**
         * Sets the value of the eduSub property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEduSub(String value) {
            this.eduSub = value;
        }

        /**
         * Gets the value of the dateExam property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDateExam() {
            return dateExam;
        }

        /**
         * Sets the value of the dateExam property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDateExam(XMLGregorianCalendar value) {
            this.dateExam = value;
        }

        /**
         * Gets the value of the codeSchool property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeSchool() {
            return codeSchool;
        }

        /**
         * Sets the value of the codeSchool property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeSchool(String value) {
            this.codeSchool = value;
        }

        /**
         * Gets the value of the school property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSchool() {
            return school;
        }

        /**
         * Sets the value of the school property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSchool(String value) {
            this.school = value;
        }

        /**
         * Gets the value of the codePlaceExam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodePlaceExam() {
            return codePlaceExam;
        }

        /**
         * Sets the value of the codePlaceExam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodePlaceExam(String value) {
            this.codePlaceExam = value;
        }

        /**
         * Gets the value of the placeExam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlaceExam() {
            return placeExam;
        }

        /**
         * Sets the value of the placeExam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlaceExam(String value) {
            this.placeExam = value;
        }

        /**
         * Gets the value of the apRev property.
         * 
         */
        public int getApRev() {
            return apRev;
        }

        /**
         * Sets the value of the apRev property.
         * 
         */
        public void setApRev(int value) {
            this.apRev = value;
        }

        /**
         * Gets the value of the apRevText property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApRevText() {
            return apRevText;
        }

        /**
         * Sets the value of the apRevText property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApRevText(String value) {
            this.apRevText = value;
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
         *         &lt;element name="pas_date" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
         *         &lt;element name="pas_date_gr" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
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

            @XmlElement(name = "pas_date", defaultValue = "1900-01-01")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar pasDate;
            @XmlElement(name = "pas_date_gr", defaultValue = "1900-01-01")
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
         *         &lt;element name="pas_org" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="pas_org_gr" type="{http://www.w3.org/2001/XMLSchema}string"/>
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

            @XmlElement(name = "pas_org", required = true)
            protected String pasOrg;
            @XmlElement(name = "pas_org_gr", required = true)
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
         *         &lt;element name="pas_num" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
         *         &lt;element name="pas_num_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-6"/>
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

            @XmlElement(name = "pas_num", required = true)
            protected String pasNum;
            @XmlElement(name = "pas_num_gr", required = true)
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
         *         &lt;element name="pas_ser" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
         *         &lt;element name="pas_ser_gr" type="{urn://x-artefacts-coko/ege/services/1.0.0}digits-4"/>
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

            @XmlElement(name = "pas_ser", required = true)
            protected String pasSer;
            @XmlElement(name = "pas_ser_gr", required = true)
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
        public static class SecondName {

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

    }

}
