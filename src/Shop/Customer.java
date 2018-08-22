package Shop;

import java.util.Scanner;

/**
 * 顾客
 * 
 * @author asus
 *
 */
public class Customer {
	private String name;
	private String address;
	private String call;

	public Customer() {
		super();
	}

	public Customer(String name, String address, String call) {
		super();
		Scanner in = new Scanner(System.in);
		System.out.println("请输入收件人姓名");
		this.name = in.next();
		System.out.println("请输入收件人联系方式");
		this.call = in.next();
		System.out.println("请输入收件地址");
		this.address = in.next();
		
		
	
		
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", call=" + call + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCall() {
		return call;
	}

	public void setCall(String call) {
		this.call = call;
	}

}
