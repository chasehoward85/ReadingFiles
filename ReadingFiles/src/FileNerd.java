import java.io.*;
import java.util.*;

public class FileNerd {

	public static void main(String[] args) throws IOException{
		
		Scanner reader = new Scanner(new File ("E:\\ReadingFiles\\NerdData.txt"));
		
		int maxIndx = -1;
		String text[] = new String[1000];
		
		while(reader.hasNext()){
			maxIndx++;
			text[maxIndx] = reader.nextLine();
			}
		reader.close();
		
		for(int i = 0; i <= maxIndx; i++){
			Scanner sent = new Scanner(text[i]);
			String scn = "";
			//System.out.println(text[i]);
			
			while(sent.hasNext()){
				scn = sent.next();
				if(scn.equals("The")){
					System.out.println(text[i]);
				}
				
			}
		}

	}

}
