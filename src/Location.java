import java.util.ArrayList;

public class Location {
	private String name;
	private String description;
	private int partyPeople;
	private Location[] alternatives;
	private static String[] directions = {"österut", "söderut", "västerut", "norrut"};
	private boolean visited;
	private ArrayList<Item> items;
	

	
	public Location(String string, String description, int partyPeople) {
		// TODO Auto-generated constructor stub
		this.setName(string);
		this.setDescription(description);
		this.partyPeople = partyPeople;
		this.setVisited(false);
		this.alternatives = new Location[4];
		this.items = new ArrayList<Item>();
		}
	
	public String doCommand(String command) {
		return "";
	}
		
	public void describeYourself() {
		if(isVisited()){
			System.out.println("Du är återigen på " + this.getName() + ".");
		} else {
			System.out.println(getDescription());
			setVisited(true);
		}
		for (int i = 0; i < 4; i++) {
			if (alternatives[i] != null) {
				System.out.println("Du kan cykla " + getDirections()[i] + " mot " + alternatives[i].getName() + ".\n");
			}
		}
	}

	public Location[] getAlternatives() {
		return alternatives;
	}

	public void setAlternatives(Location[] alternatives) {
		this.alternatives = alternatives;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String[] getDirections() {
		return directions;
	}

	public static void setDirections(String[] directions) {
		Location.directions = directions;
	}

}
