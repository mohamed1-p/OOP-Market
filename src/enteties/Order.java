package enteties;

import java.io.Serializable;
import java.util.List;

public interface Order extends Serializable{
	boolean isCreditCardNumberValid(String userInput);

	void setCreditCardNumber(String userInput);

	void setProducts(Product[] products);

	void setCustomerId(int customerId);
	
	int getCustomerId();
}
