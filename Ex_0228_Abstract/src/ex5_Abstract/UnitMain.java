package ex5_Abstract;

public class UnitMain {
	public static void main(String[] args) {
		Terran t1 = new Terran("해병", 50, false);
		t1.decEnergy(); //재정의한 decEnergy() 호출 ( -=3)
		System.out.println("t1의 에너지 : " + t1.getEnergy());//상속받은 부모클래스의 일반메서드 사용
		
		Protoss p1 = new Protoss("광전사", 150, false);
		p1.decEnergy();
		p1.decEnergy();
		p1.decEnergy();
		System.out.println("p1의 에너지 : " + p1.getEnergy());
		
		Zerg z1 = new Zerg("무리군주", 100, true);
		z1.decEnergy();
		System.out.println("z1의 에너지 : " + z1.getEnergy());
	}
}
