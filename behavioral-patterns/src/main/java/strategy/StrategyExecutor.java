package strategy;

public class StrategyExecutor {

	public static void main(String[] args) {
		
		
		CreditCard card = new CreditCard(new AmexStrategy());
		card.setCvv("212");
		card.setDate("04/2020");
		card.setNumber("379185883464283");
		System.out.println("Is Amex Card Valid : " + card.isValid());
		
		card.setNumber("379185883464282");
		System.out.println("Is Amex Card Valid : " + card.isValid());
		
		CreditCard visaCard = new CreditCard(new VisaStrategy());
		visaCard.setCvv("212");
		visaCard.setDate("04/2020");
		visaCard.setNumber("4539589763663402");
		System.out.println("Is Visa Card Valid : " + visaCard.isValid());
	}

}
