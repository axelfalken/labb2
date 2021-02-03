import java.util.ArrayList;

public class Player {
	private String name;
	private Location position;
	private int cash;
	private double promille;
	private ArrayList<Item> items;

	public Player(String name, Location location) {
		// TODO Auto-generated constructor stub
		this.setName(name);
		this.position = location;
		this.setCash(500);
		this.setPromille(0.0);
		this.items = new ArrayList<Item>();
	}
	
	public void moveTo(Location location) {
		if(location == null) {
			System.out.println("Du kan inte cykla åt det hållet! Försök igen.");
		} else {
			this.position = location;
		}
	}

	public Location getLocation() {
		// TODO Auto-generated method stub
		return this.position;
	}

	public void doCommand(String string) {
		switch (string) {
			case "east":
				moveTo(this.position.getAlternatives()[0]);
				break;
			case "south":
				moveTo(this.position.getAlternatives()[1]);
				break;
			case "west":
				moveTo(this.position.getAlternatives()[2]);
				break;
			case "north":
				moveTo(this.position.getAlternatives()[3]);
				break;
			case "help":
				System.out.println("Inte mycket vi kan göra :(");
				break;
			default:
				System.out.println("Du skrev in ett felaktigt kommando, försök igen.");
				break;
		}
	}
	
	public void giveItem(Item item) {
		
		this.items.add(item);
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCash() {
		return cash;
	}

	public void setCash(int cash) {
		this.cash = cash;
	}

	public double getPromille() {
		return promille;
	}

	public void setPromille(double promille) {
		this.promille = promille;
	}


	
}
