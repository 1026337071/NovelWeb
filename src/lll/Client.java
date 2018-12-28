package lll;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client extends JFrame{
	JTextField inputField = new JTextField(10);
	JButton sendButton = new JButton("����");
	JButton quitButton = new JButton("�˳�");
	JTextArea displayArea = new JTextArea(15, 20);
	static DataOutputStream oss = null;
	DataInputStream dataInputStream = null;
	
	public Client() {
		InputStream inputStream;
		OutputStream outputStream;
		try {
			Socket socket = new Socket("localhost",1234);
			inputStream = socket.getInputStream();
			outputStream = socket.getOutputStream();
			oss =new DataOutputStream(outputStream);
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		new Client();
		UserElogin("123456", "123456");
	}
//	1.	��½
	public static void UserElogin(String ID,String password) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model1");
	     oss.flush();
	     oss.writeUTF(ID);
	     oss.flush();
	     oss.writeUTF(password);
	     oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	2.	ע��
	public void Register(String ID,String password,String name,String useremail) throws IOException{
	     oss.writeUTF("model2");
	     oss.flush();
	     oss.writeUTF(ID);
	     oss.flush();
	     oss.writeUTF(password);
	     oss.flush();
	     oss.writeUTF(name);
	     oss.flush();
	     oss.writeUTF(useremail);
	     oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	3.������Ϣ����
	public void Userelogin(String ID,String password,String name,String useremail,String headsculpture) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model3");
	     oss.flush();
	     oss.writeUTF(password);
	     oss.flush();
	     oss.writeUTF(name);
	     oss.flush();
	     oss.writeUTF(useremail);
	     oss.flush();
	     oss.writeUTF(headsculpture);
	     oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	4.���
	public void  bookshelf(String bookname) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model4");
	     oss.flush();
		oss.writeUTF(bookname);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	5.��ǩ 
	public void Label(String tag) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model5");
	     oss.flush();
		oss.writeUTF(tag);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	6.���ߵ�½
	public void AuthorElogin(String ID,String pw) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model6");
	     oss.flush();
				oss.writeUTF(ID);
				oss.flush();
				oss.writeUTF(pw);
				oss.flush();
			     oss.writeUTF("bye");
			     oss.flush();
			     oss.close();
			}
//	7.��ɾС˵
	public void  CRUD(String book) throws IOException,ClassNotFoundException{
				
	     oss.writeUTF("model7");
	     oss.flush();
		oss.writeUTF(book);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
			
//	8.����Ա��½
	public  void Elogin(String ID,String pw) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model8");
	     oss.flush();
		oss.writeUTF(ID);
		oss.flush();
		oss.writeUTF(pw);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	9.��������
	public  void SetAuthorElogin(String author) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model9");
	     oss.flush();
		oss.writeUTF(author);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	10.�����û�
	public  void SetUserElogin(String user) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model10");
	     oss.flush();
		oss.writeUTF(user);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}
//	11.�Ƽ�С˵
	public  void Recommend(String recommend) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model11");
	     oss.flush();
		oss.writeUTF(recommend);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}

//	12.����С˵
	public  void Comment(String comment) throws IOException,
	ClassNotFoundException{
	     oss.writeUTF("model2");
	     oss.flush();
		oss.writeUTF(comment);
		oss.flush();
	     oss.writeUTF("bye");
	     oss.flush();
	     oss.close();
	}

}


