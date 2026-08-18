package com.interviewprep.java8;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

//@FunctionalInterface    // FunctionalInterface annotation is commented because extending another functional interface (TestInterface) makes this existing Functional Interface (UpiPayment) as normal Interface (Not Functional Interface anymore)
public interface UpiPayment extends TestInterface {

    String doPayment(String source, String destination);

    default double getScratchCards() {
        return new Random().nextDouble();
    }

    static String datePatterns(String pattern) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        return dateFormat.format(new Date());
    }

}
