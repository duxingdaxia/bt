package com.test.controller.zTree;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.service.ZTree;

@Controller
@RequestMapping("/zTree")
public class LoginController {

	@Resource
	private ZTree ztree;
	
	@RequestMapping("/login.do")
	public String Login(){
		System.out.println("登录zTree控制器");
		return "zTree/lxztree";
	}
	
	@RequestMapping("/load.do")
	@ResponseBody
	public Object loadNodes(){
		System.out.println("载入zTree节点");
		Object o=ztree.loadNodes();
		
		return o; 
	}
}
