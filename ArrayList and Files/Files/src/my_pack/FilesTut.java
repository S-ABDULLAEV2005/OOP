package my_pack;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
public class FilesTut {

	public static void main(String[] args) throws IOException {
	
		File f = new File("\"C:\\Users\\shahz\\Desktop\\My_file.txt\"");
	    Scanner scan = new Scanner(f);
        
	    String fileContent = "My name is Shakhzod and i am from Tajikistan";
	    while(scan.hasNextLine()) {
        fileContent = fileContent.concat(scan.nextLine() + "\n");
	    	//	    	System.out.println(scan.hasNextLine());
        }
	  FileWriter writer = new FileWriter("\"C:\\Users\\shahz\\Desktop\\My_file.txt\"");
	  writer.write(fileContent);
	  writer.close();
	}

}
