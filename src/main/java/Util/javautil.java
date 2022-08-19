package Util;

import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class javautil {
    public static String randomNum(){
        Random r=new Random();
        int rn=r.nextInt(100);
        String id = Integer.toString(rn);
        return id;
    } 

    public static String randonString(){
        String rs=RandomStringUtils.randomAlphabetic(18);
        return rs;
    }
}
