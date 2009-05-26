/**
 * AccountCustomerWS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public interface AccountCustomerWS extends java.rmi.Remote {
    public java.lang.String upgrade(java.lang.String origBarcode, java.lang.String[] partNos, java.lang.String custNo) throws java.rmi.RemoteException;
    public java.lang.String createOrder(java.lang.Object kit) throws java.rmi.RemoteException;
    public java.lang.String createSMGFOrder(java.lang.String cNum, java.lang.String gtNum, java.lang.String[] partNums, java.lang.String gender, java.lang.String custNum) throws java.rmi.RemoteException;
    public java.lang.String getCurrentKitStatus(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException;
    public java.lang.String cancelKit(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException;
    public java.lang.String getMtdnaResults(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException;
    public java.lang.String getYResults(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException;
    public java.lang.String getSNPResults(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException;
    public java.lang.String getParticipantInfo(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException;
    public java.lang.String getSNPResultsByDateRange(java.lang.String startDate, java.lang.String endDate, java.lang.String custNo) throws java.rmi.RemoteException;
    public byte[][] getPDFReports(java.lang.String numstr, java.lang.String custNo) throws java.rmi.RemoteException, com.sgl.acws.IOException;
    public java.lang.String recollect(java.lang.String newBarcode, java.lang.String origBarcode, java.lang.String fname, java.lang.String lname, java.lang.String custNo) throws java.rmi.RemoteException;
}
