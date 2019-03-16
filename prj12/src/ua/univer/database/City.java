package ua.univer.database;

public class City {
	private int id; 
	private String name;
	private boolean iscap;
	private int count;
	private String country;
	public City(int id, String name, boolean iscap, int count, String country) {		
		this.id = id;
		this.name = name;
		this.iscap = iscap;
		this.count = count;
		this.country = country;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "City [id=" + id + ", name=" + name + ", iscap=" + iscap + ", count=" + count + ", country=" + country
				+ "]";
	}

	/**
	 * @return the count
	 */
	public int getCount() {
		return count;
	}

	/**
	 * @param count the count to set
	 */
	public void setCount(int count) {
		this.count = count;
	}

	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the iscap
	 */
	public boolean isIscap() {
		return iscap;
	}
	/**
	 * @param iscap the iscap to set
	 */
	public void setIscap(boolean iscap) {
		this.iscap = iscap;
	}
	/**
	 * @return the count
	 */

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	
}
