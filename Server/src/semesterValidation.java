/*Author = Monjura Afrin Rumi
 * I have created this class to validate semester date so that it is after survey date.
 */

package mrumi_hw5;

import java.util.Date;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("semesterValidation")
public class semesterValidation implements Validator{
	
	@Override
    public void validate(FacesContext context, UIComponent component, Object value) throws ValidatorException 
    {
        if (value == null) 
        {
            return; // Let required="true" handle.
        }
        UIInput startDateComponent = (UIInput) component.getAttributes().get("sdate");
        if (!startDateComponent.isValid()) 
        {
            return; // Already invalidated. Don't care about it then.
        }
        Date startDate = (Date) startDateComponent.getValue();
        if (startDate == null) 
        {
            return; // Let required="true" handle.
        }
        Date endDate = (Date) value;
        if (startDate.after(endDate)) 
        {                        
            FacesMessage message = 	new FacesMessage("Semester date can not be before survey date.");	
			throw new ValidatorException(message);
        }
    }

}
