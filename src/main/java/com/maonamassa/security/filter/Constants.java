package com.maonamassa.security.filter;

import java.util.concurrent.TimeUnit;

public class Constants {
    public static final String SECRET = "secret";
    public static final String TOKEN_PREFIX = "Bearer";
    public static final String HEADER_STRING = "Authorization";
    public static final long EXPIRANTION_TIME = 86400000L; // 1 Day

    public static void main(String[] args){
        System.out.println(TimeUnit.MILLISECONDS.convert(1,TimeUnit.DAYS));
    }
}
