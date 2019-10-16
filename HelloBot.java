import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class HelloBot extends Bot{
		Date date;
		DateFormat day_name = new SimpleDateFormat("EEEE");
		DateFormat month = new SimpleDateFormat("MMMM");
		DateFormat day = new SimpleDateFormat("dd");
		DateFormat hours = new SimpleDateFormat("HH");
		DateFormat minutes = new SimpleDateFormat("m");


		HelloBot(String name) {
			super(name);
			this.date = new Date();
			this.day_name = new SimpleDateFormat("EEEE");
			this.month = new SimpleDateFormat("MMMM");
			this.day = new SimpleDateFormat("dd");
			this.hours = new SimpleDateFormat("HH");
			this.minutes = new SimpleDateFormat("m");
		}
		void launchHello() {
			System.out.println(this.description());
		}
    String description() {
			return "[ "+super.name+" ] "+" Salut "+super.super.description()+" ! Nous sommes "+this.day_name.format(this.date)+" "+this.day.format(this.date)+" "+this.month.format(this.date)+" et il est "+this.hours.format(this.date)+"h"+this.minutes.format(this.date);
		}
	}
