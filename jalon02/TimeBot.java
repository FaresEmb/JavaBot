import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.DateFormat;

public class TimeBot extends Bot{
		Date date;
		DateFormat day_name = new SimpleDateFormat("EEEE");
		DateFormat month = new SimpleDateFormat("MMMM");
		DateFormat day = new SimpleDateFormat("dd");
		DateFormat hours = new SimpleDateFormat("HH");
		DateFormat minutes = new SimpleDateFormat("m");


		TimeBot(String name,String userName) {
			super(name, userName);
			this.date = new Date();
			this.day_name = new SimpleDateFormat("EEEE");
			this.month = new SimpleDateFormat("MMMM");
			this.day = new SimpleDateFormat("dd");
			this.hours = new SimpleDateFormat("HH");
			this.minutes = new SimpleDateFormat("mm");
		}
		void launchTime() {
			System.out.println(this.description());
		}
    String description() {
			return "["+super.name+"] Nous sommes "+this.day_name.format(this.date)+" "+this.day.format(this.date)+" "+this.month.format(this.date)+" et il est "+this.hours.format(this.date)+"h"+this.minutes.format(this.date)+".";
		}
	}
