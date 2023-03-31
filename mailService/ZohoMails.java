package mailService;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class ZohoMails {
	private static ZohoMails zm;
	private ZohoMails() {}
	public static ZohoMails getInstance() {
		if(zm==null)
			zm=new ZohoMails();
		return zm;
	}
	
	
	ArrayList<User> users=new ArrayList<User>();
	ArrayList<Group> groups=new ArrayList<Group>();
	Scanner scan=new Scanner(System.in);
	public static void main(String[] args) {
			ZohoMails ZM=ZohoMails.getInstance();
			ZM.options();
	}
	public void options() {
		int uc;
		do {
			
		System.out.println("0.deSerializePreviousData\n1.Add user\n2.UserLogIn\n3.CreateGroup\n4.AddUsersToGroup\n5.Exit");
		uc=scan.nextInt();
		switch(uc) {
		case 0:
			dodeSerialize();
			break;
		case 1:
			addUser();
			break;
		case 2:
			userLogIn();
			break;
		case 3:
			CreateGroup();
			break;
		case 4:
			addUserToGroup();
			break;
		case 5:
			doSerialize();
			break;
		default:
			System.out.println("Wrong option!!!!!");
		}
		}while(uc<=3);
	}
	public void doSerialize() {
		try {
			FileOutputStream fo=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\zohoMails\\userObjects");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(users);
			os.close();
			fo.close();
			//System.out.println("Serialized successfully....\nProgram is shutting down...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			FileOutputStream fo=new FileOutputStream("C:\\Users\\Administrator\\Desktop\\zohoMails\\groupObjects");
			ObjectOutputStream os=new ObjectOutputStream(fo);
			os.writeObject(groups);
			os.close();
			fo.close();
			System.out.println("Serialized successfully....\nProgram is shutting down...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void dodeSerialize(){
		try {
			FileInputStream fi=new FileInputStream("C:\\Users\\Administrator\\Desktop\\zohoMails\\userObjects");
			ObjectInputStream oi=new ObjectInputStream(fi);
			users=(ArrayList<User>)oi.readObject();
			oi.close();
			fi.close();
			//System.out.println("Previous Details are DeSerialized Successfully...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}try {
			FileInputStream fi=new FileInputStream("C:\\Users\\Administrator\\Desktop\\zohoMails\\groupObjects");
			ObjectInputStream oi=new ObjectInputStream(fi);
			groups=(ArrayList<Group>)oi.readObject();
			oi.close();
			fi.close();
			System.out.println("Previous Details are DeSerialized Successfully...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public void userLogIn() {
		System.out.println("Enter ur mail Id to LogIn : ");
		String mail=scan.next();
		boolean mailExist=false;
		int k=0;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getMailId().equals(mail)) {
				mailExist=true;
				k=i;
				break;
			}
		}
		if(mailExist) {
			System.out.println("Enter your password : ");
			String pwd=scan.next();
			if(users.get(k).getPwd().equals(pwd)) {
				System.out.println("Welcome Mr/Mrs "+users.get(k).getUname());
				int uc;
				do {
					System.out.println("1.Compose Mail\n2.view Inbox\n3.View Sent Mails\n4.Recall mail\n5.exit");
					uc=scan.nextInt();
					switch(uc) {
					case 1 :
						System.out.println("1.To single user\2.To group");
						int uuc=scan.nextInt();
						if(uuc==1)
						composeMail(k);
						else
							mailToGrp(k);
						break;
					case 2:
						viewInbox(k);
						break;
					case 3:
						viewSentMails(k);
						break;
					case 4:
						recallMails(k);
						break;
					case 5:
						Exit(k);
						System.out.println("Signing out.....");
					}
					
				}while(uc!=5);
			}
		}
		else {
			System.out.println("Check your mail Id !!!\nMail Id not exist....");
		}
	}
	public void Exit(int k) {
		
	}
	public void composeMail(int k) {
		System.out.println("Enter TO address : ");
		String toAddress=scan.next();
		boolean toExist=false;
		int toIndex=0;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getMailId().equals(toAddress)) {
				toExist=true;
				toIndex=i;
				break;
			}
		}
		if(toExist) {
			System.out.println("Enter Mail Subject : ");
			String subject=scan.nextLine();
			subject=scan.nextLine();
			System.out.println("Type the content : ");
			String content=scan.nextLine();
			content=scan.nextLine();
			Msg m=new Msg(users.get(k).getMailId(),toAddress,subject,content);
			users.get(k).sentMail.add(m);
			users.get(toIndex).recievedMail.add(m);
			System.out.println("Mail Sent Successfully");
		}
		else {
			System.out.println("Mail Id Not Exist!!!\nEnter correct TO address...");
			composeMail(k);
		}
	}
	public void viewInbox(int k) {
		for(int i=users.get(k).recievedMail.size()-1;i>=0;i--) {
			System.out.println("From : "+users.get(k).recievedMail.get(i).from);
			System.out.println("Subject : "+users.get(k).recievedMail.get(i).mailSubject);
			System.out.println("Content : "+users.get(k).recievedMail.get(i).content);
			System.out.println("\n");
		}
	}
	public void viewSentMails(int k) {
		for(int i=users.get(k).sentMail.size()-1;i>=0;i--) {
			System.out.println("To : "+users.get(k).sentMail.get(i).to);
			System.out.println("Subject : "+users.get(k).sentMail.get(i).mailSubject);
			System.out.println("Content : "+users.get(k).sentMail.get(i).content);
			System.out.println("\n");
		}
	}
	public void recallMails(int k) {
		
	}
	public void addUser() {
		System.out.println("Enter User Name : ");
		String name=scan.next();
		String mailId="";
		String pwd="";
		boolean nameExist=true;
		for(int i=0;i<users.size();i++) {
			if(users.get(i).getUname().equals(name)) {
				nameExist=false;
				break;
			}
		}
		if(nameExist) {
			System.out.println("Enter Unique Mail Id : ");
			mailId=scan.next();
			boolean mailExist=true;
			for(int i=0;i<users.size();i++) {
				if(users.get(i).getMailId().equals(mailId)) {
					mailExist=false;
					break;
				}
			}
			if(mailExist) {
				System.out.println("Enter Strong password : ");
				pwd=scan.next();
				users.add(new User(name,mailId,pwd));
				System.out.println(name +" added as User in ZohoMails.....");
				return;
			}
			else {
				System.out.println("Mail already Exist!!!\nTry another mail...");
				addUser();
			}
		}
		else {
			System.out.println("Name Already Exist!!!\nTry another name...");
			addUser();
		}
	}
	public void CreateGroup() {
		System.out.println("Enter Group name : ");
		String name=scan.next();
		boolean nameExist=true;
		for(int i=0;i<groups.size();i++) {
			if(groups.get(i).name.equals(name)) {
				nameExist=false;
				break;
			}
		}
		if(nameExist) {
			System.out.println("Enter Group MailId : ");
			String mailId=scan.next();
			boolean mailIdExist=true;
			for(int i=0;i<groups.size();i++) {
				if(groups.get(i).mailId.equals(mailId)) {
					mailIdExist=false;
					break;
				}
			}
			if(mailIdExist) {
				System.out.println("Enter Description for Group : ");
				String description=scan.nextLine();
				System.out.println("Enter password : ");
				String pwd=scan.next();
				groups.add(new Group(name,mailId,description,pwd));
				System.out.println("Group created successfully.....");
			}
			else {
				System.out.println("Mail Id Already Exist!!!\nMail Id already Exist");
				CreateGroup();
			}
		}
		else {
			System.out.println("GroupName Already Exist!!!!\nTry Another name...");
			CreateGroup();
		}
	}
	public void addUserToGroup() {

		System.out.println("Enter grp name : ");
		String grp=scan.next();
		boolean grpExist=false;
		int grpIndex=0;
		for(int i=0;i<groups.size();i++) {
			if(groups.get(i).name.equals(grp)) {
				grpExist=true;
				grpIndex=i;
				break;
			}
		}
		if(grpExist) {
			System.out.println("Enter Group password : ");
			String pwd=scan.next();
			if(groups.get(grpIndex).password.equals(pwd)) {
				System.out.println("How many persons you want to add?");
				int size=scan.nextInt();
				for(int i=0;i<size;i++) {
					System.out.println("Enter username to add to the group : ");
					String name=scan.next();
					boolean userExist=false;
					int userIndex=-1;
					for(int j=0;j<users.size();j++) {
						if(users.get(j).getUname().equals(name)) {
							userExist=true;
							userIndex=j;
							break;
						}
					}
					if(userExist) {
						groups.get(grpIndex).users.add(users.get(userIndex));
					}
					else {
						System.out.println("User not Exist!!!!");
						i--;
					}
				}
			}
		}
		else {
			System.out.println("Group not Exist!!!!");
			return;
		}
		System.out.println("Users added to the group "+groups.get(grpIndex).name+" successfully");
	}
	public void mailToGrp(int k) {
		System.out.println("Enter group mailId to Send : ");
		String mail=scan.next();
		boolean mailExist=false;
		int grpIndex=-1;
		for(int i=0;i<groups.size();i++) {
			if(groups.get(i).mailId.equals(mail)) {
				mailExist=true;
				grpIndex=i;
				break;
			}
		}
		if(mailExist) {
			System.out.println("Enter mail Subject : ");
			String subject=scan.nextLine();
			subject=scan.nextLine();
			System.out.println("Enter mail content : ");
			String content=scan.nextLine();
			content=scan.nextLine();
			Msg m=new Msg(users.get(k).getMailId(),"You",content,subject);
			users.get(k).sentMail.add(m);
			groups.get(grpIndex).sentMsg(m);
			System.out.println("Mail sent to everyone");
			return;
		}
		else {
			System.out.println("MailId not Exist");
			mailToGrp(k);
		}
	}
}
