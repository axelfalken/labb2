
public class Ticket extends Tool {

	public Ticket() {
		super("Biljett", 0.2, 200);
	}

	public void use(Player player) {

		if (player.getLocation().getName() == "k�rallen" || player.getLocation().getName() == "flamman") {
			System.out.println("Vakten tog emot biljetten, v�lkommen in!");
			
			// Vill ha en metod som tar bort biljetten i Players itemarray?
			
		} else {
			System.out.println("Du kan inte l�mna in biljetten h�r.");
		}
	}

	@Override
	public void doCommand(String string) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printYourself() {
		// TODO Auto-generated method stub
		
	}
}
