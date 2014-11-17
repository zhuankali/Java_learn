package exampleJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReadLineJava {
	public String ReadLine(){
		int ch;
		String ss1 = "";
		while(true){
			try{
				ch = System.in.read();
				if(ch == -1 || (char)ch == '\n'){
					break;
				}
				else if((char)ch != '\r'){
					ss1 += (char)ch;
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return ss1;
	}
	
	public String ReadLine1(){
		char ch;
		String ss1 = "";
		while(true){
			try{
				ch = (char)System.in.read();
				if((int)ch == -1 || ch == '\n'){
					break;
				}
				else if(ch != '\r'){
					ss1 += ch;
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}
		return ss1;
	}
	
	public void readLines(String fInName, String fOutName) throws IOException{
		BufferedReader fIn = new BufferedReader(new FileReader(fInName));
		PrintWriter fOut = new PrintWriter(new FileWriter(fOutName));
		
		String s;
		while((s = fIn.readLine()) != null){
			System.out.println(s);
			fOut.println(s);
		}
		fIn.close();
		fOut.close();
	}
}
