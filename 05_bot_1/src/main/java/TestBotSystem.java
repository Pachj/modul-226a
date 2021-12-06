
public class TestBotSystem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// create a new support system
		BotSystem botSystem = new BotSystem();
		// start the system
		//botSystem.start();

		RandomTester randomTester = new RandomTester();
		System.out.println(randomTester.getResponse());
	}

}
