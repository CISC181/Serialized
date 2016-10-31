package pkgSerial;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class cMain {

	public static void main(String[] args) {

		Rectangle rec = new Rectangle(10,20);
		System.out.println(rec);

	      try {
	    	  
	    	  
	    	  
	          FileOutputStream fileOut = new FileOutputStream("src/pkgSerial/tmp/rectangle.ser");
	          
	          ObjectOutputStream out = new ObjectOutputStream(fileOut);
	          
	          out.writeObject(rec);
	          out.close();
	          fileOut.close();
	          System.out.printf("Serialized data is saved in src/pkgSerial/tmp/rectangle.ser");
	       }catch(IOException i) {
	          i.printStackTrace();
	       }
	}

}
