package csce247.assignments.strategy;
//noah snell csce 247

//creates queen character
public class Queen extends Character {
	public Queen(String name) {
		super(name);
		//sets weapon to knife
		weaponbehavior = new WeaponKnife();
	}
	//displays queen info
	public void display() {
		System.out.println(name + " is a beautiful queen");
}
}