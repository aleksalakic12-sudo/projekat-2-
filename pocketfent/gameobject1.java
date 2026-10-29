package pocketfent;

public class gameobject1 {
	
	

	    private int x;
	    private int y;
	    private int width;
	    private int height;
	    private int hp;

	    public GameObject1(int x, int y, int width, int height, int hp) {
	        this.x = x;
	        this.y = y;
	        this.width = width;
	        this.height = height;
	        this.hp = hp;
	    
	


}

		private gameobject1(int x, int y, int width, int height, int hp) {
			super();
			this.x = x;
			this.y = y;
			this.width = width;
			this.height = height;
			this.hp = hp;
		}

		private int getX() {
			return x;
		}

		private void setX(int x) {
			this.x = x;
		}

		private int getY() {
			return y;
		}

		private void setY(int y) {
			this.y = y;
		}

		private int getWidth() {
			return width;
		}

		private void setWidth(int width) {
			this.width = width;
		}

		private int getHeight() {
			return height;
		}

		private void setHeight(int height) {
			this.height = height;
		}

		private int getHp() {
			return hp;
		}

		private void setHp(int hp) {
			this.hp = hp;
		}
}
