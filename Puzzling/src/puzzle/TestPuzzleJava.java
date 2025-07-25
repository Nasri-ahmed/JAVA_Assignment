package puzzle;

import java.util.ArrayList;
import java.util.Arrays;

public class TestPuzzleJava {

	public static void main(String[] args) {
		
		PuzzleJava generator = new PuzzleJava();

        System.out.println("---- getTenRolls() ----");
        ArrayList<Integer> randomRolls = generator.getTenRolls();
        System.out.println(randomRolls);

        System.out.println("\n---- getRandomLetter() ----");
        System.out.println(generator.getRandomLetter());

        System.out.println("\n---- generatePassword() ----");
        System.out.println(generator.generatePassword());

        System.out.println("\n---- getNewPasswordSet(5) ----");
        System.out.println(generator.getNewPasswordSet(5));

        System.out.println("\n---- shuffleArray() ----");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Before: " + Arrays.toString(arr));
        generator.shuffleArray(arr);
        System.out.println("After : " + Arrays.toString(arr));

	}

}
