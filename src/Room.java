
public class Room extends Location{

	private int size;
	
	public Room(String string, String description, int partyPeople, int size) {
		super(string, description, partyPeople);
		this.setSize(size);
		
		// TODO Auto-generated constructor stub
	}
	
	public void describeYourself() {
		
		if(isVisited()){
			System.out.println("Du är återigen på " + this.getName() + ".");
		} else {
			System.out.println(getDescription());
			
			setVisited(true);
			
		}
		for (int i = 0; i < 4; i++) {
			if (getAlternatives()[i] != null) {
				System.out.println("Du kan gå " + getDirections()[i] + " mot " + getAlternatives()[i].getName() + ".\n");
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
		System.out.println("Denna plats �r inomhus.");
	}
*/
}
