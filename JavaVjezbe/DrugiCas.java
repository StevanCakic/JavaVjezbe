import java.util.Scanner;

public class DrugiCas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Scanner sc = new Scanner(System.in);
		float prviBroj = sc.nextFloat();
		float drugiBroj = sc.nextFloat();
		
		if (prviBroj > drugiBroj) {
			System.out.println("Prvi broj veci od drugog.");
		} else if (prviBroj < drugiBroj) {
			System.out.println("Drugi broj veci od prvog.");
		} else {
			System.out.println("Jednaki su.");

		}
		*/
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj automobila: ");
		int N = sc.nextInt();
		int ukupnaZarada = 0;
		int cijena, sati;
		for(int i = 1; i <= N; i++) {
			System.out.println("Unesite broj sati na parkingu za auto " + i + ": ");
			sati = sc.nextInt();
			if(sati <= 5) {
				cijena = sati * 2;
			} else {
				cijena = 10 + (sati - 5);
			}
			ukupnaZarada += cijena;
		}
		// sc.close();
		System.out.print("Ukupna zarada parkinga je: " + ukupnaZarada + " EUR.");
		
	}

}
