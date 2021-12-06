package day1115.inner;

import java.awt.*;
import java.awt.event.*;

public class Anonymousinner extends Frame {
	Button b1 = new Button("버튼1");
	Button b2 = new Button("버튼2");
	Button b3 = new Button("버튼3");
	Anonymousinner() {
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e ) {
				System.out.println("버튼이 눌림 ");
			}
		}
				);
		add(b1);
		setBounds(200, 200, 500, 500);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Anonymousinner();
	}
}
class EventHandler implements ActionListener {
	//버튼에 액션이 발생하는 순간 actionPerfomed() 자동 호출 
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 눌렸습니다.");
	}
}