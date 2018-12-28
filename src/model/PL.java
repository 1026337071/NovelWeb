package model;

public class PL {
	
	private int tid;
	private int gid;
	private int uid;
	private String content;
	private String time;
	public PL(int tid, int gid, int uid, String content, String time) {
		super();
		this.tid = tid;
		this.gid = gid;
		this.uid = uid;
		this.content = content;
		this.time = time;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getTid() {
		return tid;
	}
	public int getGid() {
		return gid;
	}
	public int getUid() {
		return uid;
	}
	
}
