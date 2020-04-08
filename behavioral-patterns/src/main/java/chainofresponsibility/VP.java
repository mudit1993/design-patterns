package chainofresponsibility;

public class VP extends Handler {

	@Override
	public void handleRequest(Request request) {
		if(request.getRequestType() == RequestType.PURCHASE) {
			if(request.getCost() < 20000) {
				System.out.println("VP approves the request");
			}
			else {
				successor.handleRequest(request);
			}
		}
	}

}
