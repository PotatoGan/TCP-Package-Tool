/****************************************************************************
 * 																			*
 * 				Transmission Control Protocol package Tool					*
 * 																			*
 ****************************************************************************
 *																			*
 * 								TCPÐ­Òé°ü¹¤¾ß								*
 * 																			*
 ****************************************************************************
 * 
 * 					Writen by Zhou
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */





package TCPGUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.MenuListener;
import javax.swing.event.MenuEvent;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JTextArea;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;


public class tcpWin extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JTextField textField_10;
	private JLabel lblNewLabel_5;
	private JTextField textField_11;
	private JLabel lblNewLabel_6;
	private JTextField textField_12;
	private JLabel lblNewLabel_7;
	private JTextField textField_13;
	private JLabel lblNewLabel_8;
	private JTextField textField_14;
	private JLabel lblNewLabel_9;
	private JTextField textField_15;
	private JLabel lblNewLabel_10;
	private JTextField textField_16;
	private JLabel lblNewLabel_11;
	private JTextField textField_17;
	private JLabel lblNewLabel_12;
	private JTextField textField_18;
	private JLabel lblNewLabel_13;
	private JTextField textField_19;
	private JLabel lblNewLabel_14;
	private JTextField textField_20;
	private JTextField textField_21;
	private JTextField textField_22;
	private JTextField textField_23;
	private JTextField textField_24;
	private JTextField textField_25;
	private JTextField textField_26;
	private JTextField textField_27;
	private JTextField textField_28;
	private JTextField textField_29;
	private JTextField textField_30;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				
				try	{
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			    }
			    catch(Exception e) {
			        //TODO exception
			    }
				
				try {
					tcpWin frame = new tcpWin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	private static String addZero(String str, int x) {	//×Ö·û´®ÓÃ0²¹Î»
		while(str.length() != x) {
			str = "0" + str;
		}
		return str;
	}

	/**
	 * Create the frame.
	 */
	public tcpWin() {
		setTitle("TCP\u534F\u8BAE\u5305\u81EA\u52A8\u751F\u6210\u5DE5\u5177");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 12));
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u6587\u4EF6");
		mnNewMenu.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5BFC\u5165");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				importPackage.main(new String[] {});
			}
		});
		mntmNewMenuItem_1.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("\u5BFC\u51FA");
		mntmNewMenuItem.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 14));
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E");
		mnNewMenu_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 14));
		mnNewMenu_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				aboutWin.main(new String[] {});
			}
		});
		menuBar.add(mnNewMenu_1);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u6E90\u7AEF\u53E3\uFF1A");
		lblNewLabel.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel.setBounds(450, 52, 64, 32);
		panel.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField.setBounds(511, 52, 71, 32);
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u76EE\u7684\u7AEF\u53E3\uFF1A");
		lblNewLabel_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(597, 52, 80, 32);
		panel.add(lblNewLabel_1);
		
		textField_7 = new JTextField();
		textField_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_7.setColumns(10);
		textField_7.setBounds(677, 52, 64, 32);
		panel.add(textField_7);
		
		JLabel lblNewLabel_2 = new JLabel("\u5E8F\u53F7\uFF1A");
		lblNewLabel_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(464, 95, 50, 32);
		panel.add(lblNewLabel_2);
		
		textField_8 = new JTextField();
		textField_8.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_8.setColumns(10);
		textField_8.setBounds(511, 94, 80, 32);
		panel.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_9.setColumns(10);
		textField_9.setBounds(670, 95, 71, 32);
		panel.add(textField_9);
		
		lblNewLabel_3 = new JLabel("\u786E\u8BA4\u53F7\uFF1A");
		lblNewLabel_3.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(610, 95, 67, 32);
		panel.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\u6570\u636E\u504F\u79FB\uFF1A");
		lblNewLabel_4.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(433, 137, 80, 32);
		panel.add(lblNewLabel_4);
		
		textField_10 = new JTextField();
		textField_10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_10.setColumns(10);
		textField_10.setBounds(511, 137, 80, 32);
		panel.add(textField_10);
		
		lblNewLabel_5 = new JLabel("\u4FDD\u7559\uFF1A");
		lblNewLabel_5.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(614, 137, 50, 32);
		panel.add(lblNewLabel_5);
		
		textField_11 = new JTextField();
		textField_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_11.setColumns(10);
		textField_11.setBounds(661, 136, 80, 32);
		panel.add(textField_11);
		
		lblNewLabel_6 = new JLabel("URG\uFF1A");
		lblNewLabel_6.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(464, 179, 50, 32);
		panel.add(lblNewLabel_6);
		
		textField_12 = new JTextField();
		textField_12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_12.setColumns(10);
		textField_12.setBounds(511, 179, 80, 32);
		panel.add(textField_12);
		
		lblNewLabel_7 = new JLabel("ACK\uFF1A");
		lblNewLabel_7.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(614, 180, 50, 32);
		panel.add(lblNewLabel_7);
		
		textField_13 = new JTextField();
		textField_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_13.setColumns(10);
		textField_13.setBounds(661, 179, 80, 32);
		panel.add(textField_13);
		
		lblNewLabel_8 = new JLabel("PSH\uFF1A");
		lblNewLabel_8.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(464, 223, 50, 32);
		panel.add(lblNewLabel_8);
		
		textField_14 = new JTextField();
		textField_14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_14.setColumns(10);
		textField_14.setBounds(511, 222, 80, 32);
		panel.add(textField_14);
		
		lblNewLabel_9 = new JLabel("RST\uFF1A");
		lblNewLabel_9.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(614, 223, 50, 32);
		panel.add(lblNewLabel_9);
		
		textField_15 = new JTextField();
		textField_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_15.setColumns(10);
		textField_15.setBounds(661, 222, 80, 32);
		panel.add(textField_15);
		
		lblNewLabel_10 = new JLabel("SYN\uFF1A");
		lblNewLabel_10.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_10.setBounds(464, 266, 50, 32);
		panel.add(lblNewLabel_10);
		
		textField_16 = new JTextField();
		textField_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_16.setColumns(10);
		textField_16.setBounds(511, 265, 80, 32);
		panel.add(textField_16);
		
		lblNewLabel_11 = new JLabel("FIN\uFF1A");
		lblNewLabel_11.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_11.setBounds(614, 266, 50, 32);
		panel.add(lblNewLabel_11);
		
		textField_17 = new JTextField();
		textField_17.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_17.setColumns(10);
		textField_17.setBounds(661, 265, 80, 32);
		panel.add(textField_17);
		
		lblNewLabel_12 = new JLabel("\u7A97\u53E3\u5C3A\u5BF8\uFF1A");
		lblNewLabel_12.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_12.setBounds(433, 308, 81, 32);
		panel.add(lblNewLabel_12);
		
		textField_18 = new JTextField();
		textField_18.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_18.setColumns(10);
		textField_18.setBounds(511, 308, 69, 32);
		panel.add(textField_18);
		
		lblNewLabel_13 = new JLabel("\u7D27\u6025\u6307\u9488\uFF1A");
		lblNewLabel_13.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_13.setBounds(433, 392, 80, 32);
		panel.add(lblNewLabel_13);
		
		textField_19 = new JTextField();
		textField_19.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_19.setColumns(10);
		textField_19.setBounds(511, 392, 69, 32);
		panel.add(textField_19);
		
		lblNewLabel_14 = new JLabel("\u9009\u9879\uFF1A");
		lblNewLabel_14.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_14.setBounds(614, 392, 50, 32);
		panel.add(lblNewLabel_14);
		
		textField_20 = new JTextField();
		textField_20.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_20.setColumns(10);
		textField_20.setBounds(661, 391, 80, 32);
		panel.add(textField_20);
		
		JButton btnNewButton = new JButton("\u8BA1\u7B97\u6821\u9A8C\u548C");
		
		btnNewButton.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		btnNewButton.setBounds(610, 350, 131, 32);
		panel.add(btnNewButton);
		
		textField_21 = new JTextField();
		textField_21.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_21.setColumns(10);
		textField_21.setBounds(511, 351, 91, 31);
		panel.add(textField_21);
		
		JLabel lblNewLabel_12_1 = new JLabel("\u6821\u9A8C\u548C\uFF1A");
		lblNewLabel_12_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_12_1.setBounds(450, 350, 64, 32);
		panel.add(lblNewLabel_12_1);
		
		textField_22 = new JTextField();
		textField_22.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_22.setColumns(10);
		textField_22.setBounds(289, 94, 50, 32);
		panel.add(textField_22);
		
		textField_23 = new JTextField();
		textField_23.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_23.setColumns(10);
		textField_23.setBounds(229, 94, 50, 32);
		panel.add(textField_23);
		
		textField_24 = new JTextField();
		textField_24.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_24.setColumns(10);
		textField_24.setBounds(169, 94, 50, 32);
		panel.add(textField_24);
		
		textField_25 = new JTextField();
		textField_25.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_25.setColumns(10);
		textField_25.setBounds(109, 94, 50, 32);
		panel.add(textField_25);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u76EE\u7684\u5730\u5740\uFF1A");
		lblNewLabel_1_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(31, 94, 80, 32);
		panel.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_15 = new JLabel("\u6E90\u5730\u5740\uFF1A");
		lblNewLabel_15.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_15.setBounds(48, 52, 64, 32);
		panel.add(lblNewLabel_15);
		
		textField_26 = new JTextField();
		textField_26.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_26.setColumns(10);
		textField_26.setBounds(109, 52, 50, 32);
		panel.add(textField_26);
		
		textField_27 = new JTextField();
		textField_27.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_27.setColumns(10);
		textField_27.setBounds(169, 52, 50, 32);
		panel.add(textField_27);
		
		textField_28 = new JTextField();
		textField_28.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_28.setColumns(10);
		textField_28.setBounds(229, 52, 50, 32);
		panel.add(textField_28);
		
		textField_29 = new JTextField();
		textField_29.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_29.setColumns(10);
		textField_29.setBounds(289, 52, 50, 32);
		panel.add(textField_29);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"TCP", "UDP"}));
		comboBox.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 14));
		comboBox.setBounds(109, 144, 71, 23);
		panel.add(comboBox);
		
		JLabel lblNewLabel_2_1 = new JLabel("\u534F\u8BAE\uFF1A");
		lblNewLabel_2_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_1.setBounds(61, 137, 50, 32);
		panel.add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_2_2 = new JLabel("\u957F\u5EA6\uFF1A");
		lblNewLabel_2_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_2.setBounds(61, 180, 50, 32);
		panel.add(lblNewLabel_2_2);
		
		textField_30 = new JTextField();
		textField_30.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		textField_30.setColumns(10);
		textField_30.setBounds(108, 179, 80, 32);
		panel.add(textField_30);
		
		JLabel lblNewLabel_16 = new JLabel("\u4F2A\u9996\u90E8");
		lblNewLabel_16.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		lblNewLabel_16.setBounds(10, 10, 71, 32);
		panel.add(lblNewLabel_16);
		
		JLabel lblNewLabel_16_1 = new JLabel("\u9996\u90E8");
		lblNewLabel_16_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		lblNewLabel_16_1.setBounds(404, 10, 50, 32);
		panel.add(lblNewLabel_16_1);
		
		JLabel lblNewLabel_16_2 = new JLabel("\u6570\u636E");
		lblNewLabel_16_2.setFont(new Font("Î¢ÈíÑÅºÚ", Font.BOLD, 20));
		lblNewLabel_16_2.setBounds(17, 266, 64, 32);
		panel.add(lblNewLabel_16_2);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("\u6570\u636E\uFF1A");
		lblNewLabel_2_2_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		lblNewLabel_2_2_1.setBounds(61, 309, 50, 32);
		panel.add(lblNewLabel_2_2_1);
		
		
		//lblNewLabel_17.setIcon(new ImageIcon(ico.getImage().getScaledInstance(lblNewLabel_17.getWidth(), lblNewLabel_17.getHeight(), Image.SCALE_DEFAULT)));
		JLabel lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setBounds(212, 145, 140, 140);
		ImageIcon ico1 = new ImageIcon(tcpWin.class.getResource("/imgs/SCJSWZJ.jpg"));
		ico1.setImage(ico1.getImage().getScaledInstance(lblNewLabel_17.getWidth(), lblNewLabel_17.getHeight(), Image.SCALE_DEFAULT));
		lblNewLabel_17.setIcon(ico1);
		panel.add(lblNewLabel_17);
		
		JButton btnNewButton_1 = new JButton("\u53D1\u9001\u534F\u8BAE\u5305");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				importPackage.main(new String[] {});
			}
		});
		btnNewButton_1.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 16));
		btnNewButton_1.setBounds(546, 467, 131, 32);
		panel.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setTabSize(5);
		textArea.setLineWrap(true);
		textArea.setFont(new Font("Î¢ÈíÑÅºÚ", Font.PLAIN, 14));
		textArea.setBounds(109, 313, 230, 186);
		JScrollPane scrollPane = new JScrollPane(textArea);
		scrollPane.setBounds(109, 313, 230, 186);
		panel.add(scrollPane);
		
		textField_30.addFocusListener(new FocusAdapter() {
			@Override
			public void focusLost(FocusEvent e) {
			}
		});
		
		
		btnNewButton.addActionListener(new ActionListener() {				//**¼ÆËãÐ£ÑéºÍ**//
			public void actionPerformed(ActionEvent e) {
				
				int ip1, ip2, ip3, ip4, ip5, ip6, ip7, ip8;
				int protocol = 6, length;
				
				int soursePort, destinationPort, sequenceNumber, acknowledgmentNumber, dataOffset, reserved = 0, windowSize, urgentPointer;
				int sum1, sum2, sum3, sum4, sum5, sum6, sum7, sum8, sum9, sum10, sum11, sum12, sum13, sum14, sum15, sumAll;
				String URG, ACK, PSH, RST, SYN, FIN, checksum;
				
				ip1 = Integer.parseInt(textField_26.getText());				//ÕûÊýÐÍµÄip
        		ip2 = Integer.parseInt(textField_27.getText());
        		ip3 = Integer.parseInt(textField_28.getText());
        		ip4 = Integer.parseInt(textField_29.getText());
        		ip5 = Integer.parseInt(textField_25.getText());
        		ip6 = Integer.parseInt(textField_24.getText());
        		ip7 = Integer.parseInt(textField_23.getText());
        		ip8 = Integer.parseInt(textField_22.getText());
        		
        		System.out.println(ip1);
        		
        		
        		if(String.valueOf(comboBox.getSelectedItem()) == "TCP")		//Ð­Òé
        			protocol = 6;
        		else if(String.valueOf(comboBox.getSelectedItem()) == "UDP")
        			protocol = 17;
        		
        		System.out.println(protocol);
        		
        		length = Integer.parseInt(textField_30.getText());			//³¤¶È
        		soursePort = Integer.parseInt(textField.getText());			//Ô´¶Ë¿Ú
        		destinationPort = Integer.parseInt(textField_7.getText());	//Ä¿µÄ¶Ë¿Ú
        		sequenceNumber = Integer.parseInt(textField_8.getText());	//ÐòºÅ
        		acknowledgmentNumber = Integer.parseInt(textField_9.getText());	//È·ÈÏºÅ
        		dataOffset = Integer.parseInt(textField_10.getText());		//Êý¾ÝÆ«ÒÆ
        		reserved = Integer.parseInt(textField_11.getText());		//±£Áô
        		URG = textField_12.getText();
        		ACK = textField_13.getText();
        		PSH = textField_14.getText();
        		RST = textField_15.getText();
        		SYN = textField_16.getText();
        		FIN = textField_17.getText();        		
				windowSize = Integer.parseInt(textField_18.getText());		//´°¿Ú³ß´ç
				urgentPointer = Integer.parseInt(textField_19.getText());	//½ô¼±Ö¸Õë
				System.out.println(urgentPointer);
				
				if(length > 20) {
					int option, optionSplit[] = new int[10000], i, sumOption = 0;
					String biOption;
					option = Integer.parseInt(textField_19.getText()); 			//Ñ¡Ïî
					biOption = addZero(Integer.toBinaryString(option), 8 * (length - 20));
					for(i = 0; i < (length - 20) / 2; ++i) {
						optionSplit[i] = Integer.parseInt(biOption.substring(16 * i, 16 * (i + 1) - 1), 2);
						sumOption += optionSplit[i];
					}
				}
				System.out.println(urgentPointer);
				sum1 = Integer.parseInt(Integer.toBinaryString(ip1) + addZero(Integer.toBinaryString(ip2), 8), 2);				//µÚÒ»ÐÐ	**Î±Ê×²¿**
				System.out.println(sum1);
				sum2 = Integer.parseInt(Integer.toBinaryString(ip3) + addZero(Integer.toBinaryString(ip4), 8), 2);				//µÚ¶þÐÐ
				sum3 = Integer.parseInt(Integer.toBinaryString(ip5) + addZero(Integer.toBinaryString(ip6), 8), 2);				//µÚÈýÐÐ
				sum4 = Integer.parseInt(Integer.toBinaryString(ip7) + addZero(Integer.toBinaryString(ip8), 8), 2);				//µÚËÄÐÐ
				sum5 = Integer.parseInt(Integer.toBinaryString(protocol), 2);													//µÚÎåÐÐ	**Ê×²¿**
				System.out.println(sum5);
				sum6 = Integer.parseInt(Integer.toBinaryString(length), 2);														//µÚÁùÐÐ
				System.out.println(1);
				sum7 = Integer.parseInt(Integer.toBinaryString(soursePort), 2);													//µÚÆßÐÐ
				System.out.println(1);
				sum8 = Integer.parseInt(Integer.toBinaryString(destinationPort), 2);											//µÚ°ËÐÐ
				System.out.println(1);
				sum9 = Integer.parseInt(addZero(Integer.toBinaryString(sequenceNumber), 32).substring(0, 15), 2);				//µÚ¾ÅÐÐ
				System.out.println(1);
				sum10 = Integer.parseInt(addZero(Integer.toBinaryString(sequenceNumber), 32).substring(16, 31), 2);				//µÚÊ®ÐÐ
				System.out.println(1);
				sum11 = Integer.parseInt(addZero(Integer.toBinaryString(acknowledgmentNumber), 32).substring(0, 15), 2);		//µÚÊ®Ò»ÐÐ
				System.out.println(1);
				sum12 = Integer.parseInt(addZero(Integer.toBinaryString(acknowledgmentNumber), 32).substring(16, 31), 2);		//µÚÊ®¶þÐÐ
				System.out.println(1);
				sum13 = Integer.parseInt(addZero(Integer.toBinaryString(dataOffset), 4) + addZero(Integer.toBinaryString(reserved), 4) + URG + ACK + PSH + RST + SYN + FIN, 2);	//µÚÊ®ÈýÐÐ
				sum14 = Integer.parseInt(Integer.toBinaryString(windowSize), 2);												//µÚÊ®ËÄÐÐ
				System.out.println(1);
				sum15 = Integer.parseInt(Integer.toBinaryString(urgentPointer), 2);												//µÚÊ®ÎåÐÐ
				System.out.println(sum15);
				
				sumAll = sum1 + sum2 + sum3 + sum4 + sum5 + sum6 + sum7 + sum8 + sum9 + sum10 + sum11 + sum12 + sum13 + sum14 + sum15;
				System.out.println(sumAll);
				checksum = Integer.toHexString(sumAll);
				System.out.println(checksum);
				textField_21.setText(checksum);
				System.out.println(1);
				

			}
		});
	}
}


