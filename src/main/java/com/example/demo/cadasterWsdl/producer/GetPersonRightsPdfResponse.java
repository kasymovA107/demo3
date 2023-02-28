
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="request" type="{http://producer.x-road.eu}PersonData"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="response" type="{http://producer.x-road.eu}PersonRightsDoc"/&gt;
 *           &lt;element name="fault" type="{http://producer.x-road.eu}fault"/&gt;
 *         &lt;/choice&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "request",
    "response",
    "fault"
})
@XmlRootElement(name = "GetPersonRightsPdfResponse")
public class GetPersonRightsPdfResponse {

    @XmlElement(required = true)
    protected PersonData request;
    protected PersonRightsDoc response;
    protected Fault fault;

    /**
     * Gets the value of the request property.
     * 
     * @return
     *     possible object is
     *     {@link PersonData }
     *     
     */
    public PersonData getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonData }
     *     
     */
    public void setRequest(PersonData value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link PersonRightsDoc }
     *     
     */
    public PersonRightsDoc getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link PersonRightsDoc }
     *     
     */
    public void setResponse(PersonRightsDoc value) {
        this.response = value;
    }

    /**
     * Gets the value of the fault property.
     * 
     * @return
     *     possible object is
     *     {@link Fault }
     *     
     */
    public Fault getFault() {
        return fault;
    }

    /**
     * Sets the value of the fault property.
     * 
     * @param value
     *     allowed object is
     *     {@link Fault }
     *     
     */
    public void setFault(Fault value) {
        this.fault = value;
    }

}
