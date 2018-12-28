package model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import lll.DataConnect;


public class Admin {
	
	private int aid;
	private String apw;
	private boolean islogin;
	
	
	
	public Admin(){
		islogin=false;
	}
	public Admin(int aid, String apw) {
		super();
		this.aid = aid;
		this.apw = apw;
		islogin=true;
	}
	public int getAid() {
		return aid;
	}
	
	public String getApw() {
		return apw;
	}
	public void setApw(String apw) {
		this.apw = apw;
	}
    protected void login(){
    	
    }
 
    
    public static boolean login(String uid, String pw) throws SQLException {
		boolean bool = true;
		String sql = "select Uid,Upw from userlist where uid = " + uid + " and Upw ="
				+ pw;
		Statement stmt = lll.DataConnect.getConnection().createStatement();
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
 protected void addAdmin(){
 	
 }
 protected void banUser(){
 	
 }
 protected void unBanUser(){
 	
 }
 protected void addGG(){
 	
 }
 protected void deletegGG(){
 	
 }
 protected void updatePersonal(){
 	
 }
 protected void addCM(){
 	
 }
 protected void deleteCM(){
 	
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
	
    
}
