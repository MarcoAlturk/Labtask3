package org.example;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Locale;

public class I18Testing {
    public static void main(String[] args) {
        Locale deLocale = Locale.GERMANY;
        Locale usLocale = Locale.US;
        long number = 123456789L;
        NumberFormat denf = NumberFormat.getInstance(deLocale);
        NumberFormat usnf = NumberFormat.getInstance(usLocale);
        System.out.println(denf.format(number));
        System.out.println(usnf.format(number));

        Date now = new Date();
        DateFormat usdf = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, usLocale);
        DateFormat dedf =  DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, deLocale);
        System.out.println(usdf.format(now));
        System.out.println(dedf.format(now));
    }

}
