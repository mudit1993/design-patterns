package abstractfactory;

public abstract class CreditCardFactory {

	public static CreditCardFactory getCreditCardFactory(int creditScore) {
		if (creditScore > 650) {
			return new AmexCreditCardFactory();
		} else {
			return new VisaCreditCardFactory();
		}
	}

	public abstract CreditCard getCreditCard(CardType cardType);

	public abstract Validator getValidator(CardType cardType);

}
