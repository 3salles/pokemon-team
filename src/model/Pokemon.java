package model;

public class Pokemon {
	
	private int official_id;
	private String name;
	private String primary_type;
	private String second_type;
	private int atk;
	private int def;
	private int hp;
	private int speed;
	
	public Pokemon () {}
	
	public Pokemon (
			int official_id, 
			String name, 
			String primary_type, 
			String second_type, 
			int atk,
			int def,
			int hp,
			int speed
			) {
		this.official_id = official_id;
		this.name = name;
		this.primary_type = primary_type;
		this.second_type = second_type;
		this.atk = atk;
		this.def = def;
		this.hp = hp;
		this.speed = speed;
	}
	

	public int getOfficial_id() {
		return official_id;
	}
	public void setOfficial_id(int official_id) {
		this.official_id = official_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrimary_type() {
		return primary_type;
	}
	public void setPrimary_type(String primary_type) {
		this.primary_type = primary_type;
	}
	public String getSecond_type() {
		return second_type;
	}
	public void setSecond_type(String second_type) {
		this.second_type = second_type;
	}
	public int getAtk() {
		return atk;
	}
	public void setAtk(int atk) {
		this.atk = atk;
	}
	public int getDef() {
		return def;
	}
	public void setDef(int def) {
		this.def = def;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	


}
