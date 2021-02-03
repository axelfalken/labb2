
public class OutdoorsArea extends Location{
	private String weather;
	
	
	public OutdoorsArea(String string, String description, int partyPeople, String weather) {
		super(string, description, partyPeople);
		setWeather(weather);
		
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void describeYourself(Player player) {
		
		if(isVisited()){
			System.out.println("Du är återigen på " + getName() + ".");
		} else {
			System.out.println(getDescription());
			
			setVisited(true);
			
		}
		for (int i = 0; i < 4; i++) {
			if (getAlternatives()[i] != null) {
				System.out.println("Du kan cykla " + getDirections()[i] + " mot " + getAlternatives()[i].getName() + ".\n");
			}
		}

	}

	public String getWeather() {
		return weather;
	}

	public void setWeather(String weather) {
		this.weather = weather;
	}

	/*@Override
	public void describeYourself() {
		// TODO Auto-generated method stub
		System.out.println("Denna plats ligger utomhus.");
	}*/

}
