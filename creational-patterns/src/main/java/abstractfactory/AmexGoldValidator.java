package abstractfactory;

public class AmexGoldValidator implements Validator {

	@Override
	public Boolean validate(CardType cardType) {
		return true;
	}

}
