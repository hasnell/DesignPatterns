package csce247.assignments.strategy;
//noah snell csce 247

//abstract class character
public abstract class Character {
	protected String name;
	WeaponBehavior weaponbehavior;
	
	//constructor for character
	public Character(String name) {
		this.name = name;
	}

	//displays character
	public abstract void display();
	
	//character attacks
	public void attack() {
		weaponbehavior.attack();
	}
	
	//sets character's weapon
	public void setWeaponBehavior(WeaponBehavior wb) {
		this.weaponbehavior=wb;
	}
	
}
