package com.edusys.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class XDate {
    
    static SimpleDateFormat formatDate = new SimpleDateFormat();
    
    
    
    /**
     * Chuyển đổi String sang Date
     * @param date là String cần chuyển
     * @param pattern là định dạng thời gian
     */
    public static Date toDate(String date, String pattern) {
        try {
            formatDate.applyPattern(pattern);
            return formatDate.parse(date);
        } 
        catch (ParseException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    
    
    /**
     * Chuyển đổi từ Date sang String
     * @param date là Date cần chuyển đổi
     * @param pattern là định dạng thời gian
     */
    public static String toString(Date date, String pattern) {
        formatDate.applyPattern(pattern);
        return formatDate.format(date);
    }
}