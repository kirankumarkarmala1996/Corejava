package com.starpatterns;

public class Starpatterns {
	public void forLoop() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
		}
	}
	public void reverseForLoop() {
		for(int i=5;i>=1;i--) {
			System.out.println(i);
		}
	}
	
	public void mixedForLoop() {
		for(int i=0;i<=5;i++) {
			for(int j=i+1;j>=1;j--) {
			System.out.print(i);
		}
			System.out.println(" ");
		}
	}
	public void printStars() {
		for(int i=0;i<=5;i++) {
			for(int j=i+1;j>=1;j--) {
			System.out.print("*");
		}
			System.out.println(" ");
		}
	}
	public void Loop() {
		for(int i=0;i<=5;i++) {
			for(int j=i+1;j>=1;j--) {
				if((i>=5))
			System.out.print("*");
		}
			System.out.println(" ");
		}
	}
		

	public void fiveStarRowsPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
	}

	public void fiveNumberRowsPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

	public void fiveNumRowsPattern() {
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}

	public void numberReverseRowsPattern() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

	public void numcontiniousReverseRowsPattern() {
		for (int i = 5; i >= 1; i--) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(i);
			}
			System.out.println(" ");
		}
	}

	public void continiousNumRowsPattern() {
		int k = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.printf("%2d", k);
				k++;
			}
			System.out.println(" ");
		}
	}

	public static void main(String[] args) {
		Starpatterns pattern = new Starpatterns();
		pattern.printStars();
	}

}
