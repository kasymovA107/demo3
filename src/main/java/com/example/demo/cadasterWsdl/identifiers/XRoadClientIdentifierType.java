
package com.example.demo.cadasterWsdl.identifiers;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for XRoadClientIdentifierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="XRoadClientIdentifierType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://x-road.eu/xsd/identifiers}XRoadIdentifierType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}xRoadInstance"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}memberClass"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}memberCode"/&gt;
 *         &lt;element ref="{http://x-road.eu/xsd/identifiers}subsystemCode" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute ref="{http://x-road.eu/xsd/identifiers}objectType use="required""/&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "XRoadClientIdentifierType")
public class XRoadClientIdentifierType
    extends XRoadIdentifierType
{


}
