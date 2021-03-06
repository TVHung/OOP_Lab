package hust.soict.hedspi.mydate;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static int CompareTwoDate(String d1, String d2) throws ParseException {
		DateFormat df = new SimpleDateFormat("dd/mm/yyyy");
        Date date1 = new Date();
        Date date2 = new Date();

        date1 = df.parse(d1);
        date2 = df.parse(d2);

        if (date1.compareTo(date2) > 0) {
            return 1;
        } else if (date1.compareTo(date2) < 0) {
            return -1;
        }
        return 0;
	}
	
	public static void printCompareDate(String d1, String d2) throws ParseException {
		int i = CompareTwoDate(d1, d2);
		if(i == 1) {
			System.out.println(d1 + " after " + d2);
		}else if(i == -1) {
			System.out.println(d1 + " before " + d2);
		}else{
			System.out.println(d1 + " duplicate " + d2);
		}
	}
	
	public static void SortDate(String[] date) throws ParseException {
		for (int i = 0; i < date.length; i++) {
			for (int k = i+1; k < date.length; k++) {
				if(CompareTwoDate(date[i], date[k]) == 1) {
					String tmp = date[i];
					date[i] = date[k];
					date[k] = tmp;
				}
			}
		}
	}
}
