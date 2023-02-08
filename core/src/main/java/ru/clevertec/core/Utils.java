package ru.clevertec.core;

import ru.clevertec.utils.StringUtils;

public class Utils {
    private Utils(){}
    public static boolean isAllPositiveNumbers(String... str) {
         for(String s: str) {
             if(!StringUtils.isPositiveNumber(s)) {
             	return false;
             }
         }
         
         return true;
    }

}
