package fileHanling;
import java.awt.BufferCapabilities;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Exicute {
	
	public void writeData(String data) throws IOException{
		File fr = new File("C:\\ReadData.txt");
		FileWriter fw = new FileWriter(fr, true);
		BufferedWriter bw = new BufferedWriter(fw); 
		bw.newLine();
		bw.write(data);
		bw.flush();
		bw.close();
		
		
	}
	
	public void readData() throws IOException{
		File fl = new File("C://ReadData.txt");
		FileReader fr = new FileReader(fl);
		BufferedReader br = new BufferedReader(fr);
		
		String s = br.readLine();
		
		while(s!=null){
			System.out.println(s);
			s = br.readLine();
		}
		
		
		
		
		/*int i = fr.read();
		while(i!=-1){
			System.out.print((char)i);
			i = fr.read();
		}*/
		
		
		
	}
	
	

}
