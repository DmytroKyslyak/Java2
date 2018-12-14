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
		st.add(new SStudent("IPSA", 5, "SM-51", 556678, "Daniels", "Jack", 2001, "Kiev", 8333433));
		st.add(new SStudent("IPSA", 4, "ST-41", 558879, "Smirnoff", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("RTF", 3, "SD-31", 5568680, "Ivanov", "Gleb", 2005, "Kiev", 9998433));
		st.add(new SStudent("RTF", 4, "ST-41", 558881, "Petrov", "Marat", 2002, "Lviv", 4220433));
		st.add(new SStudent("FIVT", 4, "ST-41", 558882, "Lincoln", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("FIVT", 3, "ST-31", 5568683, "Franklin", "Jack", 2004, "Kiev", 7777433));
		st.add(new SStudent("FIVT", 5, "SD-51", 556684, "Ivanov", "Stss", 2001, "Kiev", 8333433));
		st.add(new SStudent("RTF", 4, "ST-41", 558885, "Petrov", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("RTF", 3, "SD-31", 5568686, "Ivanov", "Greg", 2005, "Kiev", 9998433));
		st.add(new SStudent("RTF", 3, "ST-31", 5568687, "Ivanov", "Alex", 2000, "Kiev", 9998433));
		st.add(new SStudent("FIVT", 3, "SK-31", 5568688, "Jamson", "Jack", 2000, "Kiev", 9998433));
		st.add(new SStudent("FIVT", 5, "SD-51", 556689, "Washington", "Jack", 2001, "Kiev", 3833343));
		st.add(new SStudent("IPSA", 4, "SM-41", 558890, "Petrov", "Ivan", 2002, "Lviv", 4220433));
		st.add(new SStudent("IPSA", 3, "ST-31", 5568691, "Sidorov", "Jack", 2004, "Kiev", 7777433));
		
		
		//st.print();
		System.out.println("Задание A");	
		st.printStudentsByFacultet("RTF");
		System.out.println("Задание B");
		st.printStudentsByFacKurs("IPSA", 5);
		System.out.println("Задание C");
		st.printStudentsByYear(2005);
		System.out.println("Задание D");
		st.printStudentsByGroup("ST-51");
	

	}

}
