package com.kecode._2_array;

public class demo01 {
    public static void main(String[] args){
        String[] stringArray = new String[3]; // 各元素的值默认为null
        for (int i = 0; i < stringArray.length; i++) { // 对各元素进行初始化，但没有赋值。
            stringArray[i] = new String();
            System.out.println(stringArray[i]);
        }


        String foo="blue";
        boolean[] bar=new boolean[2];
        System.out.println(bar[0]);
        if(bar[0]){
            foo="green";
        }
        System.out.println(foo);
    }
}
