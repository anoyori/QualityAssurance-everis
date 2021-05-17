package desafios;

import java.io.IOException;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String[] args) throws IOException {

		Scanner leia = new Scanner(System.in);

		int x;
		x = leia.nextInt();

		for (int i = 1; i <= x; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}