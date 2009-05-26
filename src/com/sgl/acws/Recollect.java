/**
 * Recollect.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class Recollect  implements java.io.Serializable {
    private java.lang.String newBarcode;

    private java.lang.String origBarcode;

    private java.lang.String fname;

    private java.lang.String lname;

    private java.lang.String custNo;

    public Recollect() {
    }

    public Recollect(
           java.lang.String newBarcode,
           java.lang.String origBarcode,
           java.lang.String fname,
           java.lang.String lname,
           java.lang.String custNo) {
           this.newBarcode = newBarcode;
           this.origBarcode = origBarcode;
           this.fname = fname;
           this.lname = lname;
           this.custNo = custNo;
    }


    /**
     * Gets the newBarcode value for this Recollect.
     * 
     * @return newBarcode
     */
    public java.lang.String getNewBarcode() {
        return newBarcode;
    }


    /**
     * Sets the newBarcode value for this Recollect.
     * 
     * @param newBarcode
     */
    public void setNewBarcode(java.lang.String newBarcode) {
        this.newBarcode = newBarcode;
    }


    /**
     * Gets the origBarcode value for this Recollect.
     * 
     * @return origBarcode
     */
    public java.lang.String getOrigBarcode() {
        return origBarcode;
    }


    /**
     * Sets the origBarcode value for this Recollect.
     * 
     * @param origBarcode
     */
    public void setOrigBarcode(java.lang.String origBarcode) {
        this.origBarcode = origBarcode;
    }


    /**
     * Gets the fname value for this Recollect.
     * 
     * @return fname
     */
    public java.lang.String getFname() {
        return fname;
    }


    /**
     * Sets the fname value for this Recollect.
     * 
     * @param fname
     */
    public void setFname(java.lang.String fname) {
        this.fname = fname;
    }


    /**
     * Gets the lname value for this Recollect.
     * 
     * @return lname
     */
    public java.lang.String getLname() {
        return lname;
    }


    /**
     * Sets the lname value for this Recollect.
     * 
     * @param lname
     */
    public void setLname(java.lang.String lname) {
        this.lname = lname;
    }


    /**
     * Gets the custNo value for this Recollect.
     * 
     * @return custNo
     */
    public java.lang.String getCustNo() {
        return custNo;
    }


    /**
     * Sets the custNo value for this Recollect.
     * 
     * @param custNo
     */
    public void setCustNo(java.lang.String custNo) {
        this.custNo = custNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Recollect)) return false;
        Recollect other = (Recollect) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.newBarcode==null && other.getNewBarcode()==null) || 
             (this.newBarcode!=null &&
              this.newBarcode.equals(other.getNewBarcode()))) &&
            ((this.origBarcode==null && other.getOrigBarcode()==null) || 
             (this.origBarcode!=null &&
              this.origBarcode.equals(other.getOrigBarcode()))) &&
            ((this.fname==null && other.getFname()==null) || 
             (this.fname!=null &&
              this.fname.equals(other.getFname()))) &&
            ((this.lname==null && other.getLname()==null) || 
             (this.lname!=null &&
              this.lname.equals(other.getLname()))) &&
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
        if (getNewBarcode() != null) {
            _hashCode += getNewBarcode().hashCode();
        }
        if (getOrigBarcode() != null) {
            _hashCode += getOrigBarcode().hashCode();
        }
        if (getFname() != null) {
            _hashCode += getFname().hashCode();
        }
        if (getLname() != null) {
            _hashCode += getLname().hashCode();
        }
        if (getCustNo() != null) {
            _hashCode += getCustNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Recollect.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "recollect"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBarcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "newBarcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("origBarcode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "origBarcode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lname");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lname"));
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
