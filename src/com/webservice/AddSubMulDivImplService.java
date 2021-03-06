
package com.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "AddSubMulDivImplService", targetNamespace = "http://webservice.com/", wsdlLocation = "http://localhost:8181/AddSubMulDiv_Webservice/services/AddSubMulDivImplPort?wsdl")
public class AddSubMulDivImplService
    extends Service
{

    private final static URL ADDSUBMULDIVIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException ADDSUBMULDIVIMPLSERVICE_EXCEPTION;
    private final static QName ADDSUBMULDIVIMPLSERVICE_QNAME = new QName("http://webservice.com/", "AddSubMulDivImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8181/AddSubMulDiv_Webservice/services/AddSubMulDivImplPort?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        ADDSUBMULDIVIMPLSERVICE_WSDL_LOCATION = url;
        ADDSUBMULDIVIMPLSERVICE_EXCEPTION = e;
    }

    public AddSubMulDivImplService() {
        super(__getWsdlLocation(), ADDSUBMULDIVIMPLSERVICE_QNAME);
    }

    public AddSubMulDivImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), ADDSUBMULDIVIMPLSERVICE_QNAME, features);
    }

    public AddSubMulDivImplService(URL wsdlLocation) {
        super(wsdlLocation, ADDSUBMULDIVIMPLSERVICE_QNAME);
    }

    public AddSubMulDivImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, ADDSUBMULDIVIMPLSERVICE_QNAME, features);
    }

    public AddSubMulDivImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddSubMulDivImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IAddSubMulDiv
     */
    @WebEndpoint(name = "AddSubMulDivImplPort")
    public IAddSubMulDiv getAddSubMulDivImplPort() {
        return super.getPort(new QName("http://webservice.com/", "AddSubMulDivImplPort"), IAddSubMulDiv.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IAddSubMulDiv
     */
    @WebEndpoint(name = "AddSubMulDivImplPort")
    public IAddSubMulDiv getAddSubMulDivImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://webservice.com/", "AddSubMulDivImplPort"), IAddSubMulDiv.class, features);
    }

    private static URL __getWsdlLocation() {
        if (ADDSUBMULDIVIMPLSERVICE_EXCEPTION!= null) {
            throw ADDSUBMULDIVIMPLSERVICE_EXCEPTION;
        }
        return ADDSUBMULDIVIMPLSERVICE_WSDL_LOCATION;
    }

}
