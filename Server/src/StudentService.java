/*Author = Monjura Afrin Rumi
 * This class stores information of students who have submitted the form.
 * It also calculated mean and standard deviation of the numbers entered by the user 
 * and stores those value in another class.   
 */

package mrumi_hw5;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class StudentService {
	
	private EntityManagerFactory emfactory;
	private EntityManager entityManager;
	
	private WinningResult wr;
	
	public StudentService()
	{			
	}
	
	protected void insertData(String fn, String ln, String adrs, String ct, String st, String zp, 
			String pn, String em, Date dt, Date sms, String lk, String itrs, String rc, String cm)
	{
		// student = new Student(fn, ln, adrs, ct, st, zp, pn, em, dt, sms, lk, itrs, rc, cm);
		Student student = new Student();
		student.setFname(fn);
		student.setLname(ln);
		student.setAddress(adrs);
		student.setCity(ct);
		student.setState(st);
		student.setZip_code(zp);
		student.setPhone(pn);
		student.setEmail(em);
		String sdt = dt.toString();
		student.setDate(sdt);
		String ssms = sms.toString();
		student.setSemester(ssms);
		student.setLiked(lk);
		student.setInterested(itrs);
		student.setRecommend(rc);
		student.setComment(cm);	
		
		emfactory = Persistence.createEntityManagerFactory("assign5");		
		entityManager = emfactory.createEntityManager();			
		entityManager.getTransaction().begin();								
		Student check = entityManager.find(Student.class, em);		
		if (check == null) 
		{			
			entityManager.persist(student);
		} 
		else 
		{
			entityManager.merge(student);
		}					
		entityManager.getTransaction().commit();								
	}
	
	protected List<Student> getPersonalData()
	{	
		emfactory = Persistence.createEntityManagerFactory("assign5");		
		entityManager = emfactory.createEntityManager();
		TypedQuery<Student> query =  entityManager.createQuery("select s from Student s",Student.class);		
    	List<Student> stduents = query.getResultList();    	
		return stduents;		
	} 		
		
	protected WinningResult mean_std_calculate(String num)
	{	
		wr= new WinningResult(0,0);
		if(num.isEmpty())
			return wr;
		String middle[]=num.split(",");		
		double sum=0;
		for(int i=0;i<middle.length;i++)
		{			
			int val = Integer.parseInt(middle[i]);
			sum+=(double)val;
		}					
		double mean=sum/middle.length;			
		sum=0;
		for(int i=0;i<middle.length;i++)
		{
			int val = Integer.parseInt(middle[i]);
			sum+=((double)val-mean)*((double)val-mean);
		}
		double std=Math.sqrt(sum)/middle.length;			
		wr = new WinningResult(mean, std);
		return wr;		
	}

}
