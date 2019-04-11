package org.example.www.manager;

public class ManagerProxy implements org.example.www.manager.Manager_PortType {
  private String _endpoint = null;
  private org.example.www.manager.Manager_PortType manager_PortType = null;
  
  public ManagerProxy() {
    _initManagerProxy();
  }
  
  public ManagerProxy(String endpoint) {
    _endpoint = endpoint;
    _initManagerProxy();
  }
  
  private void _initManagerProxy() {
    try {
      manager_PortType = (new org.example.www.manager.Manager_ServiceLocator()).getmanagerSOAP();
      if (manager_PortType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)manager_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)manager_PortType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (manager_PortType != null)
      ((javax.xml.rpc.Stub)manager_PortType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public org.example.www.manager.Manager_PortType getManager_PortType() {
    if (manager_PortType == null)
      _initManagerProxy();
    return manager_PortType;
  }
  
  public double add(double x, double y) throws java.rmi.RemoteException{
    if (manager_PortType == null)
      _initManagerProxy();
    return manager_PortType.add(x, y);
  }
  
  public double mul(double x, double y) throws java.rmi.RemoteException{
    if (manager_PortType == null)
      _initManagerProxy();
    return manager_PortType.mul(x, y);
  }
  
  public double sub(double x, double y) throws java.rmi.RemoteException{
    if (manager_PortType == null)
      _initManagerProxy();
    return manager_PortType.sub(x, y);
  }
  
  public double div(double x, double y) throws java.rmi.RemoteException{
    if (manager_PortType == null)
      _initManagerProxy();
    return manager_PortType.div(x, y);
  }
  
  
}