
package example;

import org.apache.commons.lang.WordUtils;
import java.util.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.*;


public class Hello {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String  message = "hello ivy !";
        System.out.println("standard message : " + message);
        System.out.println("capitalized by " + WordUtils.class.getName() 
                                + " : " + WordUtils.capitalizeFully(message));


	int nb = 0;
        int monmax = 0;
        CSVReader reader = new CSVReader(new FileReader("data.csv")); 
        List<String[]> myEntries = reader.readAll();
	//parcourt
        for(String[] num : myEntries) {
            nb = Integer.parseInt(Arrays.toString(num).substring(1, Arrays.toString(num).length()-1));
	if(nb > monmax){
                monmax = nb;
            }
	System.out.println("Lecture du nombre : " + nb);
            }

        System.out.println("Le nombre maximum est : " + monmax);

    }
}
		

