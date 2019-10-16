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
	}
}
