package model;

public class RPL {
	
	private int tid;
	private int uid;
	private String content;
	private String time;
	public RPL(int tid, int uid, String content, String time) {
		super();
		this.tid = tid;
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
	public int getUid() {
		return uid;
	}
	

}
