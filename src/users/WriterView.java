/*
 * WriterView.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author  __USER__
 */
public class WriterView extends javax.swing.JFrame {

	/** Creates new form WriterView */
	public WriterView() {
		initComponents();
		this.RemeberPw();
		this.WriterRemeberPw();
		this.setLocationRelativeTo(null);
	}

	public void RemeberPw() {
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
				this.jCheckBox1.setSelected(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	public void WriterRemeberPw() {
		File f = new File("writer.txt");
		System.out.println(f.exists());
		if (f.exists()) {
			try {
				Scanner sc = new Scanner(f);
				String name = sc.nextLine();
				String gender = sc.nextLine();
				String phone = sc.nextLine();
				String location = sc.nextLine();
				this.jTextField3.setText(name);
				this.jTextField4.setText(gender);
				this.jTextField5.setText(phone);
				this.jTextField6.setText(location);
				this.jCheckBox2.setSelected(true);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel2 = new javax.swing.JPanel();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jTextField2 = new javax.swing.JTextField();
		jCheckBox1 = new javax.swing.JCheckBox();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton4 = new javax.swing.JButton();
		jPanel3 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jCheckBox2 = new javax.swing.JCheckBox();
		jTextField3 = new javax.swing.JTextField();
		jTextField4 = new javax.swing.JTextField();
		jTextField5 = new javax.swing.JTextField();
		jTextField6 = new javax.swing.JTextField();
		jButton1 = new javax.swing.JButton();
		jButton2 = new javax.swing.JButton();
		jPanel4 = new javax.swing.JPanel();
		jLabel9 = new javax.swing.JLabel();
		jLabel10 = new javax.swing.JLabel();
		jButton3 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(255, 255, 255));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel1.setText("\u4f5c\u8005\u4e13\u533a");

		jTabbedPane1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));

		jPanel2.setBackground(new java.awt.Color(238, 255, 158));

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel2.setText("\u7b14\u540d\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel3.setText("\u7535\u5b50\u90ae\u7bb1");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel4.setText("\u5bc6\u7801\uff1a");

		jCheckBox1.setBackground(new java.awt.Color(250, 108, 47));
		jCheckBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox1.setText("\u8bb0\u4f4f\u5bc6\u7801");

		jButton4.setBackground(new java.awt.Color(250, 108, 47));
		jButton4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton4.setForeground(new java.awt.Color(255, 255, 255));
		jButton4.setText("\u4e0b\u4e00\u6b65");

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
										.addGap(59, 59, 59)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel4)
														.addComponent(jLabel3)
														.addComponent(jLabel2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jButton4)
														.addGroup(
																jPanel2Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				false)
																		.addComponent(
																				jCheckBox1)
																		.addComponent(
																				jTextField2)
																		.addComponent(
																				jPasswordField1)
																		.addComponent(
																				jTextField1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				144,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(160, Short.MAX_VALUE)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel2Layout
										.createSequentialGroup()
										.addGap(26, 26, 26)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel2)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel3)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel4)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18).addComponent(
												jCheckBox1).addGap(26, 26, 26)
										.addComponent(jButton4)
										.addContainerGap(49, Short.MAX_VALUE)));

		jTabbedPane1.addTab("1.\u7533\u8bf7\u4f5c\u8005>", jPanel2);

		jPanel3.setBackground(new java.awt.Color(238, 255, 158));

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel5.setText("\u771f\u5b9e\u59d3\u540d\uff1a");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel6.setText("\u6027\u522b\uff1a");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel7.setText("\u8054\u7cfb\u7535\u8bdd\uff1a");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel8.setText("\u6240\u5728\u5730\u533a\uff1a");

		jCheckBox2.setBackground(new java.awt.Color(250, 108, 47));
		jCheckBox2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox2
				.setText("\u6211\u5df2\u9605\u8bfb\u5e76\u540c\u610f\u300a\u4f5c\u8005\u6ce8\u518c\u6295\u7a3f\u534f\u8bae\u300b");

		jButton1.setBackground(new java.awt.Color(250, 108, 47));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u63d0\u4ea4\u7533\u8bf7");

		jButton2.setBackground(new java.awt.Color(250, 108, 47));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u8fd4\u56de\u4e0a\u4e00\u6b65");

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(
				jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout
				.setHorizontalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addGap(36, 36, 36)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel3Layout
																		.createSequentialGroup()
																		.addComponent(
																				jButton1)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				162,
																				Short.MAX_VALUE)
																		.addComponent(
																				jButton2))
														.addGroup(
																jPanel3Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING,
																				false)
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				jPanel3Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel8)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField6))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				jPanel3Layout
																						.createSequentialGroup()
																						.addComponent(
																								jLabel7)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addComponent(
																								jTextField5))
																		.addGroup(
																				javax.swing.GroupLayout.Alignment.LEADING,
																				jPanel3Layout
																						.createSequentialGroup()
																						.addGroup(
																								jPanel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jLabel5)
																										.addComponent(
																												jLabel6))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																						.addGroup(
																								jPanel3Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.TRAILING,
																												false)
																										.addComponent(
																												jTextField4,
																												javax.swing.GroupLayout.Alignment.LEADING)
																										.addComponent(
																												jTextField3,
																												javax.swing.GroupLayout.Alignment.LEADING,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												194,
																												Short.MAX_VALUE)))))
										.addContainerGap(
												44,
												javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGroup(
								jPanel3Layout.createSequentialGroup().addGap(
										82, 82, 82).addComponent(jCheckBox2)
										.addContainerGap(85, Short.MAX_VALUE)));
		jPanel3Layout
				.setVerticalGroup(jPanel3Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel3Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel5)
														.addComponent(
																jTextField3,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel6)
														.addComponent(
																jTextField4,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jLabel7)
														.addComponent(
																jTextField5,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel8)
														.addComponent(
																jTextField6,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(18, 18, 18)
										.addComponent(jCheckBox2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addGroup(
												jPanel3Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton1)
														.addComponent(jButton2))
										.addContainerGap(43, Short.MAX_VALUE)));

		jTabbedPane1.addTab("2.\u8be6\u7ec6\u4fe1\u606f>", jPanel3);

		jPanel4.setBackground(new java.awt.Color(238, 255, 158));

		jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel9.setText("\u7533\u8bf7\u4f5c\u8005\u6210\u529f");

		jLabel10.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel10
				.setText("\u606d\u559c\uff0c\u60a8\u5df2\u52a0\u5165\u4e00\u672c\u6b63\u7ecf\u96c6\u56e2\u4f5c\u8005\u5927\u5bb6\u5ead\uff01\uff01\uff01");

		jButton3.setBackground(new java.awt.Color(250, 108, 47));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u8fd4\u56de\u4e3b\u754c\u9762");
		jButton3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton3ActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(
				jPanel4);
		jPanel4.setLayout(jPanel4Layout);
		jPanel4Layout
				.setHorizontalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGroup(
												jPanel4Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				139,
																				139,
																				139)
																		.addComponent(
																				jLabel9,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				111,
																				javax.swing.GroupLayout.PREFERRED_SIZE))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				128,
																				128,
																				128)
																		.addComponent(
																				jButton3))
														.addGroup(
																jPanel4Layout
																		.createSequentialGroup()
																		.addGap(
																				32,
																				32,
																				32)
																		.addComponent(
																				jLabel10,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				306,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))
										.addContainerGap(96, Short.MAX_VALUE)));
		jPanel4Layout
				.setVerticalGroup(jPanel4Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel4Layout
										.createSequentialGroup()
										.addGap(40, 40, 40)
										.addComponent(
												jLabel9,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												52,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
										.addComponent(
												jLabel10,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												98,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton3)
										.addContainerGap(39, Short.MAX_VALUE)));

		jTabbedPane1.addTab("3.\u7533\u8bf7\u6210\u529f", jPanel4);

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
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																110,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(
																jTabbedPane1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																439,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												39,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(
												jTabbedPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												314,
												javax.swing.GroupLayout.PREFERRED_SIZE)));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.PREFERRED_SIZE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
		MainView l =new MainView();
		l.setVisible(true);
		// TODO add your handling code here:
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new WriterView().setVisible(true);
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
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JPanel jPanel4;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	private javax.swing.JTextField jTextField3;
	private javax.swing.JTextField jTextField4;
	private javax.swing.JTextField jTextField5;
	private javax.swing.JTextField jTextField6;
	// End of variables declaration//GEN-END:variables

}