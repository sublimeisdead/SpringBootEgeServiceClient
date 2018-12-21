
package coko.artefacts.x.ege.services._1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 *  Ответ на запрос о результатах ЕГЭ 
 * 
 * <p>Java class for EgeResultsResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="EgeResultsResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="EgeResult" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Subject">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PartA">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PartB">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PartC">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PartD">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="PersentageTasks" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="CodePPE">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="CodeOY">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BlankNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Blank1" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Blank2" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="MinMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DateExam" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="DatePublish" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
@XmlType(name = "EgeResultsResponseType", propOrder = {
    "egeResult"
})
public class EgeResultsResponseType {

    @XmlElement(name = "EgeResult")
    protected EgeResultsResponseType.EgeResult egeResult;

    /**
     * Gets the value of the egeResult property.
     * 
     * @return
     *     possible object is
     *     {@link EgeResultsResponseType.EgeResult }
     *     
     */
    public EgeResultsResponseType.EgeResult getEgeResult() {
        return egeResult;
    }

    /**
     * Sets the value of the egeResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link EgeResultsResponseType.EgeResult }
     *     
     */
    public void setEgeResult(EgeResultsResponseType.EgeResult value) {
        this.egeResult = value;
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
     *         &lt;element name="Subject">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Total" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Grade" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PartA">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PartB">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PartC">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PartD">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="PersentageTasks" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="CodePPE">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="CodeOY">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BlankNumber" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Blank1" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="Blank2" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="MinMark" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DateExam" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="DatePublish" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "subject",
        "total",
        "grade",
        "partA",
        "partB",
        "partC",
        "partD",
        "tasksDone",
        "persentageTasks",
        "codePPE",
        "codeOY",
        "blankNumber",
        "blank1",
        "blank2",
        "minMark",
        "dateExam",
        "datePublish"
    })
    public static class EgeResult {

        @XmlElement(name = "Subject", required = true)
        protected EgeResultsResponseType.EgeResult.Subject subject;
        @XmlElement(name = "Total", required = true)
        protected String total;
        @XmlElement(name = "Grade", required = true)
        protected String grade;
        @XmlElement(name = "PartA", required = true)
        protected EgeResultsResponseType.EgeResult.PartA partA;
        @XmlElement(name = "PartB", required = true)
        protected EgeResultsResponseType.EgeResult.PartB partB;
        @XmlElement(name = "PartC", required = true)
        protected EgeResultsResponseType.EgeResult.PartC partC;
        @XmlElement(name = "PartD", required = true)
        protected EgeResultsResponseType.EgeResult.PartD partD;
        @XmlElement(name = "TasksDone", required = true)
        protected String tasksDone;
        @XmlElement(name = "PersentageTasks", required = true)
        protected String persentageTasks;
        @XmlElement(name = "CodePPE", required = true)
        protected EgeResultsResponseType.EgeResult.CodePPE codePPE;
        @XmlElement(name = "CodeOY", required = true)
        protected EgeResultsResponseType.EgeResult.CodeOY codeOY;
        @XmlElement(name = "BlankNumber", required = true)
        protected String blankNumber;
        @XmlElement(name = "Blank1", required = true)
        protected String blank1;
        @XmlElement(name = "Blank2", required = true)
        protected String blank2;
        @XmlElement(name = "MinMark", required = true)
        protected String minMark;
        @XmlElement(name = "DateExam", required = true)
        protected String dateExam;
        @XmlElement(name = "DatePublish", required = true)
        protected String datePublish;

        /**
         * Gets the value of the subject property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsResponseType.EgeResult.Subject }
         *     
         */
        public EgeResultsResponseType.EgeResult.Subject getSubject() {
            return subject;
        }

        /**
         * Sets the value of the subject property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsResponseType.EgeResult.Subject }
         *     
         */
        public void setSubject(EgeResultsResponseType.EgeResult.Subject value) {
            this.subject = value;
        }

        /**
         * Gets the value of the total property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTotal() {
            return total;
        }

        /**
         * Sets the value of the total property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTotal(String value) {
            this.total = value;
        }

        /**
         * Gets the value of the grade property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGrade() {
            return grade;
        }

        /**
         * Sets the value of the grade property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGrade(String value) {
            this.grade = value;
        }

        /**
         * Gets the value of the partA property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsResponseType.EgeResult.PartA }
         *     
         */
        public EgeResultsResponseType.EgeResult.PartA getPartA() {
            return partA;
        }

        /**
         * Sets the value of the partA property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsResponseType.EgeResult.PartA }
         *     
         */
        public void setPartA(EgeResultsResponseType.EgeResult.PartA value) {
            this.partA = value;
        }

        /**
         * Gets the value of the partB property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsResponseType.EgeResult.PartB }
         *     
         */
        public EgeResultsResponseType.EgeResult.PartB getPartB() {
            return partB;
        }

        /**
         * Sets the value of the partB property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsResponseType.EgeResult.PartB }
         *     
         */
        public void setPartB(EgeResultsResponseType.EgeResult.PartB value) {
            this.partB = value;
        }

        /**
         * Gets the value of the partC property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsResponseType.EgeResult.PartC }
         *     
         */
        public EgeResultsResponseType.EgeResult.PartC getPartC() {
            return partC;
        }

        /**
         * Sets the value of the partC property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsResponseType.EgeResult.PartC }
         *     
         */
        public void setPartC(EgeResultsResponseType.EgeResult.PartC value) {
            this.partC = value;
        }

        /**
         * Gets the value of the partD property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsResponseType.EgeResult.PartD }
         *     
         */
        public EgeResultsResponseType.EgeResult.PartD getPartD() {
            return partD;
        }

        /**
         * Sets the value of the partD property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsResponseType.EgeResult.PartD }
         *     
         */
        public void setPartD(EgeResultsResponseType.EgeResult.PartD value) {
            this.partD = value;
        }

        /**
         * Gets the value of the tasksDone property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTasksDone() {
            return tasksDone;
        }

        /**
         * Sets the value of the tasksDone property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTasksDone(String value) {
            this.tasksDone = value;
        }

        /**
         * Gets the value of the persentageTasks property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPersentageTasks() {
            return persentageTasks;
        }

        /**
         * Sets the value of the persentageTasks property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPersentageTasks(String value) {
            this.persentageTasks = value;
        }

        /**
         * Gets the value of the codePPE property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsResponseType.EgeResult.CodePPE }
         *     
         */
        public EgeResultsResponseType.EgeResult.CodePPE getCodePPE() {
            return codePPE;
        }

        /**
         * Sets the value of the codePPE property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsResponseType.EgeResult.CodePPE }
         *     
         */
        public void setCodePPE(EgeResultsResponseType.EgeResult.CodePPE value) {
            this.codePPE = value;
        }

        /**
         * Gets the value of the codeOY property.
         * 
         * @return
         *     possible object is
         *     {@link EgeResultsResponseType.EgeResult.CodeOY }
         *     
         */
        public EgeResultsResponseType.EgeResult.CodeOY getCodeOY() {
            return codeOY;
        }

        /**
         * Sets the value of the codeOY property.
         * 
         * @param value
         *     allowed object is
         *     {@link EgeResultsResponseType.EgeResult.CodeOY }
         *     
         */
        public void setCodeOY(EgeResultsResponseType.EgeResult.CodeOY value) {
            this.codeOY = value;
        }

        /**
         * Gets the value of the blankNumber property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlankNumber() {
            return blankNumber;
        }

        /**
         * Sets the value of the blankNumber property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlankNumber(String value) {
            this.blankNumber = value;
        }

        /**
         * Gets the value of the blank1 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlank1() {
            return blank1;
        }

        /**
         * Sets the value of the blank1 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlank1(String value) {
            this.blank1 = value;
        }

        /**
         * Gets the value of the blank2 property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBlank2() {
            return blank2;
        }

        /**
         * Sets the value of the blank2 property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBlank2(String value) {
            this.blank2 = value;
        }

        /**
         * Gets the value of the minMark property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinMark() {
            return minMark;
        }

        /**
         * Sets the value of the minMark property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinMark(String value) {
            this.minMark = value;
        }

        /**
         * Gets the value of the dateExam property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDateExam() {
            return dateExam;
        }

        /**
         * Sets the value of the dateExam property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDateExam(String value) {
            this.dateExam = value;
        }

        /**
         * Gets the value of the datePublish property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDatePublish() {
            return datePublish;
        }

        /**
         * Sets the value of the datePublish property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDatePublish(String value) {
            this.datePublish = value;
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
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "id",
            "name"
        })
        public static class CodeOY {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "Name", required = true)
            protected String name;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "id",
            "name"
        })
        public static class CodePPE {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "Name", required = true)
            protected String name;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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
         *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "mask",
            "tasksDone"
        })
        public static class PartA {

            @XmlElement(name = "Mask", required = true)
            protected String mask;
            @XmlElement(name = "TasksDone", required = true)
            protected String tasksDone;

            /**
             * Gets the value of the mask property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMask() {
                return mask;
            }

            /**
             * Sets the value of the mask property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMask(String value) {
                this.mask = value;
            }

            /**
             * Gets the value of the tasksDone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTasksDone() {
                return tasksDone;
            }

            /**
             * Sets the value of the tasksDone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTasksDone(String value) {
                this.tasksDone = value;
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
         *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "mask",
            "tasksDone"
        })
        public static class PartB {

            @XmlElement(name = "Mask", required = true)
            protected String mask;
            @XmlElement(name = "TasksDone", required = true)
            protected String tasksDone;

            /**
             * Gets the value of the mask property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMask() {
                return mask;
            }

            /**
             * Sets the value of the mask property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMask(String value) {
                this.mask = value;
            }

            /**
             * Gets the value of the tasksDone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTasksDone() {
                return tasksDone;
            }

            /**
             * Sets the value of the tasksDone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTasksDone(String value) {
                this.tasksDone = value;
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
         *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "mask",
            "tasksDone"
        })
        public static class PartC {

            @XmlElement(name = "Mask", required = true)
            protected String mask;
            @XmlElement(name = "TasksDone", required = true)
            protected String tasksDone;

            /**
             * Gets the value of the mask property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMask() {
                return mask;
            }

            /**
             * Sets the value of the mask property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMask(String value) {
                this.mask = value;
            }

            /**
             * Gets the value of the tasksDone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTasksDone() {
                return tasksDone;
            }

            /**
             * Sets the value of the tasksDone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTasksDone(String value) {
                this.tasksDone = value;
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
         *         &lt;element name="Mask" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="TasksDone" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "mask",
            "tasksDone"
        })
        public static class PartD {

            @XmlElement(name = "Mask", required = true)
            protected String mask;
            @XmlElement(name = "TasksDone", required = true)
            protected String tasksDone;

            /**
             * Gets the value of the mask property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMask() {
                return mask;
            }

            /**
             * Sets the value of the mask property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMask(String value) {
                this.mask = value;
            }

            /**
             * Gets the value of the tasksDone property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTasksDone() {
                return tasksDone;
            }

            /**
             * Sets the value of the tasksDone property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTasksDone(String value) {
                this.tasksDone = value;
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
         *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "id",
            "name"
        })
        public static class Subject {

            @XmlElement(name = "Id", required = true)
            protected String id;
            @XmlElement(name = "Name", required = true)
            protected String name;

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setId(String value) {
                this.id = value;
            }

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

        }

    }

}
