package csce247.assignments.strategy;
//noah snell csce 247

//Creates king character
public class King extends Character {
	public King(String name) {
		super(name);
		//sets weapon to sword
		weaponbehavior = new WeaponSword();
	}
	//displays king info
	public void display() {
		System.out.println(name + " is a noble king");
}
}