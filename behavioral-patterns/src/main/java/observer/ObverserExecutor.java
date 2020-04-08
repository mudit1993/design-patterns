package observer;

public class ObverserExecutor {
	public static void main(String[] args) {
		Subject messages = new MessageStream();

		PhoneClient phoneObserver = new PhoneClient(messages);
		TabletClient tabletObserver = new TabletClient(messages); // internally registers to the subject in the
																	// constructor

		phoneObserver.addMessage("This is a sample message");
		tabletObserver.addMessage("This is another message");

	}

}
