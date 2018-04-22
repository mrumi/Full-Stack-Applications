/*Author = Monjura Afrin Rumi
 * This class is used to implement RESTful web service.
 * It stores related zip code, city and state. Returns city and address information for corresponding 
 * zipcode when called.
 */

package hw3_test;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

@Path("/todos")
public class addressResource extends Application{
	
	private String location="habijabi";
	
	@Path("{todo}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
    //@Consumes(MediaType.APPLICATION_FORM_URLENCODED)
	public String createAddress(@PathParam("todo")String name){		
								 		
		String [] z = {"22312","22030","22301","20148"};
		String [] c = {"Alexandria","Fairfax","Tysons Corner","Ashburn"};
		String [] s = {"VA","VA","MD","VA"};
		//System.out.println("called with " + name);
						
		for(int i=0;i<z.length;i++)
		{
			if(z[i].equals(name))
			{				
				location = c[i]+","+s[i];				
			}
		}	
		//System.out.println(location);	
        return location;
	}
		
}
