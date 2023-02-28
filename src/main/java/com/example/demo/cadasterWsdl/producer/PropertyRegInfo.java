
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for PropertyRegInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="PropertyRegInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="DocNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Owner" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="PropCode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RegDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="TermDate" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PropertyRegInfo", propOrder = {
    "address",
    "docNum",
    "owner",
    "propCode",
    "regDate",
    "termDate"
})
@XmlSeeAlso({
    PersonRight.class
})
public class PropertyRegInfo {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "DocNum", required = true)
    protected String docNum;
    @XmlElement(name = "Owner", required = true)
    protected String owner;
    @XmlElement(name = "PropCode")
    protected long propCode;
    @XmlElement(name = "RegDate", required = true)
    protected String regDate;
    @XmlElement(name = "TermDate", required = true)
    protected String termDate;

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
     * Gets the value of the docNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocNum() {
        return docNum;
    }

    /**
     * Sets the value of the docNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocNum(String value) {
        this.docNum = value;
    }

    /**
     * Gets the value of the owner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOwner() {
        return owner;
    }

    /**
     * Sets the value of the owner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOwner(String value) {
        this.owner = value;
    }

    /**
     * Gets the value of the propCode property.
     * 
     */
    public long getPropCode() {
        return propCode;
    }

    /**
     * Sets the value of the propCode property.
     * 
     */
    public void setPropCode(long value) {
        this.propCode = value;
    }

    /**
     * Gets the value of the regDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegDate() {
        return regDate;
    }

    /**
     * Sets the value of the regDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegDate(String value) {
        this.regDate = value;
    }

    /**
     * Gets the value of the termDate property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTermDate() {
        return termDate;
    }

    /**
     * Sets the value of the termDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTermDate(String value) {
        this.termDate = value;
    }

}
