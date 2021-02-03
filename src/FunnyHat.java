
public class FunnyHat extends WearableItem {
	
	public FunnyHat() {
		super("Rolig hatt", 0.8, 160);
	}

	@Override
	public void doCommand(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printYourself(Player player) {
		// TODO Auto-generated method stub
		System.out.println("På hatthyllan ligger en extremt rolig hatt. ");
	}
}
