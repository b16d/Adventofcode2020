package acl.adventofcode.firstday;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exo1 {

	public static void main(String[] args) {
		Exo1 exo1 = new Exo1();
		
		int[] input = exo1.readFile("input/InputExo1");
		
		int result1 = exo1.computeResultCase1(input);
		int result2 = exo1.computeResultCase2(input);
		
		System.out.println("Result " + result1);
		System.out.println("Result " + result2);
	}
	
	private int[] readFile(String filePath) {
		int [] inputs = new int [200];
        try {
            Scanner scanner = new Scanner(new File("C:\\Users\\alban\\eclipse-workspace\\Adventofcode2020\\src\\main\\resources\\input\\InputExo1"));
            
            int i = 0;
            while(scanner.hasNextLine()) {
                String line = scanner.nextLine();
                inputs[i] = Integer.parseInt(line);
                i++;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return inputs;
	}
	
	private int computeResultCase1(int[] input) {
		int sum = 0;
		for (int i = 0; i <input.length; i++) {
			for (int j = 0; j < input.length; j++) {
	
				if (input[i] + input [j] == 2020) {
					sum = input[i] * input [j];
				}
			}
		}
		
		return sum;
	}
	
	private int computeResultCase2(int[] input) {
		int sum = 0;
		for (int i = 0; i <input.length; i++) {
			for (int j = 0; j < input.length; j++) {
				for (int z = 0; z < input.length; z++) {
					if (input[i] + input [j] + input [z] == 2020) {
						sum = input[i] * input [j] * input [z];
					}
				}
			}
		}

		return sum;
	}
}
