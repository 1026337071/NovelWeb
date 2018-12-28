/*
 * PersonalView.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

import java.awt.Image;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFileChooser;

/**
 *
 * @author  __USER__
 */
public class PersonalView extends javax.swing.JFrame {

	private Object jLable5;

	/** Creates new form PersonalView */
	public PersonalView() {
		initComponents();
		this.RemeberPw();
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

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jTextField1 = new javax.swing.JTextField();
		jLabel3 = new javax.swing.JLabel();
		jTextField2 = new javax.swing.JTextField();
		jLabel4 = new javax.swing.JLabel();
		jPasswordField1 = new javax.swing.JPasswordField();
		jButton2 = new javax.swing.JButton();
		jButton3 = new javax.swing.JButton();
		jButton1 = new javax.swing.JButton();
		jLabel5 = new javax.swing.JLabel();
		jCheckBox1 = new javax.swing.JCheckBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(238, 255, 158));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel1.setText("\u4e2a\u4eba\u4fe1\u606f\u7ba1\u7406");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel2.setText("id\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel3.setText("email:");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jLabel4.setText("password:");

		jButton2.setBackground(new java.awt.Color(250, 108, 47));
		jButton2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton2.setForeground(new java.awt.Color(255, 255, 255));
		jButton2.setText("\u8fd4\u56de\u4e3b\u754c\u9762");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
			}
		});

		jButton3.setBackground(new java.awt.Color(250, 108, 47));
		jButton3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton3.setForeground(new java.awt.Color(255, 255, 255));
		jButton3.setText("\u66f4\u65b0\u4fe1\u606f");

		jButton1.setBackground(new java.awt.Color(250, 108, 47));
		jButton1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jButton1.setForeground(new java.awt.Color(255, 255, 255));
		jButton1.setText("\u4e0a\u4f20\u5934\u50cf");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jCheckBox1.setBackground(new java.awt.Color(250, 108, 47));
		jCheckBox1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 14));
		jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
		jCheckBox1.setText("\u8bb0\u4f4f\u5bc6\u7801");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout.createSequentialGroup()
										.addContainerGap(194, Short.MAX_VALUE)
										.addComponent(jButton1).addGap(96, 96,
												96))
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addGap(29, 29, 29)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.TRAILING)
														.addComponent(jLabel3)
														.addComponent(jLabel2)
														.addComponent(jLabel4))
										.addGap(18, 18, 18)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addComponent(
																				jCheckBox1)
																		.addContainerGap())
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jPasswordField1,
																								javax.swing.GroupLayout.Alignment.LEADING,
																								javax.swing.GroupLayout.DEFAULT_SIZE,
																								201,
																								Short.MAX_VALUE)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.LEADING,
																												false)
																										.addComponent(
																												jTextField2)
																										.addComponent(
																												jTextField1)
																										.addComponent(
																												jLabel1,
																												javax.swing.GroupLayout.DEFAULT_SIZE,
																												133,
																												Short.MAX_VALUE))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.LEADING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addPreferredGap(
																												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																										.addGroup(
																												jPanel1Layout
																														.createParallelGroup(
																																javax.swing.GroupLayout.Alignment.LEADING)
																														.addComponent(
																																jLabel5,
																																javax.swing.GroupLayout.DEFAULT_SIZE,
																																201,
																																Short.MAX_VALUE)
																														.addGroup(
																																jPanel1Layout
																																		.createSequentialGroup()
																																		.addComponent(
																																				jButton2)
																																		.addPreferredGap(
																																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																																				javax.swing.GroupLayout.DEFAULT_SIZE,
																																				Short.MAX_VALUE)
																																		.addComponent(
																																				jButton3)))))
																		.addContainerGap(
																				60,
																				javax.swing.GroupLayout.PREFERRED_SIZE)))));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												37,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel2))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jTextField2,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel3))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(
																jPasswordField1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addComponent(jLabel4))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jCheckBox1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												21, Short.MAX_VALUE)
										.addComponent(
												jLabel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												142,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton1)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.BASELINE)
														.addComponent(jButton2)
														.addComponent(jButton3))
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		MainView l =new MainView();
		l.setVisible(true);
		// TODO add your handling code here:
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		// TODO add your handling code here:
		JFileChooser jfc = new JFileChooser();
		jfc.showOpenDialog(this);
		String fname = jfc.getSelectedFile().getAbsolutePath();
		Image img = new ImageIcon(fname).getImage().getScaledInstance(
				this.jLabel5.getWidth(), this.jLabel5.getHeight(),
				Image.SCALE_SMOOTH);
		this.jLabel5.setIcon(new ImageIcon(img));

	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new PersonalView().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton3;
	private javax.swing.JCheckBox jCheckBox1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPasswordField jPasswordField1;
	private javax.swing.JTextField jTextField1;
	private javax.swing.JTextField jTextField2;
	// End of variables declaration//GEN-END:variables

}