package firstprojectpackage;

public class pattern10 {
	public static void main(String []args) {
		int sp = 5;
		for(int i = 1; i <= 5; i++) {
			for(int m = 1; m <= (sp-i); m++) {
				System.out.print(" ");
			}
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}