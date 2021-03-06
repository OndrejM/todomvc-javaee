
package wsdl;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "SampleWebService", targetNamespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface SampleWebService {


    /**
     * 
     * @return
     *     returns int
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getAllTodosSize", targetNamespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", className = "wsdl.GetAllTodosSize")
    @ResponseWrapper(localName = "getAllTodosSizeResponse", targetNamespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", className = "wsdl.GetAllTodosSizeResponse")
    @Action(input = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/SampleWebService/getAllTodosSizeRequest", output = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/SampleWebService/getAllTodosSizeResponse")
    public int getAllTodosSize();

    /**
     * 
     * @param arg0
     * @return
     *     returns wsdl.AllTodosResult
     */
    @WebMethod
    @WebResult(name = "allTodos", targetNamespace = "")
    @RequestWrapper(localName = "getAllTodos", targetNamespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", className = "wsdl.GetAllTodos")
    @ResponseWrapper(localName = "getAllTodosResponse", targetNamespace = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/", className = "wsdl.GetAllTodosResponse")
    @Action(input = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/SampleWebService/getAllTodosRequest", output = "http://ws.wsexamples.javaee.todomvc.ondrej.mihalyi/SampleWebService/getAllTodosResponse")
    public AllTodosResult getAllTodos(
        @WebParam(name = "arg0", targetNamespace = "")
        boolean arg0);

}
