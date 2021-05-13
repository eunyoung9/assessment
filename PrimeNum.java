
public class PrimeNum {

	public static void main(String[] args) {
	
//val의 값이 소수인지 합성수인지 판단하는 프로그램 작성하기 
//0~val-2만큼 루프 돌리기 
//만약 val을 2부터 나눠보고 나머지가 0이라면 합성수이므로 for문 탈출
//나머지가 0이 이니라면 div값을 1씩 더하기
//만약 div의 값이 check와 똑같다면 소수, 다르다면 합성수 출력하기 


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
		 }//for문의 끝
		 check = div;
		 if(check == val) { 
			 //소수
			 System.out.println(num + "은(는) 소수입니다. ");
		 }
		 else {
			 //합성수
			 System.out.println(num + "은(는) 합성수입니다.");
		 }

	}
}


