package coupling;

public class MainTest {
	public static void main(String[] args) {
		Sport sprot = new BaseBall();
		Human soo = new Human(sprot);
		
		soo.play();
		soo.stop();
	}
}
