

public abstract class Item {
	private String name;
	private double weight;
	private int price;
	
	public Item(String name, double weight, int price) {
		this.name = name;
		this.weight = weight;
		this.price = price;
	}
	
	public abstract void doCommand(String string);
	
	public abstract void printYourself(Player player);

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
