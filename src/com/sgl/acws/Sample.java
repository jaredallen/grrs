/**
 * Sample.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class Sample  extends com.sgl.acws.Person  implements java.io.Serializable {
    private java.lang.String caseRole;

    private java.lang.String marks;

    private java.lang.Integer methodId;

    private java.util.Calendar sampleDate;

    public Sample() {
    }

    public Sample(
           com.sgl.acws.Address address,
           java.lang.String birthDate,
           java.lang.Integer caseId,
           java.lang.String emailAddress,
           java.lang.Integer ethnicity,
           java.lang.String firstName,
           java.lang.Integer id,
           java.lang.String lastName,
           java.util.Calendar lastUpdateDate,
           java.lang.Integer lastUpdateUserId,
           java.lang.String login,
           java.lang.String middleName,
           java.lang.String notes,
           java.lang.Integer options,
           java.lang.String password,
           java.lang.String passwordHint,
           java.lang.Integer permissions,
           java.lang.String secretAnswer,
           java.lang.String sex,
           java.lang.String suffix,
           java.lang.String title,
           java.lang.String caseRole,
           java.lang.String marks,
           java.lang.Integer methodId,
           java.util.Calendar sampleDate) {
        super(
            address,
            birthDate,
            caseId,
            emailAddress,
            ethnicity,
            firstName,
            id,
            lastName,
            lastUpdateDate,
            lastUpdateUserId,
            login,
            middleName,
            notes,
            options,
            password,
            passwordHint,
            permissions,
            secretAnswer,
            sex,
            suffix,
            title);
        this.caseRole = caseRole;
        this.marks = marks;
        this.methodId = methodId;
        this.sampleDate = sampleDate;
    }


    /**
     * Gets the caseRole value for this Sample.
     * 
     * @return caseRole
     */
    public java.lang.String getCaseRole() {
        return caseRole;
    }


    /**
     * Sets the caseRole value for this Sample.
     * 
     * @param caseRole
     */
    public void setCaseRole(java.lang.String caseRole) {
        this.caseRole = caseRole;
    }


    /**
     * Gets the marks value for this Sample.
     * 
     * @return marks
     */
    public java.lang.String getMarks() {
        return marks;
    }


    /**
     * Sets the marks value for this Sample.
     * 
     * @param marks
     */
    public void setMarks(java.lang.String marks) {
        this.marks = marks;
    }


    /**
     * Gets the methodId value for this Sample.
     * 
     * @return methodId
     */
    public java.lang.Integer getMethodId() {
        return methodId;
    }


    /**
     * Sets the methodId value for this Sample.
     * 
     * @param methodId
     */
    public void setMethodId(java.lang.Integer methodId) {
        this.methodId = methodId;
    }


    /**
     * Gets the sampleDate value for this Sample.
     * 
     * @return sampleDate
     */
    public java.util.Calendar getSampleDate() {
        return sampleDate;
    }


    /**
     * Sets the sampleDate value for this Sample.
     * 
     * @param sampleDate
     */
    public void setSampleDate(java.util.Calendar sampleDate) {
        this.sampleDate = sampleDate;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Sample)) return false;
        Sample other = (Sample) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.caseRole==null && other.getCaseRole()==null) || 
             (this.caseRole!=null &&
              this.caseRole.equals(other.getCaseRole()))) &&
            ((this.marks==null && other.getMarks()==null) || 
             (this.marks!=null &&
              this.marks.equals(other.getMarks()))) &&
            ((this.methodId==null && other.getMethodId()==null) || 
             (this.methodId!=null &&
              this.methodId.equals(other.getMethodId()))) &&
            ((this.sampleDate==null && other.getSampleDate()==null) || 
             (this.sampleDate!=null &&
              this.sampleDate.equals(other.getSampleDate())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getCaseRole() != null) {
            _hashCode += getCaseRole().hashCode();
        }
        if (getMarks() != null) {
            _hashCode += getMarks().hashCode();
        }
        if (getMethodId() != null) {
            _hashCode += getMethodId().hashCode();
        }
        if (getSampleDate() != null) {
            _hashCode += getSampleDate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Sample.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "sample"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseRole"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marks");
        elemField.setXmlName(new javax.xml.namespace.QName("", "marks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("methodId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "methodId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sampleDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sampleDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
