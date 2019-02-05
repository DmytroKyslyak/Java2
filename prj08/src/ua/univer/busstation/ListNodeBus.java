package ua.univer.busstation;
import java.util.Iterator;

public class ListNodeBus implements Iterable<Bus>{
private class NodeBusIterator implements Iterator<Bus> {
	private NodeBus current;
    public NodeBusIterator(NodeBus head) {
		current = head;
	}
	@Override
	public boolean hasNext() {		
		return current!=null;
	}

	@Override
	public Bus next() {
		Bus bus = current.getData();
		current = current.next;
		return bus;
	}
	
	
}	
    
	private NodeBus head;
	public void addFirst(Bus bus){
		NodeBus node = new NodeBus(bus);
		if(head == null) {
			head = node;
		}
		else {
			node.next = head;
			head = node;
		}
	}
	public void addLast(Bus bus){
		
	}
	public Bus getBus(int i){
		NodeBus current = head;
		int count = 0;
		while(current!=null){
			if (i == count) return current.getData();
			count++;			
			current = current.next;
		}
		return null;
	}
	public void print(){
		NodeBus current = head;
		while(current!=null){
			System.out.println(current.getData());
			current = current.next;
		}
	}
	public void printMyIterator(){
		Iterator<Bus> iterator = this.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
	}
	@Override
	public Iterator<Bus> iterator() {
		// TODO Auto-generated method stub
		return new NodeBusIterator(head);
	}
}
