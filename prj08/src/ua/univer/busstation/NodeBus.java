package ua.univer.busstation;

public class NodeBus {
	public NodeBus(Bus bus) {
		data = bus;
		next = null;
	}

	private Bus data;

	public Bus getData() {
		return data;
	}

	public NodeBus next;
}