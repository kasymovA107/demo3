package com.example.demo.cadasterWsdl.producer;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.3
 * 2023-02-17T14:29:26.892+06:00
 * Generated source version: 3.3.3
 *
 */
@WebServiceClient(name = "CadastreReferencesApp",
                  wsdlLocation = "classpath:wsdl/central-server_GOV_70000019_dkrpni-service_GetProperty_v1.wsdl",
                  targetNamespace = "http://producer.x-road.eu")
public class CadastreReferencesApp extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://producer.x-road.eu", "CadastreReferencesApp");
    public final static QName PortName = new QName("http://producer.x-road.eu", "PortName");
    static {
        URL url = CadastreReferencesApp.class.getClassLoader().getResource("wsdl/central-server_GOV_70000019_dkrpni-service_GetProperty_v1.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(CadastreReferencesApp.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/central-server_GOV_70000019_dkrpni-service_GetProperty_v1.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public CadastreReferencesApp(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public CadastreReferencesApp(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CadastreReferencesApp() {
        super(WSDL_LOCATION, SERVICE);
    }

    public CadastreReferencesApp(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public CadastreReferencesApp(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public CadastreReferencesApp(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns References
     */
    @WebEndpoint(name = "PortName")
    public References getPortName() {
        return super.getPort(PortName, References.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns References
     */
    @WebEndpoint(name = "PortName")
    public References getPortName(WebServiceFeature... features) {
        return super.getPort(PortName, References.class, features);
    }


    public PropertyInfo getPropertyInfo(GetPropertyInfo request) {
        return getPropertyInfo(request);

    }    public GetPropertyPdf getPropertyPdf(GetProperty request) {
        return getPropertyPdf(request);
    }
}
