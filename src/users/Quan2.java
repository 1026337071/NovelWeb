/*
 * Quan2.java
 *
 * Created on __DATE__, __TIME__
 */

package users;

import javax.swing.JFrame;

/**
 *
 * @author  __USER__
 */
public class Quan2 extends javax.swing.JFrame {

	/** Creates new form Quan2 */
	public Quan2() {
		initComponents();
		this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		this.setLocationRelativeTo(null);
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
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

		setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

		jPanel1.setBackground(new java.awt.Color(238, 255, 158));

		jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24));
		jLabel1.setText("\u5c0f\u8bf4\u9605\u8bfb");

		jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel2.setText("\u4e66\u540d\uff1a");

		jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel4.setText("\u5168\u7403\u9ad8\u6b66");

		jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18));
		jLabel3.setText("\u7b2c\u4e8c\u7ae0\u8282");

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
				.setText("   \u6b63\u5f53\u65b9\u5e73\u4e3a\u81ea\u5df1\u7684\u672a\u6765\u8c0b\u5212\u6dfb\u7816\u52a0\u74e6\u4e4b\u9645\uff0c\u524d\u6392\u90a3\u4e2a\u957f\u7684\u4e94\u5927\u4e09\u7c97\u7684\u6768\u5efa\u540c\u5b66\uff0c\u5ffd\u7136\u8f6c\u5934\u95ee\n\u9053:\u201c\u65b9\u5e73\uff0c\u9648\u51e1\uff0c\u4f60\u4eec\u62a5\u4e0d\u62a5\u540d\uff1f\u201d\u65b9\u5e73\u5bf9\u6768\u5efa\u5370\u8c61\u53ef\u8c13\u6df1\u523b\uff0c\u5012\u4e0d\u662f\u6768\u5efa\u5e05\u7834\u5929\u9645\u3002\u5173\u952e\u5728\n\u4e8e\uff0c\u5927\u5b66\u6bd5\u4e1a\u4e4b\u540e\uff0c\u65b9\u5e73\u9ad8\u4e2d\u540c\u5b66\u805a\u4f1a\uff0c\u521a\u6bd5\u4e1a\u7684\u6768\u5efa\uff0c\u5c45\u7136\u517b\u4e86\u4e00\u8138\u7684\u7edc\u816e\u80e1\u5b50\uff0c\u5dee\u70b9\u8ba9\u65b9\u5e73\n\u4ee5\u4e3a\u6768\u5efa\u4ed6\u7238\u4e5f\u6765\u53c2\u52a0\u540c\u5b66\u805a\u4f1a\u4e86\u3002\u6253\u90a3\u4ee5\u540e\uff0c\u65b9\u5e73\u5c31\u6ca1\u5fd8\u8bb0\u8fd9\u4f4d\u7edc\u816e\u80e1\u5b50\u540c\u5b66\uff0c\u7279\u5f81\u592a\u660e\u663e\u3002\n\u5fc3\u91cc\u60f3\u7740\u4e8b\uff0c\u65b9\u5e73\u4e00\u65f6\u95f4\u6ca1\u60f3\u7740\u63a5\u8bdd\u3002\u65b9\u5e73\u540c\u684c\uff0c\u88ab\u73ed\u4e0a\u540c\u5b66\u620f\u79f0\u4e3a\u201c\u5e73\u51e1\u4e8c\u4eba\u7ec4\u201d\u6210\u5458\u4e4b\u4e00\n\u7684\u9648\u51e1\uff0c\u8fd9\u65f6\u5019\u5219\u662f\u6447\u5934\u9053\uff1a\u201c\u6211\u4e0d\u62a5\u540d\u4e86\uff0c\u6d6a\u8d39\u94b1\u800c\u5df2\u3002\u62a5\u4e2a\u540d\u5c31\u8981\u4e00\u4e07\uff0c\u6307\u5b9a\u8003\u4e0d\u4e0a\uff0c\u6709\n\u8fd9\u4e48\u591a\u94b1\u5927\u5b66\u4e00\u5e74\u751f\u6d3b\u8d39\u52a0\u5b66\u8d39\u90fd\u5dee\u4e0d\u591a\u591f\u4e86\u3002\u201d\u6768\u5efa\u6709\u4e9b\u550f\u5618\u9053\uff1a\u201c\u4e5f\u662f\uff0c\u53ef\u603b\u6709\u4e9b\u4e0d\u7518\u5fc3\uff0c\n\u4e0d\u8bd5\u8bd5\uff0c\u5c31\u6015\u540e\u6094\u4e00\u8f88\u5b50\u3002\u201d\u6768\u5efa\u7684\u540c\u684c\uff0c\u4e5f\u662f\u4e2a\u7537\u751f\uff0c\u540d\u5b57\u65b9\u5e73\u6709\u4e9b\u6a21\u7cca\u4e86\u3002\u6b64\u65f6\u4e5f\u8f6c\u5934\u52a0\n\u5165\u8ba8\u8bba\uff0c\u8138\u8272\u9eef\u7136\u9053\uff1a\u201c\u8fd9\u662f\u54b1\u4eec\u552f\u4e00\u4e00\u6b21\u9ca4\u9c7c\u8dc3\u9f99\u95e8\u7684\u673a\u4f1a\uff0c\u53ef\u60dc\uff0c\u8ddf\u6211\u4eec\u65e0\u5173\u3002\u201d\u4e09\u4eba\u53c8\u662f\n\u550f\u5618\uff0c\u53c8\u662f\u9057\u61be\uff0c\u542c\u5f97\u65b9\u5e73\u6ee1\u5934\u96fe\u6c34\uff0c\u83ab\u540d\u5176\u5999\u3002\n    \u62a5\u540d\uff1f\u521a\u521a\u8001\u5e08\u8bf4\u7684\u201c\u6587\u79d1\u201d\u62a5\u540d\uff1f\u62a5\u540d\u8d39\u5c31\u8981\u4e00\u4e07\uff1f\u8fd9\u53ef\u662f08\u5e74\uff0c\u8981\u662f\u6ca1\u8bb0\u9519\uff0c\u9633\u57ce\u8fd9\n\u65f6\u5019\u7684\u5e02\u533a\u623f\u4ef7\u4e5f\u624d4000\u4e00\u5e73\u5de6\u53f3\uff0c\u8003\u8bd5\u62a5\u540d\u8981\u8fd9\u4e48\u591a\u94b1\u5417\uff1f\u8fd9\u51e0\u4e2a\u5bb6\u4f19\u6ca1\u8bf4\u9519\u5427\uff1f\u53c8\u6216\u8005\u88ab\n\u4eba\u9a97\uff1f\u65b9\u5e73\u521a\u60f3\u63d2\u8bdd\u95ee\u95ee\uff0c\u540c\u684c\u9648\u51e1\u6276\u4e86\u6276\u773c\u955c\uff0c\u8138\u8272\u575a\u6bc5\u9053\uff1a\u201c\u5c31\u7b97\u4e0d\u8003\u6b66\u79d1\uff0c\u8003\u6587\u79d1\uff0c\u4e5f\n\u4e0d\u4e00\u5b9a\u4e00\u8f88\u5b50\u65e0\u6cd5\u51fa\u4eba\u5934\u5730\uff01\u793e\u4f1a\u4e0a\u4e5f\u6709\u6b66\u9053\u57f9\u8bad\u73ed\uff0c\u7b49\u6211\u4eec\u6bd5\u4e1a\u4e86\u6323\u4e86\u94b1\uff0c\u5230\u65f6\u5019\u4e5f\u53ef\u4ee5\n\u8fdb\u4fee\u3002\u5c31\u7b97\u4e0d\u5982\u6b66\u79d1\u751f\uff0c\u8d77\u7801\u8fd8\u6709\u5e0c\u671b\uff01\u201d");
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
										.addContainerGap()
										.addComponent(
												jLabel1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												104,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												245, Short.MAX_VALUE)
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
										.addGap(184, 184, 184)
										.addComponent(jButton2)
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jButton1).addGap(50, 50,
												50)).addGroup(
								jPanel1Layout.createSequentialGroup().addGap(
										29, 29, 29).addComponent(jScrollPane1,
										javax.swing.GroupLayout.DEFAULT_SIZE,
										806, Short.MAX_VALUE)
										.addGap(38, 38, 38)));
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
										.addPreferredGap(
												javax.swing.LayoutStyle.ComponentPlacement.RELATED,
												19, Short.MAX_VALUE)
										.addComponent(
												jScrollPane1,
												javax.swing.GroupLayout.PREFERRED_SIZE,
												434,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(
				getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 873,
				Short.MAX_VALUE).addGap(0, 873, Short.MAX_VALUE).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(
				javax.swing.GroupLayout.Alignment.LEADING).addGap(0, 558,
				Short.MAX_VALUE).addGap(0, 558, Short.MAX_VALUE).addComponent(
				jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
				javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

		pack();
	}// </editor-fold>
	//GEN-END:initComponents

	private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
		new Quan1().setVisible(true);
	}

	private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
		new Quan3().setVisible(true);
	}

	/**
	 * @param args the command line arguments
	 */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Quan2().setVisible(true);
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