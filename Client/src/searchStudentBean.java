/*Author = Monjura Afrin Rumi
 * This is a managed bean class for soap client project. It calls soap service to search 
 * other surveyers inquired by user and also to delete some user from surveyers' list. 
 * Soap service performs those operation and sends results to display in client side.
 */

package Client;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import mrumi_hw5.SearchStudent;
import mrumi_hw5.SearchStudentProxy;
import mrumi_hw5.Student;

@ManagedBean
@SessionScoped
public class searchStudentBean {
	
	private String fname;	
	private String lname;
	private String city;
	private String state;
	
	private String action;
	private String err_msg;
	
	private Student[] searchedValue;	
	
	private SearchStudent ssp;
	
	public String deletion()
	{
		String returnValue = "back";
		try{			
			SearchStudentProxy proxy = new SearchStudentProxy();	
			ssp = proxy.getSearchStudent();			
			returnValue = ssp.deleteStudent(action);	
			searchWS();
		}
		catch(Exception e){
			System.out.println("proxy " + e);
		}	
		
		return returnValue;
	}
	
	public String searchWS()
	{				
		if(fname == "" && lname == "" && city == "" && state == ""){			
			return "back";
		}	
		try{			
			SearchStudentProxy proxy = new SearchStudentProxy();	
			ssp = proxy.getSearchStudent();			
			searchedValue = ssp.searchedStudents(fname, lname, city, state);
			return "searchResult";			
		}
		catch(Exception e){
			System.out.println("proxy " + e);
			err_msg = e.toString();
			return "error";
		}			
	}	
	
	public Student[] getSearchedValue()
	{		
		return searchedValue;
	}
	
	public String getErr_msg()
	{
		return err_msg;
	}
	
	public void setAction(String action) 
	{
		this.action = action;
	}
	
	public void setFname (String fname)
    {
		this.fname = fname;
    }

	public String getFname ()
    {
        return fname;
    }
	
	public void setLname (String lname)
    {
		this.lname = lname;
    }

    public String getLname ()
    {
        return lname;
    }    
    
    public void setCity (String city)
    {
		this.city = city;
    }
    
    public String getCity ()
    {
        return city;
    }
    
    public void setState (String state)
    {
		this.state = state;
    }

    public String getState ()
    {
        return state;
    }    	

}
