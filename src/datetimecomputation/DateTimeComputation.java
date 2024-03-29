package datetimecomputation;

import java.util.Calendar;

public class DateTimeComputation {
    public static void main(String[] args) {
        addTwoDates();
    }
    
    public static void addTwoDates(){
        System.out.println("===Add Two Dates===");
        Calendar c1 = Calendar.getInstance();
        Calendar c2 = Calendar.getInstance();
        Calendar cTotal = (Calendar) c1.clone();
        cTotal.add(Calendar.YEAR, c2.get(Calendar.YEAR));
        cTotal.add(Calendar.MONTH, c2.get(Calendar.MONTH) + 1); // Zero-based months
        cTotal.add(Calendar.DATE, c2.get(Calendar.DATE));
        cTotal.add(Calendar.HOUR_OF_DAY, c2.get(Calendar.HOUR_OF_DAY));
        cTotal.add(Calendar.MINUTE, c2.get(Calendar.MINUTE));
        cTotal.add(Calendar.SECOND, c2.get(Calendar.SECOND));
        cTotal.add(Calendar.MILLISECOND, c2.get(Calendar.MILLISECOND));
        System.out.format("%s + %s = %s", c1.getTime(), c2.getTime(), cTotal.getTime());
        System.out.println("\n===================");
    }
}
