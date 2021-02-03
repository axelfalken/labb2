import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	private Scanner keyboard;
	private ArrayList<Location> locations;
	private Player player;

	public Game() {
		keyboard = new Scanner(System.in);
		locations = new ArrayList<>();
		
		Location start = new Location("Hemma", "Du �r ensam hemma i din lilla etta.\nTill maten slinker b�de en och tv� bira ner och du b�rjar bli sugen p� att dra vidare. \nOvven �r knuten, vart ska du forts�tta kv�llen?", 0);
		Location utekr�k = new OutdoorsArea("Utekr�k", "Du kommer till vallamassivet. Det �r skymning och burkar ligger sl�ngda i varje buske. \nEn grupp festerister spelar h�g musik och skriker ramsor. \nEn kall bris kyler dig genom den tunna sommarjackan.", 30, "soligt");
		Location korrefest = new Room("Korrefest", "Du anl�nder till en korridorsfest i Ryd. \nSom vanligt �r det alldeles f�r m�nga personer p� alldeles f�r f� kvadratmeter. \nSpriten fl�dar och i h�gtalarna h�rs schlager.", 20, 20);
		Location flamman = new Room("Flamman", "Du kommer till slut ner i till flamman. I underjorden �r det m�rkt och dunkelt. \nStudenterna k�mpar f�r att verka nyktra framf�r vakterna. St�mningen �r p� topp.", 200, 80);
		Location k�rallen = new Room("K�rallen", "�ntligen inne p� K�rallen! Det �r �rets sista kravall och det stora dansgolvet �r proppfullt med taggade studenter. \nP� scenen spelar Asap Rocky och publiken �r som galen. \nR�k-och-st�k-t�ltet har aldrig varit s� fullt.", 1200, 400);
		Location donken = new Room("Donken", "Slutligen anl�nder du dit du velat komma hela kv�llen, din �lskade restaurang Gyllene M�sen. \nDu �ter tv� dubbelcheese och skryter om att du fick en gratis McFlurry Daim med din stora andel Mcpoints \nsom visar p� att du kommer hit alldeles f�r ofta.", 1250, 100);
		Location efterfest = new Room("Efterfest", "Kv�llen tar en ov�ntad v�ndning, du hamnar p� efterfest i ryd. \nN�gon ligger d�ckad, ett par sitter o strular i soffan. \nVar detta verkligen en bra ide?", 15, 25);
		
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

		System.out.println("V�lkommen till en utekv�ll i Link�ping!\nVad heter du?");
		name = keyboard.nextLine();
		player = new Player(name, locations.get(0));
		System.out.println("Hej " + name
				+ ", din st�kiga utekv�ll ska precis b�rja.\nDu kan r�ra dig i de fyra riktiningarna east/west/north/south.\n(Tips: Du kan anv�nda kommandot [help] n�r som helst f�r att f� hj�lp)");

		while (true) {
			String command;

			player.getLocation().describeYourself(player);
			System.out.println("Vad vill du g�ra?");
			command = keyboard.nextLine();
			player.doCommand(command);
		}
	}
}
