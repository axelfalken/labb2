
public abstract class Tool extends Item {

	public Tool(String name, double weight, int price) {
		super(name, weight, price);
	}
	
	public abstract void use(Player player);

	@Override
	public abstract void doCommand(String string);

	@Override
	public abstract void printYourself();
}
