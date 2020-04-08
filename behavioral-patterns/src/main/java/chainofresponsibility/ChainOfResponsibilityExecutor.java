package chainofresponsibility;

public class ChainOfResponsibilityExecutor {

	public static void main(String[] args) {
		CEO mukesh = new CEO();
		VP lokesh = new VP();
		Manager vijay = new Manager();
		
		vijay.setSuccessor(lokesh);
		lokesh.setSuccessor(mukesh);
		
		Request requestConf = new Request(RequestType.CONFERENCE, 220000l);
		Request requestPurchaseOne = new Request(RequestType.PURCHASE, 220000l);
		Request requestPurchaseTwo = new Request(RequestType.PURCHASE, 2200l);
		vijay.handleRequest(requestConf);
		vijay.handleRequest(requestPurchaseOne);
		vijay.handleRequest(requestPurchaseTwo);

	}

}
