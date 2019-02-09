package ua.univer.soccer;

public class Program {
	public static void main(String[] args) {
		SoccerTeam dynamo = new SoccerTeam();
		dynamo.put(11, " Rebrov");
		dynamo.put(0, " Schevchenko");
		dynamo.put(16, " Abramovich");
		dynamo.put(27, " Milevskiy");
		dynamo.put(33, " Berezovec");
		dynamo.put(9, " Kaha");
		dynamo.print();
	}

}
