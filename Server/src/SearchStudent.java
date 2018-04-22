/*Author = Monjura Afrin Rumi
 * This class is used to generate soap based service. 
 * It provides operations to search data and also delete those data via soap service.
 */

package mrumi_hw5;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(portName = "http://ec2-35-166-60-65.us-west-2.compute.amazonaws.com")
@SOAPBinding(style=Style.RPC)
public class SearchStudent {
	
	private EntityManagerFactory emfactory;
	private EntityManager entityManager;	
	private Student[] students;	
		
	@WebMethod
	public Student[] searchedStudents(@WebParam(name = "fname")String fname, 
			@WebParam(name = "lname") String lname, @WebParam(name = "city") String city, @WebParam(name = "state") String state){								
		
		String query = "select s from Student s where 1 = 1";
		if (!fname.isEmpty())
			query += " and s.fname = :fname";
		if (!lname.isEmpty())
			query += " and s.lname = :lname";
		if (!city.isEmpty())
			query += " and s.city = :city";
		if (!state.isEmpty())
			query += " and s.state = :state";			
		emfactory = Persistence.createEntityManagerFactory("assign5");		
		entityManager = emfactory.createEntityManager();
		entityManager.getTransaction().begin();			
		TypedQuery<Student> q =  entityManager.createQuery(query,Student.class);		    	    	    	
		if (!fname.isEmpty())
			q.setParameter("fname", fname);
		if (!lname.isEmpty())
			q.setParameter("lname", lname);
		if (!city.isEmpty())
			q.setParameter("city", city);
		if (!state.isEmpty()) 
			q.setParameter("state", state);			
		List<Student> result = q.getResultList();			
		entityManager.getTransaction().commit();	
		System.out.println();
		
		students  = new Student[result.size()];
		
		for(int i = 0; i<result.size();i++)
		{
			students[i] = result.get(i);
		}
		
		return students;
	}	
	
	@WebMethod
	public String deleteStudent(@WebParam(name = "action") String action) 
	{    	
    	emfactory = Persistence.createEntityManagerFactory("assign5");		
		entityManager = emfactory.createEntityManager();
		entityManager.getTransaction().begin();								
		Student student = entityManager.find(Student.class, action);						
		if(student !=null)
			entityManager.remove(student);		
		entityManager.getTransaction().commit();		
		return "deleted";		
	}

}
