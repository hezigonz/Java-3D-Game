package hezigonz.game.graphics;

public class Screen {
	private int width, height;
	public int[] pixels;
	
	public Screen(int width, int height) {
		this.width = width;
		this.height = height;
		pixels = new int[width * height];
	}
	
	int time = 0;
	int counter = 0;
	
	public void clear() {
		for(int i = 0; i < pixels.length; i++) {
			pixels[i] = 0;
		}
	}
	
	public void render() {
		counter++;
		if (counter % 100 == 0) {
			time++;
		}
		
		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				pixels[time + time * width] = 0xff00ff; // Reminder // Hex values start with a 0x //
			}
		}
	}
}
