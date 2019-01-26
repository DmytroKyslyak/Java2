package ua.univer.Enum;

enum DayOfWeek{
	Monday, Tuesday, Wednesday;
	String name;
	private DayOfWeek() {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
}

public class EnumExample {
	public static void main(String[] args) {
		DayOfWeek Monday = new DayOfWeek.Monday;
		System.out.println(Monday);
	}

}
