package basic;

import java.util.Random;

public class RandomNumber {

	public static void main(String[] args) {
		Random objRandom = new Random();
        for (int i = 0; i< 10; i++){
          int randomNumber = objRandom.nextInt(100);
          System.out.println("Random No : " + randomNumber); 
         }

	}

}
