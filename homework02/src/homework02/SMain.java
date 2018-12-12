package homework02;

public class SMain {
	public static void main(String[] args) {
		
		/*
		SStudent st1 = new SStudent("FIFT", 5, "ST-51", 5568677, "Ivanov", "Jack", 2001, "Kiev", 433);
		st1.setName("Petya");
		System.out.println(st1);
		*/
		SList st = new SList();
		st.add(new SStudent("FIFT", 5, "ST-51", 556677, "Ivanov", "Jack", 2001, "Kiev", 8333433));
		st.add(new SStudent("FIOT", 4, "ST-41", 558877, "Petrov", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("FIFT", 3, "ST-51", 5568677, "Ivanov", "Jack", 2004, "Kiev", 433));
		
		st.print();
		System.out.println();
		st.printStudentsByFacultet("FIFT");
	}

}
