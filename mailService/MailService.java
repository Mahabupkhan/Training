package mailService;

import java.io.Serializable;
import java.util.ArrayList;

public class MailService {
	public static void main(String[] args) {

	}
}

class Msg implements Serializable{
	String from;
	String to;
	String mailSubject;
	String content;
	boolean recalled = false;
	public Msg(String from, String to, String mailSubject, String content) {
		this.from = from;
		this.to = to;
		this.mailSubject = mailSubject;
		this.content = content;
	}
}

class User implements Serializable{
	private String uname;
	private String mailId;
	private String pwd;
	ArrayList<Msg> recievedMail = new ArrayList<Msg>();
	ArrayList<Msg> sentMail = new ArrayList<Msg>();
	//ArrayList<File> receivedFile=new ArrayList<File>();
	//ArrayList<File> sentFile=new ArrayList<File>();

	public User(String uname, String mailId, String pwd) {
		this.uname = uname;
		this.mailId = mailId;
		this.pwd = pwd;
	}

	public String getUname() {
		return uname;
	}

	public String getMailId() {
		return mailId;
	}

	public String getPwd() {
		return pwd;
	}
}

class Group implements Serializable{
	String name;
	String mailId;
	String Description;
	String password;
	ArrayList<User> users = new ArrayList<User>();

	public Group(String name, String mailId, String Description, String password) {
		this.name = name;
		this.mailId = mailId;
		this.Description = Description;
		this.password = password;
	}
	public void removeUser(User u) {
	for(int i=0;i<users.size();i++) {
		if(users.get(i).getUname().equals(u)) {
			users.remove(i);
			break;
		}
	}	
	}
	public void sentMsg(Msg m) {
		for(int i=0;i<users.size();i++) {
			users.get(i).recievedMail.add(m);
		}
	}

}
