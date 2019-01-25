package com.wd.xyf.test;

import org.junit.Test;

import java.sql.SQLOutput;

/**
 * @ClassName FormatTest
 * @Description
 * @Author wangdi
 * @Date 2019/1/22 9:57
 * @Version 1.0
 **/
public class FormatTest {

	@Test
	public void formatSql() {
		String sql = "update T_TASKITEM set N_CHECKRESULT = ? where C_BH in ( %s ) ";
		String cond = "?,?,?";
		System.out.println(String.format(sql, cond));

	}

}
