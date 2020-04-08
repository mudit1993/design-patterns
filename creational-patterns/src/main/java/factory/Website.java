package factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Website {

	protected List<Page> pages = new ArrayList<Page>();

	public List<Page> getPages() {
		return pages;
	}

	public Website() {
		createWebsite();
	}

	public abstract void createWebsite(); // contract hook for the subclasses to implement their own custom website
}
	