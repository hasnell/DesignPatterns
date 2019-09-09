package csce247.assignments.strategy;
//noah snell csce 247

//creates knight character
public class Knight extends Character {
	public Knight(String name) {
		super(name);
		//sets weapon to bow
		weaponbehavior = new WeaponBow();
	}
	//displays knight information
	public void display() {
		System.out.println(name + " is a valiant knight");
}
}