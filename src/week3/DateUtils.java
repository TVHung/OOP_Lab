package week3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
	public static int CompareTwoDate(String d1, String d2) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date date1 = null;
        Date date2 = null;

        try {
            date1 = dateFormat.parse(d1);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        try {
            date2 = dateFormat.parse(d2);

        } catch (ParseException e) {
            e.printStackTrace();
        }

        assert date1 != null;
        assert date2 != null;
        if (date1.compareTo(date2) > 0) {
            return 1;
        } else if (date1.compareTo(date2) < 0) {
            return -1;
        }
        return 0;
	}
	
	public void SortDate(String[] date) {
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
