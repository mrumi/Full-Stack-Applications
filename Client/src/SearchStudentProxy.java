package mrumi_hw5;

public class SearchStudentProxy implements mrumi_hw5.SearchStudent {
  private String _endpoint = null;
  private mrumi_hw5.SearchStudent searchStudent = null;
  
  public SearchStudentProxy() {
    _initSearchStudentProxy();
  }
  
  public SearchStudentProxy(String endpoint) {
    _endpoint = endpoint;
    _initSearchStudentProxy();
  }
  
  private void _initSearchStudentProxy() {
    try {
      searchStudent = (new mrumi_hw5.SearchStudentServiceLocator()).getSearchStudent();
      if (searchStudent != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)searchStudent)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)searchStudent)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (searchStudent != null)
      ((javax.xml.rpc.Stub)searchStudent)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public mrumi_hw5.SearchStudent getSearchStudent() {
    if (searchStudent == null)
      _initSearchStudentProxy();
    return searchStudent;
  }
  
  public mrumi_hw5.Student[] searchedStudents(java.lang.String fname, java.lang.String lname, java.lang.String city, java.lang.String state) throws java.rmi.RemoteException{
    if (searchStudent == null)
      _initSearchStudentProxy();
    return searchStudent.searchedStudents(fname, lname, city, state);
  }
  
  public java.lang.String deleteStudent(java.lang.String action) throws java.rmi.RemoteException{
    if (searchStudent == null)
      _initSearchStudentProxy();
    return searchStudent.deleteStudent(action);
  }
  
  
}