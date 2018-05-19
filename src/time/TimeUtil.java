package time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {
    public static long transDate(String str) {
    	SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    	Date parse=null;
    	try {
    		parse=simpleDateFormat.parse(str);
    	}
    	catch(ParseException e) {
    		return -1;
    	}
    	long time=parse.getTime();
    	return time;
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="2016-11-29 00:02:07";
        System.out.println(transDate(str));
	}

}
