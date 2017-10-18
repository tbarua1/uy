package record_update;

public class Product {
	private int productId;
	private String proName;
	private double price;

    Product() {
        System.out.println("i am from Constructor"); //To change body of generated methods, choose Tools | Templates.
    }
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProName() {
		return proName;
	}
	public void setProName(String proName) {
		this.proName = proName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((proName == null) ? 0 : proName.hashCode());
		result = prime * result + productId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (proName == null) {
			if (other.proName != null)
				return false;
		} else if (!proName.equals(other.proName))
			return false;
		if (productId != other.productId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", proName=" + proName + ", price=" + price + "]";
	}
	public Product(int productId, String proName, double price) {
		super();
		this.productId = productId;
		this.proName = proName;
		this.price = price;
	}
	
}
