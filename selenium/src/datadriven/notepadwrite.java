package datadriven;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class notepadwrite {

	public static void main(String[] args) throws IOException 
	{
		FileWriter fw=new FileWriter("F:\\mornimg6am\\selenium\\src\\com\\orgHrm\\Results\\NoteOut.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("This is Notepad Write");
		bw.newLine();
		bw.write("This is Selenium");
		bw.newLine();
		bw.write("\n");
		bw.write("I am learning Notepad Operations");
		bw.close();
	}

}
