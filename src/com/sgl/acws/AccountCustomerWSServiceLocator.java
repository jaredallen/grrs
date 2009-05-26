/**
 * AccountCustomerWSServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class AccountCustomerWSServiceLocator extends org.apache.axis.client.Service implements com.sgl.acws.AccountCustomerWSService {

    public AccountCustomerWSServiceLocator() {
    }


    public AccountCustomerWSServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public AccountCustomerWSServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for AccountCustomerWSPort
    private java.lang.String AccountCustomerWSPort_address = "https://sorensongenomics.com:443/account_customer_ws/AccountCustomerWS";

    public java.lang.String getAccountCustomerWSPortAddress() {
        return AccountCustomerWSPort_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String AccountCustomerWSPortWSDDServiceName = "AccountCustomerWSPort";

    public java.lang.String getAccountCustomerWSPortWSDDServiceName() {
        return AccountCustomerWSPortWSDDServiceName;
    }

    public void setAccountCustomerWSPortWSDDServiceName(java.lang.String name) {
        AccountCustomerWSPortWSDDServiceName = name;
    }

    public com.sgl.acws.AccountCustomerWS getAccountCustomerWSPort() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(AccountCustomerWSPort_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getAccountCustomerWSPort(endpoint);
    }

    public com.sgl.acws.AccountCustomerWS getAccountCustomerWSPort(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.sgl.acws.AccountCustomerWSPortBindingStub _stub = new com.sgl.acws.AccountCustomerWSPortBindingStub(portAddress, this);
            _stub.setPortName(getAccountCustomerWSPortWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setAccountCustomerWSPortEndpointAddress(java.lang.String address) {
        AccountCustomerWSPort_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.sgl.acws.AccountCustomerWS.class.isAssignableFrom(serviceEndpointInterface)) {
                com.sgl.acws.AccountCustomerWSPortBindingStub _stub = new com.sgl.acws.AccountCustomerWSPortBindingStub(new java.net.URL(AccountCustomerWSPort_address), this);
                _stub.setPortName(getAccountCustomerWSPortWSDDServiceName());
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
        if ("AccountCustomerWSPort".equals(inputPortName)) {
            return getAccountCustomerWSPort();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "AccountCustomerWSService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "AccountCustomerWSPort"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("AccountCustomerWSPort".equals(portName)) {
            setAccountCustomerWSPortEndpointAddress(address);
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
