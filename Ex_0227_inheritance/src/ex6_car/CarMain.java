package ex6_car;

public class CarMain {
	public static void main(String[] args) {
		
		//CarŬ������ gasGauge ������ ���� �ְ�
		//�ܿ� �������� ����ϴ� �Լ��� showCurrentGauge()�� ���� �ִ�.
		
		//HybridCarŬ������ electricGauge������ �����ְ�, CarŬ������ ����ϰ�
		//�����ڸ� ������ �� gasGauge,electricGauge�� �Ķ���ͷ� �޴´�.
		//�޼���� �������̵��� �̿��Ͽ� �ܿ� �������� �ܿ� ���ⷮ�� ���
		
		//HybridWaterCarŬ������ waterGauge������ �����ְ�, HybridCar�� ��ӹ޴´�.
		//�����ڸ� ������ �� gasGauge, electricGauge, waterGauge�� �Ķ���ͷ� �޴´�.
		//�޼���� �������̵带 �ؼ� �ܿ� ���� , ����, ���� ���� ���
		
		//main���� HybridWaterCar��ü�� �����Ͽ� ������ ���� ����� ����Ͻÿ�.
		
		//�ܿ������� : 
		//�ܿ����ⷮ :
		//�ܿ����Ǿ� :
		HybridWaterCar hwc = new HybridWaterCar(15,30,25);
		hwc.showCurrentGauge();
		
	}
}
