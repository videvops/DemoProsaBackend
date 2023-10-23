package com.example.DemoPosaBackend.Utilities;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class FormatDate {

    public static final String FORMATO_STANDARD = "dd-MM-yyyy HH:mm:ss";

    public static final String FORMATO_SQL = "yyyy-MM-dd HH:mm:ss";
    public static Date formatStandardDateStringToDate(String fechaComoString) throws ParseException {
        if (fechaComoString.isBlank() || fechaComoString.isEmpty()) return null;
        SimpleDateFormat format = new SimpleDateFormat(FORMATO_SQL);
        try{
            return format.parse(fechaComoString);
        }catch (ParseException e){
            throw new ParseException("Error",1);
        }
    }

    public static String formatStandardDateToString(Date fechaComoDate) throws ParseException {
        String fechaJava = new java.util.Date(fechaComoDate.getTime()).toString();
        SimpleDateFormat format = new SimpleDateFormat(FORMATO_STANDARD);
        try {
            return format.parse(fechaJava).toString();

        }catch (ParseException e){
            return e.toString();
        }
    }
}
