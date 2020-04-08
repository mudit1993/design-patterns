package bridge.movie;

import java.util.List;

public class PrintFormatter implements Formatter {

	public String format(String header, List<Detail> details) {
		StringBuilder builder = new StringBuilder();
		builder.append(header).append("\n");

		for (Detail detail : details) {
			builder.append(detail.getLabel()).append(" : ").append(detail.getValue()).append("\n");
		}

		return builder.toString();
	}

}
