package abstractfactory;

public class AbstractFactoryExecutor {

	public static void main(String[] args) {
		CreditCardFactory abstractFactory = CreditCardFactory.getCreditCardFactory(695);
		CreditCard creditCard = abstractFactory.getCreditCard(CardType.GOLD);
		System.out.println(creditCard.getClass());
		abstractFactory = CreditCardFactory.getCreditCardFactory(500);
		creditCard = abstractFactory.getCreditCard(CardType.PLATINUM);
		System.out.println(creditCard.getClass());

	}

}
