
package com.example.demo.cadasterWsdl.producer;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for TechParam complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TechParam"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Address" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BalconNumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BathType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BoundType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="BuildArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConstrType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="ConstrYear" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FloorNumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="FloorsInBuild" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Formaispolzovania" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Formasobstvenosti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="God_postroiki" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HasBath" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HasGas" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HasPlumbing" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HasSewerage" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="HeatType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="KitchenArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LandLegalArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LandRealArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LegalArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="LodjNum" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Materialsten" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Naznachenie" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ploshad_stroenia" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Ploshad_zem_uchastka" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Propcode" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="RealArea" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RoofType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="RoomNumb" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="SurveyDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="SurveyType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TechParam", propOrder = {
    "address",
    "balconNumb",
    "bathType",
    "boundType",
    "buildArea",
    "constrType",
    "constrYear",
    "floorNumb",
    "floorsInBuild",
    "formaispolzovania",
    "formasobstvenosti",
    "godPostroiki",
    "hasBath",
    "hasGas",
    "hasPlumbing",
    "hasSewerage",
    "heatType",
    "kitchenArea",
    "landLegalArea",
    "landRealArea",
    "legalArea",
    "lodjNum",
    "materialsten",
    "naznachenie",
    "ploshadStroenia",
    "ploshadZemUchastka",
    "propcode",
    "realArea",
    "roofType",
    "roomNumb",
    "surveyDate",
    "surveyType"
})
public class TechParam {

    @XmlElement(name = "Address", required = true)
    protected String address;
    @XmlElement(name = "BalconNumb", required = true)
    protected String balconNumb;
    @XmlElement(name = "BathType", required = true)
    protected String bathType;
    @XmlElement(name = "BoundType", required = true)
    protected String boundType;
    @XmlElement(name = "BuildArea", required = true)
    protected String buildArea;
    @XmlElement(name = "ConstrType", required = true)
    protected String constrType;
    @XmlElement(name = "ConstrYear", required = true)
    protected String constrYear;
    @XmlElement(name = "FloorNumb", required = true)
    protected String floorNumb;
    @XmlElement(name = "FloorsInBuild", required = true)
    protected String floorsInBuild;
    @XmlElement(name = "Formaispolzovania", required = true)
    protected String formaispolzovania;
    @XmlElement(name = "Formasobstvenosti", required = true)
    protected String formasobstvenosti;
    @XmlElement(name = "God_postroiki", required = true)
    protected String godPostroiki;
    @XmlElement(name = "HasBath", required = true)
    protected String hasBath;
    @XmlElement(name = "HasGas", required = true)
    protected String hasGas;
    @XmlElement(name = "HasPlumbing", required = true)
    protected String hasPlumbing;
    @XmlElement(name = "HasSewerage", required = true)
    protected String hasSewerage;
    @XmlElement(name = "HeatType", required = true)
    protected String heatType;
    @XmlElement(name = "KitchenArea", required = true)
    protected String kitchenArea;
    @XmlElement(name = "LandLegalArea", required = true)
    protected String landLegalArea;
    @XmlElement(name = "LandRealArea", required = true)
    protected String landRealArea;
    @XmlElement(name = "LegalArea", required = true)
    protected String legalArea;
    @XmlElement(name = "LodjNum", required = true)
    protected String lodjNum;
    @XmlElement(name = "Materialsten", required = true)
    protected String materialsten;
    @XmlElement(name = "Naznachenie", required = true)
    protected String naznachenie;
    @XmlElement(name = "Ploshad_stroenia", required = true)
    protected String ploshadStroenia;
    @XmlElement(name = "Ploshad_zem_uchastka", required = true)
    protected String ploshadZemUchastka;
    @XmlElement(name = "Propcode")
    protected long propcode;
    @XmlElement(name = "RealArea", required = true)
    protected String realArea;
    @XmlElement(name = "RoofType", required = true)
    protected String roofType;
    @XmlElement(name = "RoomNumb", required = true)
    protected String roomNumb;
    @XmlElement(name = "SurveyDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar surveyDate;
    @XmlElement(name = "SurveyType", required = true)
    protected String surveyType;

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
     * Gets the value of the balconNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBalconNumb() {
        return balconNumb;
    }

    /**
     * Sets the value of the balconNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBalconNumb(String value) {
        this.balconNumb = value;
    }

    /**
     * Gets the value of the bathType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBathType() {
        return bathType;
    }

    /**
     * Sets the value of the bathType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBathType(String value) {
        this.bathType = value;
    }

    /**
     * Gets the value of the boundType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBoundType() {
        return boundType;
    }

    /**
     * Sets the value of the boundType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBoundType(String value) {
        this.boundType = value;
    }

    /**
     * Gets the value of the buildArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBuildArea() {
        return buildArea;
    }

    /**
     * Sets the value of the buildArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBuildArea(String value) {
        this.buildArea = value;
    }

    /**
     * Gets the value of the constrType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrType() {
        return constrType;
    }

    /**
     * Sets the value of the constrType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrType(String value) {
        this.constrType = value;
    }

    /**
     * Gets the value of the constrYear property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConstrYear() {
        return constrYear;
    }

    /**
     * Sets the value of the constrYear property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConstrYear(String value) {
        this.constrYear = value;
    }

    /**
     * Gets the value of the floorNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorNumb() {
        return floorNumb;
    }

    /**
     * Sets the value of the floorNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorNumb(String value) {
        this.floorNumb = value;
    }

    /**
     * Gets the value of the floorsInBuild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFloorsInBuild() {
        return floorsInBuild;
    }

    /**
     * Sets the value of the floorsInBuild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFloorsInBuild(String value) {
        this.floorsInBuild = value;
    }

    /**
     * Gets the value of the formaispolzovania property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormaispolzovania() {
        return formaispolzovania;
    }

    /**
     * Sets the value of the formaispolzovania property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormaispolzovania(String value) {
        this.formaispolzovania = value;
    }

    /**
     * Gets the value of the formasobstvenosti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFormasobstvenosti() {
        return formasobstvenosti;
    }

    /**
     * Sets the value of the formasobstvenosti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFormasobstvenosti(String value) {
        this.formasobstvenosti = value;
    }

    /**
     * Gets the value of the godPostroiki property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGodPostroiki() {
        return godPostroiki;
    }

    /**
     * Sets the value of the godPostroiki property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGodPostroiki(String value) {
        this.godPostroiki = value;
    }

    /**
     * Gets the value of the hasBath property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasBath() {
        return hasBath;
    }

    /**
     * Sets the value of the hasBath property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasBath(String value) {
        this.hasBath = value;
    }

    /**
     * Gets the value of the hasGas property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasGas() {
        return hasGas;
    }

    /**
     * Sets the value of the hasGas property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasGas(String value) {
        this.hasGas = value;
    }

    /**
     * Gets the value of the hasPlumbing property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasPlumbing() {
        return hasPlumbing;
    }

    /**
     * Sets the value of the hasPlumbing property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasPlumbing(String value) {
        this.hasPlumbing = value;
    }

    /**
     * Gets the value of the hasSewerage property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHasSewerage() {
        return hasSewerage;
    }

    /**
     * Sets the value of the hasSewerage property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHasSewerage(String value) {
        this.hasSewerage = value;
    }

    /**
     * Gets the value of the heatType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHeatType() {
        return heatType;
    }

    /**
     * Sets the value of the heatType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHeatType(String value) {
        this.heatType = value;
    }

    /**
     * Gets the value of the kitchenArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKitchenArea() {
        return kitchenArea;
    }

    /**
     * Sets the value of the kitchenArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKitchenArea(String value) {
        this.kitchenArea = value;
    }

    /**
     * Gets the value of the landLegalArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandLegalArea() {
        return landLegalArea;
    }

    /**
     * Sets the value of the landLegalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandLegalArea(String value) {
        this.landLegalArea = value;
    }

    /**
     * Gets the value of the landRealArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLandRealArea() {
        return landRealArea;
    }

    /**
     * Sets the value of the landRealArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLandRealArea(String value) {
        this.landRealArea = value;
    }

    /**
     * Gets the value of the legalArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLegalArea() {
        return legalArea;
    }

    /**
     * Sets the value of the legalArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLegalArea(String value) {
        this.legalArea = value;
    }

    /**
     * Gets the value of the lodjNum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLodjNum() {
        return lodjNum;
    }

    /**
     * Sets the value of the lodjNum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLodjNum(String value) {
        this.lodjNum = value;
    }

    /**
     * Gets the value of the materialsten property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaterialsten() {
        return materialsten;
    }

    /**
     * Sets the value of the materialsten property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaterialsten(String value) {
        this.materialsten = value;
    }

    /**
     * Gets the value of the naznachenie property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaznachenie() {
        return naznachenie;
    }

    /**
     * Sets the value of the naznachenie property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaznachenie(String value) {
        this.naznachenie = value;
    }

    /**
     * Gets the value of the ploshadStroenia property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPloshadStroenia() {
        return ploshadStroenia;
    }

    /**
     * Sets the value of the ploshadStroenia property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPloshadStroenia(String value) {
        this.ploshadStroenia = value;
    }

    /**
     * Gets the value of the ploshadZemUchastka property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPloshadZemUchastka() {
        return ploshadZemUchastka;
    }

    /**
     * Sets the value of the ploshadZemUchastka property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPloshadZemUchastka(String value) {
        this.ploshadZemUchastka = value;
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
     * Gets the value of the realArea property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRealArea() {
        return realArea;
    }

    /**
     * Sets the value of the realArea property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRealArea(String value) {
        this.realArea = value;
    }

    /**
     * Gets the value of the roofType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoofType() {
        return roofType;
    }

    /**
     * Sets the value of the roofType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoofType(String value) {
        this.roofType = value;
    }

    /**
     * Gets the value of the roomNumb property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomNumb() {
        return roomNumb;
    }

    /**
     * Sets the value of the roomNumb property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomNumb(String value) {
        this.roomNumb = value;
    }

    /**
     * Gets the value of the surveyDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSurveyDate() {
        return surveyDate;
    }

    /**
     * Sets the value of the surveyDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSurveyDate(XMLGregorianCalendar value) {
        this.surveyDate = value;
    }

    /**
     * Gets the value of the surveyType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurveyType() {
        return surveyType;
    }

    /**
     * Sets the value of the surveyType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurveyType(String value) {
        this.surveyType = value;
    }

}
