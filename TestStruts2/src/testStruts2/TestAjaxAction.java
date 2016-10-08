package testStruts2;

import com.opensymphony.xwork2.ActionSupport;


public class TestAjaxAction extends ActionSupport{
	private String i1;
	private String i2;
	private String i3;
	private String i4;
	
	private String i11;
	private String i22;
	private String i33;
	private String i44;
	
	public String getI11() {
		return i11;
	}

	public void setI11(String i11) {
		this.i11 = i11;
	}

	public String getI22() {
		return i22;
	}

	public void setI22(String i22) {
		this.i22 = i22;
	}

	public String getI33() {
		return i33;
	}

	public void setI33(String i33) {
		this.i33 = i33;
	}

	public String getI44() {
		return i44;
	}

	public void setI44(String i44) {
		this.i44 = i44;
	}

	public String getI1() {
		return i1;
	}

	public void setI1(String i1) {
		this.i1 = i1;
	}

	public String getI2() {
		return i2;
	}

	public void setI2(String i2) {
		this.i2 = i2;
	}

	public String getI3() {
		return i3;
	}

	public void setI3(String i3) {
		this.i3 = i3;
	}

	public String getI4() {
		return i4;
	}

	public void setI4(String i4) {
		this.i4 = i4;
	}

	public String testA(){
		
		setI11(i1);
		setI22(i2);
		setI33(i3);
		setI44(i4);
		System.out.println(i1+";"+i2+";"+i3+";"+i4+".");
		return "success";
	}

}
