import java.util.Scanner;
public class Dvorac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite broj katapulta:");
		int N = sc.nextInt();
		System.out.println("Unesite maksimalnu distancu za domet:");
		int D = sc.nextInt();
		System.out.println("Unesite health dvorca:");
		int HD = sc.nextInt();
		System.out.println("Unesite napad katapulta:");
		int KA = sc.nextInt();
		int brKatapultaIzDometa = 0;
		for (int i = 0; i < N;i++) {
			int xKatapulta = sc.nextInt();
			int yKatapulta = sc.nextInt();
			int menhetnRastojanje = Math.abs(xKatapulta) + Math.abs(yKatapulta);
			if (menhetnRastojanje <= D) {
				brKatapultaIzDometa++;
			}
		}
		if(brKatapultaIzDometa * KA >= HD) {
			System.out.print("Dvorac je srusen");
		} else {
			System.out.print("Dvorac nije srusen");
		}

	}

}
