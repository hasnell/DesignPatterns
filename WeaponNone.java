package csce247.assignments.strategy;
//noah snell csce 247

//attacks with no weapon
public class WeaponNone implements WeaponBehavior {
	public void attack() {
		System.out.println("Oh no! I lost my weapon");
	}
}
