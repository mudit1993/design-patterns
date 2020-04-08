package chainofresponsibility;

public class Request {

	private RequestType requestType;
	private long cost;

	public Request(RequestType requestType, long cost) {
		super();
		this.requestType = requestType;
		this.cost = cost;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	public long getCost() {
		return cost;
	}

}
