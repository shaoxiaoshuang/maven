package org.sxs.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName: DateUtil
 * @Description: TODO
 * @Author: SXS
 * @date: 2020/12/9 12:14
 * @Version: V1.0
 */
public class DateUtil {

    //字符串转日期类型
    public static Date stringToDate(String pattern,String str){
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        try {
            return  sf.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }


    //日期转字符串
    public static String dateToString(String pattern, Date date){
        SimpleDateFormat sf = new SimpleDateFormat(pattern);
        return sf.format(date);
    }
}

