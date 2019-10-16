
public class HelloBot extends Bot{

		HelloBot(String name,String userName) {
			super(name, userName);
		}
		void launchHello() {
			System.out.println(this.description());
		}
    String description() {
			return "["+super.name+"] Salut "+ super.userName+"!";
		}
	}
