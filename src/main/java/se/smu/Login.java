package se.smu;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame{
	MainProcess main;
	private JTextField id = new JTextField(20);
	private JPasswordField pw= new JPasswordField("",15);
	public Login() {
		this.setLayout(null);
		Font default_font = new Font("맑은 고딕",Font.BOLD,20);
		Color default_color = new Color(0,32,96);		
		
		JLabel Title_label = new JLabel("SMU To do List");
		Title_label.setFont(new Font("HY견고딕",Font.BOLD,30));
		Title_label.setForeground(default_color);
		
		JLabel ID_label= new JLabel("아이디");
		ID_label.setFont(default_font);
		ID_label.setForeground(default_color);
		
		JLabel PW_label= new JLabel("비밀번호");
		PW_label.setFont(default_font);
		PW_label.setForeground(default_color);
		
		JButton btn1 = new JButton("로그인");
		btn1.setFont(default_font);
		btn1.setBackground(default_color);
		btn1.setForeground(new Color(255,255,255));
		btn1.addActionListener(new MyActionListener());

		Title_label.setBounds(190,90,500,200);
		ID_label.setBounds(140, 170, 200, 200);
		PW_label.setBounds(130, 250, 200, 200);
		id.setBounds(220,255,240,40);
		pw.setBounds(220,335,240,40);
		btn1.setBounds(280,430,100,40);
		
		add(PW_label);
		add(id);
		add(ID_label);
		add(pw);
		add(Title_label);
		add(btn1);

		setSize(650,750);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public static void main(String [] args) {

	}
	class MyActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JButton b = (JButton)e.getSource();
			String ID = id.getText();
			String PW = new String(pw.getPassword());
			if(ID.equals("") || PW.equals(""))
				JOptionPane.showMessageDialog(null , "아이디 비밀번호는 필수입력사항입니다.");
			else if(ID.equals("stormers") && PW.equals("stormers")) {
				main.change();
			}
			else 
				JOptionPane.showMessageDialog(null , "아이디 또는 비밀번호가 틀렸습니다.");
			
		}
		
	}
	public void setMain(MainProcess main) {
		this.main=main;
	}
}
