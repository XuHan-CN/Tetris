package eLuoSiFangKuai;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.lang.Thread.State;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Main extends JFrame{
	
	private static final long serialVersionUID = 5535335146564070229L;
	Tetris panel;// = new Tetris();
	
	public static void main(String[] args) {
		Main window = new Main();
		window.setVisible(true);
		Tetris panel = new Tetris();
		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setSize(538, 598);
		window.setLocationRelativeTo(null);
		
		//使当前游戏区获得焦点
		panel.requestFocus();
		panel.start();
		panel.requestFocus();
	}
	
	public Main() {
		setTitle("俄罗斯方块");
		
		JMenuBar menubar = new JMenuBar();
		setJMenuBar(menubar);
		
		JMenu menu1 = new JMenu("游戏");
		menubar.add(menu1);
		
		JMenuItem menuitem11 = new JMenuItem("排行榜");
		menu1.add(menuitem11);
		
		JMenu menu2 = new JMenu("控制");
		menubar.add(menu2);
		
		JMenuItem menuitem21 = new JMenuItem("重新开始");
		menu2.add(menuitem21);
		menuitem21.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根

			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
		
		JMenuItem menuitem22 = new JMenuItem("暂停");
		menu2.add(menuitem22);
		
		JMenu menu3 = new JMenu("游戏介绍");
		menubar.add(menu3);
		
		JMenuItem menuitem31 = new JMenuItem("玩法介绍");
		menu3.add(menuitem31);
		menuitem31.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根
				Regular_introduce regular_introduce = new Regular_introduce();
				regular_introduce.setVisible(true);
				regular_introduce.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
		
		JMenuItem menuitem32 = new JMenuItem("开发者介绍");
		menu3.add(menuitem32);
		menuitem32.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO 自动生成的方法存根
				//int pause = panel.getPAUSE();
				Designer_introduce designer_introduce = new Designer_introduce(panel);
				designer_introduce.setVisible(true);
				designer_introduce.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO 自动生成的方法存根
				
			}
		});
	}
	

}
