package swingDemo;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainSwing extends JFrame{
	private TextPanel textPanel;
	private MenuBar bar;
	private JButton clear;
	public MainSwing() {
		super("Demo");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(700,500);
		setLayout(new BorderLayout());
		
		textPanel= new TextPanel();
		add(textPanel,BorderLayout.CENTER);
		
		bar = new MenuBar();
		bar.setTextArea(textPanel.getArea());
		add(bar,BorderLayout.NORTH);
		setVisible(true);
		
		clear = new JButton("Clear");
		add(clear,BorderLayout.SOUTH);
		clear.addActionListener((e)->{
			textPanel.getArea().setText("");
		});
	}
}
