package acl.adventofcode.second;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exo2 {

	public static void main(String[] args) {
		int min = 0;
		int max = 0;
		char letter;
		String password = "";

		int result = 0;
		try {
			Scanner scanner = new Scanner(new File("C:\\Users\\alban\\eclipse-workspace\\Adventofcode2020\\src\\main\\resources\\input\\InputExo2"));


			while(scanner.hasNextLine()) {
				String line = scanner.nextLine();
				String[] tempo = line.split(" ");

				String[] tabTemp = tempo[0].split("-");
				
				System.out.println(line);
				min = Integer.parseInt(tabTemp[0]);
				max = Integer.parseInt(tabTemp[1]);
				
				min--;
				max--;
				
				letter = tempo[1].charAt(0);
				password = tempo[2];

				char minChar = password.charAt(min);
				char maxChar = password.charAt(max);
				

				
				if ((minChar == letter) ^ (maxChar == letter)) {
					result++;
				}
				
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Result : " + result);

	}



}
