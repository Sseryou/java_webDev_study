package ex1_enum;

public class Ex2_Enum {
	public static void main(String[] args) {
		Item start = Item.START;
		String str = start.getItemStr();
		String symbol = start.getSymbol();
		System.out.println(str);
		
		//���� for���� �̿��Ͽ� �������� ��ü ���� ����ϱ�
		
		Item[] items = Item.values();
		for(Item item : items) {
			System.out.println(item.getItemStr()+ " , "+ item.getSymbol());
		}
		
	}

}
