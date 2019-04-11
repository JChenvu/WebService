/**
 * Manager_ServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.manager;

public class Manager_ServiceLocator extends org.apache.axis.client.Service implements org.example.www.manager.Manager_Service {

    public Manager_ServiceLocator() {
    }


    public Manager_ServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public Manager_ServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for managerSOAP
    private java.lang.String managerSOAP_address = "http://localhost:8080/TopdownSoap/services/managerSOAP";

    public java.lang.String getmanagerSOAPAddress() {
        return managerSOAP_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String managerSOAPWSDDServiceName = "managerSOAP";

    public java.lang.String getmanagerSOAPWSDDServiceName() {
        return managerSOAPWSDDServiceName;
    }

    public void setmanagerSOAPWSDDServiceName(java.lang.String name) {
        managerSOAPWSDDServiceName = name;
    }

    public org.example.www.manager.Manager_PortType getmanagerSOAP() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(managerSOAP_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getmanagerSOAP(endpoint);
    }

    public org.example.www.manager.Manager_PortType getmanagerSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            org.example.www.manager.ManagerSOAPStub _stub = new org.example.www.manager.ManagerSOAPStub(portAddress, this);
            _stub.setPortName(getmanagerSOAPWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setmanagerSOAPEndpointAddress(java.lang.String address) {
        managerSOAP_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (org.example.www.manager.Manager_PortType.class.isAssignableFrom(serviceEndpointInterface)) {
                org.example.www.manager.ManagerSOAPStub _stub = new org.example.www.manager.ManagerSOAPStub(new java.net.URL(managerSOAP_address), this);
                _stub.setPortName(getmanagerSOAPWSDDServiceName());
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
        if ("managerSOAP".equals(inputPortName)) {
            return getmanagerSOAP();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://www.example.org/manager/", "manager");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://www.example.org/manager/", "managerSOAP"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("managerSOAP".equals(portName)) {
            setmanagerSOAPEndpointAddress(address);
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
