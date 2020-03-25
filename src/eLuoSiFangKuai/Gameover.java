package eLuoSiFangKuai;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gameover extends JFrame {

	private JPanel contentPane;
	

	public Gameover(int score,int line,Tetris panel) {
		setTitle("\u6E38\u620F\u7ED3\u675F");
		setBounds(420, 250, 450, 218);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u6E38\u620F\u7ED3\u675F");
		label.setForeground(Color.BLUE);
		label.setFont(new Font("宋体", Font.BOLD, 30));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setBounds(10, 10, 416, 50);
		contentPane.add(label);
		
		JLabel lblNewLabel = new JLabel("\u5F97\u5206:"+score);
		lblNewLabel.setFont(new Font("宋体", Font.PLAIN, 25));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 70, 194, 50);
		contentPane.add(lblNewLabel);
		
		JLabel label_1 = new JLabel("消除了"+line+"行");
		label_1.setHorizontalAlignment(SwingConstants.CENTER);
		label_1.setFont(new Font("宋体", Font.PLAIN, 25));
		label_1.setBounds(214, 70, 212, 50);
		contentPane.add(label_1);
		
		JButton btnNewButton = new JButton("\u91CD\u65B0\u5F00\u59CB");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.moveInitAction();
				dispose();
			}
		});
		btnNewButton.setBounds(10, 130, 194, 39);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u9000\u51FA");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(EXIT_ON_CLOSE);
			}
		});
		btnNewButton_1.setBounds(214, 130, 212, 39);
		contentPane.add(btnNewButton_1);
	}
}
