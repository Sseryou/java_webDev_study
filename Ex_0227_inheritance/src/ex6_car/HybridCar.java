package ex6_car;

public class HybridCar extends Car{
	int eletricGauge;
	
	public HybridCar(int gasGauge, int eletricGauge) {
		super(gasGauge);
		this.eletricGauge = eletricGauge;
	}
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("ÀÜ¿© Àü±â¾ç : " + eletricGauge);
	}

}
