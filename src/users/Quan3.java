/*
 * Quan3.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

/**
 *
 * @author  __USER__
 */
public class Quan3 extends javax.swing.JFrame {

	/** Creates new form Quan3 */
	public Quan3() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	//GEN-BEGIN:initComponents
	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jLabel8 = new javax.swing.JLabel();
		jScrollPane2 = new javax.swing.JScrollPane();
		jTextArea2 = new javax.swing.JTextArea();
		jButton4 = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel2.setBackground(new java.awt.Color(238, 255, 158));

		jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel5.setText("\u5c0f\u8bf4\u9605\u8bfb");

		jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel6.setText("\u4e66\u540d\uff1a");

		jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel7.setText("\u5168\u7403\u9ad8\u6b66");

		jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel8.setText("\u7b2c\u4e09\u7ae0\u8282");

		jTextArea2.setColumns(20);
		jTextArea2.setFont(new java.awt.Font("Monospaced", 1, 18));
		jTextArea2.setRows(5);
		jTextArea2
				.setText("  \u8fd9\u8bdd\u4e00\u51fa\uff0c\u6768\u5efa\u7684\u540c\u684c\u4e5f\u9762\u8272\u6fc0\u52a8\u9053\uff1a\u201c\u4e0d\u9519\uff0c\u8003\u4e2a\u6587\u79d1\u540d\u6821\uff0c\u6bd5\u4e1a\u51fa\u6765\uff0c\u5de5\u8d44\u5f85\u9047\u4e5f\u4e0d\u4f1a\n\u4f4e\uff01\u201d\n  \u201c\u6211\u8fd8\u662f\u60f3\u8bd5\u8bd5......\u201d\u6768\u5efa\u6709\u4e9b\u72b9\u8c6b\uff0c\u4ed6\u5bb6\u5883\u4e5f\u7b97\u4e0d\u9519\uff0c\u52a0\u4e0a\u8eab\u4f53\u5065\u58ee\uff0c\u4e0d\u8bd5\u8bd5\u4e0d\u7518\u5fc3\u3002\n\u5bf9\u4e8e\u6768\u5efa\u60f3\u8981\u5c1d\u8bd5\u7684\u8bdd\u8bed\uff0c\u9648\u51e1\u4e8c\u4e8c\u5e74\u4e5f\u6ca1\u963b\u6b62\uff0c\u5c3d\u7ba1\u5e0c\u671b\u6e3a\u832b\uff0c\u53ef\u673a\u4f1a\u5c31\u5728\u773c\u524d\uff0c\u603b\u6709\u4eba\u4e0d\n\u7518\u5fc3\u3002\n   \u4e09\u4eba\u8bf4\u7684\u706b\u70ed\uff0c\u6b64\u523b\u7684\u65b9\u5e73\u5374\u662f\u6ee1\u8138\u61f5\u3002\n   \u4ec0\u4e48\u60c5\u51b5\uff1f\n   \u54bd\u4e86\u54bd\u53e3\u6c34\uff0c\u65b9\u5e73\u770b\u4e86\u4e09\u4eba\u4e00\u4f1a\uff0c\u6ca1\u770b\u5230\u53f3\u5f00\u73a9\u7b11\u9017\u8da3\u7684\u610f\u601d\uff0c\u8fd9\u65f6\u5019\u65b9\u5e73\u603b\u7b97\u5bdf\u89c9\u6709\u4e9b\u4e0d\n\u5bf9\u52b2\u4e86\u3002\n   \u6b63\u60f3\u95ee\u8bdd\uff0c\u7ed3\u679c\u518d\u6b21\u88ab\u4eba\u62a2\u4e86\u8bdd\u8bed\u3002\n   \u65b9\u5e73\u4ed6\u4eec\u65c1\u8fb9\u7684\u8bfe\u684c\uff0c\u539f\u672c\u6709\u4e24\u4e2a\u7537\u751f\u7a83\u7a83\u79c1\u8bed\uff0c\u8fd9\u65f6\u5019\u5927\u6982\u662f\u89c9\u5f97\u4eba\u5c11\u4e86\u8ba8\u8bba\u4e0d\u591f\u5473\u9053\u3002\n   \u7b49\u65b9\u5e73\u4ed6\u4eec\u8fd9\u8fb9\u51b7\u9759\u4e0b\u6765\uff0c\u65c1\u8fb9\u90a3\u684c\u7684\u4e00\u4e2a\u5e73\u5934\u7537\u751f\u5c31\u9762\u5e26\u6fc0\u52a8\uff0c\u559c\u4e0d\u81ea\u80dc\u9053\uff1a\u201c\u6768\u5efa\uff0c\u9648\n\u51e1\uff0c\u4f60\u4eec\u6628\u665a\u4e0a\u7f51\u770b\u65b0\u95fb\u4e86\u5417\uff1f\u201d\n   \u6768\u5efa\u4e8c\u4eba\u6447\u4e86\u6447\u5934\uff0c\u9ad8\u8003\u5728\u5373\uff0c\u73b0\u5728\u5bb6\u91cc\u7ba1\u7684\u90fd\u4e25\uff0c\u54ea\u6709\u65f6\u95f4\u4e0a\u7f51\u3002\u89c1\u4e8c\u4eba\u4e0d\u77e5\u60c5\uff0c\u65b9\u5e73\u548c\n\u53e6\u5916\u4e00\u4e2a\u7537\u751f\u4e5f\u4f1a\u662f\u832b\u7136\uff0c\u5e73\u5934\u7537\u751f\u987f\u65f6\u7b11\u9053\uff1a\u201c\u592a\u53ef\u60dc\u4e86\uff01\u201d");
		jScrollPane2.setViewportView(jTextArea2);

		jButton4.setBackground(new java.awt.Color(250, 108, 47));
		jButton4.setText("\u4e0a\u4e00\u7ae0");
		jButton4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				jButton4ActionPerformed(evt);
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
								javax.swing.GroupLayout.Alignment.TRAILING,
								jPanel2Layout
										.createSequentialGroup()
										.addContainerGap()
										.addComponent(
												jLabel5,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												104,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												251, Short.MAX_VALUE)
										.addGroup(
												jPanel2Layout
														.createParallelGroup(
																javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel6)
																		.addGap(
																				7,
																				7,
																				7)
																		.addComponent(
																				jLabel7))
														.addGroup(
																javax.swing.GroupLayout.Alignment.TRAILING,
																jPanel2Layout
																		.createSequentialGroup()
																		.addComponent(
																				jLabel8)
																		.addGap(
																				17,
																				17,
																				17)))
										.addGap(184, 184, 184).addComponent(
												jButton4).addGap(126, 126, 126))
						.addGroup(
								jPanel2Layout.createSequentialGroup().addGap(
										29, 29, 29).addComponent(jScrollPane2,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										812, Short.MAX_VALUE)
										.addGap(38, 38, 38)));
		jPanel2Layout
				.setVerticalGroup(jPanel2Layout
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
																		.addContainerGap()
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel5,
																								javax.swing.GroupLayout.PREFERRED_SIZE,
																								51,
																								javax.swing.GroupLayout.PREFERRED_SIZE)
																						.addComponent(
																								jButton4)))
														.addGroup(
																jPanel2Layout
																		.createSequentialGroup()
																		.addGap(
																				35,
																				35,
																				35)
																		.addGroup(
																				jPanel2Layout
																						.createParallelGroup(
																								javax.swing.GroupLayout.Alignment.BASELINE)
																						.addComponent(
																								jLabel6)
																						.addComponent(
																								jLabel7))
																		.addPreferredGap(
																				javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																		.addComponent(
																				jLabel8)))
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												javax.swing.GroupLayout.DEFAULT_SIZE,
												Short.MAX_VALUE)
										.addComponent(
												jScrollPane2,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												434,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 879,
				Short.MAX_VALUE).addGap(0, 879, Short.MAX_VALUE).addGap(0, 879,
				Short.MAX_VALUE).addComponent(jPanel2,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 547,
				Short.MAX_VALUE).addGap(0, 547, Short.MAX_VALUE).addGap(0, 547,
				Short.MAX_VALUE).addComponent(jPanel2,
				javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
		
	new Quan2().setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Quan3().setVisible(true);
			}
		});
	}

	//GEN-BEGIN:variables
	// Variables declaration - do not modify
	private javax.swing.JButton jButton1;
	private javax.swing.JButton jButton2;
	private javax.swing.JButton jButton4;
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JScrollPane jScrollPane2;
	private javax.swing.JTextArea jTextArea1;
	private javax.swing.JTextArea jTextArea2;
	// End of variables declaration//GEN-END:variables

}