package zookeeper;

public class Bat extends Mammal {
	
	 int energyLevel;
	public Bat() {
		this.energyLevel=300;
	}
	public void fly() {
		 this.energyLevel-= 50;
		 System.out.println("the Bat has flown something and its energy is " +  this.displayEnergy());
		 
	}
	public void eatHumans() {
		 this.energyLevel+= 25;
		 System.out.println("the Bat has eaten something and its energy is " +  this.displayEnergy());
		 
	}
	public void attackTown() {
		this.energyLevel-= 100;
		 System.out.println("the Bat has attacked something and its energy is " +  this.displayEnergy());
		 
	}
	
    public int displayEnergy() {
		
		return this.energyLevel;
	}

}
