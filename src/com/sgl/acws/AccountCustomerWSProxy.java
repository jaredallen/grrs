package com.sgl.acws;

public class AccountCustomerWSProxy implements com.sgl.acws.AccountCustomerWS {
  private String _endpoint = null;
  private com.sgl.acws.AccountCustomerWS accountCustomerWS = null;
  
  public AccountCustomerWSProxy() {
    _initAccountCustomerWSProxy();
  }
  
  public AccountCustomerWSProxy(String endpoint) {
    _endpoint = endpoint;
    _initAccountCustomerWSProxy();
  }
  
  private void _initAccountCustomerWSProxy() {
    try {
      accountCustomerWS = (new com.sgl.acws.AccountCustomerWSServiceLocator()).getAccountCustomerWSPort();
      if (accountCustomerWS != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)accountCustomerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)accountCustomerWS)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (accountCustomerWS != null)
      ((javax.xml.rpc.Stub)accountCustomerWS)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.sgl.acws.AccountCustomerWS getAccountCustomerWS() {
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS;
  }
  
  public java.lang.String upgrade(java.lang.String origBarcode, java.lang.String[] partNos, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.upgrade(origBarcode, partNos, custNo);
  }
  
  public java.lang.String createOrder(java.lang.Object kit) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.createOrder(kit);
  }
  
  public java.lang.String createSMGFOrder(java.lang.String cNum, java.lang.String gtNum, java.lang.String[] partNums, java.lang.String gender, java.lang.String custNum) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.createSMGFOrder(cNum, gtNum, partNums, gender, custNum);
  }
  
  public java.lang.String getCurrentKitStatus(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.getCurrentKitStatus(numstr, custNo);
  }
  
  public java.lang.String cancelKit(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.cancelKit(numstr, custNo);
  }
  
  public java.lang.String getMtdnaResults(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.getMtdnaResults(numstr, custNo);
  }
  
  public java.lang.String getYResults(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.getYResults(numstr, custNo);
  }
  
  public java.lang.String getSNPResults(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.getSNPResults(numstr, custNo);
  }
  
  public java.lang.String getParticipantInfo(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.getParticipantInfo(numstr, custNo);
  }
  
  public java.lang.String getSNPResultsByDateRange(java.lang.String startDate, java.lang.String endDate, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.getSNPResultsByDateRange(startDate, endDate, custNo);
  }
  
  public byte[][] getPDFReports(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException, com.sgl.acws.IOException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.getPDFReports(numstr, custNo);
  }
  
  public java.lang.String recollect(java.lang.String newBarcode, java.lang.String origBarcode, java.lang.String fname, java.lang.String lname, java.lang.String custNo) throws java.rmi.RemoteException{
    if (accountCustomerWS == null)
      _initAccountCustomerWSProxy();
    return accountCustomerWS.recollect(newBarcode, origBarcode, fname, lname, custNo);
  }
  
  
}