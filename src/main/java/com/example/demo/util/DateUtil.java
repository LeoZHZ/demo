package com.example.demo.util;

import org.apache.commons.lang.time.DateUtils;

import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class DateUtil {

    /**
     * 通过时间秒毫秒数判断两个时间的间隔
     *
     * @param date1
     * @param date2
     * @return
     */
    public static int differentDaysByMillisecond(java.util.Date date1, java.util.Date date2) {
        int days = (int) ((date2.getTime() - date1.getTime()) / (1000 * 3600 * 24));
        return days;
    }

    public static String timeStampToNowDate(long timeStamp) {
        Date date = new Date(timeStamp);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateStr = simpleDateFormat.format(date);
        return dateStr;
    }

    public static String timeStampToNowTime(long timeStamp) {
        Date date = new Date(timeStamp);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        String dateStr = simpleDateFormat.format(date);
        return dateStr;
    }

    public static void main(String[] args) {
        System.out.println(timeStampToNowDate(System.currentTimeMillis()));
    }
    public static String lastMonthDate() {
        java.util.Date dateUtil = new java.util.Date();
        java.util.Date backupTime = DateUtils.addMonths(dateUtil, -1);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");

        return sdf.format(backupTime);
    }

    public static Timestamp GetBirthDate(String age) {
        int year = 0;
        int month = 0;
        int day = 0;
        if (age.contains("岁")) {
            year = Integer.parseInt(age.substring(0, age.indexOf("岁")));
        }

        if (age.contains("月")) {
            if (age.contains("岁"))
                month = Integer.parseInt(age.substring(age.indexOf("岁") + 1, age.indexOf("月")));
            else
                month = Integer.parseInt(age.substring(0, age.indexOf("月")));
        }

        if (age.contains("天")) {
            if (age.contains("月")) {
                day = Integer.parseInt(age.substring(age.indexOf("月") + 1, age.indexOf("天")));
            } else if (age.contains("岁")) {
                day = Integer.parseInt(age.substring(age.indexOf("岁") + 1, age.indexOf("天")));
            } else {
                day = Integer.parseInt(age.substring(0, age.indexOf("天")));
            }
        }

        System.out.println(year + " " + month + " " + day);

        Calendar mycalendar = Calendar.getInstance();//获取现在时间
        String getYear = String.valueOf(mycalendar.get(Calendar.YEAR));//获取年份
        int birthYear = Integer.parseInt(getYear) - year;
        Timestamp date = new Timestamp(birthYear, 0, 0, 0, 0, 0, 0);
        return date;
    }

    public static Timestamp toTimestamp(String strDate) {
        if (strDate.contains(":")) {
            return Timestamp.valueOf(strDate);
        } else {
            Timestamp timestamp = new Timestamp(Date.valueOf(strDate).getTime());
            return timestamp;
        }
    }

    public static Timestamp toTimestampEnd(String strDate) {
        if (!strDate.contains(":")) {
            strDate += " 23:59:59";
            return Timestamp.valueOf(strDate);
        }

        return Timestamp.valueOf(strDate);
    }

    public static long Now() {
        java.util.Date dateUtil = new java.util.Date();
        return dateUtil.getTime();
    }

    public static String NowDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        java.util.Date dateUtil = new java.util.Date();
        return sdf.format(dateUtil);
    }

    public static String NowMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
        java.util.Date dateUtil = new java.util.Date();
        return sdf.format(dateUtil);
    }

    public static String NowDateAndTime() {
        return NowDate() + " " + NowTime();
    }

    public static java.util.Date StringToDate(String dateTime, String formatType) {
        DateFormat format1 = new SimpleDateFormat(formatType);
        java.util.Date date = null;
        try {
            date = format1.parse(dateTime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    public static String DateToString(java.util.Date date, String formatType) {
        SimpleDateFormat sdf = new SimpleDateFormat(formatType);
        return sdf.format(date);
    }

    public static String NowDateStrim() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
        java.util.Date dateUtil = new java.util.Date();
        return sdf.format(dateUtil);
    }

    public static String NowTime() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        java.util.Date dateUtil = new java.util.Date();
        return sdf.format(dateUtil);
    }

    public static String NowTimeStrim() {
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        java.util.Date dateUtil = new java.util.Date();
        return sdf.format(dateUtil);
    }

    public static String ToFormatDate(String date) {
        if (date.length() >= 8) {
            String newDate = date.substring(2, 8);
            String rex = "(.{2})";
            newDate = newDate.replaceAll(rex, "$1-");
            newDate = newDate.substring(0, newDate.length() - 1);
            newDate = date.substring(0, 2) + newDate;
            date = newDate;
        }

        return date;
    }

    public static String ToFormatTime(String time) {

        if (time.length() >= 6) {
            time = time.substring(0, 6);
            String rex = "(.{2})";
            time = time.replaceAll(rex, "$1:");
            time = time.substring(0, time.length() - 1);

            //		java.util.Date dateUtil = new java.util.Date();
            //		date.
        }

        return time;
    }

    public static long between(String startDate, String endDate) {
        if (StringUtils.isBlank(startDate) || StringUtils.isBlank(endDate)) {
            return -1;
        }
        SimpleDateFormat smdf = new SimpleDateFormat("yyyy-MM-dd");
        long between = 0;
        try {
            java.util.Date start = smdf.parse(startDate);
            java.util.Date end = smdf.parse(endDate);
            between = (end.getTime() - start.getTime()) / (3600 * 24 * 1000);
            System.out.println(between);
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return between;
    }

    public static boolean isGreaterThanTime(String time) {
        boolean flag = false;
        java.util.Date nowDate = new java.util.Date();
        java.util.Date pastDate = null;
        //格式化日期
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        //在日期字符串非空时执行
        if (time != null && !"".equals(time)) {
            try {
                //将字符串转为日期格式，如果此处字符串为非合法日期就会抛出异常。
                pastDate = sdf.parse(time);
                //调用Date里面的before方法来做判断
                flag = pastDate.before(nowDate);

            } catch (ParseException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("日期参数不可为空");
        }
        return flag;
    }

    public static java.util.Date parse(String strDate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-DD"); //定义日期格式
        return sdf.parse(strDate);  //字符串转换为Date格式
    }

    //根据日期换算年龄
    public static int getAge(java.util.Date date) throws ParseException {
        //java提供的日期类，因为是抽象类并且构造方法是protected，所以api提供了getInstance()来创建对象
        Calendar cal = Calendar.getInstance();

        if (cal.before(date)) { // before()日期是否在比较的日期之前，是true，否false
            throw new IllegalArgumentException("现在是你的生日!");
        }
        //当前的年月日
        int yearNow = cal.get(Calendar.YEAR);  //年
        int monthNow = cal.get(Calendar.MONTH);  //月
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); //日

        cal.setTime(date);
        //传入的年月日
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        //当前年-传入的年份
        int age = yearNow - yearBirth;
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;
            } else {
                age--;
            }
        }
        return age;
    }
}
