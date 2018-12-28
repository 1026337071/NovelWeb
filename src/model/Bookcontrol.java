package model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import lll.DataConnect;

public class Bookcontrol {
	public String uname;
	public String chapter;
	public String author;
	private static Statement stmt;
	public  Bookcontrol() {
		super();
	}
	public Bookcontrol(String uname, String chapter, String author) {
		super();
		this.uname = uname;
		this.chapter = chapter;
		this.author = author;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getChapter() {
		return chapter;
	}
	public void setChapter(String chapter) {
		this.chapter = chapter;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public ArrayList<Bookcontrol> loadBookcontrol() throws SQLException, ClassNotFoundException {
		ArrayList<Bookcontrol> books = new ArrayList<Bookcontrol>();
		String sql = "select * from bookcontrol";
		stmt = lll.DataConnect.getConnection().createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()){
			books.add(new Bookcontrol(rs.getString(1),rs.getString(2),rs.getString(3)));
		}
		return books;
	}
	public void addBookcontol(Bookcontrol u) throws SQLException, ClassNotFoundException {
		String sql = "insert into user values('"+u.uname+"','"+u.chapter+"','"+u.author+"')";
		stmt.executeUpdate(sql);
	}
	public void deleteBookcontrol(String uname) throws SQLException, ClassNotFoundException {
		String sql = "delete from bookcontrol where uname="+uname;
		stmt.executeUpdate(sql);
	}
	
	public boolean queryBook(String uname) throws SQLException, ClassNotFoundException {
		boolean bool = false;
		try{
			DataConnect dc = new DataConnect();
			String sql = "select * from bookcontrol where uname='"+uname+"'";
			stmt = dc.getStat();
			ResultSet rs = stmt.executeQuery(sql);
			if(rs.next()) {
				bool = true;
			}
			}catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return bool;
	}
	
	public List<String> queryAllBook() throws SQLException, ClassNotFoundException {
		List<String> list = new ArrayList<String>();
		try{
			DataConnect dc = new DataConnect();
			String sql = "select uname from bookcontrol";
			stmt = dc.getStat();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				list.add(rs.getString("uname")); 
				}
			}catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return list;
	}
	
	public String initString() throws SQLException, ClassNotFoundException {
		String str="";
		try{
			DataConnect dc = new DataConnect();
			String sql = "select comment from commentlist";
			stmt = dc.getStat();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				str += rs.getString("comment");
				str += "\r\n";
				}
			}catch (SQLException sqle) {
			sqle.printStackTrace();
		}
		return str;
	}
}
