package unnamed;

import java.util.Scanner;

public class Game_Menu {

	public void menu(){
		Scanner scanner = new Scanner(System.in);
		boolean suspend = true;
		
		while (suspend){
			System.out.println("1. New Game \n2. Load Game \n3. Credits \n4. Quit");
			System.out.println("Please make a choice: ");
			int userInput = scanner.nextInt();
			
		switch(userInput){
        	case 1:
        		Intro intro = new Intro();
        		intro.intro();
        		suspend = false;
        		break;
        	case 2:
        		System.out.println("Load Game.");
        		suspend = false;
        		break;
        	case 3:
        		System.out.println("Credits.");
        		suspend = false;
        		break;
        	case 4:
        		suspend = false;
        		break;
   }
		}
	}
			     
}