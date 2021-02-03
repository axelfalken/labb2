
public abstract class Eatables extends Item {
	
	public Eatables(String name, double weight, int price) {
		super(name, weight, price);
	}
	
	@Override
	public abstract void doCommand(String string);

	@Override
	public abstract void printYourself();

}
