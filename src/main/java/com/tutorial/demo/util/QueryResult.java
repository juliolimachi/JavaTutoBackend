package com.tutorial.demo.util;

import java.util.List;

public class QueryResult {

	private int totalRecors;
	private List<Object> list;
	
	public int getTotalRecors() {
		return totalRecors;
	}
	public List<Object> getList() {
		return list;
	}
	public void setTotalRecors(int totalRecors) {
		this.totalRecors = totalRecors;
	}
	public void setList(List<Object> list) {
		this.list = list;
	}
	
}
