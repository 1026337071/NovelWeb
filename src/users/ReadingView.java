/*
 * ReadingView.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class ReadingView extends javax.swing.JFrame {

	/** Creates new form ReadingView */
	public ReadingView() {
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
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jButton1 = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jTextArea1 = new javax.swing.JTextArea();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(238, 255, 158));
		jPanel1.setAutoscrolls(true);

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel1.setText("\u5c0f\u8bf4\u9605\u8bfb");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setText("\u4e66\u540d\uff1a");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel3.setText("\u7b2c\u4e00\u7ae0\u8282");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel4.setText("\u4e09\u5bf8\u4eba\u95f4");

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
				.setText("    \u708e\u708e\u590f\u65e5\uff0c\u4f4d\u4e8e\u8054\u90a6\u4e1c\u90e8\u7684\u6c60\u4e91\u96e8\u6797\uff0c\u4e91\u96fe\u5f25\u6f2b\uff0c\u597d\u4f3c\u4e00\u5c42\u8584\u7eb1\u73af\u7ed5\uff0c\u4e00\u68f5\u68f5\u53c2\u5929\u5927\u6811\uff0c\n\u7eb5\u6a2a\u4ea4\u9519\uff0c\u7e41\u8302\u7684\u6811\u51a0\u4e2d\uff0c\u65f6\u800c\u6709\u51e0\u53ea\u9e1f\u817e\u7a7a\u800c\u8d77\uff0c\u5636\u9e23\u7740\u7ff1\u7fd4\u4e0e\u5929\u9645\u95f4\u3002\u5929\u7a7a\u4e0a\uff0c\u90a3\u4eff\u4f5b\u53ef\u4ee5\n\u6c38\u6052\u5b58\u5728\u7684\u592a\u9633\uff0c\u5df2\u7136\u4e0d\u518d\u662f\u4eba\u4eec\u8bb0\u5fc6\u529b\u7684\u6837\u5b50\uff0c\u800c\u662f\u591a\u5e74\u524d\uff0c\u88ab\u4e00\u628a\u5e9e\u5927\u5230\u96be\u4ee5\u5f62\u5bb9\u7684\n\u9752\u94dc\u53e4\u5251\uff0c\u76f4\u63a5\u523a\u7a7f\uff0c\u9732\u51fa\u5c0f\u534a\u4e2a\u5251\u5c16\uff01\u8fd9\u53e4\u5251\u4f3c\u5c3d\u529b\u4e07\u53e4\u5c81\u6708\uff0c\u81ea\u661f\u7a7a\u800c\u6765\uff0c\u900f\u51fa\u65e0\u5c3d\u6ca7\u6851\uff0c\n\u66f4\u6709\u4e00\u80a1\u5f3a\u70c8\u7684\u5a01\u538b\uff0c\u5f62\u6210\u5149\u6655\uff0c\u7b3c\u7f69\u82cd\u7a79\uff0c\u4eff\u4f5b\u80fd\u9547\u538b\u5927\u5730\uff0c\u8ba9\u4f17\u751f\u819c\u62dc\uff01\n   \u8fdc\u8fdc\u770b\u53bb\uff0c\u8fd9\u4e00\u5e55\u89c1\u9633\u96e8\u6797\uff0c\u597d\u4f3c\u4e00\u526f\u753b\u5377\uff0c\u76f4\u81f3\u8fdc\u5904\u51fa\u6765\u55e1\u55e1\u4e4b\u58f0\uff0c\u624d\u88ab\u6253\u7834\u3002\u4e00\u8258\u7ea2\u8272\n\u7684\u5927\u70ed\u6c14\u7403\u8239\uff0c\u6b63\u4e8e\u96e8\u6797\u4e0a\u65b9\u7f13\u7f13\u98de\u6765\u3002\u8fd9\u70ed\u6c14\u7403\u8239\u8231\u5f88\u5927\uff0c\u8db3\u4ee5\u5bb9\u7eb3\u6570\u767e\u4eba\uff0c\u80fd\u770b\u5230\u5f88\u591a\u5c11\u5e74\n\u7537\u5973\uff0c\u5728\u7532\u677f\u4e0a\u4e09\u4e94\u6210\u7fa4\uff0c\u5341\u4e8c\u4f20\u51fa\u6b22\u58f0\u7b11\u8bed\u3002\n   \u4ed6\u4eec\uff0c\u662f\u6765\u81ea\u51e4\u51f0\u57ce\u4e2d\uff0c\u8fd9\u4e00\u5c4a\u8003\u5165\u8054\u90a6\u56db\u5927\u9053\u9662\u4e4b\u4e00\uff0c\u7f25\u7f08\u9053\u9662\u7684\u5b66\u5b50\uff0c\u6b63\u4e58\u5750\u5c5e\u4e8e\u7f25\u7f08\n\u9053\u9662\u7684\u98de\u8247\uff0c\u8de8\u8d8a\u4e07\u91cc\uff0c\u524d\u5f80\u7f25\u7f08\u9053\u9662\u6c42\u5b66\u3002\u6216\u8bb8\u662f\u5bf9\u6c42\u5b66\u7684\u671f\u5f85\uff0c\u65c5\u7a0b\u5bf9\u4e8e\u5c11\u5e74\u7537\u5973\u6765\u8bf4\u5e76\u4e0d\n\u67af\u71e5\uff0c\u7537\u5973\u4e4b\u95f4\uff0c\u66f4\u6709\u4e00\u4e9b\u6726\u80e7\u7684\u5438\u5f15\uff0c\u4f7f\u5f97\u8fd9\u4e07\u91cc\u4e4b\u65c5\uff0c\u522b\u6709\u4e00\u4e9b\u4e50\u8da3\u3002\u53c8\u56e0\u8def\u9014\u9065\u8fdc\uff0c\u6240\u4ee5\n\u5728\u98de\u8247\u4e0a\uff0c\u914d\u5907\u4e86\u98df\u9986\uff0c\u4fee\u7075\u5ba4\u3001\u533b\u52a1\u5ba4\u7b49\u533a\u57df\u3002\n   \u6b64\u523b\uff0c\u98de\u8247\u7684\u98df\u9986\u4e2d\uff0c\u5b66\u5b50\u4e0d\u5c11\uff0c\u5176\u4e2d\u4e00\u5904\u996d\u684c\u65c1\uff0c\u4f5c\u8005\u4e00\u4e2a\u633a\u7740\u809a\u76ae\u7684\u5c0f\u80d6\u5b50\u3002\n");
		jScrollPane1.setViewportView(jTextArea1);

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
										.addGap(20, 20, 20)
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createSequentialGroup()
																		.addGroup(
																				jPanel1Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.TRAILING)
																						.addComponent(
																								jLabel3)
																						.addGroup(
																								jPanel1Layout
																										.createSequentialGroup()
																										.addComponent(
																												jLabel1,
																												javax.swing.GroupLayout.PREFERRED_SIZE,
																												104,
																												javax.swing.GroupLayout.PREFERRED_SIZE)
																										.addGap(
																												263,
																												263,
																												263)
																										.addComponent(
																												jLabel2)
																										.addGap(
																												7,
																												7,
																												7)
																										.addComponent(
																												jLabel4)))
																		.addGap(
																				243,
																				243,
																				243)
																		.addComponent(
																				jButton1))
														.addComponent(
																jScrollPane1,
																javax.swing.GroupLayout.DEFAULT_SIZE,
																828,
																Short.MAX_VALUE))
										.addContainerGap()));
		jPanel1Layout
				.setVerticalGroup(jPanel1Layout
						.createParallelGroup(
								javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(
								jPanel1Layout
										.createSequentialGroup()
										.addContainerGap()
										.addGroup(
												jPanel1Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																jPanel1Layout
																		.createParallelGroup(
																				javax.swing.GroupLayout.Alignment.TRAILING)
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addComponent(
																								jButton1)
																						.addGap(
																								45,
																								45,
																								45))
																		.addGroup(
																				jPanel1Layout
																						.createSequentialGroup()
																						.addGroup(
																								jPanel1Layout
																										.createParallelGroup(
																												javax.swing.GroupLayout.Alignment.BASELINE)
																										.addComponent(
																												jLabel2)
																										.addComponent(
																												jLabel4))
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
																						.addComponent(
																								jLabel3)
																						.addPreferredGap(
																								javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
														.addComponent(
																jLabel1,
																javax.swing.GroupLayout.PREFERRED_SIZE,
																51,
																javax.swing.GroupLayout.PREFERRED_SIZE))
										.addGap(14, 14, 14)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												385,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap(95, Short.MAX_VALUE)));

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
		new Reading2().setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new ReadingView().setVisible(true);
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