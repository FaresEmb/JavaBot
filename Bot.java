import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class Bot extends Controler{
		String name;

		Bot(String name) {
			this.name = name;
		}

	void launchBot(){
		if (this.name.equals("hello")) {
			HelloBot hello = new HelloBot(this.name);
			hello.launchHello();
		}
	}
}
