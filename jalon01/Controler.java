
import java.util.Scanner;


public class Controler {
	String userinput;
	User user;

	Controler(User user){
		this.user = user;
	}
	String description(){
		return user.getName();
	}

	void runUser(){
		while(true){
		Scanner sc = new Scanner(System.in);
		System.out.print("["+this.description()+"] ");
		this.userinput = sc.nextLine();
		if (userinput.isEmpty()) {
		}
		else if (userinput.substring(0,1).equals("@")){
			Bot bot = new Bot(userinput.substring(1),this.user.getName());
			bot.launchBot();
		}
		else if (userinput.substring(0,2).equals("++")){
			break;
		}
	}
}
}
