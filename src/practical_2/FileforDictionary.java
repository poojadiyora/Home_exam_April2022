package practical_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileforDictionary {
	public static void main(String[] args) throws IOException {
		
		   String path = "C:\\Users\\diyor\\takehomepractical\\generateRandomnumber\\data\\dictionary.txt";
		   doesFileExist(path);
			}
				public static String doesFileExist(String pa) throws IOException {
					 String s = null;
					 try {
				File f = new File(pa);
				FileReader fr = new FileReader(f);
				BufferedReader br = new BufferedReader(fr);

				
				 
				while ((s = br.readLine())!= null) {
					System.out.println(s);
				}
				br.close();
					 }
					 catch(FileNotFoundException e) {
						 e.printStackTrace();
						 System.out.println("file not found");
					 }
				
				
				return s;
				
			}
}
