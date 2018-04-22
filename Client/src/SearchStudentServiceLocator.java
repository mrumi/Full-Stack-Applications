/**
 * SearchStudentServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mrumi_hw5;

public class SearchStudentServiceLocator extends org.apache.axis.client.Service implements mrumi_hw5.SearchStudentService {

    public SearchStudentServiceLocator() {
    }


    public SearchStudentServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchStudentServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchStudent
    private java.lang.String SearchStudent_address = "http://ec2-35-166-60-65.us-west-2.compute.amazonaws.com/mrumi_hw5/services/SearchStudent";

    public java.lang.String getSearchStudentAddress() {
        return SearchStudent_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String SearchStudentWSDDServiceName = "SearchStudent";

    public java.lang.String getSearchStudentWSDDServiceName() {
        return SearchStudentWSDDServiceName;
    }

    public void setSearchStudentWSDDServiceName(java.lang.String name) {
        SearchStudentWSDDServiceName = name;
    }

    public mrumi_hw5.SearchStudent getSearchStudent() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchStudent_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchStudent(endpoint);
    }

    public mrumi_hw5.SearchStudent getSearchStudent(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            mrumi_hw5.SearchStudentSoapBindingStub _stub = new mrumi_hw5.SearchStudentSoapBindingStub(portAddress, this);
            _stub.setPortName(getSearchStudentWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchStudentEndpointAddress(java.lang.String address) {
        SearchStudent_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (mrumi_hw5.SearchStudent.class.isAssignableFrom(serviceEndpointInterface)) {
                mrumi_hw5.SearchStudentSoapBindingStub _stub = new mrumi_hw5.SearchStudentSoapBindingStub(new java.net.URL(SearchStudent_address), this);
                _stub.setPortName(getSearchStudentWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("SearchStudent".equals(inputPortName)) {
            return getSearchStudent();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://mrumi_hw5", "SearchStudentService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://mrumi_hw5", "SearchStudent"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("SearchStudent".equals(portName)) {
            setSearchStudentEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
