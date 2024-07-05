package enteties;

import java.util.List;

public interface Cart {

	boolean isEmpty();

	void addProduct(Product productById);

	Product[] getProducts();

	void clear();
}
