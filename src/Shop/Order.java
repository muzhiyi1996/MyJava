package Shop;

import java.util.Scanner;

/**
 * 订单
 * 
 * @author asus
 *
 */
public class Order {
	public Order(Start start, Car car, Customer customer) {
		Scanner in = new Scanner(System.in);
		System.out.println("请输入收件人姓名");
		customer.setName(in.next());
		System.out.println("请输入收件人联系方式");
		customer.setCall(in.next());
		System.out.println("请输入收件地址");
		customer.setAddress(in.next());
		System.out.println("下单中········");
		System.out.println("----------订单信息-----------");
		for (int i = 0; i < car.getAl().size(); i++) {
			System.out.println(car.getAl().get(i).getName() + "\t" + "件数" + "*" + car.getAl().get(i).getCount() + "\t"
					+ "单项总价：" + car.getAl().get(i).getCount() * car.getAl().get(i).getPrice());
		}
		System.out.println("订单总价：" + car.getSunPrice());
		System.out.println("收件人："+customer.getName());
		System.out.println("联系方式："+customer.getCall());
		System.out.println("收件地址："+customer.getAddress());

	}

}
