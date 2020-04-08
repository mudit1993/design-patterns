package abstractfactory;

public class AmexValidator implements Validator{

	@Override
	public Boolean validate(CardType cardType) {
		return true;
	}

}
