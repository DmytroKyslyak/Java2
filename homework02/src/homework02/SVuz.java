package homework02;

public abstract class SVuz {
	private String facultet;
	private int kurs;
	private String group;
	
	public SVuz() {
		facultet = "";
		kurs = 0;
		group = "";
	}
	public SVuz(String facultet, int kurs, String group) {
		this.facultet=facultet;
		this.kurs=kurs;
		this.group=group;
	}
	public String getFacultet() {
		return facultet;
	}
	public void setFacultet(String facultet) {
		this.facultet = facultet;
	}
	public int getKurs() {
		return kurs;
	}
	public void setKurs(int kurs) {
		this.kurs = kurs;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}
	
	@Override
	public String toString() {
		return "Facultet = "+ facultet + ", Kurs=" + kurs + ", Group=" + group + "";
	}
}
