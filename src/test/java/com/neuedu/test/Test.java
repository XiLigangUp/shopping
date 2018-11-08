package com.neuedu.test;

import java.math.BigDecimal;

public class Test {

   public static void main(String[] args) {
        System.out.println(0.05+0.01);
        System.out.println(1.0-0.42);
        //一定是字符串类型
        BigDecimal bigDecimal=new BigDecimal("0.05");
        BigDecimal bigDecimal1=new BigDecimal("0.01");
        System.out.println(bigDecimal1.add(bigDecimal));
    }
}
