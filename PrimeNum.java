
public class PrimeNum {

	public static void main(String[] args) {
	
//val�� ���� �Ҽ����� �ռ������� �Ǵ��ϴ� ���α׷� �ۼ��ϱ� 
//0~val-2��ŭ ���� ������ 
//���� val�� 2���� �������� �������� 0�̶�� �ռ����̹Ƿ� for�� Ż��
//�������� 0�� �̴϶�� div���� 1�� ���ϱ�
//���� div�� ���� check�� �Ȱ��ٸ� �Ҽ�, �ٸ��ٸ� �ռ��� ����ϱ� 


		 int val = 11;
		 int div = 2;
		 int check;
		 int num = 0;
		 for(int i =0; i<val-2; i++) {
			 num = val;
			 if(0==val%div) {
				 break;
			 }
			 div++;
		 }//for���� ��
		 check = div;
		 if(check == val) { 
			 //�Ҽ�
			 System.out.println(num + "��(��) �Ҽ��Դϴ�. ");
		 }
		 else {
			 //�ռ���
			 System.out.println(num + "��(��) �ռ����Դϴ�.");
		 }

	}
}


