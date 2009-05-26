/**
 * CostItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class CostItem  implements java.io.Serializable {
    private java.lang.String accountNumber;

    private java.lang.String accountType;

    private java.util.Calendar acctDate;

    private java.lang.String bankName;

    private java.lang.String cardCode;

    private java.lang.Integer caseId;

    private java.lang.String caseType;

    private java.lang.String description;

    private java.util.Calendar expDate;

    private java.lang.Float extPrice;

    private java.lang.Integer id;

    private java.lang.String invoiceNumber;

    private java.lang.String partNo;

    private java.lang.String paymentType;

    private java.lang.Float price;

    private java.lang.Integer quantity;

    private java.lang.String routingNumber;

    public CostItem() {
    }

    public CostItem(
           java.lang.String accountNumber,
           java.lang.String accountType,
           java.util.Calendar acctDate,
           java.lang.String bankName,
           java.lang.String cardCode,
           java.lang.Integer caseId,
           java.lang.String caseType,
           java.lang.String description,
           java.util.Calendar expDate,
           java.lang.Float extPrice,
           java.lang.Integer id,
           java.lang.String invoiceNumber,
           java.lang.String partNo,
           java.lang.String paymentType,
           java.lang.Float price,
           java.lang.Integer quantity,
           java.lang.String routingNumber) {
           this.accountNumber = accountNumber;
           this.accountType = accountType;
           this.acctDate = acctDate;
           this.bankName = bankName;
           this.cardCode = cardCode;
           this.caseId = caseId;
           this.caseType = caseType;
           this.description = description;
           this.expDate = expDate;
           this.extPrice = extPrice;
           this.id = id;
           this.invoiceNumber = invoiceNumber;
           this.partNo = partNo;
           this.paymentType = paymentType;
           this.price = price;
           this.quantity = quantity;
           this.routingNumber = routingNumber;
    }


    /**
     * Gets the accountNumber value for this CostItem.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this CostItem.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the accountType value for this CostItem.
     * 
     * @return accountType
     */
    public java.lang.String getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this CostItem.
     * 
     * @param accountType
     */
    public void setAccountType(java.lang.String accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the acctDate value for this CostItem.
     * 
     * @return acctDate
     */
    public java.util.Calendar getAcctDate() {
        return acctDate;
    }


    /**
     * Sets the acctDate value for this CostItem.
     * 
     * @param acctDate
     */
    public void setAcctDate(java.util.Calendar acctDate) {
        this.acctDate = acctDate;
    }


    /**
     * Gets the bankName value for this CostItem.
     * 
     * @return bankName
     */
    public java.lang.String getBankName() {
        return bankName;
    }


    /**
     * Sets the bankName value for this CostItem.
     * 
     * @param bankName
     */
    public void setBankName(java.lang.String bankName) {
        this.bankName = bankName;
    }


    /**
     * Gets the cardCode value for this CostItem.
     * 
     * @return cardCode
     */
    public java.lang.String getCardCode() {
        return cardCode;
    }


    /**
     * Sets the cardCode value for this CostItem.
     * 
     * @param cardCode
     */
    public void setCardCode(java.lang.String cardCode) {
        this.cardCode = cardCode;
    }


    /**
     * Gets the caseId value for this CostItem.
     * 
     * @return caseId
     */
    public java.lang.Integer getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this CostItem.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.Integer caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the caseType value for this CostItem.
     * 
     * @return caseType
     */
    public java.lang.String getCaseType() {
        return caseType;
    }


    /**
     * Sets the caseType value for this CostItem.
     * 
     * @param caseType
     */
    public void setCaseType(java.lang.String caseType) {
        this.caseType = caseType;
    }


    /**
     * Gets the description value for this CostItem.
     * 
     * @return description
     */
    public java.lang.String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CostItem.
     * 
     * @param description
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }


    /**
     * Gets the expDate value for this CostItem.
     * 
     * @return expDate
     */
    public java.util.Calendar getExpDate() {
        return expDate;
    }


    /**
     * Sets the expDate value for this CostItem.
     * 
     * @param expDate
     */
    public void setExpDate(java.util.Calendar expDate) {
        this.expDate = expDate;
    }


    /**
     * Gets the extPrice value for this CostItem.
     * 
     * @return extPrice
     */
    public java.lang.Float getExtPrice() {
        return extPrice;
    }


    /**
     * Sets the extPrice value for this CostItem.
     * 
     * @param extPrice
     */
    public void setExtPrice(java.lang.Float extPrice) {
        this.extPrice = extPrice;
    }


    /**
     * Gets the id value for this CostItem.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this CostItem.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the invoiceNumber value for this CostItem.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this CostItem.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the partNo value for this CostItem.
     * 
     * @return partNo
     */
    public java.lang.String getPartNo() {
        return partNo;
    }


    /**
     * Sets the partNo value for this CostItem.
     * 
     * @param partNo
     */
    public void setPartNo(java.lang.String partNo) {
        this.partNo = partNo;
    }


    /**
     * Gets the paymentType value for this CostItem.
     * 
     * @return paymentType
     */
    public java.lang.String getPaymentType() {
        return paymentType;
    }


    /**
     * Sets the paymentType value for this CostItem.
     * 
     * @param paymentType
     */
    public void setPaymentType(java.lang.String paymentType) {
        this.paymentType = paymentType;
    }


    /**
     * Gets the price value for this CostItem.
     * 
     * @return price
     */
    public java.lang.Float getPrice() {
        return price;
    }


    /**
     * Sets the price value for this CostItem.
     * 
     * @param price
     */
    public void setPrice(java.lang.Float price) {
        this.price = price;
    }


    /**
     * Gets the quantity value for this CostItem.
     * 
     * @return quantity
     */
    public java.lang.Integer getQuantity() {
        return quantity;
    }


    /**
     * Sets the quantity value for this CostItem.
     * 
     * @param quantity
     */
    public void setQuantity(java.lang.Integer quantity) {
        this.quantity = quantity;
    }


    /**
     * Gets the routingNumber value for this CostItem.
     * 
     * @return routingNumber
     */
    public java.lang.String getRoutingNumber() {
        return routingNumber;
    }


    /**
     * Sets the routingNumber value for this CostItem.
     * 
     * @param routingNumber
     */
    public void setRoutingNumber(java.lang.String routingNumber) {
        this.routingNumber = routingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CostItem)) return false;
        CostItem other = (CostItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.acctDate==null && other.getAcctDate()==null) || 
             (this.acctDate!=null &&
              this.acctDate.equals(other.getAcctDate()))) &&
            ((this.bankName==null && other.getBankName()==null) || 
             (this.bankName!=null &&
              this.bankName.equals(other.getBankName()))) &&
            ((this.cardCode==null && other.getCardCode()==null) || 
             (this.cardCode!=null &&
              this.cardCode.equals(other.getCardCode()))) &&
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.caseType==null && other.getCaseType()==null) || 
             (this.caseType!=null &&
              this.caseType.equals(other.getCaseType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.expDate==null && other.getExpDate()==null) || 
             (this.expDate!=null &&
              this.expDate.equals(other.getExpDate()))) &&
            ((this.extPrice==null && other.getExtPrice()==null) || 
             (this.extPrice!=null &&
              this.extPrice.equals(other.getExtPrice()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.partNo==null && other.getPartNo()==null) || 
             (this.partNo!=null &&
              this.partNo.equals(other.getPartNo()))) &&
            ((this.paymentType==null && other.getPaymentType()==null) || 
             (this.paymentType!=null &&
              this.paymentType.equals(other.getPaymentType()))) &&
            ((this.price==null && other.getPrice()==null) || 
             (this.price!=null &&
              this.price.equals(other.getPrice()))) &&
            ((this.quantity==null && other.getQuantity()==null) || 
             (this.quantity!=null &&
              this.quantity.equals(other.getQuantity()))) &&
            ((this.routingNumber==null && other.getRoutingNumber()==null) || 
             (this.routingNumber!=null &&
              this.routingNumber.equals(other.getRoutingNumber())));
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
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAcctDate() != null) {
            _hashCode += getAcctDate().hashCode();
        }
        if (getBankName() != null) {
            _hashCode += getBankName().hashCode();
        }
        if (getCardCode() != null) {
            _hashCode += getCardCode().hashCode();
        }
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getCaseType() != null) {
            _hashCode += getCaseType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getExpDate() != null) {
            _hashCode += getExpDate().hashCode();
        }
        if (getExtPrice() != null) {
            _hashCode += getExtPrice().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getPartNo() != null) {
            _hashCode += getPartNo().hashCode();
        }
        if (getPaymentType() != null) {
            _hashCode += getPaymentType().hashCode();
        }
        if (getPrice() != null) {
            _hashCode += getPrice().hashCode();
        }
        if (getQuantity() != null) {
            _hashCode += getQuantity().hashCode();
        }
        if (getRoutingNumber() != null) {
            _hashCode += getRoutingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CostItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "costItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "accountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("acctDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "acctDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bankName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cardCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("caseType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("", "description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("extPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "extPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "invoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("partNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "partNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentType");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new javax.xml.namespace.QName("", "price"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new javax.xml.namespace.QName("", "quantity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("", "routingNumber"));
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
