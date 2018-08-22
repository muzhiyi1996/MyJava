package Shop;

import org.apache.commons.collections.MultiMap;

//商品
public class Store {
	private String id;
	private String name;
	private double price;
	private int count;
	private MultiMap style;

	public MultiMap getStyle() {
		return style;
	}

	public void setStyle(MultiMap style) {
		this.style = style;
	}

	/**
	 * @param id
	 * @param name
	 * @param price
	 */
	public Store(String id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Store other = (Store) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "Store [id=" + id + ", name=" + name + ", price=" + price + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {

		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
