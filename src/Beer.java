
public class Beer extends Eatables {

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
		if (player.getLocation().getName().toLowerCase() == "flamman"
				|| player.getLocation().getName().toLowerCase() == "k�rallen") {
			System.out.println("Det finns kall �l i baren. ");
		} else {
			System.out.println("I ett h�rn finns en systemetp�se med varm �l. ");
		}
		
	}
}
