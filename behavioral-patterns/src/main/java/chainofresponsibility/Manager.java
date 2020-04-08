package chainofresponsibility;

public class Manager extends Handler {

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.CONFERENCE) {
			System.out.println("Manager approves the request");

		} else {
			successor.handleRequest(request);
		}

	}

}
