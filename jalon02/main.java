import java.util.Scanner;
import java.util.Date;

public class main {

	public static void main(String[] args){
		if (args.length==2 && args[0].equals("-p")){
		String userName = args[1];
		User user = new User(userName);
		Controler userinput = new Controler(user);
		userinput.runUser();
	}
	else{
		System.out.println("Not enough argument! Please use: -p <username> as arguments");
	}
	}
}
