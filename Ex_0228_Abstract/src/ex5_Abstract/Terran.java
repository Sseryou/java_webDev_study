package ex5_Abstract;

public class Terran extends Unit{
	
	//공중 true, 지상 false
	boolean fly;
	
	public Terran(String name, int energy, boolean fly) {
		super.name = name;
		super.energy = energy;
		this.fly = fly;
	}
	
	@Override
	public void decEnergy() {
		energy -= 3;
		
	}
	
	
}
