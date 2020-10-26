import java.util.*;
public class Calex {
	public static void main(String[] args) {
		Calendar cal =Calendar.getInstance();
		System.out.println("The current date is" + cal.getTime());
		System.out.println("current Month =" + cal.getTime());
		cal.add(Calendar.DATE, -15);
		System.out.println("15 days ago:" +cal.getTime());
		cal.add(Calendar.MONTH, 4);
		System.out.println("4 months later:" + cal.getTime());
		cal.add(Calendar.YEAR, 2);
		System.out.println("2 year later:" + cal.getTime());
	}
}