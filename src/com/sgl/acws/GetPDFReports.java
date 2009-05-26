/**
 * GetPDFReports.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class GetPDFReports  implements java.io.Serializable {
    private java.lang.String numstr;

    private java.lang.String custNo;

    public GetPDFReports() {
    }

    public GetPDFReports(
           java.lang.String numstr,
           java.lang.String custNo) {
           this.numstr = numstr;
           this.custNo = custNo;
    }


    /**
     * Gets the numstr value for this GetPDFReports.
     * 
     * @return numstr
     */
    public java.lang.String getNumstr() {
        return numstr;
    }


    /**
     * Sets the numstr value for this GetPDFReports.
     * 
     * @param numstr
     */
    public void setNumstr(java.lang.String numstr) {
        this.numstr = numstr;
    }


    /**
     * Gets the custNo value for this GetPDFReports.
     * 
     * @return custNo
     */
    public java.lang.String getCustNo() {
        return custNo;
    }


    /**
     * Sets the custNo value for this GetPDFReports.
     * 
     * @param custNo
     */
    public void setCustNo(java.lang.String custNo) {
        this.custNo = custNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetPDFReports)) return false;
        GetPDFReports other = (GetPDFReports) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.numstr==null && other.getNumstr()==null) || 
             (this.numstr!=null &&
              this.numstr.equals(other.getNumstr()))) &&
            ((this.custNo==null && other.getCustNo()==null) || 
             (this.custNo!=null &&
              this.custNo.equals(other.getCustNo())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getNumstr() != null) {
            _hashCode += getNumstr().hashCode();
        }
        if (getCustNo() != null) {
            _hashCode += getCustNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetPDFReports.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "getPDFReports"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numstr");
        elemField.setXmlName(new javax.xml.namespace.QName("", "numstr"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
