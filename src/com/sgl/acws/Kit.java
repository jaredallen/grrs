/**
 * Kit.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.sgl.acws;

public class Kit  implements java.io.Serializable {
    private java.lang.String allBarcodes;

    private java.lang.Integer batchId;

    private java.util.Calendar cancelled;

    private java.lang.Integer caseId;

    private java.lang.Integer caseStatus;

    private java.lang.String caseType;

    private com.sgl.acws.CostItem[] costItems;

    private java.util.Calendar createDate;

    private java.lang.String dbaName;

    private java.util.Calendar finalReview;

    private java.lang.Integer id;

    private com.sgl.acws.Contact kitContact;

    private java.lang.Integer kitId;

    private java.lang.String kitNo;

    private java.util.Calendar kitReceived;

    private com.sgl.acws.Sample[] kitSamples;

    private java.lang.String lab;

    private java.lang.String note;

    private java.lang.String orderNo;

    private java.util.Calendar paymentReceived;

    private java.util.Calendar recollectRequested;

    private java.util.Calendar reportSent;

    private java.util.Calendar sentToLab;

    private java.lang.String sortKey;

    private java.lang.String trackingNo;

    public Kit() {
    }

    public Kit(
           java.lang.String allBarcodes,
           java.lang.Integer batchId,
           java.util.Calendar cancelled,
           java.lang.Integer caseId,
           java.lang.Integer caseStatus,
           java.lang.String caseType,
           com.sgl.acws.CostItem[] costItems,
           java.util.Calendar createDate,
           java.lang.String dbaName,
           java.util.Calendar finalReview,
           java.lang.Integer id,
           com.sgl.acws.Contact kitContact,
           java.lang.Integer kitId,
           java.lang.String kitNo,
           java.util.Calendar kitReceived,
           com.sgl.acws.Sample[] kitSamples,
           java.lang.String lab,
           java.lang.String note,
           java.lang.String orderNo,
           java.util.Calendar paymentReceived,
           java.util.Calendar recollectRequested,
           java.util.Calendar reportSent,
           java.util.Calendar sentToLab,
           java.lang.String sortKey,
           java.lang.String trackingNo) {
           this.allBarcodes = allBarcodes;
           this.batchId = batchId;
           this.cancelled = cancelled;
           this.caseId = caseId;
           this.caseStatus = caseStatus;
           this.caseType = caseType;
           this.costItems = costItems;
           this.createDate = createDate;
           this.dbaName = dbaName;
           this.finalReview = finalReview;
           this.id = id;
           this.kitContact = kitContact;
           this.kitId = kitId;
           this.kitNo = kitNo;
           this.kitReceived = kitReceived;
           this.kitSamples = kitSamples;
           this.lab = lab;
           this.note = note;
           this.orderNo = orderNo;
           this.paymentReceived = paymentReceived;
           this.recollectRequested = recollectRequested;
           this.reportSent = reportSent;
           this.sentToLab = sentToLab;
           this.sortKey = sortKey;
           this.trackingNo = trackingNo;
    }


    /**
     * Gets the allBarcodes value for this Kit.
     * 
     * @return allBarcodes
     */
    public java.lang.String getAllBarcodes() {
        return allBarcodes;
    }


    /**
     * Sets the allBarcodes value for this Kit.
     * 
     * @param allBarcodes
     */
    public void setAllBarcodes(java.lang.String allBarcodes) {
        this.allBarcodes = allBarcodes;
    }


    /**
     * Gets the batchId value for this Kit.
     * 
     * @return batchId
     */
    public java.lang.Integer getBatchId() {
        return batchId;
    }


    /**
     * Sets the batchId value for this Kit.
     * 
     * @param batchId
     */
    public void setBatchId(java.lang.Integer batchId) {
        this.batchId = batchId;
    }


    /**
     * Gets the cancelled value for this Kit.
     * 
     * @return cancelled
     */
    public java.util.Calendar getCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this Kit.
     * 
     * @param cancelled
     */
    public void setCancelled(java.util.Calendar cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the caseId value for this Kit.
     * 
     * @return caseId
     */
    public java.lang.Integer getCaseId() {
        return caseId;
    }


    /**
     * Sets the caseId value for this Kit.
     * 
     * @param caseId
     */
    public void setCaseId(java.lang.Integer caseId) {
        this.caseId = caseId;
    }


    /**
     * Gets the caseStatus value for this Kit.
     * 
     * @return caseStatus
     */
    public java.lang.Integer getCaseStatus() {
        return caseStatus;
    }


    /**
     * Sets the caseStatus value for this Kit.
     * 
     * @param caseStatus
     */
    public void setCaseStatus(java.lang.Integer caseStatus) {
        this.caseStatus = caseStatus;
    }


    /**
     * Gets the caseType value for this Kit.
     * 
     * @return caseType
     */
    public java.lang.String getCaseType() {
        return caseType;
    }


    /**
     * Sets the caseType value for this Kit.
     * 
     * @param caseType
     */
    public void setCaseType(java.lang.String caseType) {
        this.caseType = caseType;
    }


    /**
     * Gets the costItems value for this Kit.
     * 
     * @return costItems
     */
    public com.sgl.acws.CostItem[] getCostItems() {
        return costItems;
    }


    /**
     * Sets the costItems value for this Kit.
     * 
     * @param costItems
     */
    public void setCostItems(com.sgl.acws.CostItem[] costItems) {
        this.costItems = costItems;
    }

    public com.sgl.acws.CostItem getCostItems(int i) {
        return this.costItems[i];
    }

    public void setCostItems(int i, com.sgl.acws.CostItem _value) {
        this.costItems[i] = _value;
    }


    /**
     * Gets the createDate value for this Kit.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this Kit.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the dbaName value for this Kit.
     * 
     * @return dbaName
     */
    public java.lang.String getDbaName() {
        return dbaName;
    }


    /**
     * Sets the dbaName value for this Kit.
     * 
     * @param dbaName
     */
    public void setDbaName(java.lang.String dbaName) {
        this.dbaName = dbaName;
    }


    /**
     * Gets the finalReview value for this Kit.
     * 
     * @return finalReview
     */
    public java.util.Calendar getFinalReview() {
        return finalReview;
    }


    /**
     * Sets the finalReview value for this Kit.
     * 
     * @param finalReview
     */
    public void setFinalReview(java.util.Calendar finalReview) {
        this.finalReview = finalReview;
    }


    /**
     * Gets the id value for this Kit.
     * 
     * @return id
     */
    public java.lang.Integer getId() {
        return id;
    }


    /**
     * Sets the id value for this Kit.
     * 
     * @param id
     */
    public void setId(java.lang.Integer id) {
        this.id = id;
    }


    /**
     * Gets the kitContact value for this Kit.
     * 
     * @return kitContact
     */
    public com.sgl.acws.Contact getKitContact() {
        return kitContact;
    }


    /**
     * Sets the kitContact value for this Kit.
     * 
     * @param kitContact
     */
    public void setKitContact(com.sgl.acws.Contact kitContact) {
        this.kitContact = kitContact;
    }


    /**
     * Gets the kitId value for this Kit.
     * 
     * @return kitId
     */
    public java.lang.Integer getKitId() {
        return kitId;
    }


    /**
     * Sets the kitId value for this Kit.
     * 
     * @param kitId
     */
    public void setKitId(java.lang.Integer kitId) {
        this.kitId = kitId;
    }


    /**
     * Gets the kitNo value for this Kit.
     * 
     * @return kitNo
     */
    public java.lang.String getKitNo() {
        return kitNo;
    }


    /**
     * Sets the kitNo value for this Kit.
     * 
     * @param kitNo
     */
    public void setKitNo(java.lang.String kitNo) {
        this.kitNo = kitNo;
    }


    /**
     * Gets the kitReceived value for this Kit.
     * 
     * @return kitReceived
     */
    public java.util.Calendar getKitReceived() {
        return kitReceived;
    }


    /**
     * Sets the kitReceived value for this Kit.
     * 
     * @param kitReceived
     */
    public void setKitReceived(java.util.Calendar kitReceived) {
        this.kitReceived = kitReceived;
    }


    /**
     * Gets the kitSamples value for this Kit.
     * 
     * @return kitSamples
     */
    public com.sgl.acws.Sample[] getKitSamples() {
        return kitSamples;
    }


    /**
     * Sets the kitSamples value for this Kit.
     * 
     * @param kitSamples
     */
    public void setKitSamples(com.sgl.acws.Sample[] kitSamples) {
        this.kitSamples = kitSamples;
    }

    public com.sgl.acws.Sample getKitSamples(int i) {
        return this.kitSamples[i];
    }

    public void setKitSamples(int i, com.sgl.acws.Sample _value) {
        this.kitSamples[i] = _value;
    }


    /**
     * Gets the lab value for this Kit.
     * 
     * @return lab
     */
    public java.lang.String getLab() {
        return lab;
    }


    /**
     * Sets the lab value for this Kit.
     * 
     * @param lab
     */
    public void setLab(java.lang.String lab) {
        this.lab = lab;
    }


    /**
     * Gets the note value for this Kit.
     * 
     * @return note
     */
    public java.lang.String getNote() {
        return note;
    }


    /**
     * Sets the note value for this Kit.
     * 
     * @param note
     */
    public void setNote(java.lang.String note) {
        this.note = note;
    }


    /**
     * Gets the orderNo value for this Kit.
     * 
     * @return orderNo
     */
    public java.lang.String getOrderNo() {
        return orderNo;
    }


    /**
     * Sets the orderNo value for this Kit.
     * 
     * @param orderNo
     */
    public void setOrderNo(java.lang.String orderNo) {
        this.orderNo = orderNo;
    }


    /**
     * Gets the paymentReceived value for this Kit.
     * 
     * @return paymentReceived
     */
    public java.util.Calendar getPaymentReceived() {
        return paymentReceived;
    }


    /**
     * Sets the paymentReceived value for this Kit.
     * 
     * @param paymentReceived
     */
    public void setPaymentReceived(java.util.Calendar paymentReceived) {
        this.paymentReceived = paymentReceived;
    }


    /**
     * Gets the recollectRequested value for this Kit.
     * 
     * @return recollectRequested
     */
    public java.util.Calendar getRecollectRequested() {
        return recollectRequested;
    }


    /**
     * Sets the recollectRequested value for this Kit.
     * 
     * @param recollectRequested
     */
    public void setRecollectRequested(java.util.Calendar recollectRequested) {
        this.recollectRequested = recollectRequested;
    }


    /**
     * Gets the reportSent value for this Kit.
     * 
     * @return reportSent
     */
    public java.util.Calendar getReportSent() {
        return reportSent;
    }


    /**
     * Sets the reportSent value for this Kit.
     * 
     * @param reportSent
     */
    public void setReportSent(java.util.Calendar reportSent) {
        this.reportSent = reportSent;
    }


    /**
     * Gets the sentToLab value for this Kit.
     * 
     * @return sentToLab
     */
    public java.util.Calendar getSentToLab() {
        return sentToLab;
    }


    /**
     * Sets the sentToLab value for this Kit.
     * 
     * @param sentToLab
     */
    public void setSentToLab(java.util.Calendar sentToLab) {
        this.sentToLab = sentToLab;
    }


    /**
     * Gets the sortKey value for this Kit.
     * 
     * @return sortKey
     */
    public java.lang.String getSortKey() {
        return sortKey;
    }


    /**
     * Sets the sortKey value for this Kit.
     * 
     * @param sortKey
     */
    public void setSortKey(java.lang.String sortKey) {
        this.sortKey = sortKey;
    }


    /**
     * Gets the trackingNo value for this Kit.
     * 
     * @return trackingNo
     */
    public java.lang.String getTrackingNo() {
        return trackingNo;
    }


    /**
     * Sets the trackingNo value for this Kit.
     * 
     * @param trackingNo
     */
    public void setTrackingNo(java.lang.String trackingNo) {
        this.trackingNo = trackingNo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Kit)) return false;
        Kit other = (Kit) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allBarcodes==null && other.getAllBarcodes()==null) || 
             (this.allBarcodes!=null &&
              this.allBarcodes.equals(other.getAllBarcodes()))) &&
            ((this.batchId==null && other.getBatchId()==null) || 
             (this.batchId!=null &&
              this.batchId.equals(other.getBatchId()))) &&
            ((this.cancelled==null && other.getCancelled()==null) || 
             (this.cancelled!=null &&
              this.cancelled.equals(other.getCancelled()))) &&
            ((this.caseId==null && other.getCaseId()==null) || 
             (this.caseId!=null &&
              this.caseId.equals(other.getCaseId()))) &&
            ((this.caseStatus==null && other.getCaseStatus()==null) || 
             (this.caseStatus!=null &&
              this.caseStatus.equals(other.getCaseStatus()))) &&
            ((this.caseType==null && other.getCaseType()==null) || 
             (this.caseType!=null &&
              this.caseType.equals(other.getCaseType()))) &&
            ((this.costItems==null && other.getCostItems()==null) || 
             (this.costItems!=null &&
              java.util.Arrays.equals(this.costItems, other.getCostItems()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.dbaName==null && other.getDbaName()==null) || 
             (this.dbaName!=null &&
              this.dbaName.equals(other.getDbaName()))) &&
            ((this.finalReview==null && other.getFinalReview()==null) || 
             (this.finalReview!=null &&
              this.finalReview.equals(other.getFinalReview()))) &&
            ((this.id==null && other.getId()==null) || 
             (this.id!=null &&
              this.id.equals(other.getId()))) &&
            ((this.kitContact==null && other.getKitContact()==null) || 
             (this.kitContact!=null &&
              this.kitContact.equals(other.getKitContact()))) &&
            ((this.kitId==null && other.getKitId()==null) || 
             (this.kitId!=null &&
              this.kitId.equals(other.getKitId()))) &&
            ((this.kitNo==null && other.getKitNo()==null) || 
             (this.kitNo!=null &&
              this.kitNo.equals(other.getKitNo()))) &&
            ((this.kitReceived==null && other.getKitReceived()==null) || 
             (this.kitReceived!=null &&
              this.kitReceived.equals(other.getKitReceived()))) &&
            ((this.kitSamples==null && other.getKitSamples()==null) || 
             (this.kitSamples!=null &&
              java.util.Arrays.equals(this.kitSamples, other.getKitSamples()))) &&
            ((this.lab==null && other.getLab()==null) || 
             (this.lab!=null &&
              this.lab.equals(other.getLab()))) &&
            ((this.note==null && other.getNote()==null) || 
             (this.note!=null &&
              this.note.equals(other.getNote()))) &&
            ((this.orderNo==null && other.getOrderNo()==null) || 
             (this.orderNo!=null &&
              this.orderNo.equals(other.getOrderNo()))) &&
            ((this.paymentReceived==null && other.getPaymentReceived()==null) || 
             (this.paymentReceived!=null &&
              this.paymentReceived.equals(other.getPaymentReceived()))) &&
            ((this.recollectRequested==null && other.getRecollectRequested()==null) || 
             (this.recollectRequested!=null &&
              this.recollectRequested.equals(other.getRecollectRequested()))) &&
            ((this.reportSent==null && other.getReportSent()==null) || 
             (this.reportSent!=null &&
              this.reportSent.equals(other.getReportSent()))) &&
            ((this.sentToLab==null && other.getSentToLab()==null) || 
             (this.sentToLab!=null &&
              this.sentToLab.equals(other.getSentToLab()))) &&
            ((this.sortKey==null && other.getSortKey()==null) || 
             (this.sortKey!=null &&
              this.sortKey.equals(other.getSortKey()))) &&
            ((this.trackingNo==null && other.getTrackingNo()==null) || 
             (this.trackingNo!=null &&
              this.trackingNo.equals(other.getTrackingNo())));
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
        if (getAllBarcodes() != null) {
            _hashCode += getAllBarcodes().hashCode();
        }
        if (getBatchId() != null) {
            _hashCode += getBatchId().hashCode();
        }
        if (getCancelled() != null) {
            _hashCode += getCancelled().hashCode();
        }
        if (getCaseId() != null) {
            _hashCode += getCaseId().hashCode();
        }
        if (getCaseStatus() != null) {
            _hashCode += getCaseStatus().hashCode();
        }
        if (getCaseType() != null) {
            _hashCode += getCaseType().hashCode();
        }
        if (getCostItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCostItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCostItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getDbaName() != null) {
            _hashCode += getDbaName().hashCode();
        }
        if (getFinalReview() != null) {
            _hashCode += getFinalReview().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getKitContact() != null) {
            _hashCode += getKitContact().hashCode();
        }
        if (getKitId() != null) {
            _hashCode += getKitId().hashCode();
        }
        if (getKitNo() != null) {
            _hashCode += getKitNo().hashCode();
        }
        if (getKitReceived() != null) {
            _hashCode += getKitReceived().hashCode();
        }
        if (getKitSamples() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getKitSamples());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getKitSamples(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLab() != null) {
            _hashCode += getLab().hashCode();
        }
        if (getNote() != null) {
            _hashCode += getNote().hashCode();
        }
        if (getOrderNo() != null) {
            _hashCode += getOrderNo().hashCode();
        }
        if (getPaymentReceived() != null) {
            _hashCode += getPaymentReceived().hashCode();
        }
        if (getRecollectRequested() != null) {
            _hashCode += getRecollectRequested().hashCode();
        }
        if (getReportSent() != null) {
            _hashCode += getReportSent().hashCode();
        }
        if (getSentToLab() != null) {
            _hashCode += getSentToLab().hashCode();
        }
        if (getSortKey() != null) {
            _hashCode += getSortKey().hashCode();
        }
        if (getTrackingNo() != null) {
            _hashCode += getTrackingNo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Kit.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "kit"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allBarcodes");
        elemField.setXmlName(new javax.xml.namespace.QName("", "allBarcodes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "batchId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("", "cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("caseStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("", "caseStatus"));
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
        elemField.setFieldName("costItems");
        elemField.setXmlName(new javax.xml.namespace.QName("", "costItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "costItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("", "createDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dbaName");
        elemField.setXmlName(new javax.xml.namespace.QName("", "dbaName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("finalReview");
        elemField.setXmlName(new javax.xml.namespace.QName("", "finalReview"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("kitContact");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kitContact"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "contact"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kitId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kitId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kitNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kitNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kitReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kitReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("kitSamples");
        elemField.setXmlName(new javax.xml.namespace.QName("", "kitSamples"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn:acws.sgl.com/AccountCustomerWS", "sample"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lab");
        elemField.setXmlName(new javax.xml.namespace.QName("", "lab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new javax.xml.namespace.QName("", "note"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "orderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentReceived");
        elemField.setXmlName(new javax.xml.namespace.QName("", "paymentReceived"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recollectRequested");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recollectRequested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reportSent");
        elemField.setXmlName(new javax.xml.namespace.QName("", "reportSent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sentToLab");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sentToLab"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortKey");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("trackingNo");
        elemField.setXmlName(new javax.xml.namespace.QName("", "trackingNo"));
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
