package day1111.collection;

import java.util.*;

public class StackQueueEx {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<String>();
		Queue<String> q = new LinkedList<>();
		
		q.offer("0");
		q.offer("1");
		q.offer("2");
		
		while(!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
		stack.push("0");
		stack.push("1");
		stack.push("2");

		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
	}

}
