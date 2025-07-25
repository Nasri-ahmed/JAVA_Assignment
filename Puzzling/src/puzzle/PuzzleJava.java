package puzzle;

import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {
	
	  public ArrayList<Integer> getTenRolls() {
	        Random rand = new Random();
	        ArrayList<Integer> rolls = new ArrayList<Integer>();
	        for (int i = 0; i < 10; i++) {
	            rolls.add(rand.nextInt(20) + 1); // 1 to 20
	        }
	        return rolls;
	    }

	    // 2. Get Random Letter
	    public char getRandomLetter() {
	        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
	        Random rand = new Random();
	        int index = rand.nextInt(26);
	        return alphabet[index];
	    }

	    // 3. Generate Random 8-character Password
	    public String generatePassword() {
	        StringBuilder password = new StringBuilder();
	        for (int i = 0; i < 8; i++) {
	            password.append(getRandomLetter());
	        }
	        return password.toString();
	    }

	    // 4. Generate New Password Set
	    public ArrayList<String> getNewPasswordSet(int length) {
	        ArrayList<String> passwordSet = new ArrayList<String>();
	        for (int i = 0; i < length; i++) {
	            passwordSet.add(generatePassword());
	        }
	        return passwordSet;
	    }

	    // 5. Shuffle Array (Bonus)
	    public void shuffleArray(int[] arr) {
	        Random rand = new Random();
	        for (int i = 0; i < arr.length; i++) {
	            int randomIndex = rand.nextInt(arr.length);
	            int temp = arr[i];
	            arr[i] = arr[randomIndex];
	            arr[randomIndex] = temp;
	        }
	    }

}
