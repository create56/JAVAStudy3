package project1;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class UpandDown {
	// ����ڴ� ��ǻ�Ͱ� ������ ���� ������Ѵ�
	public static void main(String[] args) {
		// ��ȸ�� 5��
		
		// ����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ ������ ũ�ٸ�
		// ��ǻ�ʹ� "���� ���ڸ� �Է����ּ���!" ��� ����ϰ�
		
		// ����� �Է��� ���� ��ǻ�Ͱ� ������ ������ �۴ٸ�
		// ��ǻ�� "ū ���ڸ� �Է����ּ���!" ��� ����ϼ���
		
		//����ڰ� �Է��� ���� ��ǻ�Ͱ� ������ �����
		// ��ǻ�ʹ� "�����Դϴ�!" ��� ����ϼ���.
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ڸ� ���� �ֽ��ϴ�");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("���ڸ� ������");
		System.out.println("���纸����");
		
		boolean corrent = false;
		
		Random random = new Random();
		//��ǻ�Ͱ� 1~100������ �� �� �ϳ��� ���� �����Ѵ�.
		int pick = random.nextInt(100) + 1;
		
		for (int i = 1; i <=5; i++) {
			System.out.println("���� :");
			
			int user = scanner.nextInt();
			int diff = pick - user;
			
			if (1 <= diff && diff <= 5) {
				System.out.println("���� ������ ���ڸ� ����ؿ�");
				System.out.println("ū���ڸ� �Է����ּ���");
			} else if (-5 <= diff && diff <= -1) {
				System.out.println("���� ������ ���ڿ� ����ؿ�");
				System.out.println("ū ���ڸ� �Է��ϼ���");
			} 
			 else if(user > pick) {
				System.out.println("���� ���ڸ� �Է����ּ��� ");
			} else if (user < pick) {
				System.out.println("ū ���ڸ� �Է��ϼ���");
			} else {
				System.out.println("�����Դϴ�!");
				corrent = true;	
			}
		}
		
		if (!corrent) {
			System.out.println("���� ������ ���ڴ� ~~" + pick + "�Դϴ�");
			System.out.println("������ �ٽ� �������ּ���");
					
	
		}

	}

}
