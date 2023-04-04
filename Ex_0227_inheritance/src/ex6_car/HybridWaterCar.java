package ex6_car;

public class HybridWaterCar extends HybridCar{
	int waterGauge;
	
	
	public HybridWaterCar(int gasGauge, int eletricGauge , int waterGauge) {
		super(gasGauge, eletricGauge);
		this.waterGauge = waterGauge;
	}
	
	
	
	@Override
	public void showCurrentGauge() {
		super.showCurrentGauge();
		System.out.println("ÀÜ¿© ¹°ÀÇ¾ç : " + waterGauge);
	}

}

