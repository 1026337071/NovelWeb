/*
 * LoginView.java
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
public class LoginView extends javax.swing.JFrame implements ActionListener {

	/** Creates new form LoginView */
	public LoginView() {
		initComponents();
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	public void LoginRemeberPw() {
		File f = new File("loginrem.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				String name = sc.nextLine();
				String pw = sc.nextLine();
				this.jTextField1.setText(name);
				this.jPasswordField1.setText(pw);
				this.jCheckBox1.setSelected(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void HostRemeberPw() {
		File f = new File("hostrem.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				String name = sc.nextLine();
				String pw = sc.nextLine();
				this.jTextField2.setText(name);
				this.jPasswordField2.setText(pw);
				this.jCheckBox2.setSelected(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel7 = new javax.swing.JPanel();
		jPanel1 = new javax.swing.JPanel();
		jTabbedPane2 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jLabel3 = new javax.swing.JLabel();
		jButton4 = new javax.swing.JButton();
		jPanel5 = new javax.swing.JPanel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel5 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton1 = new javax.swing.JButton();
		jCheckBox1 = new javax.swing.JCheckBox();
		jPanel8 = new javax.swing.JPanel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jPasswordField2 = new javax.swing.JPasswordField();
		jCheckBox2 = new javax.swing.JCheckBox();
		jButton2 = new javax.swing.JButton();
		jLabel2 = new javax.swing.JLabel();

		javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(
				jPanel7);
		jPanel7.setLayout(jPanel7Layout);
		jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));
		jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 100,
				Short.MAX_VALUE));

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setBackground(new java.awt.Color(255, 255, 255));

		jPanel1.setBackground(new java.awt.Color(238, 255, 158));

		jTabbedPane2.setBackground(new java.awt.Color(249, 239, 178));
		jTabbedPane2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));

		jPanel2.setBackground(new java.awt.Color(238, 255, 158));

		jLabel1.setText("\u8bf7\u626b\u7801\u767b\u5f55");

		jButton3.setBackground(new java.awt.Color(255, 255, 255));
		jButton3.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\HP\\Desktop\\����\\img\\kfc.jpg")); // NOI18N
		jButton3.setBorder(null);
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

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
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				84,
																				84,
																				84)
																		.addComponent(
																				jButton3,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				274,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				182,
																				182,
																				182)
																		.addComponent(
																				jLabel1)))
										.addContainerGap(118, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(26, 26, 26)
										.addComponent(
												jButton3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												290,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												42,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(22, Short.MAX_VALUE)));

		jTabbedPane2.addTab("QQ\u767b\u5f55", jPanel2);

		jPanel3.setBackground(new java.awt.Color(238, 255, 158));
		jPanel3.setAutoscrolls(true);

		jLabel3.setText("\u8bf7\u626b\u7801\u767b\u5f55");

		jButton4.setBackground(new java.awt.Color(255, 255, 255));
		jButton4.setIcon(new javax.swing.ImageIcon(
				"C:\\Users\\HP\\Desktop\\����\\img\\���΢�ŵ�¼.png")); // NOI18N
		jButton4.setBorder(null);

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel3Layout.createSequentialGroup().addGap(94, 94, 94)
						.addComponent(jButton4,
								javax.swing.GroupLayout.PREFERRED_SIZE, 286,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(96, Short.MAX_VALUE)).addGroup(
				javax.swing.GroupLayout.Alignment.TRAILING,
				jPanel3Layout.createSequentialGroup().addContainerGap(194,
						Short.MAX_VALUE).addComponent(jLabel3).addGap(207, 207,
						207)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(23, 23, 23)
										.addComponent(
												jButton4,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												276,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jLabel3,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												57,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(31, Short.MAX_VALUE)));

		jTabbedPane2.addTab("\u5fae\u4fe1\u767b\u5f55", jPanel3);

		jPanel5.setBackground(new java.awt.Color(238, 255, 158));

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel4.setText("id:");

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel5.setText("password:");

		jButton1.setBackground(new java.awt.Color(250, 108, 47));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u767b\u5f55");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jCheckBox1.setBackground(new java.awt.Color(250, 108, 47));
		jCheckBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox1.setText("\u8bb0\u4f4f\u5bc6\u7801");

		javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(
				jPanel5);
		jPanel5.setLayout(jPanel5Layout);
		jPanel5Layout
				.setHorizontalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(86, 86, 86)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addGroup(
																jPanel5Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING)
																		.addComponent(
																				jCheckBox1)
																		.addComponent(
																				jLabel5)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel5Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				jPasswordField1)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				164,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(jButton1))
										.addContainerGap(128, Short.MAX_VALUE)));
		jPanel5Layout
				.setVerticalGroup(jPanel5Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel5Layout
										.createSequentialGroup()
										.addGap(62, 62, 62)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel4)
																		.addGap(
																				38,
																				38,
																				38)
																		.addComponent(
																				jLabel5))
														.addGroup(
																jPanel5Layout
																		.createSequentialGroup()
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addGap(
																				38,
																				38,
																				38)
																		.addComponent(
																				jPasswordField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addGap(49, 49, 49)
										.addGroup(
												jPanel5Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jCheckBox1)
														.addComponent(jButton1))
										.addContainerGap(172, Short.MAX_VALUE)));

		jTabbedPane2.addTab("\u8d26\u53f7\u767b\u5f55", jPanel5);

		jPanel8.setBackground(new java.awt.Color(238, 255, 158));
		jPanel8.setAutoscrolls(true);

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel6.setText("id:");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel7.setText("password:");

		jCheckBox2.setBackground(new java.awt.Color(250, 108, 47));
		jCheckBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox2.setText("\u8bb0\u4f4f\u5bc6\u7801");

		jButton2.setBackground(new java.awt.Color(250, 108, 47));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u767b\u5f55");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(
				jPanel8);
		jPanel8.setLayout(jPanel8Layout);
		jPanel8Layout
				.setHorizontalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGap(86, 86, 86)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel8Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				117,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2))
														.addGroup(
																jPanel8Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel8Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jLabel7))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addGroup(
																				jPanel8Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								false)
																						.addComponent(
																								jTextField2)
																						.addComponent(
																								jPasswordField2,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								165,
																								javax.swing.GroupLayout.PREFERRED_SIZE))))
										.addGap(497, 497, 497)));
		jPanel8Layout
				.setVerticalGroup(jPanel8Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel8Layout
										.createSequentialGroup()
										.addGap(67, 67, 67)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel6))
										.addGap(41, 41, 41)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jPasswordField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(37, 37, 37)
										.addGroup(
												jPanel8Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jCheckBox2)
														.addComponent(jButton2))
										.addContainerGap(172, Short.MAX_VALUE)));

		jTabbedPane2.addTab("\u7ba1\u7406\u5458\u767b\u5f55", jPanel8);

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setText("        \u767b\u5f55");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129,
				javax.swing.GroupLayout.PREFERRED_SIZE).addComponent(
				jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 481,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				jPanel1Layout.createSequentialGroup().addContainerGap()
						.addComponent(jLabel2,
								javax.swing.GroupLayout.PREFERRED_SIZE, 23,
								javax.swing.GroupLayout.PREFERRED_SIZE).addGap(
								18, 18, 18).addComponent(jTabbedPane2,
								javax.swing.GroupLayout.DEFAULT_SIZE, 429,
								Short.MAX_VALUE).addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addComponent(jPanel1,
						javax.swing.GroupLayout.DEFAULT_SIZE, 469,
						Short.MAX_VALUE).addContainerGap()));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
		
		jButton1.addActionListener(this);
		jButton2.addActionListener(this);
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

		// TODO add your handling code here:
	}

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new LoginView().setVisible(true);
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
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel5;
	private javax.swing.JPanel jPanel7;
	private javax.swing.JPanel jPanel8;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JPasswordField jPasswordField2;
	private javax.swing.JTabbedPane jTabbedPane2;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;

	// End of variables declaration//GEN-END:variables
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jButton1) {
			try {
				if(!jTextField1.getText().equals("")&&
					!String.valueOf(jPasswordField1.getPassword()).equals("")){
				if(model.User.login(jTextField1.getText(), String
						.valueOf(jPasswordField1.getPassword()))){
					Loginsuccess ls = new Loginsuccess();
					ls.setVisible(true);
					this.dispose();
				}else{
					Loginfail lf = new Loginfail();
					lf.setVisible(true);
				}
			} else{
				JOptionPane.showMessageDialog(null, "�û���,���벻��Ϊ��", "",JOptionPane.WARNING_MESSAGE);
			}
			}catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				MainView l = new MainView();
				l.setVisible(true);
			}
		}
		if (e.getSource() == jButton2) {
			try {
				if(!jTextField2.getText().equals("")&&
					!String.valueOf(jPasswordField2.getPassword()).equals("")){
				if(model.User.login(jTextField2.getText(), String
						.valueOf(jPasswordField2.getPassword()))){
					Loginsuccess ls = new Loginsuccess();
					ls.setVisible(true);
					this.dispose();
				}else{
					Loginfail lf = new Loginfail();
					lf.setVisible(true);
				}
			} else{
				JOptionPane.showMessageDialog(null, "�û���,���벻��Ϊ��", "",JOptionPane.WARNING_MESSAGE);
			}
			}catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				MainView l = new MainView();
				l.setVisible(true);
			}
		}
	}
	

}