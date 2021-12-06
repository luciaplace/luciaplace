package day1111.collection;

import java.util.*;

public class StackEx1 {
	
	public static Stack<String> back    = new Stack<>();//�ڷΰ��� ��ư

	public static Stack<String> forward = new Stack<>();//������ ���� ��ư 

	public static void main(String[] args) {
		goURL("1.����Ʈ");
		goURL("2.����");
		goURL("3.���̹�");
		goURL("4.����");

		printStatus();

		goBack();
		System.out.println("= �ڷΰ��� ��ư�� ���� �� =");  
		printStatus();

		goBack();
		System.out.println("= '�ڷ�' ��ư�� ���� �� =");  
		printStatus();

		goForward();
		System.out.println("= '������' ��ư�� ���� �� =");  
		printStatus();

		goURL("codechobo.com");
		System.out.println("= ���ο� �ּҷ� �̵� �� =");  
		printStatus();
	}

	public static void printStatus() {
		System.out.println("back:"+back);
		System.out.println("forward:"+forward);
		System.out.println("����ȭ���� '" + back.peek()+"' �Դϴ�.");  
		System.out.println();
	}

	public static void goURL(String url){
		back.push(url);
		if(!forward.empty()) 
			forward.clear();
	}

	public static void goForward(){
		if(!forward.empty())
			back.push(forward.pop());
	}

	public static void goBack(){
		if(!back.empty())
			forward.push(back.pop());
	}
}
