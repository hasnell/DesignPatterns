package csce247.assignments.strategy;
//noah snell csce 247

//creates troll character
public class Troll extends Character {
	public Troll(String name) {
		super(name);
		//sets weapon to axe
		weaponbehavior = new WeaponAxe();
	}
	//displays troll info
	public void display() {
		System.out.println(name + " is a funny troll");
}
}