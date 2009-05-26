/**
 * Upgrade.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class Upgrade  implements java.io.Serializable {
    private java.lang.String origBarcode;

    private java.lang.String[] partNos;

    private java.lang.String custNo;

    public Upgrade() {
    }

    public Upgrade(
           java.lang.String origBarcode,
           java.lang.String[] partNos,
           java.lang.String custNo) {
           this.origBarcode = origBarcode;
           this.partNos = partNos;
           this.custNo = custNo;
    }


    /**
     * Gets the origBarcode value for this Upgrade.
     * 
     * @return origBarcode
     */
    public java.lang.String getOrigBarcode() {
        return origBarcode;
    }


    /**
     * Sets the origBarcode value for this Upgrade.
     * 
     * @param origBarcode
     */
    public void setOrigBarcode(java.lang.String origBarcode) {
        this.origBarcode = origBarcode;
    }


    /**
     * Gets the partNos value for this Upgrade.
     * 
     * @return partNos
     */
    public java.lang.String[] getPartNos() {
        return partNos;
    }


    /**
     * Sets the partNos value for this Upgrade.
     * 
     * @param partNos
     */
    public void setPartNos(java.lang.String[] partNos) {
        this.partNos = partNos;
    }

    public java.lang.String getPartNos(int i) {
        return this.partNos[i];
    }

    public void setPartNos(int i, java.lang.String _value) {
        this.partNos[i] = _value;
    }


    /**
     * Gets the custNo value for this Upgrade.
     * 
     * @return custNo
     */
    public java.lang.String getCustNo() {
        return custNo;
    }


    /**
     * Sets the custNo value for this Upgrade.
     * 
     * @param custNo
     */
    public void setCustNo(java.lang.String custNo) {
        this.custNo = custNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Upgrade)) return false;
        Upgrade other = (Upgrade) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.origBarcode==null && other.getOrigBarcode()==null) || 
             (this.origBarcode!=null &&
              this.origBarcode.equals(other.getOrigBarcode()))) &&
            ((this.partNos==null && other.getPartNos()==null) || 
             (this.partNos!=null &&
              java.util.Arrays.equals(this.partNos, other.getPartNos()))) &&
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
        if (getOrigBarcode() != null) {
            _hashCode += getOrigBarcode().hashCode();
        }
        if (getPartNos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartNos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartNos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustNo() != null) {
            _hashCode += getCustNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Upgrade.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "upgrade"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origBarcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origBarcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNos");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partNos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
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
