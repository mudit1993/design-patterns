package abstractfactory;

public class AmexPlatinumValidator implements Validator {

	@Override
	public Boolean validate(CardType cardType) {
		return true;
	}

}
