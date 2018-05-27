package com.iceyyy.iceswing;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
		JFrame jframe = new JFrame();
		JPanel jpanel = new JPanel();
		jframe.add(jpanel);
		jframe.setTitle("启动窗体");
		jframe.setSize(300, 300);
		jframe.setLocation(500, 200);
		jframe.setVisible(true);
		jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
