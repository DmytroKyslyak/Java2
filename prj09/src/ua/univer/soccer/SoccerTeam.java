package ua.univer.soccer;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SoccerTeam {
	private HashMap<Integer, String> map; //LinkedHashMap
	
	public SoccerTeam() {
		map = new HashMap<> ();	//LinkedHashMap
	}
	public String get(Integer k) {
		return map.get(k);
	}
	public void put(Integer k, String v) {
		map.put(k, v);
	}
	public void print() {
		for (Integer k: map.keySet()) {
			System.out.print(k);
			System.out.println(map.get(k));
		}
	}
}
