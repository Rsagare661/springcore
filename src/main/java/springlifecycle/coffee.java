package springlifecycle;

public class coffee {
   private double price;

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public coffee() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "coffee [price=" + price + "]";
}
   
public void init() {
	System.out.println("inside init method");
}

public void destroy() {
	System.out.println("inside destroy method");
}





}
