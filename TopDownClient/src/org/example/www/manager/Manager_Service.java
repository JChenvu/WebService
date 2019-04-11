/**
 * Manager_Service.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.manager;

public interface Manager_Service extends javax.xml.rpc.Service {
    public java.lang.String getmanagerSOAPAddress();

    public org.example.www.manager.Manager_PortType getmanagerSOAP() throws javax.xml.rpc.ServiceException;

    public org.example.www.manager.Manager_PortType getmanagerSOAP(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
