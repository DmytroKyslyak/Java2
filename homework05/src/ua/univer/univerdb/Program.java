package ua.univer.univerdb;

public class Program {
	
	public static void main(String[] args) {
		try {
			Univer univer = new Univer();
			univer.show();
			//univer.addGroup(new group(5, "Python"));
			//univer.deleteGroup("Python");
			univer.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
