package com.newlecture.app.ex6.control.loop;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Program2 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("res/studentsl.data");
		Scanner fscan = new Scanner(fis);
		
		FileOutputStream fos = new FileOutputStream("res/sutdentsl-out.data");
		PrintWriter fout = new PrintWriter(fos,true, Charset.forName("UTF-8"));
		

		
			while(fscan.hasNextLine()) 
			{
			String line = fscan.nextLine();
			//String name = line.substring(1,3);
			fout.print(line);
			
			if(fscan.hasNextLine())
			fout.println();
			}
	
	
		fscan.close();
		fis.close();
		fout.close();
		fos.close();
		
		System.out.println("작업완료");
		


	}

}
