/**
 * ManagerSOAPImpl.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.manager;

public class ManagerSOAPImpl implements org.example.www.manager.Manager_PortType{
    public double add(double x, double y) throws java.rmi.RemoteException {
        return x+y;
    }

    public double mul(double x, double y) throws java.rmi.RemoteException {
        return x*y;
    }

    public double sub(double x, double y) throws java.rmi.RemoteException {
        return x-y;
    }

    public double div(double x, double y) throws java.rmi.RemoteException {
        return x/y;
    }

}
