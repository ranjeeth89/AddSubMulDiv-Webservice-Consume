
package com.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "IAddSubMulDiv", targetNamespace = "http://webservice.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface IAddSubMulDiv {


    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(action = "urn:Multiplication")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "multiplication", targetNamespace = "http://webservice.com/", className = "com.webservice.Multiplication")
    @ResponseWrapper(localName = "multiplicationResponse", targetNamespace = "http://webservice.com/", className = "com.webservice.MultiplicationResponse")
    public int multiplication(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(action = "urn:Division")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "division", targetNamespace = "http://webservice.com/", className = "com.webservice.Division")
    @ResponseWrapper(localName = "divisionResponse", targetNamespace = "http://webservice.com/", className = "com.webservice.DivisionResponse")
    public int division(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(action = "urn:Subtraction")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "subtraction", targetNamespace = "http://webservice.com/", className = "com.webservice.Subtraction")
    @ResponseWrapper(localName = "subtractionResponse", targetNamespace = "http://webservice.com/", className = "com.webservice.SubtractionResponse")
    public int subtraction(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns int
     */
    @WebMethod(action = "urn:Addition")
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "addition", targetNamespace = "http://webservice.com/", className = "com.webservice.Addition")
    @ResponseWrapper(localName = "additionResponse", targetNamespace = "http://webservice.com/", className = "com.webservice.AdditionResponse")
    public int addition(
        @WebParam(name = "arg0", targetNamespace = "")
        int arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        int arg1);

}
