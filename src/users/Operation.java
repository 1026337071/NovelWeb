//package users;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.text.SimpleDateFormat;
//import java.util.ArrayList;
//import java.util.Date;
//import java.util.List;
//
//import javax.swing.JOptionPane;
//import javax.swing.JPasswordField;
//import javax.swing.JTextArea;
//import javax.swing.JTextField;
//
//import GUI.Login;
//
//public class Operation {
//
//	static PreparedStatement ps=null;
//	static Connection ct=null;
//	static ResultSet rs=null;
//	public static String[] loginUserInfo = null;
//	
//	public Operation(){
//		try{
//			Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
//			ct=DriverManager.getConnection("jdbc:microsoft:sqlserver://127.0.0.1:1433;databaseName=smdb","sa","123");
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//	}
//	
//	
//	public boolean check(JTextField fieldAccount, JPasswordField fieldPassword,String roleType){//登录审核
//		boolean checkResult = false;
//		PreparedStatement ps=null;
//		ResultSet rs=null;
//		String account,passworld,pass;
//		account = fieldAccount.getText();
//		passworld = fieldPassword.getText();
//		try {
//			String sql = "SELECT * FROM SM_USER where  NO='"+account+"' AND ROLE_TYPE = "+roleType+""
//				+ " AND PWD = '"+passworld+"'";
//			ps=ct.prepareStatement(sql);
//			rs=ps.executeQuery();
//			while(rs.next()){	
//				checkResult = true;
//				// 保存登录信息到全局变量，这样，所有地方都可以根据全局变量拿到登录用户的信息
//				loginUserInfo = new String[2];
//				loginUserInfo[0] = rs.getString("NO");
//				loginUserInfo[1] = rs.getString("USER_NAME");
//				
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return checkResult;
//	}
//
//	public  String[][] output(){//List<sm_user_smapply> 查询所有
//		String[][]st = null;
//		List<sm_user_smapply> list = new ArrayList<sm_user_smapply>();
//		try {
//			ps=ct.prepareStatement("SELECT * FROM sm_user_apply");
//			rs=ps.executeQuery();
//			while(rs.next())
//			{
//				sm_user_smapply smu = new sm_user_smapply();
//				smu.setNO(rs.getString("NO"));
//				smu.setUSER_NAME(rs.getString("USER_NAME"));
//				smu.setSTART_TIME(rs.getString("START_TIME"));
//				smu.setEND_TIME(rs.getString("END_TIME"));
//				smu.setSTATE(rs.getString("STATE"));
//				list.add(smu);
//			}
//			st = new String[list.size()][5];
//			for(int i = 0;i<list.size();i++){
//				 st[i][0] =list.get(i).getNO();//,list.get(i).getUser_name(),list.get(i).getNo()};
//				 st[i][1] =list.get(i).getUSER_NAME();
//				 st[i][2] =list.get(i).getSTART_TIME();
//				 st[i][3] =list.get(i).getEND_TIME();
//				 st[i][4] =list.get(i).getSTATE();
//			}
//			//System.out.println(i);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			
//			e.printStackTrace();
//		}
//		return st;
//	}	
//	
//	public String  Remarks(String st1,String st2){//状态查询
//		String st = null;
//		try {
//			ps=ct.prepareStatement("select REMARKS from sm_user_apply where NO = '"+st1+"' and START_TIME = '"+st2+"';");
//			rs=ps.executeQuery();	
//			while(rs.next())
//			{
//				st = rs.getString("REMARKS");			
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return st;
//	}
//	
//	public String checkDate(String dateStr){//获取月份
//		   String result = "";
//		   try{
//		      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//		      Date date = sdf.parse(dateStr);
//		      if(null != date){
//		         int month = date.getMonth()+1;
//		         if(month < 10){
//		            result = ""+month;    
//		         }else{
//		            result = String.valueOf(month);
//		         }
//		      }
//		   } catch (Exception e){
//			   JOptionPane.showMessageDialog(null, "日期格式应为：2000-01-01","提示：", JOptionPane.INFORMATION_MESSAGE);		   }
//		   return result;
//		}
//	
//	public int  apply(String st1,String st2,String st3,String st4,String st5,String st6){//添加
//		int a = 0;
//		if(st1.length()==0){
//			JOptionPane.showMessageDialog(null, "请输入学号！","提示：", JOptionPane.INFORMATION_MESSAGE);
//			a=1;
//		}else if(st2.length()==0){
//			JOptionPane.showMessageDialog(null, "请输入姓名！","提示：", JOptionPane.INFORMATION_MESSAGE);
//			a=1;
//		}else if(st3.length()==0){
//			JOptionPane.showMessageDialog(null, "请输入请假时间！","提示：", JOptionPane.INFORMATION_MESSAGE);
//			a=1;
//		}else if(st4.length()==0){
//			JOptionPane.showMessageDialog(null, "请输入请假时间！","提示：", JOptionPane.INFORMATION_MESSAGE);
//			a=1;
//		}else if(st5.length()==0){
//			JOptionPane.showMessageDialog(null, "请输入请假原因！","提示：", JOptionPane.INFORMATION_MESSAGE);
//			a=1;
//		}else{
//			try {
//				Statement sm=null;
//				sm=ct.createStatement();
//				int i = sm.executeUpdate("insert into sm_user_apply values('"+st2+"','"+st1+"','"
//						+st3+"','"+st4+"','未审核','"+st5+"',"+st6+");");
//				if(i==1){
//				JOptionPane.showMessageDialog(null, "添加成功！","提示：", JOptionPane.INFORMATION_MESSAGE);
//				}else{
//					JOptionPane.showMessageDialog(null, "添加失败！","提示：", JOptionPane.INFORMATION_MESSAGE);
//				}
//			
//			} catch (Exception e) {
//				// TODO: handle exception
//				e.printStackTrace();
//			}
//				a=0;
//		}
//		return a;	
//	}
//	
////	public  String[][] output(){//List<sm_user_smapply> 查询所有
////		String[][]st = null;
////		List<sm_user_smapply> list = new ArrayList<sm_user_smapply>();
////		try {
////			ps=ct.prepareStatement("SELECT * FROM sm_user_apply");
////			rs=ps.executeQuery();
////			while(rs.next())
////			{
////				sm_user_smapply smu = new sm_user_smapply();
////				smu.setNO(rs.getString("NO"));
////				smu.setUSER_NAME(rs.getString("USER_NAME"));
////				smu.setSTART_TIME(rs.getString("START_TIME"));
////				smu.setEND_TIME(rs.getString("END_TIME"));
////				smu.setSTATE(rs.getString("STATE"));
////				list.add(smu);
////			}
////			st = new String[list.size()][5];
////			for(int i = 0;i<list.size();i++){
////				 st[i][0] =list.get(i).getNO();//,list.get(i).getUser_name(),list.get(i).getNo()};
////				 st[i][1] =list.get(i).getUSER_NAME();
////				 st[i][2] =list.get(i).getSTART_TIME();
////				 st[i][3] =list.get(i).getEND_TIME();
////				 st[i][4] =list.get(i).getSTATE();
////			}
////			//System.out.println(i);
////		} catch (SQLException e) {
////			// TODO Auto-generated catch block
////			
////			e.printStackTrace();
////		}
////		return st;
////	}	
//	public String[][]  query(JTextField field1,JTextField field2){//查询
//		String st1,st2;
//		st1 = field1.getText();//学号
//		st2 = field2.getText();//月份
//		
//		int i = 0 ,a = 0;
//		PreparedStatement ps=null;
//		ResultSet rs=null;
//		String[][]st = null;
//		//rs.last();
//		//rs.getRow();
//		List<sm_user_smapply> list = new ArrayList<sm_user_smapply>();
//		if(st1.length()==0){
//			i=2;
//		}else if(st2.length()==0){
//			i=1;
//		}else {
//			i=3;
//		}
//		try {
//			if(i==1){
//				ps=ct.prepareStatement("SELECT * FROM sm_user_apply where  NO='"+st1+"'");
//				rs=ps.executeQuery();
//				while(rs.next()){	
//					sm_user_smapply smu = new sm_user_smapply();
//					smu.setNO(rs.getString("NO"));
//					smu.setUSER_NAME(rs.getString("USER_NAME"));
//					smu.setSTART_TIME(rs.getString("START_TIME"));
//					smu.setEND_TIME(rs.getString("END_TIME"));
//					smu.setSTATE(rs.getString("STATE"));
//					list.add(smu);
//				}
//				st = new String[list.size()][5];
//				for(int x = 0;x<list.size();x++){
//					 st[x][0] =list.get(x).getNO();//,list.get(i).getUser_name(),list.get(i).getNo()};
//					 st[x][1] =list.get(x).getUSER_NAME();
//					 st[x][2] =list.get(x).getSTART_TIME();
//					 st[x][3] =list.get(x).getEND_TIME();
//					 st[x][4] =list.get(x).getSTATE();
//				}
//			}else if(i==2){
//				ps=ct.prepareStatement("SELECT * FROM sm_user_apply where  MONTH='"+st2+"'");
//				rs=ps.executeQuery();
//				while(rs.next()){	
//					sm_user_smapply smu = new sm_user_smapply();
//					smu.setNO(rs.getString("NO"));
//					smu.setUSER_NAME(rs.getString("USER_NAME"));
//					smu.setSTART_TIME(rs.getString("START_TIME"));
//					smu.setEND_TIME(rs.getString("END_TIME"));
//					smu.setSTATE(rs.getString("STATE"));
//					list.add(smu);
//				}
//				st = new String[list.size()][5];
//				for(int x = 0;x<list.size();x++){
//					 st[x][0] =list.get(x).getNO();//,list.get(i).getUser_name(),list.get(i).getNo()};
//					 st[x][1] =list.get(x).getUSER_NAME();
//					 st[x][2] =list.get(x).getSTART_TIME();
//					 st[x][3] =list.get(x).getEND_TIME();
//					 st[x][4] =list.get(x).getSTATE();
//				}
//			}else if(i==3){
//				ps=ct.prepareStatement("SELECT * FROM sm_user_apply where NO='"+st1+"'and MONTH='"+st2+"'");
//				rs=ps.executeQuery();
//				while(rs.next()){	
//					sm_user_smapply smu = new sm_user_smapply();
//					smu.setNO(rs.getString("NO"));
//					smu.setUSER_NAME(rs.getString("USER_NAME"));
//					smu.setSTART_TIME(rs.getString("START_TIME"));
//					smu.setEND_TIME(rs.getString("END_TIME"));
//					smu.setSTATE(rs.getString("STATE"));
//					list.add(smu);
//				}
//				st = new String[list.size()][5];
//				for(int x = 0;x<list.size();x++){
//					 st[x][0] =list.get(x).getNO();//,list.get(i).getUser_name(),list.get(i).getNo()};
//					 st[x][1] =list.get(x).getUSER_NAME();
//					 st[x][2] =list.get(x).getSTART_TIME();
//					 st[x][3] =list.get(x).getEND_TIME();
//					 st[x][4] =list.get(x).getSTATE();
//				}
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//		}
//		return st;
//	}
//	
//
//		public static void change(String st,String str1,String str2) {
//			
//			//String sql = "select * from sm_user_apply where NO = '" + str1 +"' and START_TIME='"+str2+"';";
//			String sql1 = "update sm_user_apply set STATE='"+ st+"' where NO = '"+ 
//							 		str1+"' and START_TIME='"+str2+"'";
//					// System.out.println(sql1);
//			System.out.println(sql1);
//			try {
//						 
//				ps=ct.prepareStatement(sql1);
//				int a=ps.executeUpdate();
//				System.out.println(a);
//			} catch (SQLException sqle) {
//				System.out.println("数据修改出现异常: " + sqle.getMessage());
//			}
//		} 
//			 
//		public void passchang(String str1,String str2,String str3){
//			String sql1 = "update sm_user set PWD='"+ str3+"' where NO = '"+ 
//			 		str1+"' and PWD='"+str2+"'";
//			System.out.println(sql1);
//			try {
//					ps=ct.prepareStatement(sql1);
//					int a=ps.executeUpdate();
//					System.out.println(a);
//			} catch (SQLException sqle) {
//				System.out.println(sqle.getMessage());
//			}
//			
//		}
//		
//		
////		public static void main(String[] args) {
////			new Operation();
////			List<sm_user_smapply> list = output();
////			String [][] str = new String[list.size()][list.size()];
////			for (int i=0;i<list.size();i++) {
////				
////				 str[i][0] =list.get(i).getUser_name();//,list.get(i).getUser_name(),list.get(i).getNo()};
////				
////			}
////			
////			System.out.println("---->"+str[0][0]);
////	
////		}
//		}
//
//
//	

