/**
 * Student.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mrumi_hw5;

public class Student  implements java.io.Serializable {
    private java.lang.String address;

    private java.lang.String city;

    private java.lang.String comment;

    private java.lang.String date;

    private java.lang.String email;

    private java.lang.String fname;

    private java.lang.String interested;

    private java.lang.String liked;

    private java.lang.String lname;

    private java.lang.String phone;

    private java.lang.String recommend;

    private java.lang.String semester;

    private java.lang.String state;

    private java.lang.String zip_code;

    public Student() {
    }

    public Student(
           java.lang.String address,
           java.lang.String city,
           java.lang.String comment,
           java.lang.String date,
           java.lang.String email,
           java.lang.String fname,
           java.lang.String interested,
           java.lang.String liked,
           java.lang.String lname,
           java.lang.String phone,
           java.lang.String recommend,
           java.lang.String semester,
           java.lang.String state,
           java.lang.String zip_code) {
           this.address = address;
           this.city = city;
           this.comment = comment;
           this.date = date;
           this.email = email;
           this.fname = fname;
           this.interested = interested;
           this.liked = liked;
           this.lname = lname;
           this.phone = phone;
           this.recommend = recommend;
           this.semester = semester;
           this.state = state;
           this.zip_code = zip_code;
    }


    /**
     * Gets the address value for this Student.
     * 
     * @return address
     */
    public java.lang.String getAddress() {
        return address;
    }


    /**
     * Sets the address value for this Student.
     * 
     * @param address
     */
    public void setAddress(java.lang.String address) {
        this.address = address;
    }


    /**
     * Gets the city value for this Student.
     * 
     * @return city
     */
    public java.lang.String getCity() {
        return city;
    }


    /**
     * Sets the city value for this Student.
     * 
     * @param city
     */
    public void setCity(java.lang.String city) {
        this.city = city;
    }


    /**
     * Gets the comment value for this Student.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this Student.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the date value for this Student.
     * 
     * @return date
     */
    public java.lang.String getDate() {
        return date;
    }


    /**
     * Sets the date value for this Student.
     * 
     * @param date
     */
    public void setDate(java.lang.String date) {
        this.date = date;
    }


    /**
     * Gets the email value for this Student.
     * 
     * @return email
     */
    public java.lang.String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this Student.
     * 
     * @param email
     */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }


    /**
     * Gets the fname value for this Student.
     * 
     * @return fname
     */
    public java.lang.String getFname() {
        return fname;
    }


    /**
     * Sets the fname value for this Student.
     * 
     * @param fname
     */
    public void setFname(java.lang.String fname) {
        this.fname = fname;
    }


    /**
     * Gets the interested value for this Student.
     * 
     * @return interested
     */
    public java.lang.String getInterested() {
        return interested;
    }


    /**
     * Sets the interested value for this Student.
     * 
     * @param interested
     */
    public void setInterested(java.lang.String interested) {
        this.interested = interested;
    }


    /**
     * Gets the liked value for this Student.
     * 
     * @return liked
     */
    public java.lang.String getLiked() {
        return liked;
    }


    /**
     * Sets the liked value for this Student.
     * 
     * @param liked
     */
    public void setLiked(java.lang.String liked) {
        this.liked = liked;
    }


    /**
     * Gets the lname value for this Student.
     * 
     * @return lname
     */
    public java.lang.String getLname() {
        return lname;
    }


    /**
     * Sets the lname value for this Student.
     * 
     * @param lname
     */
    public void setLname(java.lang.String lname) {
        this.lname = lname;
    }


    /**
     * Gets the phone value for this Student.
     * 
     * @return phone
     */
    public java.lang.String getPhone() {
        return phone;
    }


    /**
     * Sets the phone value for this Student.
     * 
     * @param phone
     */
    public void setPhone(java.lang.String phone) {
        this.phone = phone;
    }


    /**
     * Gets the recommend value for this Student.
     * 
     * @return recommend
     */
    public java.lang.String getRecommend() {
        return recommend;
    }


    /**
     * Sets the recommend value for this Student.
     * 
     * @param recommend
     */
    public void setRecommend(java.lang.String recommend) {
        this.recommend = recommend;
    }


    /**
     * Gets the semester value for this Student.
     * 
     * @return semester
     */
    public java.lang.String getSemester() {
        return semester;
    }


    /**
     * Sets the semester value for this Student.
     * 
     * @param semester
     */
    public void setSemester(java.lang.String semester) {
        this.semester = semester;
    }


    /**
     * Gets the state value for this Student.
     * 
     * @return state
     */
    public java.lang.String getState() {
        return state;
    }


    /**
     * Sets the state value for this Student.
     * 
     * @param state
     */
    public void setState(java.lang.String state) {
        this.state = state;
    }


    /**
     * Gets the zip_code value for this Student.
     * 
     * @return zip_code
     */
    public java.lang.String getZip_code() {
        return zip_code;
    }


    /**
     * Sets the zip_code value for this Student.
     * 
     * @param zip_code
     */
    public void setZip_code(java.lang.String zip_code) {
        this.zip_code = zip_code;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Student)) return false;
        Student other = (Student) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.address==null && other.getAddress()==null) || 
             (this.address!=null &&
              this.address.equals(other.getAddress()))) &&
            ((this.city==null && other.getCity()==null) || 
             (this.city!=null &&
              this.city.equals(other.getCity()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.date==null && other.getDate()==null) || 
             (this.date!=null &&
              this.date.equals(other.getDate()))) &&
            ((this.email==null && other.getEmail()==null) || 
             (this.email!=null &&
              this.email.equals(other.getEmail()))) &&
            ((this.fname==null && other.getFname()==null) || 
             (this.fname!=null &&
              this.fname.equals(other.getFname()))) &&
            ((this.interested==null && other.getInterested()==null) || 
             (this.interested!=null &&
              this.interested.equals(other.getInterested()))) &&
            ((this.liked==null && other.getLiked()==null) || 
             (this.liked!=null &&
              this.liked.equals(other.getLiked()))) &&
            ((this.lname==null && other.getLname()==null) || 
             (this.lname!=null &&
              this.lname.equals(other.getLname()))) &&
            ((this.phone==null && other.getPhone()==null) || 
             (this.phone!=null &&
              this.phone.equals(other.getPhone()))) &&
            ((this.recommend==null && other.getRecommend()==null) || 
             (this.recommend!=null &&
              this.recommend.equals(other.getRecommend()))) &&
            ((this.semester==null && other.getSemester()==null) || 
             (this.semester!=null &&
              this.semester.equals(other.getSemester()))) &&
            ((this.state==null && other.getState()==null) || 
             (this.state!=null &&
              this.state.equals(other.getState()))) &&
            ((this.zip_code==null && other.getZip_code()==null) || 
             (this.zip_code!=null &&
              this.zip_code.equals(other.getZip_code())));
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
        if (getAddress() != null) {
            _hashCode += getAddress().hashCode();
        }
        if (getCity() != null) {
            _hashCode += getCity().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getDate() != null) {
            _hashCode += getDate().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getFname() != null) {
            _hashCode += getFname().hashCode();
        }
        if (getInterested() != null) {
            _hashCode += getInterested().hashCode();
        }
        if (getLiked() != null) {
            _hashCode += getLiked().hashCode();
        }
        if (getLname() != null) {
            _hashCode += getLname().hashCode();
        }
        if (getPhone() != null) {
            _hashCode += getPhone().hashCode();
        }
        if (getRecommend() != null) {
            _hashCode += getRecommend().hashCode();
        }
        if (getSemester() != null) {
            _hashCode += getSemester().hashCode();
        }
        if (getState() != null) {
            _hashCode += getState().hashCode();
        }
        if (getZip_code() != null) {
            _hashCode += getZip_code().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Student.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://mrumi_hw5", "Student"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "address"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "city"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("date");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "date"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "fname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("interested");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "interested"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liked");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "liked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lname");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "lname"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "phone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recommend");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "recommend"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("semester");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "semester"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "state"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("zip_code");
        elemField.setXmlName(new javax.xml.namespace.QName("http://mrumi_hw5", "zip_code"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
