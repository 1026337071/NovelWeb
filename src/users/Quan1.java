/*
 * Quan1.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class Quan1 extends javax.swing.JFrame {

	/** Creates new form Quan1 */
	public Quan1() {
		initComponents();
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel1 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jLabel2 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(238, 255, 158));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel1.setText("\u5c0f\u8bf4\u9605\u8bfb");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setText("\u4e66\u540d\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel4.setText("\u5168\u7403\u9ad8\u6b66");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel3.setText("\u7b2c\u4e00\u7ae0\u8282");

		jButton1.setBackground(new java.awt.Color(250, 108, 47));
		jButton1.setText("\u4e0b\u4e00\u7ae0");
		jButton1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton1ActionPerformed(evt);
			}
		});

		jTextArea1.setColumns(20);
		jTextArea1.setFont(new java.awt.Font("Monospaced", 1, 18));
		jTextArea1.setRows(5);
		jTextArea1
				.setText("  \u5468\u516d  \u9633\u57ce\u9ad8\u4e2d\uff084\uff09\u73ed\u6559\u5ba4   \u65b9\u5e73\u82b1\u4e86\u534a\u5c0f\u65f6\uff0c\u603b\u7b97\u786e\u5b9a\u4e00\u4ef6\u4e8b\uff0c\u4e0d\u662f\u505a\u68a6\uff0c\u4e0d\u4f1a\u62cd\u620f\u5e9f\u8bdd\n\u62cd\u620f\u80fd\u8ba9\u81ea\u5df1\u90a3\u4e9b\u540c\u5b66\u8fd4\u8001\u8fd8\u7ae5\uff0c\u8fd9\u5267\u7ec4\u53ef\u4ee5\u4e0a\u5929\u4e86\uff01\n  \u7b49\u786e\u5b9a\u4e86\u91cd\u751f\u7684\u4e8b\u5b9e\uff0c\u65b9\u5e73\u5c0f\u5c0f\u7684\u5fd0\u5fd1\u7247\u523b\uff0c\u7d27\u63a5\u7740\u4fbf\u5766\u7136\u63a5\u53d7\u4e86\u3002\u4f5c\u4e3a\u65b0\u4e16\u7eaa\u7684\u4e94\u6bd2\u9752\u5e74\uff0c\n\u8c01\u8fd8\u6ca1\u70b9\u91cd\u751f\u7684\u7ecf\u9a8c\uff1f\u5c31\u7b97\u81ea\u5df1\u54a9\u91cd\u751f\uff0c\u7f51\u4e0a\u4e00\u5927\u628a\uff0c\u5149\u770b\u770b\u5c31\u77e5\u9053\uff0c\u8fd9\u662f\u77ee\u6233\u7a77\u9006\u88ad\u9ad8\u5bcc\u5e05\u7684\n\u81f3\u9ad8\u6cd5\u5b9d\uff01\u518d\u8bf4\u4e86\u9a82\u81ea\u5df1\u8981\u94b1\u6ca1\u94b1\uff0c\u8981\u599e\u6ca1\u599e\uff0c\u91cd\u751f\u4e86\u4ec0\u4e48\u90fd\u4e0d\u6562\u8fd8\u80fd\u591a\u6d3b\u4e00\u4e9b\u5e74\uff0c\u600e\u4e48\u7b97\u90fd\u4e0d\n\u4e8f\u3002\u597d\u4e0d\u5bb9\u6613\u71ac\u5230\u4e0b\u8bfe\u94c3\u54cd\uff0c\u719f\u6089\u4e2d\u5e26\u4e9b\u964c\u751f\u7684\u8001\u5e08\uff0c\u786c\u662f\u62d6\u4e86\u597d\u51e0\u5206\u949f\u5802\u624d\u604b\u604b\u4e0d\u820d\u7684\u79bb\u53bb\u3002\n\u81f3\u4e8e\u8001\u5e08\u4e34\u8d70\u65f6\u6700\u540e\u8bf4\u7684\u90a3\u53e5\u8bdd\uff0c\u65b9\u5e73\u5c31\u5f53\u81ea\u5df1\u542c\u5c94\u4e86\u3002\n  \u201c\u6b66\u79d1\u62a5\u540d\uff0c\u4e0b\u4e2a\u661f\u671f\u5f00\u59cb\u4e86\uff0c\u6709\u60f3\u6cd5\u7684\u540c\u5b66\u505a\u597d\u51c6\u5907\u3002\u201d\u65b9\u5e73\u6ca1\u5f53\u56de\u4e8b\uff0c\u4ed6\u542c\u6210\u4e86\u201c\u6587\u79d1\u201d\n\u62a5\u540d\uff0c\u9ad8\u8003\u524d\u90fd\u662f\u63d0\u524d\u62a5\u540d\u7684\uff0c\u4e0d\u8fc7\u4e00\u822c\u90fd\u662f\u7531\u5b66\u6821\u4ee3\u52b3\uff0c\u6ca1\u5fc5\u8981\u518d\u63d0\u9192\u624d\u5bf9\u3002\u5173\u952e\u7684\u5173\u952e\uff0c\u9ad8\n\u4e09\uff084\uff09\u73ed\u662f\u7406\u79d1\u73ed\uff0c\u548c\u6587\u79d1\u65e0\u5173\u5427\uff1f\n   \u4e0d\u8fc7\u6709\u4e86\u91cd\u751f\u7684\u4e8b\uff0c\u65b9\u5e73\u54ea\u8fd8\u5728\u610f\u8fd9\u70b9\u829d\u9ebb\u7eff\u8c46\u7684\u5c0f\u4e8b\u3002\u8fd9\u5f53\u524d\uff0c\u65b9\u5e73\u60f3\u7684\u662f\u62f3\u6253\u6770\u514b\u9a6c\uff0c\n\u811a\u8e22\u9a6c\u5316\u817e\u624d\u5bf9\u3002\u5c3d\u7ba108\u5e74\u8fd9\u4e2a\u65f6\u95f4\u6bb5\u6709\u4e9b\u665a\u4e86\uff0c\u53ef\u91cd\u751f\u8005\u4e0d\u5e72\u70b9\u51fa\u4eba\u610f\u6599\u7684\u4e8b\uff0c\u80fd\u53eb\u91cd\u751f\u8005\u5417\n\u53c8\u6216\u8005\u4e0d\u4ece\u5546\uff0c\u6539\u4ece\u653f\uff1f\u65b9\u5e73\u5fc3\u91cc\u6697\u6697\u76d8\u7b97\uff0c\u4e5f\u6ca1\u5fc3\u601d\u548c\u56db\u5468\u7684\u540c\u5b66\u95f2\u804a\u3002\u8fd9\u4e9b\u5c0f\u5e74\u8f7b\uff0c\u54ea\u80fd\u60f3\n\u8c61\u5230\u81ea\u5df1\u8111\u6d77\u4e2d\u7684\u96c4\u4f1f\u76ee\u6807\uff0c\u4ece\u4eca\u5929\u8d77\uff0c\u54b1\u4eec\u5c31\u4e0d\u662f\u4e00\u4e2a\u4e16\u754c\u7684\u4eba\u4e86\uff01\n");
		jScrollPane1.setViewportView(jTextArea1);

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(
				jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout
				.setHorizontalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel1Layout
										.createSequentialGroup()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				28,
																				28,
																				28)
																		.addComponent(
																				jScrollPane1,
																				javax.swing.GroupLayout.DEFAULT_SIZE,
																				825,
																				Short.MAX_VALUE))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addContainerGap()
																		.addComponent(
																				jLabel1,
																				javax.swing.GroupLayout.PREFERRED_SIZE,
																				104,
																				javax.swing.GroupLayout.PREFERRED_SIZE)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED,
																				253,
																				Short.MAX_VALUE)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.LEADING)
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel2)
																										.addGap(
																												7,
																												7,
																												7)
																										.addComponent(
																												jLabel4))
																						.addGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING,
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel3)
																										.addGap(
																												17,
																												17,
																												17)))
																		.addGap(
																				260,
																				260,
																				260)
																		.addComponent(
																				jButton1)
																		.addGap(
																				11,
																				11,
																				11)))
										.addGap(39, 39, 39)));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
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
																		.addContainerGap()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel1,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								51,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton1)))
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGap(
																				35,
																				35,
																				35)
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel2)
																						.addComponent(
																								jLabel4))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel3)))
										.addGap(19, 19, 19)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												434,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)));

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

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Quan2().setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Quan1().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}