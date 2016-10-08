package testStruts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloAction extends ActionSupport{

	public final static String MESSAGE = "Struts2 is up and running ...";
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String execute(){
		
		System.out.println((int)(Math.random()*100));
		System.out.println((int)(Math.random()*10));
		setMessage(MESSAGE);
		return "success";
	}
}
