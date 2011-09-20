package prashant.tc.SRM519;

import java.util.Arrays;

//"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"
public class WhichDay {
	public String getDay() {
		String[] notOnThisDay={"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Saturday"};
		String[] s2 = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday",
				"Friday", "Saturday" };
		Arrays.sort(s2);
		Arrays.sort(notOnThisDay);
		// ArrayList<String> t1=new ArrayList<String>();

		// t1.addAll(s2);
		int i = 0;
		try {
			for (i = 0; i < s2.length; i++) {
				if (!s2[i].equalsIgnoreCase(notOnThisDay[i])) {
					break;
				}
			}
		} catch (Exception e) {
		}
		String s1 = new String();
		return s2[i];
	}
}
