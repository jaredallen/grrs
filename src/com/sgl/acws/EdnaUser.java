/**
 * EdnaUser.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class EdnaUser  extends com.sgl.acws.Person  implements java.io.Serializable {
    private java.lang.Boolean active;

    private java.lang.Integer contFk;

    private java.lang.String fullName;

    private java.util.Calendar lastLoginDate;

    private java.lang.Integer swimUserId;

    private java.lang.Integer userListId;

    private java.lang.String workQRole;

    public EdnaUser() {
    }

    public EdnaUser(
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
           java.lang.Boolean active,
           java.lang.Integer contFk,
           java.lang.String fullName,
           java.util.Calendar lastLoginDate,
           java.lang.Integer swimUserId,
           java.lang.Integer userListId,
           java.lang.String workQRole) {
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
        this.active = active;
        this.contFk = contFk;
        this.fullName = fullName;
        this.lastLoginDate = lastLoginDate;
        this.swimUserId = swimUserId;
        this.userListId = userListId;
        this.workQRole = workQRole;
    }


    /**
     * Gets the active value for this EdnaUser.
     * 
     * @return active
     */
    public java.lang.Boolean getActive() {
        return active;
    }


    /**
     * Sets the active value for this EdnaUser.
     * 
     * @param active
     */
    public void setActive(java.lang.Boolean active) {
        this.active = active;
    }


    /**
     * Gets the contFk value for this EdnaUser.
     * 
     * @return contFk
     */
    public java.lang.Integer getContFk() {
        return contFk;
    }


    /**
     * Sets the contFk value for this EdnaUser.
     * 
     * @param contFk
     */
    public void setContFk(java.lang.Integer contFk) {
        this.contFk = contFk;
    }


    /**
     * Gets the fullName value for this EdnaUser.
     * 
     * @return fullName
     */
    public java.lang.String getFullName() {
        return fullName;
    }


    /**
     * Sets the fullName value for this EdnaUser.
     * 
     * @param fullName
     */
    public void setFullName(java.lang.String fullName) {
        this.fullName = fullName;
    }


    /**
     * Gets the lastLoginDate value for this EdnaUser.
     * 
     * @return lastLoginDate
     */
    public java.util.Calendar getLastLoginDate() {
        return lastLoginDate;
    }


    /**
     * Sets the lastLoginDate value for this EdnaUser.
     * 
     * @param lastLoginDate
     */
    public void setLastLoginDate(java.util.Calendar lastLoginDate) {
        this.lastLoginDate = lastLoginDate;
    }


    /**
     * Gets the swimUserId value for this EdnaUser.
     * 
     * @return swimUserId
     */
    public java.lang.Integer getSwimUserId() {
        return swimUserId;
    }


    /**
     * Sets the swimUserId value for this EdnaUser.
     * 
     * @param swimUserId
     */
    public void setSwimUserId(java.lang.Integer swimUserId) {
        this.swimUserId = swimUserId;
    }


    /**
     * Gets the userListId value for this EdnaUser.
     * 
     * @return userListId
     */
    public java.lang.Integer getUserListId() {
        return userListId;
    }


    /**
     * Sets the userListId value for this EdnaUser.
     * 
     * @param userListId
     */
    public void setUserListId(java.lang.Integer userListId) {
        this.userListId = userListId;
    }


    /**
     * Gets the workQRole value for this EdnaUser.
     * 
     * @return workQRole
     */
    public java.lang.String getWorkQRole() {
        return workQRole;
    }


    /**
     * Sets the workQRole value for this EdnaUser.
     * 
     * @param workQRole
     */
    public void setWorkQRole(java.lang.String workQRole) {
        this.workQRole = workQRole;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof EdnaUser)) return false;
        EdnaUser other = (EdnaUser) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.active==null && other.getActive()==null) || 
             (this.active!=null &&
              this.active.equals(other.getActive()))) &&
            ((this.contFk==null && other.getContFk()==null) || 
             (this.contFk!=null &&
              this.contFk.equals(other.getContFk()))) &&
            ((this.fullName==null && other.getFullName()==null) || 
             (this.fullName!=null &&
              this.fullName.equals(other.getFullName()))) &&
            ((this.lastLoginDate==null && other.getLastLoginDate()==null) || 
             (this.lastLoginDate!=null &&
              this.lastLoginDate.equals(other.getLastLoginDate()))) &&
            ((this.swimUserId==null && other.getSwimUserId()==null) || 
             (this.swimUserId!=null &&
              this.swimUserId.equals(other.getSwimUserId()))) &&
            ((this.userListId==null && other.getUserListId()==null) || 
             (this.userListId!=null &&
              this.userListId.equals(other.getUserListId()))) &&
            ((this.workQRole==null && other.getWorkQRole()==null) || 
             (this.workQRole!=null &&
              this.workQRole.equals(other.getWorkQRole())));
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
        if (getActive() != null) {
            _hashCode += getActive().hashCode();
        }
        if (getContFk() != null) {
            _hashCode += getContFk().hashCode();
        }
        if (getFullName() != null) {
            _hashCode += getFullName().hashCode();
        }
        if (getLastLoginDate() != null) {
            _hashCode += getLastLoginDate().hashCode();
        }
        if (getSwimUserId() != null) {
            _hashCode += getSwimUserId().hashCode();
        }
        if (getUserListId() != null) {
            _hashCode += getUserListId().hashCode();
        }
        if (getWorkQRole() != null) {
            _hashCode += getWorkQRole().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(EdnaUser.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "ednaUser"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("active");
        elemField.setXmlName(new javax.xml.namespace.QName("", "active"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contFk");
        elemField.setXmlName(new javax.xml.namespace.QName("", "contFk"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fullName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastLoginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lastLoginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swimUserId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swimUserId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userListId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "userListId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("workQRole");
        elemField.setXmlName(new javax.xml.namespace.QName("", "workQRole"));
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
