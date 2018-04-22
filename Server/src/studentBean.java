/*Author = Monjura Afrin Rumi
 * This is a managed bean class to collect input from survey page and to supply result data in result page.
 * This class handles date validation, ajax implementation logic and also provides navigate information.
 */

package mrumi_hw5;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.ComponentSystemEvent;
import javax.faces.validator.ValidatorException;

@ManagedBean
@SessionScoped
public class studentBean {
	
	private String fname;
    private String lname;
    private String address;
    private String city;
    private String state;
    private String zip;
    private String phone;
    private String email;
    private Date date;
    private Date semester;
    private String numbers;
    private String comment;
    
    private String[] mostliked;	
    private String liked;
	private String interested;
	private String recommend;
	
	private double mean = 0;
	private double std = 0;
	
	private StudentService ssr = new StudentService();
	private List<Student> students;
		
	public String storeData()
    {		
		liked="";
		if(mostliked.length>0)
		{
			for(int i = 0; i < mostliked.length; i++)
			{
				liked += mostliked[i] + ",";
			}
			liked = liked.substring(0, liked.length()-1);
		}				
		ssr.insertData(fname, lname, address, city, state, zip, phone, 
				email, date, semester, liked, interested, recommend, comment);				
		WinningResult wr = ssr.mean_std_calculate(numbers);	
		this.mean = wr.getMean();
		this.std = wr.getStd();				
		if (this.mean > 90)
			return "WinnerSuccess";
		else
			return "SimpleSuccess";
    }
    
    public String cancelStorage()
    {
    	return "GoBack";
    }
        
    public void dataLoad(ComponentSystemEvent event)
	{    	
		students = ssr.getPersonalData();			
	}
    
    public ArrayList<String> createRecommend(String query)
    {
    	ArrayList<String> results = new ArrayList<String>();
    	results.add("Very Likely");
    	results.add("Likely");
    	results.add("Unlikely");
    	return results;
    }
	
	public List<Student> getStudents()
	{				
		return students;		 
	}		
		
	public String getFname ()
    {
        return fname;
    }

    public void setFname (final String fname)
    {
        this.fname = fname;        
    }

    public String getLname ()
    {
        return lname;
    }

    public void setLname (final String lname)
    {
        this.lname = lname;       
    }
    
    public String getAddress ()
    {
        return address;
    }

    public void setAddress (final String address)
    {
        this.address = address;
    }
    
    public String getCity ()
    {
        return city;
    }

    public void setCity (final String city)
    {
        this.city = city;        
    }

    public String getState ()
    {
        return state;
    }

    public void setState (final String state)
    {
        this.state = state;        
    }

    public String getZip ()
    {
        return zip;
    }

    public void setZip (final String zip)
    {
        this.zip = zip;                        
        String[] city_state = ajax_called(zip).split(",");
        this.city = city_state[0];
        this.state = city_state[1];
    }

    public String getPhone ()
    {
        return phone;
    }

    public void setPhone (final String phone)
    {
        this.phone = phone;        
    }

    public String getEmail ()
    {
        return email;
    }

    public void setEmail (final String email)
    {
        this.email = email;        
    }

    public Date getDate ()
    {
        return date;
    }

    public void setDate (Date date)
    {
        this.date = date;            
    }
    
    public Date getSemester ()
    {
        return semester;
    }

    public void setSemester (Date semester)
    {
        this.semester = semester;            
    }
    
    public String getComment ()
    {
        return comment;
    }

    public void setComment (final String comment)
    {
        this.comment = comment;        
    }

    public String[] getMostliked ()
	{		
		return mostliked;			
	}
    
    public void setMostliked (String[] liked)
	{		
		this.mostliked=liked;		
	}	
	
	public String getInterested ()
	{		
		return interested;			
	}
    
    public void setInterested (String interest)
	{
		this.interested = interest;		
	}
	
	public String getRecommend ()
	{		
		return recommend;			
	}
    
    public void setRecommend (String recom)
	{		
		this.recommend = recom;		
	}
	
	public String getNumbers()
    {
        return numbers;
    }

    public void setNumbers (String numbers)
    {
        this.numbers = numbers;        
    }
    
    public double getMean ()
	{
	   return this.mean;
	}	
	
	public double getStd ()
	{
	   return this.std;
	}
	
	public Date getCurrent()
	{
		return new Date();
	}	
		
	private String ajax_called(String zip)
	{
		String [] z = {"22312","22030","22301","20148"};
		String [] c = {"Alexandria","Fairfax","Tysons Corner","Ashburn"};
		String [] s = {"VA","VA","MD","VA"};
		String location="not found,sorry";						
		for(int i=0;i<z.length;i++)
		{
			if(z[i].equals(zip))
			{				
				location = c[i]+","+s[i];				
			}
		}				
        return location;
	}
	
	public void dateValidation(FacesContext context, UIComponent componentToValidate, Object value) throws ValidatorException
	{			
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		cal.add(Calendar.DATE, -1);
		today = cal.getTime();		
		Date survey = (Date)value;			
		if (survey.before(today))
		{	
			FacesMessage message = 	new FacesMessage("Survey date can not be before today's date.");	
			throw new ValidatorException(message);
		}
	}
	
	public void numberValidation(FacesContext context, UIComponent componentToValidate, Object value) throws ValidatorException 
	{		
		String nums= value.toString();
		if(!nums.isEmpty())
		{
			String middle[]=nums.split(",");
			if(middle.length < 10)
			{
				FacesMessage message = 	new FacesMessage("Provide at least 10 numbers, "
						+ "you have written only "+ middle.length + " numbers");
				throw new ValidatorException(message);
			}
			int cur_num;
			for(int i=0;i<middle.length;i++)
			{
				try
				{
					cur_num = Integer.parseInt(middle[i]);
				}catch(Exception e)
				{
					FacesMessage message = 	new FacesMessage("Provide numbers only, you have "
							+ "included " + middle[i] + " which is not a valid number");	
					throw new ValidatorException(message);
				}
				if(cur_num<1 || cur_num>100)
				{
					FacesMessage message = 	new FacesMessage("All number must be in the "
							+ "range of 1-100, you have included "+cur_num+" which is out of range.");	
					throw new ValidatorException(message);
				}
			}
		}		
	}

}
