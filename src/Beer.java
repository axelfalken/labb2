
public class Beer extends Eatables{
	
	public Beer() {
		super("Beer", 0.5, 43);
	}

	@Override
	public void doCommand(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printYourself(Player player) {
		// TODO Auto-generated method stub
		
		System.out.println("Det finns kall öl som bör drickas");
	}
}
