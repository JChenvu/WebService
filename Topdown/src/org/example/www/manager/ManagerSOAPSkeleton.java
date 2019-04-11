/**
 * ManagerSOAPSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.manager;

public class ManagerSOAPSkeleton implements org.example.www.manager.Manager_PortType, org.apache.axis.wsdl.Skeleton {
    private org.example.www.manager.Manager_PortType impl;
    private static java.util.Map _myOperations = new java.util.Hashtable();
    private static java.util.Collection _myOperationsList = new java.util.ArrayList();

    /**
    * Returns List of OperationDesc objects with this name
    */
    public static java.util.List getOperationDescByName(java.lang.String methodName) {
        return (java.util.List)_myOperations.get(methodName);
    }

    /**
    * Returns Collection of OperationDescs
    */
    public static java.util.Collection getOperationDescs() {
        return _myOperationsList;
    }

    static {
        org.apache.axis.description.OperationDesc _oper;
        org.apache.axis.description.FaultDesc _fault;
        org.apache.axis.description.ParameterDesc [] _params;
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("add", _params, new javax.xml.namespace.QName("", "addReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/manager/", "add"));
        _oper.setSoapAction("http://www.example.org/manager/add");
        _myOperationsList.add(_oper);
        if (_myOperations.get("add") == null) {
            _myOperations.put("add", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("add")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("mul", _params, new javax.xml.namespace.QName("", "mulReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/manager/", "mul"));
        _oper.setSoapAction("http://www.example.org/manager/mul");
        _myOperationsList.add(_oper);
        if (_myOperations.get("mul") == null) {
            _myOperations.put("mul", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("mul")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("sub", _params, new javax.xml.namespace.QName("", "subReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/manager/", "sub"));
        _oper.setSoapAction("http://www.example.org/manager/sub");
        _myOperationsList.add(_oper);
        if (_myOperations.get("sub") == null) {
            _myOperations.put("sub", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("sub")).add(_oper);
        _params = new org.apache.axis.description.ParameterDesc [] {
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
            new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false), 
        };
        _oper = new org.apache.axis.description.OperationDesc("div", _params, new javax.xml.namespace.QName("", "divReturn"));
        _oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        _oper.setElementQName(new javax.xml.namespace.QName("http://www.example.org/manager/", "div"));
        _oper.setSoapAction("http://www.example.org/manager/div");
        _myOperationsList.add(_oper);
        if (_myOperations.get("div") == null) {
            _myOperations.put("div", new java.util.ArrayList());
        }
        ((java.util.List)_myOperations.get("div")).add(_oper);
    }

    public ManagerSOAPSkeleton() {
        this.impl = new org.example.www.manager.ManagerSOAPImpl();
    }

    public ManagerSOAPSkeleton(org.example.www.manager.Manager_PortType impl) {
        this.impl = impl;
    }
    public double add(double x, double y) throws java.rmi.RemoteException
    {
        double ret = impl.add(x, y);
        return ret;
    }

    public double mul(double x, double y) throws java.rmi.RemoteException
    {
        double ret = impl.mul(x, y);
        return ret;
    }

    public double sub(double x, double y) throws java.rmi.RemoteException
    {
        double ret = impl.sub(x, y);
        return ret;
    }

    public double div(double x, double y) throws java.rmi.RemoteException
    {
        double ret = impl.div(x, y);
        return ret;
    }

}
