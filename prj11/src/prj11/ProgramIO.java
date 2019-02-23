package prj11;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class ProgramIO {
	
	public static void readBuffer(InputStream is) throws IOException {
		int c;
		System.out.println("is availible "+is.available());
		InputStreamReader isr = new InputStreamReader(is,"Windows 1251");
		BufferedReader bis = new BufferedReader(isr);
		String str;
		while((str=bis.readLine())!=null) {
			System.out.println("is availible = "+is.available());
			System.out.println(str);
			//System.out.println(c);
		}		
	}
	public static void read(InputStream is) throws IOException {
		int c;
		System.out.println("is availible "+is.available());
		while((c=is.read())!=-1) {;
			System.out.println("is availible = "+is.available());
			System.out.println((char)c);
			//System.out.println(c);
		}		
	}
	public static void write(OutputStream os, String str) throws IOException {
		OutputStreamWriter	 osw = new 	OutputStreamWriter (os, "CP1251");
		osw.write(str);
				
	}
	public static void main(String[] args) throws IOException {
		try (InputStream is = new FileInputStream("sourse"+File.separator+"data.txt")){
		//InputStream isFake = new ByteArrayInputStream(new byte[] {'1','2','3'});
		//InputStream isFake = new ByteArrayInputStream(new byte[] {1,2,3});
		//InputStream isFake = new ByteArrayInputStream(new byte[] {49,50,51});
		readBuffer(is);
		//catch (IOExeption e)  {
			}
	}
}
