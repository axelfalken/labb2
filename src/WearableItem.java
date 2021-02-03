
public abstract class WearableItem extends Item{
	private boolean isWearing;
	
	public WearableItem(String name, double weight, int price) {
		super(name, weight, price);
		this.setWearing(false);
	}
	
	public void putOn(){
		this.setWearing(true);
	}

	@Override
	public abstract void doCommand(String string);

	@Override
	public abstract void printYourself();

	public boolean isWearing() {
		return isWearing;
	}

	public void setWearing(boolean isWearing) {
		this.isWearing = isWearing;
	}
}
