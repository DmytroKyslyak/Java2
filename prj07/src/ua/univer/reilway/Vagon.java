package ua.univer.reilway;

enum EVagonType{
		Cargo, Pass;		
}
public class Vagon {
	private EVagonType vagonType;
	
		
	@Override
	public String toString() {
		return super.toString();
		
		
	}	
	public EVagonType getVagonType() {
		return vagonType;
	}
	public void setVagonType(EVagonType vagonType) {
		this.vagonType = vagonType;
	}
	public Vagon(EVagonType vagonType) {
		this.vagonType=vagonType;
	}
	public Vagon(String vagonStr) {
		this.vagonType=EVagonType.valueOf(vagonStr);
	}
	
}
