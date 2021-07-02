public class Main_Game {
	static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		Game a = new Game();
		int choice =0;
		do {
			System.out.print("1.Stargame\n2.Jumbled game\n");
			choice = sc.nextInt();
			switch(choice) {
			case 1: a.starGame();
					break;
			case 2: a.jumbledWordsGame();
					break;
			default:System.out.print("Invalid choice...");
		}
		}while(!(choice==1||choice==2));
		
	}
}
