package javaBASIC.ch01.sec12;

public class Calculator {

	public static void main(String[] args) {
		//5�� �Ƹ�����Ʈ�� �޿� ����ϴ� ���α׷� �ۼ��ϱ�
		// 1���� ��� �޿� ����ϱ�
		//����  ��������  ������; ������ = ��;
		String name;
		name="ȫ�浿"; //�̸�
		
		int basicPay=50000; //�޿�
		String phoneNumber = "010-123-1234";//��ȭ��ȣ
		String accountNumber = "���� 123-12-1234";//���¹�ȣ
		String dept="�˹ٻ�";//����
		boolean sex = true; //���� ����
		double tex = 0.03; //���� ����
		
		//����ϱ�
		System.out.println("1�� �˹� ���� : "+ name + "  " + basicPay + " " + phoneNumber );
		System.out.println(accountNumber + " " + dept + " " + sex + " " + tex);
		
		String name2;
		name2="�̼���"; //�̸�
		
		int basicPay2=20000; //�޿�
		String phoneNumber2 = "010-234-4567";//��ȭ��ȣ
		String accountNumber2 = "�츮 321-32-4321";//���¹�ȣ
		String dept2="������";//����
		boolean sex2 = true; //���� ����
		double tex2 = 0.02; //���� ����
		
		//����ϱ�
		System.out.println("2�� �˹� ���� : "+ name2 + "  " + basicPay2 + " " + phoneNumber2 );
		System.out.println(accountNumber2 + " " + dept2 + " " + sex2 + " " + tex2);
		
		
		String name3;
		name3="�̰��"; //�̸�
		
		int basicPay3=15000; //�޿�
		String phoneNumber3 = "010-987-7456";//��ȭ��ȣ
		String accountNumber3 = "���� 123-555-7878";//���¹�ȣ
		String dept3="����";//����
		boolean sex3 = false; //���� ����
		double tex3 = 0.015; //���� ����
		
		//����ϱ�
		System.out.println("3�� �˹� ���� : "+ name3 + "  " + basicPay3 + " " + phoneNumber3 );
		System.out.println(accountNumber3 + " " + dept3 + " " + sex3 + " " + tex3);
		
		String name4;
		name4="������"; //�̸�
		
		int basicPay4=10000; //�޿�
		String phoneNumber4 = "010-8744-3334";//��ȭ��ȣ
		String accountNumber4 = "���� 555-65-8989";//���¹�ȣ
		String dept4="����";//����
		boolean sex4 = false; //���� ����
		double tex4 = 0.025; //���� ����
		
		//����ϱ�
		System.out.println("4�� �˹� ���� : "+ name4 + "  " + basicPay4 + " " + phoneNumber4 );
		System.out.println(accountNumber4 + " " + dept4 + " " + sex4 + " " + tex4);
		
		
		String name5;
		name5="�ּ���"; //�̸�
		
		int basicPay5=9800 ; //�޿�
		String phoneNumber5 = "010-333-7777";//��ȭ��ȣ
		String accountNumber5 = "īī�� 777-454-1231 ";//���¹�ȣ
		String dept5="��������";//����
		boolean sex5 = false; //���� ����
		double tex5 = 0.005; //���� ����
		
		//����ϱ�
		System.out.println("5�� �˹� ���� : "+ name5 + "  " + basicPay5 + " " + phoneNumber5 );
		System.out.println(accountNumber5 + " " + dept5 + " " + sex5 + " " + tex5);

		// �����޾�
		// 1�� 10�ð� 2�� 15�ð� 3�� 20 4�� 25�ð� 5�� 30�ð�
		//1�� 10�ð� ���ؼ� 10 X 500000 ���� 500000 x 0.03 �Ǽ��ɾ� = 500000 - ����

		//50���� ������ ��´�
		int sum1 = 10 * basicPay;

		// ������ ����Ѵ�.
	   //int texCal = sum1 * tex;; // 500000*0.03
		double texCal = sum1 * tex;
		
		//�Ǽ��ɾ��� ����Ѵ�.
		double salary = sum1 - texCal ;//tlf
		String salary1 =sum1 + "  " + texCal + "  " + salary ;
	
		
		
		
		

         }

	
}
	
	
	