package ua.univer.reilway;

import java.util.Stack;

public class Program {
	public static void main(String[] args) {
		//EVagonType vtype = EVagonType.Cargo;
		//System.out.println(vtype);
		
		StackVagon train = new StackVagon();
		StackVagon pass = new StackVagon();
		StackVagon cargo = new StackVagon();
	
		for (int i = 0; i<13; i++) {
			if(i%2==0)
			train.push(new Vagon(EVagonType.Cargo));
			else train.push(new Vagon("Pass")); //два способа одного и тогоже
		}
		train.print();
		while(train.isEmpty()) {
			if(train.peek().getVagonType()==EVagonType.Cargo) 
				cargo.push(train.pop());
				else pass.push(train.pop());
		}
		train.print();
		cargo.print();
		pass.print();
		
		Stack<Vagon> stack = new Stack<>();
		stack.push(new Vagon(EVagonType.Cargo));
		
	}
		
	
}
