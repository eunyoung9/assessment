
public class PrimeNum {

	public static void main(String[] args) {
	
//val�� ���� �Ҽ����� �ռ������� �Ǵ��ϴ� ���α׷� �ۼ��ϱ� 
//0~val-2��ŭ ���� ������ 
//���� val�� 2���� �������� �������� 0�̶�� �ռ����̹Ƿ� for�� Ż��
//�������� 0�� �̴϶�� isPrimeNum�� ���� false�� 
//���� div�� ���� true��� �Ҽ�, �ƴ϶�� �ռ��� ����ϱ� 

		int val = 11;
		int div = 2;
		boolean isPrimeNum = true;
		
		for(int i = 0; i < val - 2; i++) {
			if(val % div == 0) {
				isPrimeNum = false;
				break;
			}
			else {
				
			}
			div++;
		}
		if(isPrimeNum == true) {
			System.out.println(val + "��(��) �Ҽ��Դϴ�. ");
		}
		else {
		System.out.println(val + "��(��) �ռ����Դϴ�. ");
		}
	}
}


