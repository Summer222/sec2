package presentation.financeui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

import presentation.logisticui.CourierFrame;
import presentation.util.welcomPanel;

public class financeFrame extends JFrame {

	private JPanel contentPane;
	private JPanel bankpanel;
	private welcomPanel welcome;
	/**
	 * 窗口宽度
	 */
	private static final int WIDTH = 1280;
	
	/**
	 * 窗口高度
	 */
	private static final int HEIGHT = 720;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					financeFrame frame = new financeFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static void changeLook() {
	    try {
	    	BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencySmallShadow;
	        org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
	        // 关闭右上角设置
	       UIManager.put("RootPane.setupButtonVisible", false);
	    } catch(Exception e) {
	    }
	}
	
	private static void changeFont() {
		Font font = new Font("微软雅黑", Font.PLAIN, 15);   
		@SuppressWarnings("rawtypes")
		java.util.Enumeration keys = UIManager.getDefaults().keys();   
		while (keys.hasMoreElements()) {
			Object key = keys.nextElement();   
		    Object value = UIManager.get(key);    
		    if (value instanceof javax.swing.plaf.FontUIResource) {
		    	UIManager.put(key, font);     
		    } 
		} 
	}
	
	public  void setClose() {
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				super.windowClosing(e);
				int result = JOptionPane.showConfirmDialog(financeFrame.this, "确认退出？","系统提示",
						JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
				if(result == JOptionPane.YES_OPTION) {
					System.exit(0);
				} else {
					return;
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public financeFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH,HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setResizable(false);//不可调整大小
		setTitle("MinJW物流管理系统");
		
		JPanel panel = new JPanel(){
			public void paintComponent(Graphics g) {
				 super.paintComponent(g);
				 ImageIcon img = new ImageIcon("image/henfu.png");
				 g.drawImage(img.getImage(), 0, 0, null);
				}
				};
		panel.setBounds(0, 0, 1280, 100);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, Color.LIGHT_GRAY, Color.LIGHT_GRAY));
		panel_1.setBounds(0, 100, 1280, 25);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		bankpanel = new JPanel();
		bankpanel.setBounds(138, 125, 1152, 446);
		contentPane.add(bankpanel);
		bankpanel.setLayout(null);
		welcome = new welcomPanel();
		welcome.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		welcome.setBounds(0, 0, 1152, 446);
		bankpanel.add(welcome);
		welcome.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(6, 0, 132, 22);
		panel_1.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("系统（S）");
		menuBar.add(mnNewMenu);
		
		JMenu mnf = new JMenu("功能（F）");
		menuBar.add(mnf);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 570, 350, 124);
		contentPane.add(panel_2);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(347, 570, 933, 124);
		contentPane.add(panel_3);
	}
}
