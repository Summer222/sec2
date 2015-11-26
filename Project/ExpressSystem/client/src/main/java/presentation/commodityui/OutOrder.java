/**
 * 出库主界面
 * 
 * @author wqy
 *
 */
package presentation.commodityui;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.JSplitPane;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class OutOrder extends JPanel {
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_7;

	/**
	 * Create the panel.
	 */
	public OutOrder() {
		setSize(1152,446);
		setLayout(null);
		intiComponent();
	}
	
	  
	    /** 
	     * 初始化窗体组件 
	     */  
	    private void intiComponent()    {  
	        /* 
	         * 设置JTable的列名 
	         */  
	        String[] columnNames =  
	        { "序号", "快递编号", "出库日期", "目的地", "装运形式","中转单编号" };  
	  
	        /* 
	         * 初始化JTable里面各项的值 
	         */  
	        Object[][] obj = new Object[1][6];  
	        for (int i = 0; i < 1; i++)  
	        {  
	            for (int j = 0; j < 6; j++)  
	            {  
	                switch (j)  
	                {  
	                case 0:  
	                    obj[i][j] = "001";  
	                    break;  
	                case 1:  
	                    obj[i][j] = "王翔翔";  
	                    break;  
	                case 2:  
	                    obj[i][j] = "男";  
	                    break;  
	                case 3:  
	                    obj[i][j] = "2011-11-11";  
	                    break;  
	                case 4:  
	                    obj[i][j] = "32088888888";  
	                    break;  
	                case 5:  
	                    obj[i][j] = "1388888";  
	                    break;  
	                }  
	            }  
	        }  
	          
	          
	        /* 
	         * JTable的其中一种构造方法 
	         */  
	        JTable table = new JTable(obj, columnNames);  
	        /* 
	         * 设置JTable的列默认的宽度和高度 
	         */  
	        TableColumn column = null;  
	        int colunms = table.getColumnCount();  
	        for(int i = 0; i < colunms; i++)  
	        {  
	            column = table.getColumnModel().getColumn(i);  
	            /*将每一列的默认宽度设置为100*/  
	            column.setPreferredWidth(100);  
	        }  
	        /* 
	         * 设置JTable自动调整列表的状态，此处设置为关闭 
	         */  
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  
	          
	        /*用JScrollPane装载JTable，这样超出范围的列就可以通过滚动条来查看*/  
	        JScrollPane scroll = new JScrollPane(table);  
	        scroll.setLocation(10, 40);
	        scroll.setSize(810, 272);  
	          
	          
	        add(scroll);  
	        
	        JLabel label = new JLabel("输入出库单");
	        label.setBounds(10, 10, 103, 15);
	        add(label);
	        
	        JButton button_1 = new JButton("提交");
	        button_1.setBounds(685, 359, 93, 23);
	        add(button_1);
	        
	        JLabel label_2 = new JLabel("货物信息");
	        label_2.setBounds(999, 10, 93, 15);
	        add(label_2);
	        
	        JLabel label_3 = new JLabel("快递编号");
	        label_3.setBounds(878, 57, 87, 15);
	        add(label_3);
	        
	        JLabel label_4 = new JLabel("出库日期");
	        label_4.setBounds(878, 108, 87, 15);
	        add(label_4);
	        
	        JLabel label_5 = new JLabel("目的地");
	        label_5.setBounds(878, 147, 87, 15);
	        add(label_5);
	        
	        JButton button_2 = new JButton("加入");
	        button_2.setBounds(1021, 300, 93, 23);
	        add(button_2);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(987, 54, 127, 21);
	        add(textField_1);
	        textField_1.setColumns(10);
	        
	        textField_2 = new JTextField();
	        textField_2.setBounds(987, 105, 127, 21);
	        add(textField_2);
	        textField_2.setColumns(10);
	        
	        textField_7 = new JTextField();
	        textField_7.setBounds(1021, 247, 66, 21);
	        add(textField_7);
	        textField_7.setColumns(10);
	        
	        JLabel lblNewLabel = new JLabel("装运形式");
	        lblNewLabel.setBounds(878, 203, 73, 15);
	        add(lblNewLabel);
	        this.setVisible(true);  
	        
	        
	        String[] orderType = { "铁路", "公路","空运"};
			JComboBox comboBox = new JComboBox(orderType);
			comboBox.setBounds(999, 200, 142, 21);
			comboBox.insertItemAt("请选择", 0);
			comboBox.setSelectedIndex(0);
			comboBox.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
				}
				});
			add(comboBox);
	        
			

	        String[] orderType1 = { "中转单编号", "汽运编号"};
			JComboBox comboBox1 = new JComboBox(orderType1);
			comboBox1.setBounds(869, 247, 142, 21);
			comboBox1.setSelectedIndex(0);
			comboBox1.addItemListener(new ItemListener() {
				public void itemStateChanged(ItemEvent e) {
				}
				});
			add(comboBox1);
			
	    }  
	    public void paintComponent(Graphics g) {
			 super.paintComponents(g);
			 ImageIcon img = new ImageIcon("image/0111.jpg");
			 g.drawImage(img.getImage(), 0, 0, null);
			}
}
