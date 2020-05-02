package co.edu.unbosque.valitators;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIInput;
import javax.faces.context.FacesContext;
import javax.faces.validator.FacesValidator;
import javax.faces.validator.Validator;
import javax.faces.validator.ValidatorException;

@FacesValidator("validarContrase�a")
public class ValidarContrase�a implements Validator {

	@Override
	public void validate(FacesContext context, UIComponent component, Object valor) throws ValidatorException {
		String attribute = (String) component.getAttributes().get("contrase�a");
		String confirmado = valor.toString();

		if (!confirmado.equals(attribute)) {
			FacesMessage message = new FacesMessage();
			message.setSummary("La contrase�a no coincide");
			message.setSeverity(FacesMessage.SEVERITY_ERROR);
			throw new ValidatorException(message);
		}

	}
}
