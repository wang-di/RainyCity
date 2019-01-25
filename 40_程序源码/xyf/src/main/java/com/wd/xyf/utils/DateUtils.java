package com.wd.xyf.utils;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @ClassName DateUtils
 * @Description 日期工具类
 * @Author wangdi
 * @Date 2019/1/17 17:21
 * @Version 1.0
 **/
public class DateUtils {

	/**
	 * @Author wangdi
	 * @Description 获取当前日期 默认yyyy-MM-dd HH:mm:ss
	 * @Date 2019/1/17 17:26
	 * @return java.util.Date
	 **/
	public static String getCurrDate() {
		return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
	}

	/**
	 * @Author wangdi
	 * @Description 获取当前时间戳
	 * @Date 2019/1/17 17:25
	 * @return java.sql.Timestamp
	 **/
	public static Timestamp getCurrTime() {
		return new Timestamp(System.currentTimeMillis());
	}
}
