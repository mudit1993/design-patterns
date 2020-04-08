package abstractfactory;

public class VisaValidator implements Validator {

	@Override
	public Boolean validate(CardType cardType) {
		return true; 
	}

}
