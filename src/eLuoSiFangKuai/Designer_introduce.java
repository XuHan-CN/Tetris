package eLuoSiFangKuai;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Designer_introduce extends JFrame {

	private JPanel contentPane;


	/**
	 * Create the frame.
	 */
	public Designer_introduce(Tetris panel) {
		setTitle("\u5F00\u53D1\u8005\u4ECB\u7ECD");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(420, 250, 211, 179);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u5236\u4F5C\u4EBA\uFF1A\u97E9\u65ED");
		label.setBounds(10, 10, 416, 21);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u5236\u4F5C\u65F6\u95F4\uFF1A2019/7/1~2019/7/14");
		label_1.setBounds(10, 72, 416, 21);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("\u4F5C\u54C1\u540D\u79F0\uFF1A\u4FC4\u7F57\u65AF\u65B9\u5757");
		label_2.setBounds(10, 41, 416, 21);
		contentPane.add(label_2);
		
		JButton button = new JButton("\u786E\u5B9A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		button.setBounds(20, 103, 158, 29);
		contentPane.add(button);
	}
}
