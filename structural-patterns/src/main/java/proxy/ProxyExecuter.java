package proxy;

public class ProxyExecuter {

	public static void main(String[] args) {
		TwitterService twitterService = (TwitterService)SecurityProxy.newInstance(new TwitterServiceStub());
		System.out.println(twitterService.getTimeline("Any"));
	}

}
