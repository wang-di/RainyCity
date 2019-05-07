package com.wd.xyf.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @ClassName Test
 * @Description TODO
 * @Author wangdi
 * @Date 2019/2/18 20:10
 * @Version 1.0
 **/
public class Test {

	private static String reg = "(\\d{4}([-/.．])\\d{1,2})?";

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile(reg);
		Matcher matcher = pattern.matcher("2018.1");
		System.out.println(matcher.matches());
		System.out.println(matcher.groupCount());
		for (int i = 0; i < matcher.groupCount(); i++) {
			System.out.println(matcher.group(i));
		}
	}
}
