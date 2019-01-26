package ua.univer.reilway;

import java.util.Arrays;

public class StackVagon {
	private Vagon [] masVagon;
	private int top;
	public StackVagon() {
		masVagon= new Vagon[10];
		top = -1;
	}	
	public Vagon peek() {
		return masVagon[top];
	}
	private void eraseCapacity() {
		// Vagon [] temp = new Vagon[masVagon.length*2];
		//masVagon = temp;
	//temp = Arrays.copyOf(masVagon, masVagon.length);
	//masVagon = temp;

	masVagon = Arrays.copyOf(masVagon, masVagon.length*2);
	
	}
	
	
	
	public Vagon push(Vagon v) {
		
		if(isFull())eraseCapacity();
		masVagon[++top] = v;
		return v;
	}	
	public Vagon pop() {
		if(!isEmpty()) {
			Vagon v = masVagon[top];
			masVagon[top] = null;
			top--;
			return v;
		}
		else return null;
	}
	public boolean isEmpty() {
		return top==-1;
	}
	public boolean isFull() {
		return top==masVagon.length-1;
	}
	public int size() {
		return top+1;
	}
	public void print() {
		System.out.println("*****************");
		for(int i=0; i<size(); i++) {
			System.out.println(masVagon[i]);
		}
	}
}
