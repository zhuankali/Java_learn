package exampleJava;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileiInOrout {
	public void readBytes1(String fInName, String fOutName)throws IOException{
		FileInputStream fIn = new FileInputStream(fInName);
		FileOutputStream fOut = new FileOutputStream(fOutName);
		int i;
		while((i = fIn.read())!= -1){
			System.out.print((char)i+"");;
//			System.out.print(i+"");
		}
		fIn.close();
		fOut.close();
	}
	
	public void readBytes2(String fInName, String fOutName)throws IOException{
		BufferedInputStream fIn = new BufferedInputStream(new FileInputStream(fInName));
		BufferedOutputStream fOut = new BufferedOutputStream(new FileOutputStream(fOutName));
		int i;
		while((i = fIn.read())!= -1){
//			System.out.print((char)i+"");;
			System.out.print((char)i+"");
			fOut.write((char)i);
		}
		fIn.close();
		fOut.close();
	}
}
