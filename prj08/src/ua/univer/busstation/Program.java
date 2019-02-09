package ua.univer.busstation;

public class Program {
	public static void main(String[] args) {
		ListNodeBus autopark = new ListNodeBus();
		autopark.addFirst(new Bus(1, "Vasya", 11));
		autopark.addFirst(new Bus(2, "Basya", 11));
		autopark.addFirst(new Bus(3, "Tasya", 11));
		autopark.addFirst(new Bus(4, "Masya", 11));
		autopark.print();
		System.out.println("******************");
		for (int i = 0; i < 4; i++) {
			System.out.println(autopark.getBus(i));
		}
		System.out.println("******************");
		for (Bus bus : autopark) {
			System.out.println(bus);
		}
	}

}