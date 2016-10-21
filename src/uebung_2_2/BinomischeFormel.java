package uebung_2_2;

public class BinomischeFormel {

	public static void main(String[] args) {
		
		//Var
		double a, b;
		
		//Zuweisung der Werte
		a = 8;
		b = 3;
		
		//Berechnung1
		double loesung1 = (a+b)*(a+b);
		
		//Brechenung2
		double loesung2 = a*a + 2*a*b + b*b;
		
		//Ausgabe der Lösungen
		System.out.println("(a+b)^2 = " + loesung1);
		System.out.println("a^2 + 2ab + b^2) = " + loesung2);
			

	}

}
