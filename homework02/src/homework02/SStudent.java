package homework02;

public class SStudent extends SVuz{
	private int id;
	private String surname;
	private String name;
	private int year;
	private String adress;
	private int phone;

	public SStudent() {
		id=0;
		surname="";
		name="";
		year=0;
		adress="";
		phone=0;
	}
	
	public SStudent(String facultet, int kurs, String group, int id, String surname, String name, int year, String adress, int phone) {
		super(facultet, kurs, group);
		this.id=id;
		this.surname=surname;
		this.name=name;
		this.year=year;
		this.adress=adress;
		this.phone=phone;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student ["+ super.toString() + ", id=" + id + ", surname=" + surname + ", name=" + name + ", year=" + year + ", adress=" + adress + ", phone=" + phone + "]";
	}
}
