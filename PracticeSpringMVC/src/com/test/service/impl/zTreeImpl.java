package com.test.service.impl;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.filechooser.FileSystemView;

import org.springframework.stereotype.Service;

import com.test.service.ZTree;

@Service("ZTree")
public class zTreeImpl implements ZTree {
	
	public List loadNodes() {
		System.out.println("����ڵ���Ϣ��");
		List l = new ArrayList();
		l.add("");
		return l;
	}

	public void setTitle(String title, String nodeId) {
		System.out.println("�޸Ľڵ�"+nodeId+"����Ϊ��"+title);
		/*
		try {
			SimpleDateFormat sdf =new SimpleDateFormat("");
			Date date =new Date();
			FileSystemView fsv = FileSystemView.getFileSystemView();
			File com=fsv.getHomeDirectory();    //����Ƕ�ȡ����·���ķ�����
			System.out.println(com.getPath()); 
			FileOutputStream fos=new FileOutputStream("pw1.txt");
			OutputStreamWriter osw=new OutputStreamWriter(fos,"GBK");
			PrintWriter pw=new PrintWriter(osw);
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
		
	}

	public void delNode(String nodeId) {
		System.out.println("ɾ���ڵ�"+nodeId);
		
	}

}
