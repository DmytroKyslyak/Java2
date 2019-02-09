package ua.univer.FreqWord;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map.Entry;

public class Program {
	
	public static void TestStringTest()	{
		long beginTime = System.nanoTime();
		StringBuilder sb = new StringBuilder(); //StringBuilder
		//StringBuffer sbf = new StringBuffer();
		
		for (int i=0; i<1030; i++) {
			sb.append(i);			
			System.out.println(sb.length() +" / "+ sb.capacity());
		}
		long endTime = System.nanoTime();
		System.out.println("time = " +(endTime - beginTime));
	}
	
	public static void main(String[] args) throws Exception{
		//String str = "mama mila ramu ramu myla mama ramu mama";
		FileReader fr = new FileReader("C:\\Git\\Java2\\prj09\\src\\1.txt");
		//FileReader fr = new FileReader("C:"+File.pathSeparator+"Git\\Java2\\prj09\\src\\1.txt");
		BufferedReader br = new BufferedReader(fr);
		StringBuilder sb = new StringBuilder();
		while (br.ready()) {
				sb.append(br.readLine());
		}
		
		String str =  sb.toString();
		String[] words = str.split("\\s");
		for (String word : words) {
			//System.out.println(word);
		}
		
		HashMap<String, Integer> map = new HashMap<>();
		for (String word : words) {
		Integer freq = map.get(word);
		if (freq != null) map.put(word, freq+1);
		else map.put(word, 1);
		}
		for (Entry<String, Integer> entry: map.entrySet())
			System.out.println(entry);
	}

}
