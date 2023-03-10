
package com.example.demo.cadasterWsdl.xroad;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;
import com.example.demo.cadasterWsdl.identifiers.XRoadCentralServiceIdentifierType;
import com.example.demo.cadasterWsdl.identifiers.XRoadClientIdentifierType;
import com.example.demo.cadasterWsdl.identifiers.XRoadServiceIdentifierType;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the eu.x_road.xsd.xroad package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Client_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "client");
    private final static QName _Service_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "service");
    private final static QName _CentralService_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "centralService");
    private final static QName _Id_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "id");
    private final static QName _UserId_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "userId");
    private final static QName _Issue_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "issue");
    private final static QName _ProtocolVersion_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "protocolVersion");
    private final static QName _Version_QNAME = new QName("http://x-road.eu/xsd/xroad.xsd", "version");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: eu.x_road.xsd.xroad
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link RequestHash }
     * 
     */
    public RequestHash createRequestHash() {
        return new RequestHash();
    }

    /**
     * Create an instance of {@link Title }
     * 
     */
    public Title createTitle() {
        return new Title();
    }

    /**
     * Create an instance of {@link Notes }
     * 
     */
    public Notes createNotes() {
        return new Notes();
    }

    /**
     * Create an instance of {@link TechNotes }
     * 
     */
    public TechNotes createTechNotes() {
        return new TechNotes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRoadClientIdentifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XRoadClientIdentifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "client")
    public JAXBElement<XRoadClientIdentifierType> createClient(XRoadClientIdentifierType value) {
        return new JAXBElement<XRoadClientIdentifierType>(_Client_QNAME, XRoadClientIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRoadServiceIdentifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XRoadServiceIdentifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "service")
    public JAXBElement<XRoadServiceIdentifierType> createService(XRoadServiceIdentifierType value) {
        return new JAXBElement<XRoadServiceIdentifierType>(_Service_QNAME, XRoadServiceIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XRoadCentralServiceIdentifierType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XRoadCentralServiceIdentifierType }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "centralService")
    public JAXBElement<XRoadCentralServiceIdentifierType> createCentralService(XRoadCentralServiceIdentifierType value) {
        return new JAXBElement<XRoadCentralServiceIdentifierType>(_CentralService_QNAME, XRoadCentralServiceIdentifierType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "id")
    public JAXBElement<String> createId(String value) {
        return new JAXBElement<String>(_Id_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "userId")
    public JAXBElement<String> createUserId(String value) {
        return new JAXBElement<String>(_UserId_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "issue")
    public JAXBElement<String> createIssue(String value) {
        return new JAXBElement<String>(_Issue_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "protocolVersion")
    public JAXBElement<String> createProtocolVersion(String value) {
        return new JAXBElement<String>(_ProtocolVersion_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://x-road.eu/xsd/xroad.xsd", name = "version")
    public JAXBElement<String> createVersion(String value) {
        return new JAXBElement<String>(_Version_QNAME, String.class, null, value);
    }

}
