package homework02;

	public class SList {
		private SStudent[] student;
		private int count;
		
		
		public SList() {
			student = new SStudent[15];
			count=-1;
		}
		public void add(SStudent st) {
			student[++count] = st;
		}
		public SStudent get(int i){
			if(i<size())
			return student[i];
			else return null;
		}
		public void set(int i, SStudent c) {
			if(i<size())
				student[i] = c;
		}
		public int size() {
			return count+1;
		}
		 public void print() {
				for (int i = 0; i < size(); i++) {		
					System.out.println(student[i]);
				}
		
		 }
		 public void printStudentsByFacultet(String facultet) {
			 for (int i = 0; i < size(); i++) {
				 if (student[i].getFacultet().equals(facultet)) {
					 System.out.println(student[i]); }
			 }		 
		 }
		 public SList getStudentsByFacultet(String name) {
			 SList studentsByFacultet = new SList();
			 for (int i = 0; i < size(); i++) {
				 if (student[i].getFacultet().equals(name)) {
					 studentsByFacultet.add(student[i]); }
			 }		 
			 return studentsByFacultet;
		 }
		
		 public void printSort() {
			 for (int i = 0; i < size(); i++) {
				  System.out.println(student[i]); 
			 }		 
		 }
		/*
		 public SList Sort() {
			 SList sort = new SList();
			 for (int i = 0; i < size(); i++) {
				if (student[i].getKurs()==0) {
				 
					 sort.add(student[i]); 
					 }
			 }		 
			 return sort;
		 } 
		 */
		 
		 
		 
		 public void printStudentsByYear(int year) {
			 for (int i = 0; i < size(); i++) {
				 if (student[i].getYear()>=year) {
					 System.out.println(student[i]); }
			 }		 
		 }
		 public SList getStudentsByYear(int year) {
			 SList studentsByYear = new SList();
			 for (int i = 0; i < size(); i++) {
				 if (student[i].getYear()>=year) {
					 studentsByYear.add(student[i]); }
			 }		 
			 return studentsByYear;
		 } 
		 
		 
		 public void printStudentsByGroup(String group) {
			 for (int i = 0; i < size(); i++) {
				 if (student[i].getGroup().equals(group)) {
					 System.out.println(student[i]); }
			 }		 
		 }
		 public SList getStudentsByGroup(String group) {
			 SList studentsByGroup = new SList();
			 for (int i = 0; i < size(); i++) {
				 if (student[i].getGroup().equals(group)) {
					 studentsByGroup.add(student[i]); }
			 }		 
			 return studentsByGroup;
		 } 
		 
		 
}
