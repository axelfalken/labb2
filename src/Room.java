
public class Room extends Location{

	private int size;
	
	public Room(String string, String description, int partyPeople, int size) {
		super(string, description, partyPeople);
		this.setSize(size);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void describeYourself(Player player) {
		
		if(isVisited()){
			System.out.println("Du är återigen på " + this.getName() + ".");
		} else {
			System.out.println(getDescription());
			setVisited(true);
		}
		
		for(Item item : this.getItems()) {
			item.printYourself(player);
		}
		
		for (int i = 0; i < 4; i++) {
			if (getAlternatives()[i] != null) {
				System.out.println("Du kan gå " + getDirections()[i] + " mot " + getAlternatives()[i].getName() + ".");
			}
		}

	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	/*@Override
	public void describeYourself() {
		// TODO Auto-generated method stub
		System.out.println("Denna plats ï¿½r inomhus.");
	}
*/
}
