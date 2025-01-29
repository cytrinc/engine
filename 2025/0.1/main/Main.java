package main;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;

import java.awt.Color;
import java.awt.FlowLayout;

public class Main {
	public static void main(String[] args) {
		System.out.println("Summoning Window...");
		
        JFrame window = new JFrame();
		
		window.setTitle("BarkEngine 0.1");
		window.setSize(900, 650);
		window.setResizable(true);
		window.setLocationRelativeTo(null);

        window.getContentPane().setBackground(Color.CYAN);

        // wtf why do i have to use html tags for this????
        JLabel info = new JLabel("<html>Welcome to BarkEngine!<br/><br/> NOTE: Projects don't work yet :(</html>");
        JButton button = new JButton("New Project");
         
        window.setLayout(new FlowLayout());
        window.add(info);
        window.add(button);
		
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

        System.out.println("Window apeared!");

	}
}
