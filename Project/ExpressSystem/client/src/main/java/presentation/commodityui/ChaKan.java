/**
 * 库存查看界面
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

public class ChaKan extends JPanel {
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public ChaKan() {
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
	        { "编号", "类型", "时间", "金额", "货物数量","存储位置" };  
	  
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
	            column.setPreferredWidth(130);  
	        }  
	        /* 
	         * 设置JTable自动调整列表的状态，此处设置为关闭 
	         */  
	        table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  
	          
	        /*用JScrollPane装载JTable，这样超出范围的列就可以通过滚动条来查看*/  
	        JScrollPane scroll = new JScrollPane(table);  
	        scroll.setLocation(20, 40);
	        scroll.setSize(1080, 162);  
	          
	          
	        add(scroll);  
	        
	        JLabel label = new JLabel("库存列表");
	        label.setBounds(10, 10, 103, 15);
	        add(label);
	        
	        JLabel label_1 = new JLabel("起始日期");
	        label_1.setBounds(105, 10, 93, 15);
	        add(label_1);
	        
	        textField = new JTextField();
	        textField.setBounds(170, 4, 117, 28);
	        add(textField);
	        textField.setColumns(10);
	        
	        JButton button = new JButton("查询");
	        button.setBounds(520, 6, 82, 23);
	        add(button);
	        
	        JLabel label_2 = new JLabel("截止日期");
	        label_2.setBounds(294, 10, 84, 15);
	        add(label_2);
	        
	        textField_1 = new JTextField();
	        textField_1.setBounds(388, 7, 66, 21);
	        add(textField_1);
	        textField_1.setColumns(10);
	        
	        JLabel label_3 = new JLabel("合计：");
	        label_3.setBounds(10, 212, 54, 15);
	        add(label_3);
	        this.setVisible(true);  
	        
	        
	        
	        String[] columnNames1 =  
		        { "编号",  "时间", "快递编号", "存储位置" };  
		  
		        /* 
		         * 初始化JTable里面各项的值 
		         */  
		        Object[][] obj1 = new Object[1][4];  
		        for (int i = 0; i < 1; i++)  
		        {  
		            for (int j = 0; j < 4; j++)  
		            {  
		                switch (j)  
		                {  
		                case 0:  
		                    obj1[i][j] = "0lala";  
		                    break;  
		                case 1:  
		                    obj1[i][j] = "翔";  
		                    break;  
		                case 2:  
		                    obj1[i][j] = "000";  
		                    break;  
		                case 3:  
		                    obj1[i][j] = "2011-11-11";  
		                    break;  
		                
		                }  
		            }  
		        }  
		          
		          
		        /* 
		         * JTable的其中一种构造方法 
		         */  
		        JTable table1 = new JTable(obj1, columnNames1);  
		        /* 
		         * 设置JTable的列默认的宽度和高度 
		         */  
		        TableColumn column1 = null;  
		        int colunms1 = table1.getColumnCount();  
		        for(int i = 0; i < colunms1; i++)  
		        {  
		            column1 = table1.getColumnModel().getColumn(i);  
		            /*将每一列的默认宽度设置为100*/  
		            column1.setPreferredWidth(200);  
		        }  
		        /* 
		         * 设置JTable自动调整列表的状态，此处设置为关闭 
		         */  
		        table1.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);  
		          
		        /*用JScrollPane装载JTable，这样超出范围的列就可以通过滚动条来查看*/  
		        JScrollPane scroll1 = new JScrollPane(table1);  
		        scroll1.setLocation(10, 237);
		        scroll1.setSize(1100, 209);  
		          
		          
		        add(scroll1);
	        
	    }  
	    public void paintComponent(Graphics g) {
			 super.paintComponents(g);
			 ImageIcon img = new ImageIcon("image/0111.jpg");
			 g.drawImage(img.getImage(), 0, 0, null);
			}
}
