package javaBASIC.cho1.sec15;

public class DataTypeEx {
    // TODO Auto-generated method stub
	//�ڷ��� - �⺻��(������-byte int long, �Ǽ��� - float double, ���� -boolean ������- char double ), ������
	//����39��
	//����ó��
	
	public static void main(String[] args) {
		
	    byte b1=10;
		System.out.println(b1);
		
		short s1 =32767; // -32768 ~32767
		long l01 = 900000001;

		byte b2=10;
		byte b3=20;		
		
		int b23 = b2 +b3; // +������ int������ ó���� byte��(1) int��(4) byte��(1) = int����
		
		
		// int resul23 = s2 - s3;  //  -40
		
		byte b4 = 20;
		short s4 = 30;
		
		int sumb4s4 =b4 + s4;
		
		float f1 = 3.14f;
		float f2 = 3.12345678f;
		System.out.println(  f1 +" "+f2);
		
		double d1 = 3.123456789012345; //15�ڸ����� ����ϱ�
		System.out.println( d1 );
		
		//�Ǽ����� float - 4byte �� double�� - 8byte 
		
		float f3=10.23f;
		float f4=2.45f;
		float mulf3f4 = f3 * f4;
		System.out.println( mulf3f4 );
	   
		
	    double mulf3f4d = f3* f4;
	    System.out.println( mulf3f4d );
		
		double d3=3.14;
		double d4=12.65;
		
		double muld3d4 = d3 * d4;
		System.out.println( muld3d4 );
		
		// float muld3d4f = d3 * d4;
		System.out.println( muld3d4 );
		
		//float muld3da4 = d3* d4; �����߻� ��? ����Ÿ������ �־� �ִϱ�
		
		double result3f4 = f3 / f4; // float�ڷ����� double������ ��ȯ�� - ����ȯ cast���� �ڵ�����ȯ
		
		int ii1=10;
	    short ss1=20;
	    
	    float ff1 = ii1; // �Ǽ��� = ������ ����ȯ cast���� �ڵ�����ȯ
	    
	    
	    //실수형--->정수형 30평->8평으로 , 가구를 버려야한다, 데이터 손실
	    //형변환 = 강제형변환 = down cast 연산       큰 타입->작은타입으로 바뀜
        //형식    정수형타입  변수명 = (정수형타입) 실수형변수

	    double d10 = 3.14; 
	    int chang10 =(int) d10;//소숫점     .14를 손실했다.
	    System.out.println(d10 + "  " + chang10);
	    
	    float f10 = 10.25f;
	    byte changef10 = (byte) f10;
	    
	    int i10 =3000;
	    short chi10 = (short) i10;
	    
	    
	    
	    //문제) 정수형으로 국어점수 수학점수 영어점수 변수 담으세요
	     int kor=80;
	     int mat=90;
	     int eng=83;
	     
	     //합계구하기
	     int sum = kor+mat+eng;
	     
	     //평균구하기 실수형
	     double avg = sum / 3.0;  //253  /3을 연산하면 정수 /정수 이므로 정수만 나온다
	     double avg1 = (double)sum / 3;
         	     
	     
	     //수학점수의 거듭제곱 90**2
	     int matDouble = mat*mat;
	     
	     
	     
	     //
	     //출력하기
	     System.out.println("합계는" + sum);
	     System.out.println("평균은" + avg); //84.3이 왜 안나오나요?
	     System.out.println("평균은"+ avg1);
	     System.out.println("수학점수의 거듭제곱" + matDouble);
	     
	     char ch1 = 'a';
         System.out.println((int) ch1);
         
         System.out.println((char)ch1+3);
         System.out.printf("%c",ch1+3); //"%c"는 문자형으로 ch1+3의 100 유니코드숫자를 문자형으로 출력하기
         
         //Korea를 출력하기
         System.out.printf("%c%c%c%c%c", 75,111,114,101,97);
         
         
        
         
         
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	    
		
	}
	
	
	
}
