package Shop;

/**
 * 商品列表
 * 
 * @author asus
 *
 */
public class Table {

	public Store[] st = {

			new Store("1001", "水晶柠檬", 15.8),
			new Store("1002", "琥珀核桃", 23.7), 
			new Store("1003", "东北松子", 25.8),
			new Store("1004", "夏威夷果", 22.5),
			new Store("1005", "巴旦木", 18.6)

	};




	public Table() {
		System.out.println("商品编号\t"+"商品名\t\t"+"单价\t");
		for (int i = 0; i < st.length; i++) {
			System.out.println(st[i].getId()+"\t\t"+st[i].getName()+"\t"+st[i].getPrice());
		}
	}

	public static void main(String[] args) {
		new Table();
	}



}
