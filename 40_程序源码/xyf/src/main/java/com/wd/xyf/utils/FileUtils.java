package com.wd.xyf.utils;

/**
 * @ClassName FileUtils
 * @Description 文件操作工具类
 * @Author wangdi
 * @Date 2019/1/18 17:54
 * @Version 1.0
 **/
public class FileUtils {

	/**
	 * @Author wangdi
	 * @Description 获取文件名后缀
	 * @Date 2019/1/18 17:55
	 * @return java.lang.String
	 **/
	public static String getSuffix(String fileName) {
		int index = fileName.lastIndexOf(".");
		if (index != -1) {
			return fileName.substring(index);
		}
		return "";
	}
}
