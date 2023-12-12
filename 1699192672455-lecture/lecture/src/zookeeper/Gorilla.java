package zookeeper;

public class Gorilla extends Mammal {
	
	public Gorilla() {
		super();
	}
	
	 public void throwSomething() {		 
	
		 super.energyLevel-= 5;
		 System.out.println("the gorilla has thrown something and its energy is " +  super. displayEnergy());
		 }
	 
	 public void eatBananas() {
		 super.energyLevel+=10;
		 System.out.println("the gorilla has eaten banana its energy is " +  super. displayEnergy());

	 }
	 public void climb() {
		 super.energyLevel-=10;
		 System.out.println("the gorilla has climbed a tree its energy is " +  super. displayEnergy());

	 }


}