public class Product {
	private String code;
	private String name;
	private double unitPrice;
	private int quantity;
	private static int productCount = 0;

	public Product(String code, String name, double unitPrice) {
		this(code, name, unitPrice, 0);
	}

	public Product(String code, String name, double unitPrice, int quantity) {
		if (unitPrice <= 0) {
			throw new IllegalArgumentException("Unit price must be positive.");
		}
		if (quantity < 0) {
			throw new IllegalArgumentException("Quantity cannot be negative.");
		}

		this.code = code;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		productCount++;
	}

	public void restock(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Restock amount must be positive.");
		}
		quantity += amount;
	}

	public void sell(int amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Sell amount must be positive.");
		}
		if (amount > quantity) {
			throw new IllegalArgumentException("Not enough inventory available.");
		}
		quantity -= amount;
	}

	public double getInventoryValue() {
		return unitPrice * quantity;
	}

	public static int getProductCount() {
		return productCount;
	}

	@Override
	public String toString() {
		return "Product{" +
				"code='" + code + '\'' +
				", name='" + name + '\'' +
				", unitPrice=" + unitPrice +
				", quantity=" + quantity +
				'}';
	}
}
