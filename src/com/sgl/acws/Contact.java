/**
 * Contact.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class Contact  extends com.sgl.acws.EdnaUser  implements java.io.Serializable {
    private java.lang.String acctCustName;

    private java.lang.String displayName;

    private java.lang.Integer exposureId;

    private java.lang.String kitAccessCodes;

    private java.util.Calendar originationDate;

    private java.lang.String promoCode;

    private java.lang.Integer relationshipId;

    private java.lang.String showName;

    private java.lang.Integer swimContactId;

    private java.lang.String uiSkin;

    public Contact() {
    }

    public Contact(
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
           java.lang.String workQRole,
           java.lang.String acctCustName,
           java.lang.String displayName,
           java.lang.Integer exposureId,
           java.lang.String kitAccessCodes,
           java.util.Calendar originationDate,
           java.lang.String promoCode,
           java.lang.Integer relationshipId,
           java.lang.String showName,
           java.lang.Integer swimContactId,
           java.lang.String uiSkin) {
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
            title,
            active,
            contFk,
            fullName,
            lastLoginDate,
            swimUserId,
            userListId,
            workQRole);
        this.acctCustName = acctCustName;
        this.displayName = displayName;
        this.exposureId = exposureId;
        this.kitAccessCodes = kitAccessCodes;
        this.originationDate = originationDate;
        this.promoCode = promoCode;
        this.relationshipId = relationshipId;
        this.showName = showName;
        this.swimContactId = swimContactId;
        this.uiSkin = uiSkin;
    }


    /**
     * Gets the acctCustName value for this Contact.
     * 
     * @return acctCustName
     */
    public java.lang.String getAcctCustName() {
        return acctCustName;
    }


    /**
     * Sets the acctCustName value for this Contact.
     * 
     * @param acctCustName
     */
    public void setAcctCustName(java.lang.String acctCustName) {
        this.acctCustName = acctCustName;
    }


    /**
     * Gets the displayName value for this Contact.
     * 
     * @return displayName
     */
    public java.lang.String getDisplayName() {
        return displayName;
    }


    /**
     * Sets the displayName value for this Contact.
     * 
     * @param displayName
     */
    public void setDisplayName(java.lang.String displayName) {
        this.displayName = displayName;
    }


    /**
     * Gets the exposureId value for this Contact.
     * 
     * @return exposureId
     */
    public java.lang.Integer getExposureId() {
        return exposureId;
    }


    /**
     * Sets the exposureId value for this Contact.
     * 
     * @param exposureId
     */
    public void setExposureId(java.lang.Integer exposureId) {
        this.exposureId = exposureId;
    }


    /**
     * Gets the kitAccessCodes value for this Contact.
     * 
     * @return kitAccessCodes
     */
    public java.lang.String getKitAccessCodes() {
        return kitAccessCodes;
    }


    /**
     * Sets the kitAccessCodes value for this Contact.
     * 
     * @param kitAccessCodes
     */
    public void setKitAccessCodes(java.lang.String kitAccessCodes) {
        this.kitAccessCodes = kitAccessCodes;
    }


    /**
     * Gets the originationDate value for this Contact.
     * 
     * @return originationDate
     */
    public java.util.Calendar getOriginationDate() {
        return originationDate;
    }


    /**
     * Sets the originationDate value for this Contact.
     * 
     * @param originationDate
     */
    public void setOriginationDate(java.util.Calendar originationDate) {
        this.originationDate = originationDate;
    }


    /**
     * Gets the promoCode value for this Contact.
     * 
     * @return promoCode
     */
    public java.lang.String getPromoCode() {
        return promoCode;
    }


    /**
     * Sets the promoCode value for this Contact.
     * 
     * @param promoCode
     */
    public void setPromoCode(java.lang.String promoCode) {
        this.promoCode = promoCode;
    }


    /**
     * Gets the relationshipId value for this Contact.
     * 
     * @return relationshipId
     */
    public java.lang.Integer getRelationshipId() {
        return relationshipId;
    }


    /**
     * Sets the relationshipId value for this Contact.
     * 
     * @param relationshipId
     */
    public void setRelationshipId(java.lang.Integer relationshipId) {
        this.relationshipId = relationshipId;
    }


    /**
     * Gets the showName value for this Contact.
     * 
     * @return showName
     */
    public java.lang.String getShowName() {
        return showName;
    }


    /**
     * Sets the showName value for this Contact.
     * 
     * @param showName
     */
    public void setShowName(java.lang.String showName) {
        this.showName = showName;
    }


    /**
     * Gets the swimContactId value for this Contact.
     * 
     * @return swimContactId
     */
    public java.lang.Integer getSwimContactId() {
        return swimContactId;
    }


    /**
     * Sets the swimContactId value for this Contact.
     * 
     * @param swimContactId
     */
    public void setSwimContactId(java.lang.Integer swimContactId) {
        this.swimContactId = swimContactId;
    }


    /**
     * Gets the uiSkin value for this Contact.
     * 
     * @return uiSkin
     */
    public java.lang.String getUiSkin() {
        return uiSkin;
    }


    /**
     * Sets the uiSkin value for this Contact.
     * 
     * @param uiSkin
     */
    public void setUiSkin(java.lang.String uiSkin) {
        this.uiSkin = uiSkin;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Contact)) return false;
        Contact other = (Contact) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.acctCustName==null && other.getAcctCustName()==null) || 
             (this.acctCustName!=null &&
              this.acctCustName.equals(other.getAcctCustName()))) &&
            ((this.displayName==null && other.getDisplayName()==null) || 
             (this.displayName!=null &&
              this.displayName.equals(other.getDisplayName()))) &&
            ((this.exposureId==null && other.getExposureId()==null) || 
             (this.exposureId!=null &&
              this.exposureId.equals(other.getExposureId()))) &&
            ((this.kitAccessCodes==null && other.getKitAccessCodes()==null) || 
             (this.kitAccessCodes!=null &&
              this.kitAccessCodes.equals(other.getKitAccessCodes()))) &&
            ((this.originationDate==null && other.getOriginationDate()==null) || 
             (this.originationDate!=null &&
              this.originationDate.equals(other.getOriginationDate()))) &&
            ((this.promoCode==null && other.getPromoCode()==null) || 
             (this.promoCode!=null &&
              this.promoCode.equals(other.getPromoCode()))) &&
            ((this.relationshipId==null && other.getRelationshipId()==null) || 
             (this.relationshipId!=null &&
              this.relationshipId.equals(other.getRelationshipId()))) &&
            ((this.showName==null && other.getShowName()==null) || 
             (this.showName!=null &&
              this.showName.equals(other.getShowName()))) &&
            ((this.swimContactId==null && other.getSwimContactId()==null) || 
             (this.swimContactId!=null &&
              this.swimContactId.equals(other.getSwimContactId()))) &&
            ((this.uiSkin==null && other.getUiSkin()==null) || 
             (this.uiSkin!=null &&
              this.uiSkin.equals(other.getUiSkin())));
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
        if (getAcctCustName() != null) {
            _hashCode += getAcctCustName().hashCode();
        }
        if (getDisplayName() != null) {
            _hashCode += getDisplayName().hashCode();
        }
        if (getExposureId() != null) {
            _hashCode += getExposureId().hashCode();
        }
        if (getKitAccessCodes() != null) {
            _hashCode += getKitAccessCodes().hashCode();
        }
        if (getOriginationDate() != null) {
            _hashCode += getOriginationDate().hashCode();
        }
        if (getPromoCode() != null) {
            _hashCode += getPromoCode().hashCode();
        }
        if (getRelationshipId() != null) {
            _hashCode += getRelationshipId().hashCode();
        }
        if (getShowName() != null) {
            _hashCode += getShowName().hashCode();
        }
        if (getSwimContactId() != null) {
            _hashCode += getSwimContactId().hashCode();
        }
        if (getUiSkin() != null) {
            _hashCode += getUiSkin().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Contact.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "contact"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctCustName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctCustName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "displayName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exposureId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "exposureId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kitAccessCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kitAccessCodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "originationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "promoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("relationshipId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "relationshipId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "showName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("swimContactId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "swimContactId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uiSkin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "uiSkin"));
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
