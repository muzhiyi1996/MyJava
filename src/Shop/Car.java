package Shop;

/**
 * 购物车
 */
import java.util.ArrayList;

public class Car implements Option {
	private double sunPrice;
	private ArrayList<Store> al = new ArrayList();

	// 增加
	@Override
	public void add(Store store, int count) {
		if (al.size() == 0) {
			al.add(store);
			store.setCount(count);
			this.setSunPrice(this.getSunPrice() + store.getPrice() * count);
		} else {
			if (al.contains(store)) {
				int u = al.indexOf(store);
				al.get(u).setCount(al.get(u).getCount() + count);
				this.setSunPrice(this.getSunPrice() + store.getPrice() * count);
			} else {
				al.add(store);
				store.setCount(count);
				this.setSunPrice(this.getSunPrice() + store.getPrice() * count);
			}
		}
	}

	// 删除
	@Override
	public void delete(Store store, int count) {
		if (!al.contains(store)) {
			System.out.println("对不起，购物车中没有该商品");
		} else if (al.get(al.indexOf(store)).getCount() < count) {
			System.out.println("对不起，您的购物车只有" + al.get(al.indexOf(store)).getCount() + "件该商品");
		} else if (al.get(al.indexOf(store)).getCount() == count) {
			al.remove(al.indexOf(store));
		} else {
			al.get(al.indexOf(store)).setCount(al.get(al.indexOf(store)).getCount() - count);
			this.setSunPrice(this.getSunPrice() - store.getPrice() * count);
		}


	}

	// 改
	@Override
	public void change(Store store, int count) {
		if (!al.contains(store)) {
			System.out.println("对不起，购物车中没有该商品");
		} else {
			this.setSunPrice(store.getPrice() * count);

		}


	}

	// 查
	@Override
	public void check() {
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
	}

	// @Override
	// public String toString() {
	// return "Car [al=" + al + "]";
	// }

	public double getSunPrice() {
		return sunPrice;
	}

	public void setSunPrice(double sunPrice) {
		this.sunPrice = sunPrice;
	}

	public ArrayList<Store> getAl() {
		return al;
	}

	public void setAl(ArrayList<Store> al) {
		this.al = al;
	}

}
