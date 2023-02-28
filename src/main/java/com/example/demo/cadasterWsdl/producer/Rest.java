
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for Rest complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Rest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Benperson" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Document" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Propcode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RegDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="Restrightname" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Rest", propOrder = {
    "address",
    "benperson",
    "document",
    "propcode",
    "regDate",
    "restrightname"
})
@XmlSeeAlso({
    HistoryRest.class
})
public class Rest {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "Benperson", required = true)
    protected String benperson;
    @XmlElement(name = "Document", required = true)
    protected String document;
    @XmlElement(name = "Propcode")
    protected long propcode;
    @XmlElement(name = "RegDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar regDate;
    @XmlElement(name = "Restrightname", required = true)
    protected String restrightname;

    /**
     * Gets the value of the address property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress() {
        return address;
    }

    /**
     * Sets the value of the address property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress(String value) {
        this.address = value;
    }

    /**
     * Gets the value of the benperson property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBenperson() {
        return benperson;
    }

    /**
     * Sets the value of the benperson property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBenperson(String value) {
        this.benperson = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocument() {
        return document;
    }

    /**
     * Sets the value of the document property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocument(String value) {
        this.document = value;
    }

    /**
     * Gets the value of the propcode property.
     * 
     */
    public long getPropcode() {
        return propcode;
    }

    /**
     * Sets the value of the propcode property.
     * 
     */
    public void setPropcode(long value) {
        this.propcode = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRegDate(XMLGregorianCalendar value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the restrightname property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestrightname() {
        return restrightname;
    }

    /**
     * Sets the value of the restrightname property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestrightname(String value) {
        this.restrightname = value;
    }

}
