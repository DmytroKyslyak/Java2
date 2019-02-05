package ua.univer.railway;

import java.util.Stack;

public class Program {

	public static void main(String[] args) {
		IStackVagon train = new StackVagon2();
		IStackVagon pass = new StackVagon3();
		IStackVagon cargo = new StackVagon();

		for (int i = 0; i < 13; i++) {
			if (i % 2 == 0)
				train.push(new Vagon(EVagonType.Cargo));
			else
				train.push(new Vagon("Pass"));
		}
		train.print();
		while (!train.isEmpty()) {
			if (train.peek().getVagonType() == EVagonType.Cargo)
				cargo.push(train.pop());
			else
				pass.push(train.pop());
		}
		train.print();
		cargo.print();
		pass.print();
		
		
	}

}
