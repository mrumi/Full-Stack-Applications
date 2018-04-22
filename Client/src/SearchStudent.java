/**
 * SearchStudent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package mrumi_hw5;

public interface SearchStudent extends java.rmi.Remote {
    public mrumi_hw5.Student[] searchedStudents(java.lang.String fname, java.lang.String lname, java.lang.String city, java.lang.String state) throws java.rmi.RemoteException;
    public java.lang.String deleteStudent(java.lang.String action) throws java.rmi.RemoteException;
}
