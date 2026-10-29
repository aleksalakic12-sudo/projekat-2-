package pocketfent;

public class Enemy1 {
	private string neprijatelj;
	private int damage;
	private int health;
	public Enemy1(int damage,int health,string neprijatelj);
	private Enemy1(string neprijatelj, int damage, int health) {
		super();
		this.neprijatelj = neprijatelj;
		this.damage = damage;
		this.health = health;
	}
	private string getNeprijatelj() {
		return neprijatelj;
	}
	private void setNeprijatelj(string neprijatelj) {
		this.neprijatelj = neprijatelj;
	}
	private int getDamage() {
		return damage;
	}
	private void setDamage(int damage) {
		this.damage = damage;
	}
	private int getHealth() {
		return health;
	}
	private void setHealth(int health) {
		this.health = health;
	}

}
