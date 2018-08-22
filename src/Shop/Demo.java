package Shop;

public class Demo {

	public static void main(String[] args) {
		Car car = new Car();
		Start start = new Start(car);
		Customer customer = new Customer();
		Order order = new Order(start,car,customer);
	}

}
