package proj5;

import java.util.Scanner;
import java.io.*;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class proj5real {

	
	private Scanner z, y;
	
	public void openFile(){
		
		
		
		try{
			
			z = new Scanner(new File("employees(2).dat"));
			
		}
		catch(Exception e) {
			System.out.println("could not find");
		}
	}
	
	
	public void readFile(){
		
		while(z.hasNext()){
			String a = z.next();
			int b = z.nextInt();
			int c = z.nextInt();
			String a1 = z.next();
			int b2 = z.nextInt();
			int c3 = z.nextInt();
			String aa = z.next();
			int bb = z.nextInt();
			int cc = z.nextInt();
			String ab = z.next();
			int abc = z.nextInt();
			int cba = z.nextInt();
			String ac = z.next();
			int acc = z.nextInt();
			int aca = z.nextInt();
			String d = z.next();
			int da = z.nextInt();
			int db = z.nextInt();
			String e = z.next();
			int ea = z.nextInt();
			int eb = z.nextInt();
			String f = z.next();
			int fa = z.nextInt();
			int fb = z.nextInt();
			
		
			
			int h = 40;
			int o = 1.5;
			 
			int w1 = b * c;
			int w2 = ((b2 - h)) * o * (c3);
			int w3 = bb * cc;
			int w4 = abc * cba;
			int w5 = acc * aca;
			int w6 = (da - h) * o * db;
			int w7 = (ea - h) * o * eb;
			int w8 = (fa - h) * o * fb;
			int w9 = w1 + w2 + w3 + w4 + w5 + w6 + w7 + w8;
			int w10 = b + b2 + bb + abc + acc + da + ea + fa;
		}
	
		
	}
	
	public void nextFile(){
		
String fileName = "employeepay.txt";
		
		try {
			
			PrintWriter.outputStream = new PrintWriter(fileName);
			outputStream.println(a + "\n " + b + ": " + "\n " + w1 + ": " + "\n 9" + "\n " + w10 + "\n " + w9);
			outputStream.flush();
			outputStream.println(a1 + "\n " + b2 + ": " + w2 + "\n 9" + "\n " + w10 + "\n " + w9);
			outputStream.flush();
			outputStream.println(aa + "\n " + bb + ": " + w3 + "\n 9" + "\n " + w10 + "\n " + w9);
			outputStream.flush();
			outputStream.println(ab + "\n " + abc + ": " + w4 + "\n 9" + "\n " + w10 + "\n " + w9 );
			outputStream.flush();
			outputStream.println(ac + "\n " + acc) + ": " + w5 + "\n 9" + "\n " + w10 + "\n " + w9);
			outputStream.flush();
			outputStream.println(d + "\n " + da + ": "  + w6 + "\n 9" + "\n " + w10 + "\n " + w9);
			outputStream.flush();
			outputStream.println(e + "\n " + ea + ": " + w7 + "\n 9" + "\n " + w10 + "\n " + w9);
			outputStream.flush();
			outputStream.println(f + "\n " + fa + ": " + w8 + "\n 9" + "\n " + w10 + "\n " + w9);
			outputStream.flush();
			
			outputStream.println(a + "\n " + b + ": " + "\n " + w1 + ": " + "\n 9" + "\n " + w10 + "\n " + w9);
			
		}
		catch (FileNotFoundException e) {
			
			System.out.println("Error");
		}
}
}
