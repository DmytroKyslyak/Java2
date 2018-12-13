package homework02;

public class SMain {
	public static void main(String[] args) {
		
		/*
		SStudent st1 = new SStudent("FIFT", 5, "ST-51", 5568677, "Ivanov", "Jack", 2001, "Kiev", 433);
		st1.setName("Petya");
		System.out.println(st1);
		*/
		SList st = new SList();
		st.add(new SStudent("IPSA", 5, "ST-51", 556677, "Ivanov", "Jack", 2001, "Kiev", 3833343));
		st.add(new SStudent("IPSA", 5, "SM-51", 556677, "Daniels", "Jack", 2001, "Kiev", 8333433));
		st.add(new SStudent("IPSA", 4, "ST-41", 558877, "Smirnoff", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("RTF", 3, "SD-51", 5568677, "Ivanov", "Gleb", 2005, "Kiev", 9998433));
		st.add(new SStudent("RTF", 4, "ST-41", 558877, "Petrov", "Marat", 2002, "Lviv", 4220433));
		st.add(new SStudent("FIVT", 4, "ST-41", 558877, "Lincoln", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("FIVT", 3, "ST-51", 5568677, "Franklin", "Jack", 2004, "Kiev", 7777433));
		st.add(new SStudent("FIVT", 5, "SD-51", 556677, "Ivanov", "Stss", 2001, "Kiev", 8333433));
		st.add(new SStudent("RTF", 4, "ST-41", 558877, "Petrov", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("RTF", 3, "SD-51", 5568677, "Ivanov", "Greg", 2005, "Kiev", 9998433));
		st.add(new SStudent("RTF", 3, "ST-51", 5568677, "Ivanov", "Alex", 2000, "Kiev", 9998433));
		st.add(new SStudent("FIVT", 3, "SK-51", 5568677, "Jamson", "Jack", 2000, "Kiev", 9998433));
		st.add(new SStudent("FIVT", 5, "SD-51", 556677, "Washington", "Jack", 2001, "Kiev", 3833343));
		st.add(new SStudent("IPSA", 4, "SM-41", 558877, "Petrov", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("IPSA", 3, "ST-51", 5568677, "Sidorov", "Jack", 2004, "Kiev", 7777433));
		
		
		//st.print();
		//System.out.println();
	
		st.printStudentsByFacultet("RTF");
		System.out.println();
		st.printSort();
		System.out.println();
		st.printStudentsByYear(2005);
		System.out.println();
		st.printStudentsByGroup("ST-51");
	

	}

}
