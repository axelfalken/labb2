import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private Scanner keyboard;
	private ArrayList<Location> locations;
	private Player player;

	public Game() {
		keyboard = new Scanner(System.in);
		locations = new ArrayList<>();
		
		Location start = new Location("Hemma", "Du är ensam hemma i din lilla etta.\nTill maten slinker både en och två bira ner och du börjar bli sugen på att dra vidare. \nOvven är knuten, vart ska du fortsätta kvällen?", 0);
		Location utekr�k = new OutdoorsArea("Utekr�k", "Du kommer till vallamassivet. Det är skymning och burkar ligger slängda i varje buske. \nEn grupp festerister spelar hög musik och skriker ramsor. \nEn kall bris kyler dig genom den tunna sommarjackan.", 30, "soligt");
		Location korrefest = new Room("Korrefest", "Du anländer till en korridorsfest i Ryd. \nSom vanligt är det alldeles för många personer på alldeles för få kvadratmeter. \nSpriten flödar och i högtalarna hörs schlager.", 20, 20);
		Location flamman = new Room("Flamman", "Du kommer till slut ner i till flamman. I underjorden är det mörkt och dunkelt. \nStudenterna kämpar för att verka nyktra framför vakterna. Stämningen är på topp.", 200, 80);
		Location k�rallen = new Room("K�rallen", "äntligen inne på Kårallen! Det är årets sista kravall och det stora dansgolvet är proppfullt med taggade studenter. \nPå scenen spelar Asap Rocky och publiken är som galen. \nRök-och-stök-tältet har aldrig varit så fullt.", 1200, 400);
		Location donken = new Room("Donken", "Slutligen anländer du dit du velat komma hela kvällen, din älskade restaurang Gyllene Måsen. \nDu äter två dubbelcheese och skryter om att du fick en gratis McFlurry Daim med din stora andel Mcpoints \nsom visar på att du kommer hit alldeles för ofta.", 1250, 100);
		Location efterfest = new Room("Efterfest", "Kvällen tar en oväntad vändning, du hamnar på efterfest i ryd. \nNågon ligger däckad, ett par sitter o strular i soffan. \nVar detta verkligen en bra ide?", 15, 25);
		
		start.setAlternatives(new Location[]{null, null, utekr�k, korrefest});
		utekr�k.setAlternatives(new Location[]{null, flamman, k�rallen, korrefest});
		korrefest.setAlternatives(new Location[]{flamman, utekr�k, k�rallen, null});
		flamman.setAlternatives(new Location[]{start, efterfest, k�rallen, donken});
		k�rallen.setAlternatives(new Location[]{flamman, start, efterfest, donken});
		donken.setAlternatives(new Location[]{start, null, efterfest, null});
		efterfest.setAlternatives(new Location[] {start, null, null, null});
		
		locations.add(start);
		locations.add(utekr�k);
		locations.add(korrefest);
		locations.add(flamman);
		locations.add(k�rallen);
		locations.add(donken);
		locations.add(efterfest);
	}

	public void run() {
		String name;

		System.out.println("Välkommen till en utekväll i Linköping!\nVad heter du?");
		name = keyboard.nextLine();
		player = new Player(name, locations.get(0));
		System.out.println("Hej " + name
				+ ", din stökiga utekväll ska precis börja.\nDu kan röra dig i de fyra riktiningarna east/west/north/south.\n(Tips: Du kan använda kommandot [help] när som helst för att få hjälp)");

		while (true) {
			String command;

			player.getLocation().describeYourself();
			System.out.println("Vart vill du röra dig?");
			command = keyboard.nextLine();
			player.doCommand(command);
		}
	}
}
