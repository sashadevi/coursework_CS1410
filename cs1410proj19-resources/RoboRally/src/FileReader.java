import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.net.*;;
public class FileReader {
	private Scanner reader;
	/**
     * Create a new FileReader that reads text from the file with the given name.
     */
	public FileReader(String fname) {
        try {
        	URL url = getClass().getResource(fname);
            reader = new Scanner(new File(url.getPath()));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileReader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
	/**
     * Read a line of text from the input,
     * and return it as an array of String data values.
     *
     * @return  An array of Strings, where each String is one of the 
     *          fields in the input.
     */
    public String getInput() 
    {
    	String input= "";
    	if(reader.hasNext()) {
    		 input = reader.nextLine();
    	}			 	
        return input;
    }
	
    public String[] trimLine(String s) {
    	
    	return s.trim().split("");
    	
    }
}
