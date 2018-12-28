/*
 * Reading3.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class Reading3 extends javax.swing.JFrame {

	/** Creates new form Reading3 */
	public Reading3() {
		initComponents();
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
		jButton2 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(238, 255, 158));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel1.setText("\u5c0f\u8bf4\u9605\u8bfb");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setText("\u4e66\u540d\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel4.setText("\u4e09\u5bf8\u4eba\u95f4");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel3.setText("\u7b2c\u4e09\u7ae0\u8282");

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
				.setText("    \u53ea\u662f\u4ed6\u547d\u4e0d\u592a\u597d\uff0c\u5bb6\u65cf\u8840\u8109\u5f88\u662f\u5947\u8469\uff0c\u4ed6\u7eb8\u5dfe\u8fd8\u8bb0\u5f97\u4e00\u5e74\u524d\u7684\u90a3\u5929\u591c\u91cc\uff0c\u67af\u7626\u5982\u67f4\u7684\u7236\n\u4eb2\u5728\u5bb6\u65cf\u7684\u7960\u5802\uff0c\u7ed9\u4ed6\u770b\u4e86\u4e00\u773c\u65cf\u8c31\u3002\u90a3\u662f\u738b\u5b9d\u4e50\u4e86\u7b2c\u4e00\u6b21\u770b\u5230\u65cf\u8c31\uff0c\u4ed6\u6e05\u6670\u5730\u770b\u5230\u4e00\u4ee3\u4ee3\n\u7956\u5148\uff0c\u4f46\u51e1\u4f53\u91cd\u8d85\u8fc7\u4e8c\u767e\u65a4\u5230\u997f\u65e0\u4e0d\u82f1\u5e74\u65e9\u901d\uff0c\u6d3b\u4e0d\u8fc7\u4e09\u5341\u4e94\u3002\u90a3\u4e00\u591c\uff0c\u738b\u5b9d\u4e50\u505a\u4e86\u4e2a\u68a6...\n\u4ed6\u8fd8\u6ca1\u7b49\u6210\u8054\u90a6\u603b\u7edf\uff0c\u5c31\u4e0e\u90a3\u4e9b\u80d6\u7237\u7237\u4eec\u76f8\u805a\u4e86\u3002\n    \u4e4b\u540e\u7684\u4e00\u5e74\uff0c\u5bf9\u4ed6\u6765\u8bf4\uff0c\u51cf\u80a5\u8fd9\u4ef6\u4e8b\u60c5\uff0c\u5df2\u7ecf\u4e0a\u5347\u5230\u4e00\u5b9a\u7684\u9ad8\u5ea6\uff0c\u53ef\u54ea\u6015\u8054\u90a6\u6b65\u5165\u7075\u5143\n\u7eaa\uff0c\u968f\u7740\u7075\u5951\u7684\u6d53\u90c1\uff0c\u968f\u7740\u53e4\u6b66\u7684\u590d\u8d77\uff0c\u51cf\u80a5\u7684\u529e\u6cd5\u4e5f\u90fd\u4e94\u82b1\u516b\u95e8\uff0c\u4f46\u738b\u5b9d\u4e50\u51e0\u4e4e\u5c1d\u8bd5\u4e86\u6240\n\u6709\uff0c\u4f53\u91cd\u4f9d\u65e7\u7a33\u4e2d\u6709\u8fdb\u3002\u8bb0\u5fc6\u7684\u6d6e\u73b0\uff0c\u8ba9\u738b\u5b9d\u4e50\u72e0\u72e0\u4e00\u54ac\u7259\uff0c\u4e0b\u5b9a\u51b3\u5fc3\u660e\u5929\u518d\u51cf\u80a5\u3002\u6709\u4e86\u8fd9\n\u6837\u7684\u51b3\u5b9a\u540e\uff0c\u738b\u5b9d\u4e50\u987f\u65f6\u89c9\u5f97\u538b\u529b\u5c0f\u4e86\u5f88\u591a\uff0c\u4e00\u8fb9\u5254\u7740\u7259\uff0c\u4e00\u8fb9\u54fc\u7740\u5c0f\u66f2\uff0c\u62ac\u5934\u671b\u7740\u8fdc\u5904\u7a97\n\u5916\u84dd\u5929\uff0c\u8111\u5b50\u4e5f\u5f00\u59cb\u6d3b\u6cdb\u8d77\u6765\u3002\n\u201c\u4e5f\u4e0d\u77e5\u9053\u9001\u7ed9\u5362\u533b\u5e08\u7684\u793c\u7269\uff0c\u4ed6\u559c\u4e0d\u559c\u6b22\uff0c\u90a3\u53ef\u662f\u54e6\u4ece\u5bb6\u91cc\u987a\u51fa\u6765\u7684\u53e4\u8463\uff0c\u90a3\u8001\u5bb6\u4f19\u80af\u5b9a\n\u559c\u6b22\u5427\u201d\u738b\u5b9d\u4e50\u5b89\u6170\u81ea\u5df1\uff0c\u8ffd\u54e6\u6478\u7740\u53ea\u8981\u508d\u4e0a\u4e86\u5362\u533b\u5e08\uff0c\u4ee5\u540e\u81ea\u5df1\u5728\u9053\u9662\u4e86\uff0c\u4e5f\u7b97\u662f\u6709\u4e86\u4e2a\n\u5c0f\u9760\u5c71\u3002\u201c\u8001\u5e08\u6743\u529b\u6709\u9650\uff0c\u4e0d\u8fc7\u4ee5\u540e\u4e5f\u8981\u9001\u70b9\u5c0f\u793c\u7269\u3002\u4f46\u8fd9\u5362\u533b\u5e08\u5927\u628a\u5e74\u7eaa\uff0c\u5fc5\u5b9a\u4eba\u8109\u4e0d\n\u5c0f\uff0c\u6211\u8fd9\u4e00\u6b65\u5e94\u8be5\u662f\u8d70\u5bf9\u4e86\u3002\u201d\u60f3\u5230\u8fd9\u91cc\uff0c\u738b\u5b9d\u4e50\u7f8e\u6ecb\u6ecb\u7684\uff0c\u53ea\u89c9\u5f97\u81ea\u5df1\u5411\u8054\u90a6\u603b\u7edf\u53c8\u8fd1\u4e86\n\u4e00\u6b65\u3002\u4ed6\u5bf9\u81ea\u5df1\u80fd\u6210\u4e3a\u8054\u90a6\u603b\u7edf\u5f88\u6709\u4fe1\u5fc3\uff0c\u8fd9\u4fe1\u5fc3\u4e3b\u8981\u662f\u6765\u81ea\u4e8e\u4ed6\u4ece\u5c0f\u5230\u5927\u94bb\u7814\u7684\u6240\u6709\u9ad8\u5b98\n\u81ea\u4f20\uff0c\u751a\u81f3\u8fd8\u603b\u7ed3\u51fa\u4e86\u51e0\u62db\u5f53\u5b98\u6740\u624b\u950f\u3002");
		jScrollPane1.setViewportView(jTextArea1);

		jButton2.setBackground(new java.awt.Color(250, 108, 47));
		jButton2.setText("\u4e0a\u4e00\u7ae0");
		jButton2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton2ActionPerformed(evt);
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
																				777,
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
																				216,
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
																				184,
																				184,
																				184)
																		.addComponent(
																				jButton2)
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
																								jButton2)
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
										.addContainerGap(85, Short.MAX_VALUE)));

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
		new Reading4().setVisible(true);
	}

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Reading2().setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Reading3().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JTextArea jTextArea1;
	// End of variables declaration//GEN-END:variables

}