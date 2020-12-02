package com.kecode._1_basic;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * 从键盘分别输入年、月、日，判断这一天是当年的第几天
 * <p>
 * 需要注意的是，在switch语句中的表达式只能是byte、short、char、int类型的值，如果传入其它类型的值，程序会报错
 * swtich.JDK1.7新加入了String类型。
 */
public class basic_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入year: ");
        int year = scanner.nextInt();
        System.out.println("输入month: ");
        int month = scanner.nextInt();
        System.out.println("输入day: ");
        int day = scanner.nextInt();
        int sumDay = 0;
        switch (month) {
            case 12:
                sumDay += 30;
            case 11:
                sumDay += 31;
                System.out.println(sumDay);
            case 10:
                sumDay += 30;
                System.out.println(sumDay);
            case 9:
                sumDay += 31;
                System.out.println(sumDay);
            case 8:
                sumDay += 31;
                System.out.println(sumDay);
            case 7:
                sumDay += 30;
            case 6:
                sumDay += 31;
            case 5:
                sumDay += 30;
            case 4:
                sumDay += 31;
            case 3:
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
                    sumDay += 29;
                else
                    sumDay += 28;
            case 2:
                sumDay += 31;
            case 1:
                sumDay += day;
                System.out.println(sumDay);

        }
        System.out.println(year + "年" + month + "月" + day + "日是今年的第" + sumDay + "天");
    }


    /**
     * 获取某日是那一年的第几天
     * 省略了参数校验
     *
     * @param year
     * @param month
     * @param dayOfMonth
     */
    private static long getDayOfYear(int year, int month, int dayOfMonth) {
        LocalDate localDate = LocalDate.of(year, 1, 1);
        LocalDate localDate2 = LocalDate.of(year, month, dayOfMonth);
        return localDate.until(localDate2, ChronoUnit.DAYS) + 1;
    }
}
