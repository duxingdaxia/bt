package com.test.service;

import java.util.List;

public interface ZTree {

	public List loadNodes();
	public void setTitle(String title,String nodeId);
	public void delNode(String nodeId);
	
}
