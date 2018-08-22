package Shop;

public interface Option {

	void check();

	void add(Store store, int count);

	void delete(Store store, int count);

	void change(Store store, int count);

}
