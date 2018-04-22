/*Author = Monjura Afrin Rumi
 * This class has properties that matches fields on Student Survey Form.
 * It also contains getter methods for these fields to be accessed from result page.
 * This class has been annotated to be used as an entity object and also to create a datatype
 * so that it can be used to pass data to soap client.
 */

package mrumi_hw5;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.xml.bind.annotation.*;

@XmlRootElement(name = "Student")
@XmlType(propOrder={"fname","lname","address","city","zip_code","email","phone","date","semester","liked","interested","recommend","comment"})
@Entity
public class Student {
	
	private String fname = "None";	
	private String lname = "None";
	
	private String address = "None";
	private String city = "None";
	private String state = "None";
	private String zip_code = "None";	
	
	@Id
	private String email;
	private String phone = "None";
	private String date;
	private String semester;
	
	private String liked = "None";	
	private String interested = "None";
	private String recommend = "None";
	private String comment = "None";
	
	public Student()
	{		
	}

	public Student(String fn, String ln, String adrs, String ct, String st, String zp, 
			String pn, String em, String dt, String sms, String lk, String itrs, String rc, String cm)
	{
		this.fname = fn;		
		this.lname = ln;
		this.address = adrs;
		this.city = ct;
		this.state = st;
		this.zip_code = zp;	
		this.phone = pn;
		this.email = em;
		this.date = dt;	
		this.semester = sms;
		if(!lk.isEmpty())
			this.liked = lk;
		if(!itrs.isEmpty())
			this.interested = itrs;
		if(!rc.isEmpty())
			this.recommend = rc;
		if(!cm.isEmpty())
			this.comment = cm;
	}
	
	@XmlElement(name = "fname")
	public String getFname ()
    {
        return fname;
    }
	
	public void setFname (String fn)
    {
		this.fname = fn;
    }

	@XmlElement(name = "lname")
    public String getLname ()
    {
        return lname;
    }
    
    public void setLname (String ln)
    {				
		this.lname = ln;
    }

    @XmlElement(name = "address")
    public String getAddress ()
    {
        return address;
    }
    
    public void setAddress (String adrs)
    {		
		this.address = adrs;
    }
    
    @XmlElement(name = "city")
    public String getCity ()
    {
        return city;
    }
    
    public void setCity (String ct)
    {		
		this.city = ct;		
    }

    @XmlElement(name = "state")
    public String getState ()
    {
        return state;
    }
    
    public void setState (String st)
    {						
		this.state = st;		
    }

    @XmlElement(name = "zip_code")
    public String getZip_code ()
    {
        return zip_code;
    }
    
    public void setZip_code (String zp)
    {								
		this.zip_code = zp;	
    }

    @XmlElement(name = "phone")
    public String getPhone ()
    {
        return phone;
    }
        
    public void setPhone (String pn)
    {						
		this.phone = pn;		
    }
    
    @XmlElement(name = "email")
    public String getEmail ()
    {
        return email;
    }
    public void setEmail (String em)
    {						
		this.email = em;		
    }
    
    @XmlElement(name = "date")
    public String getDate ()
    {
        return date;
    }
    
    public void setDate (String dt)
    {						
		this.date = dt;			
    }
    
    @XmlElement(name = "semester")
    public String getSemester()
    {
    	return semester;
    }
    
    public void setSemester (String sms)
    {								
		this.semester = sms;		
    }
    
    @XmlElement(name = "liked")
    public String getLiked ()
	{		
		return liked;			
	}
	
    public void setLiked (String lk)
    {								
		if(!lk.isEmpty())
			this.liked = lk;	
    }

    @XmlElement(name = "interested")
	public String getInterested ()
	{		
		return interested;			
	} 
	
	public void setInterested (String itrs)
    {								
		if(!itrs.isEmpty())
			this.interested = itrs;		
    }
	
	@XmlElement(name = "recommend")
	public String getRecommend ()
	{		
		return recommend;			
	}
	
	public void setRecommend (String rc)
    {						
		if(!rc.isEmpty())
			this.recommend = rc;
    }
	
	@XmlElement(name = "comment")
	public String getComment ()
    {
        return comment;
    }
    
    public void setComment (String cm)
    {								
		if(!cm.isEmpty())
			this.comment = cm;
    }

}
