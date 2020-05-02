package de.Martin.Uebungen;

public class TowerOfHanoi {
	
	static int i = 0;

	public static void main(String[] args) {
		
		move(3, "Kupfersäule", "Goldsäule", "Silbersäule");
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>> Ende <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		
	}

	static void move(int n, String fromPeg, String toPeg, String usingPeg) {
		
		if (n > 1) {
			move(n-1, fromPeg, usingPeg, toPeg);
			i++;
			System.out.printf(i + ": * Bewege Scheibe %d von der %2.5s zur %s.%n", n, fromPeg, toPeg);
			i++;
			move(n-1, usingPeg, toPeg, fromPeg);
		}
		else
			i++;
			System.out.printf(i + ": Bewege Scheibe %d von der %s zur %s.%n", n, fromPeg, toPeg);
		
	}
	

}

// Link: 

// d: int (dezimal)
// s: String
// t: date/time values
// f: fließkomme-Zahl

// %-15s oder %15s --> auffüllen oder Anzahl der Zeichen...
// %2.3s --> Wieviel aufgefüllt UND(.) wieviele Zeichen, ...


// André: Warum gibt es mehr Zeilen, wenn ich die "i++" einblende...