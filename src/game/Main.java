package game;

public class Main {
	public static void main(String[] args) {
		Game g = new Game();
		// Initialize game objects
		Pipes p = new Pipes();
		Bird b = new Bird(p);
		TitleScreen t = new TitleScreen();

		// Add updatables and renderables
		g.addRenderable(p);
		g.addUpdatable(p);
		
		g.addRenderable(b);
		g.addUpdatable(b);
		
		// Start!
		g.start();
		
	}
}
