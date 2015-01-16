package unnamed;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Intro {
		
	public void intro(){
		File file = new File("src/unnamed/story/classified.txt");

	    try {
	      FileInputStream fis = new FileInputStream(file);
	      char current;
	      while (fis.available() > 0) {
	        current = (char) fis.read();
	        System.out.print(current);
	        Thread.sleep(90);
	      }
	    } catch (IOException e) {
	      e.printStackTrace();
	    
	    } catch (InterruptedException e) {
	        e.printStackTrace();
	    }
	}
	}
