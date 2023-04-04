package ex6_updown;

import java.util.Random;

public class Start {
	
	Random rnd = new Random();
	int rand = rnd.nextInt(50)+1;
	String str = "";
	int count = 1;
	
	public String check(int number) {
		if(number == rand) {
			str = "Á¤´ä";
		} else if(number > rand) {
			str = "DOWN!!";
		} else {
			str = "UP!!";
		}
		return str;
	}


	
	

}
