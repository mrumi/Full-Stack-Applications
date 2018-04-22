/*Author = Monjura Afrin Rumi
 * This is a managed bean class. It is used only to delete any student from surveyers' list.
 */

package mrumi_hw5;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


@ManagedBean
@SessionScoped
public class searchBean {
	
	public String action;			
	
	private EntityManagerFactory emfactory;
	private EntityManager entityManager;		
	
	public void setAction(String action) 
	{
		this.action = action;
	}
	
	public String deletion() 
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
