import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Bot{
		String name;
		String userName;

		Bot(String name, String userName) {
			this.name = name;
			this.userName = userName;
		}

	void launchBot(){
		if (this.name.equals("hello")) {
			HelloBot hello = new HelloBot(this.name, this.userName);
			hello.launchHello();
		}
		else if (this.name.equals("time")){
			TimeBot hello = new TimeBot(this.name, this.userName);
			hello.launchTime();
		}
		else{
			System.out.println("[System] Je ne connais pas le chatbot @"+this.name);
		}
	}
}
