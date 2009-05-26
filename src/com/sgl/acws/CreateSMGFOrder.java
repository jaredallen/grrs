/**
 * CreateSMGFOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class CreateSMGFOrder  implements java.io.Serializable {
    private java.lang.String cNum;

    private java.lang.String gtNum;

    private java.lang.String[] partNums;

    private java.lang.String gender;

    private java.lang.String custNum;

    public CreateSMGFOrder() {
    }

    public CreateSMGFOrder(
           java.lang.String cNum,
           java.lang.String gtNum,
           java.lang.String[] partNums,
           java.lang.String gender,
           java.lang.String custNum) {
           this.cNum = cNum;
           this.gtNum = gtNum;
           this.partNums = partNums;
           this.gender = gender;
           this.custNum = custNum;
    }


    /**
     * Gets the cNum value for this CreateSMGFOrder.
     * 
     * @return cNum
     */
    public java.lang.String getCNum() {
        return cNum;
    }


    /**
     * Sets the cNum value for this CreateSMGFOrder.
     * 
     * @param cNum
     */
    public void setCNum(java.lang.String cNum) {
        this.cNum = cNum;
    }


    /**
     * Gets the gtNum value for this CreateSMGFOrder.
     * 
     * @return gtNum
     */
    public java.lang.String getGtNum() {
        return gtNum;
    }


    /**
     * Sets the gtNum value for this CreateSMGFOrder.
     * 
     * @param gtNum
     */
    public void setGtNum(java.lang.String gtNum) {
        this.gtNum = gtNum;
    }


    /**
     * Gets the partNums value for this CreateSMGFOrder.
     * 
     * @return partNums
     */
    public java.lang.String[] getPartNums() {
        return partNums;
    }


    /**
     * Sets the partNums value for this CreateSMGFOrder.
     * 
     * @param partNums
     */
    public void setPartNums(java.lang.String[] partNums) {
        this.partNums = partNums;
    }

    public java.lang.String getPartNums(int i) {
        return this.partNums[i];
    }

    public void setPartNums(int i, java.lang.String _value) {
        this.partNums[i] = _value;
    }


    /**
     * Gets the gender value for this CreateSMGFOrder.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this CreateSMGFOrder.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the custNum value for this CreateSMGFOrder.
     * 
     * @return custNum
     */
    public java.lang.String getCustNum() {
        return custNum;
    }


    /**
     * Sets the custNum value for this CreateSMGFOrder.
     * 
     * @param custNum
     */
    public void setCustNum(java.lang.String custNum) {
        this.custNum = custNum;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreateSMGFOrder)) return false;
        CreateSMGFOrder other = (CreateSMGFOrder) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cNum==null && other.getCNum()==null) || 
             (this.cNum!=null &&
              this.cNum.equals(other.getCNum()))) &&
            ((this.gtNum==null && other.getGtNum()==null) || 
             (this.gtNum!=null &&
              this.gtNum.equals(other.getGtNum()))) &&
            ((this.partNums==null && other.getPartNums()==null) || 
             (this.partNums!=null &&
              java.util.Arrays.equals(this.partNums, other.getPartNums()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.custNum==null && other.getCustNum()==null) || 
             (this.custNum!=null &&
              this.custNum.equals(other.getCustNum())));
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
        if (getCNum() != null) {
            _hashCode += getCNum().hashCode();
        }
        if (getGtNum() != null) {
            _hashCode += getGtNum().hashCode();
        }
        if (getPartNums() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPartNums());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPartNums(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getCustNum() != null) {
            _hashCode += getCustNum().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreateSMGFOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "createSMGFOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gtNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gtNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNums");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partNums"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("", "gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("custNum");
        elemField.setXmlName(new javax.xml.namespace.QName("", "custNum"));
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
