
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;choice&gt;
 *           &lt;element name="response" type="{http://producer.x-road.eu}PropertyDoc"/&gt;
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
@XmlRootElement(name = "TechparamHtmlResponse")
public class TechparamHtmlResponse {

    protected long request;
    protected PropertyDoc response;
    protected Fault fault;

    /**
     * Gets the value of the request property.
     * 
     */
    public long getRequest() {
        return request;
    }

    /**
     * Sets the value of the request property.
     * 
     */
    public void setRequest(long value) {
        this.request = value;
    }

    /**
     * Gets the value of the response property.
     * 
     * @return
     *     possible object is
     *     {@link PropertyDoc }
     *     
     */
    public PropertyDoc getResponse() {
        return response;
    }

    /**
     * Sets the value of the response property.
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyDoc }
     *     
     */
    public void setResponse(PropertyDoc value) {
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
