package latihan.cakep;
import java.util.Scanner;
/*
NAMA        : Wildan Muhammad Fikri
KELAS       : IF1
NIM         : 10118044
Deskripsi   : Warna kalimat
*/
public class Cakep {
	
		public static final String ANSI_RESET = "\u001B[0m";
		public static final String ANSI_BLACK = "\u001B[30m";
		public static final String ANSI_RED = "\u001B[31m";
		public static final String ANSI_GREEN = "\u001B[32m";
		public static final String ANSI_YELLOW = "\u001B[33m";
		public static final String ANSI_BLUE = "\u001B[34m";
		public static final String ANSI_PURPLE = "\u001B[35m";
		public static final String ANSI_CYAN = "\u001B[36m";
		public static final String ANSI_WHITE = "\u001B[37m";
		
	public static void main(String[] args) {
		System.out.println(ANSI_RED + "Kamu " + ANSI_GREEN + "ngerjain sendiri " + ANSI_YELLOW + "latihan 17 sampe " + ANSI_BLUE + "latihan 30 ini ?");
		System.out.print(ANSI_BLUE + "Jawab" + ANSI_RED + "(Yoi/Enggak) : " + ANSI_RESET);
		Scanner reader = new Scanner(System.in);
		String a = reader.nextLine();
		a = a.toUpperCase();
		if ( a.equals("YOI"))
			System.out.println(ANSI_RED+"Capek Bener."+ANSI_PURPLE+" Good Job");
		else 
			System.out.println(ANSI_RED+"Tetep cakep sih.\n"+ANSI_CYAN+"Sing penting paham konsepnya yee"+ANSI_RESET+"Keep the code works dude");
		
		reader.close();
	}

	

}
