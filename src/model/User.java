package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

import javax.swing.JOptionPane;


import lll.DataConnect;

public class User {

	public int uid;
	public String upw;
	public String uname;
	public String uemail;
	public String img;
	public boolean islogin;

	private static Statement stmt;
	public User() {
		islogin = false;
	}

	public User(int uid, String upw, String uname, String uemail, String img) {
		super();
		this.uid = uid;
		this.upw = upw;
		this.uname = uname;
		this.uemail = uemail;
		this.img = img;
		islogin = true;
	}

	public int getUid() throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		return uid;
	}

	public void setUid(int uid) throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		this.uid = uid;
	}

	public String getUpw() throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		return upw;
	}

	public void setUpw(String upw) throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		this.upw = upw;
	}

	public String getUname() throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		return uname;
	}

	public void setUname(String uname) throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		this.uname = uname;
	}

	public String getUemail() throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		return uemail;
	}

	public void setUemail(String uemail) throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		this.uemail = uemail;
	}

	public String getImg() throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		return img;
	}

	public void setImg(String img) throws Exception {
		if (!islogin)
			throw new Exception("没有登陆!");
		this.img = img;
	}

	private static String toSqlString(String str) {
		return new String(" '" + str + "' ");
	}
	
	// 登陆
	public static boolean login(String uid, String pw) throws SQLException {
		boolean bool = true;
		String sql = "select Uid,Upw from userlist where uid = " + uid + " and Upw ="
				+ pw;
		stmt = lll.DataConnect.getConnection().createStatement();
		//stmt.executeUpdate(sql);
		ResultSet r = stmt.executeQuery(sql);		
		if (r.next())
			return bool;
		else
		{
			bool = false;
			return bool;
		}

	}

	//注冊
	public static void register(String id,String email,String password){
		String sql = "insert into userlist" +
				"(Uid,Umail,Upw) " +
				"values (" + toSqlString(id)+","+toSqlString(email)+","+toSqlString(password)+")";
		try {
			stmt = lll.DataConnect.getConnection().createStatement();
			stmt.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ResultSet r = stmt.executeQuery(sql);
		

	}
	//查找
	public static boolean getuser(String id) {
		boolean bool = false;
		String sql = "select Uid from userlist where Uid = " + toSqlString(id);
		try {
			stmt = lll.DataConnect.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next() == true) {
				JOptionPane.showMessageDialog(null, "id已被注册", "",JOptionPane.WARNING_MESSAGE);
			}
			else{
				bool = true;
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return bool;
	}

	//添加小説
	protected void addNovel(String uid,String bid, String bname) throws SQLException{
		String sql = "insert into Bookcaselist (uid, bid,bname) values (321,333,'霸道总裁')；";
		DataConnect.getStat().executeUpdate(sql);
		


	}

	// 刪除小説
	protected void deleteNovel(String uid) throws SQLException{
		String sql = "delete from Novelist  where uid=123;";
		DataConnect.getStat().executeUpdate(sql);
		

	}

	// 更新小説
	protected void updateNovel(String nid) throws SQLException{
		String sql = "update Novelist set coveradd='暂无' where nid=123;";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 1上传回复的评论内容
	protected void uploadContext(String uid,String bid,String cid,String o,String comment,String lasttime) throws SQLException{
		String sql = "insert into Replaylist (uid, bid,cid,comment,lasttime) values (333,678,123,'"+comment+"','2018-12-03 13:37:59');";
		DataConnect.getStat().executeUpdate(sql);
	}

	//添加评论
	public static void addComment(String uid,String comment ) throws SQLException{
		String sql = "insert into Commentlist (uid,comment) values (uid,'"+comment+"')；";
		DataConnect.getStat().executeUpdate(sql);
	}
	
	//添加评论
	public static void addComment2(String comment ) throws SQLException{
		String sql = "insert into Commentlist (comment) values ('"+comment+"')";
		DataConnect.getStat().executeUpdate(sql);
	}

	// 登陆
	protected void replyComment() {

	}
	//查找
	public static Map<String, String> gethh(String bname) {
		Map<String, String> map = new HashMap<String, String>();
		String status = "0";
		String sql = "select Uid from userlist where bname = " + toSqlString(bname);
		try {
			stmt = lll.DataConnect.getConnection().createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			if (rs.next() == true) {
				JOptionPane.showMessageDialog(null, "查无此书", "",JOptionPane.WARNING_MESSAGE);
			}
			else{
				status = "1";
			}
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		}

		return map;
	}


}
