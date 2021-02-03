
public class Cheeseburger extends Eatables{
	
	public Cheeseburger() {
		super("Chesseburger", 0.12, 13);
	}

	@Override
	public void doCommand(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printYourself(Player player) {
		// TODO Auto-generated method stub
		System.out.println("Det finns cheese på menyn. ");
	}
}
