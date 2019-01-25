package com.wd.xyf.base;

import org.springframework.data.domain.Sort;

import java.io.Serializable;

/**
 * @ClassName BaseEntity
 * @Description 基础实体类
 * @Author wangdi
 * @Date 2019/1/23 16:41
 * @Version 1.0
 **/
public class BaseEntity implements Serializable {

	//分页页码，默认页码为1
	protected int page = 1;

	//每页数量，默认20
	protected int size = 20;

	//排序列名称，默认为c_id
	protected String sidx = "id";

	//排序规则
	protected Sort.Direction sort = Sort.Direction.ASC;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getSidx() {
		return sidx;
	}

	public void setSidx(String sidx) {
		this.sidx = sidx;
	}

	public Sort.Direction getSort() {
		return sort;
	}

	public void setSort(Sort.Direction sort) {
		this.sort = sort;
	}
}
