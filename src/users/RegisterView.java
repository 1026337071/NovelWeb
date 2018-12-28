/*
 * RegisterView.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import model.*;

/**
 *
 * @author  __USER__
 */
public class RegisterView extends javax.swing.JFrame implements ActionListener {

	/** Creates new form RegisterView */
	public RegisterView() {
		initComponents();
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	public void registerRemeberPw() {
		File f = new File("rem.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				String name = sc.nextLine();
				String email = sc.nextLine();
				String pw = sc.nextLine();
				this.jTextField1.setText(name);
				this.jTextField2.setText(email);
				this.jPasswordField1.setText(pw);
				this.jCheckBox3.setSelected(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void NumberRemeberPw() {
		File f = new File("numberrem.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				String name = sc.nextLine();
				String phonenumber = sc.nextLine();
				String pw = sc.nextLine();
				this.jTextField3.setText(name);
				this.jTextField4.setText(phonenumber);
				this.jPasswordField3.setText(pw);
				this.jCheckBox4.setSelected(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel2 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jCheckBox2 = new javax.swing.JCheckBox();
		jButton1 = new javax.swing.JButton();
		jCheckBox3 = new javax.swing.JCheckBox();
		jButton3 = new javax.swing.JButton();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jTextField3 = new javax.swing.JTextField();
		jLabel6 = new javax.swing.JLabel();
		jPasswordField3 = new javax.swing.JPasswordField();
		jLabel8 = new javax.swing.JLabel();
		jTextField4 = new javax.swing.JTextField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jButton2 = new javax.swing.JButton();
		jCheckBox4 = new javax.swing.JCheckBox();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));
		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));

		jPanel1.setBackground(new java.awt.Color(238, 255, 158));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel1.setText("\u7528\u6237\u540d\uff1a");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel2.setText("\u90ae\u7bb1\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel3.setText("\u5bc6\u7801\uff1a");

		jCheckBox2.setBackground(new java.awt.Color(250, 108, 47));
		jCheckBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox2
				.setText("   \u6211\u5df2\u9605\u8bfb\u5e76\u540c\u610f\u300a\u7528\u6237\u670d\u52a1\u534f\u8bae\u300b");
		jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jCheckBox2ActionPerformed(evt);
			}
		});

		jButton1.setBackground(new java.awt.Color(250, 108, 47));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u6ce8\u518c");

		jCheckBox3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox3.setText("\u8bb0\u4f4f\u5bc6\u7801");

		jButton3.setBackground(new java.awt.Color(250, 108, 47));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u8fd4\u56de\u4e3b\u754c\u9762");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				111,
																				111,
																				111)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jCheckBox2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								249,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																73,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel2,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																51,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel3))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jPasswordField1)
																														.addComponent(
																																jTextField2)
																														.addComponent(
																																jTextField1,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																191,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jCheckBox3)))))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jButton1)
																		.addGap(
																				32,
																				32,
																				32)
																		.addComponent(
																				jButton3)))
										.addContainerGap(103, Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(42, 42, 42)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel1)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(
																jLabel2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																30,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel3)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(10, 10, 10)
										.addComponent(jCheckBox3)
										.addGap(18, 18, 18)
										.addComponent(jCheckBox2)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton3)
														.addComponent(jButton1))
										.addContainerGap(35, Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u90ae\u7bb1\u6ce8\u518c", jPanel1);

		jPanel2.setBackground(new java.awt.Color(238, 255, 158));

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel5.setText("\u7528\u6237\u540d\uff1a");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel6.setText("\u5bc6\u7801\uff1a");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel8.setText("\u624b\u673a\u53f7\u7801\uff1a");

		jCheckBox1.setBackground(new java.awt.Color(250, 108, 47));
		jCheckBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox1
				.setText("\u6211\u5df2\u9605\u8bfb\u5e76\u540c\u610f\u300a\u7528\u6237\u670d\u52a1\u534f\u8bae\u300b");

		jButton2.setBackground(new java.awt.Color(250, 108, 47));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u6ce8\u518c");

		jCheckBox4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox4.setText("\u8bb0\u4f4f\u5bc6\u7801");

		jButton4.setBackground(new java.awt.Color(250, 108, 47));
		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u8fd4\u56de\u4e3b\u754c\u9762");
		jButton4.setAutoscrolls(true);

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(
				jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout
				.setHorizontalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				109,
																				109,
																				109)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								false)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel2Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel8)
																										.addGap(
																												18,
																												18,
																												18)
																										.addComponent(
																												jTextField4))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel2Layout
																										.createSequentialGroup()
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel5,
																																javax.swing.GroupLayout.PREFERRED_SIZE,
																																73,
																																javax.swing.GroupLayout.PREFERRED_SIZE)
																														.addComponent(
																																jLabel6))
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel2Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING,
																																false)
																														.addComponent(
																																jTextField3)
																														.addComponent(
																																jPasswordField3,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																183,
																																Short.MAX_VALUE)
																														.addComponent(
																																jCheckBox4)))
																						.addComponent(
																								jCheckBox1,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								Short.MAX_VALUE)))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				148,
																				148,
																				148)
																		.addComponent(
																				jButton2,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				88,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton4)))
										.addContainerGap(113, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(56, 56, 56)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel8)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(31, 31, 31)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jPasswordField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jCheckBox4)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(jCheckBox1)
										.addGap(18, 18, 18)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton4))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

		jTabbedPane1.addTab("\u624b\u673a\u53f7\u7801\u6ce8\u518c", jPanel2);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jTabbedPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 489,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jTabbedPane1,
						javax.swing.GroupLayout.PREFERRED_SIZE, 335,
						javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));

		pack();
		jButton1.addActionListener(this);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {
		
		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		MainView l = new MainView();
		l.setVisible(true);
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new RegisterView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JButton jButton4;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JCheckBox jCheckBox2;
	private javax.swing.JCheckBox jCheckBox3;
	private javax.swing.JCheckBox jCheckBox4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField3;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;

	// End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jButton1) {
			if(!jTextField1.getText().equals("")&&!jTextField2.getText().equals("")&&
					!String.valueOf(jPasswordField1.getPassword()).equals(""))
			{
				if(model.User.getuser(jTextField1.getText()))
				{
					model.User.register(jTextField1.getText(), jTextField2
				
						.getText(), String.valueOf(jPasswordField1
						.getPassword()));
						this.dispose();
						LoginView lv = new LoginView();
						lv.setVisible(true);
				}
			}
			else
				JOptionPane.showMessageDialog(null, "用户名，邮箱，密码不能为空", "",JOptionPane.WARNING_MESSAGE);
			
		}
	}

}