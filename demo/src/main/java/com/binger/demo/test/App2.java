package com.binger.demo.test;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class App2 {
 
 public static void main(String[] args) {
 String val = checkNumber("10.1234155", 2, 6).toString();
 System.out.println(val);
 }
 
 public static BigDecimal checkNumber(String number, int min, int max) {
 // 初始化为max位小数
 DecimalFormat df = new DecimalFormat(getMaxStr(max));
 String num = df.format(Double.parseDouble(number));
 BigDecimal bd = new BigDecimal(num);
 String val = bd.toString();
 val = val.replaceAll("^(0+)", "");
 val = val.replaceAll("(0+)$", "");
 int idx = val.indexOf(".");
 int len = val.substring(idx + 1).length();
 if (len < min) {
  if (len == 0 && idx == 0) {
  bd = new BigDecimal("0.00");
  } else {
  bd = new BigDecimal(val).setScale(2);
  }
 } else {
  bd = new BigDecimal(val).setScale(len);
 }
 return bd;
 }
 
 public static String getMaxStr(int max) {
 String val = "0.";
 for (int i = 0; i < max; i++) {
  val += "0";
 }
 return val;
 }
}