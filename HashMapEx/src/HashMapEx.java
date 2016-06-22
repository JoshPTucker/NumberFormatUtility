import java.util.Scanner;
import java.util.AbstractMap;
import java.util.Map;
import java.util.HashMap;
import java.io.File;
import java.io.FileNotFoundException;
public class HashMapEx {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		HashMap<Integer, String> myMap = new HashMap<Integer,String>();
		
		myMap.put(10,"ten");

		//Retrieve the value with

		String value = myMap.get(10);
		
		File file = new File(value);
        Scanner scannerInput = new Scanner(file);//note that Scanner can read from a file!
        while (scannerInput.hasNextLine()) {
            String line = scannerInput.nextLine();
            System.out.println(line);
        }
        scannerInput.close();
	}

}
