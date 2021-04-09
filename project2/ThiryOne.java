package project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThiryOne {
	public static void main(String[] args) {
		// ����ڿ� ��ǻ�Ͱ� ���� ���ڸ� �θ���.
		// ���ڴ� �ѹ��� �ּ� 1������ �ִ� 3������ �θ� �� �ִ�.
		// ���ڴ� 1~31���� �����ϸ鼭 �ҷ����Ѵ�.
		// ������ 31�� �θ� ����� ���ӿ��� ����.
		// �Է¿���) ���� : 1 2 3
		Scanner scanf = new Scanner(System.in);
		boolean turn = false;
		while (true) {
			// 1. ����ڰ� ���� �� �� ��ǻ�Ͱ� ���� �� ������
			System.out.println("���� ���� �ұ��?");
			System.out.println("1.�����");
			System.out.println("2.��ǻ��");

			int select = scanf.nextInt();
			if (select == 1) {
				System.out.println("����ڰ� ���� �����մϴ�!");
				turn = true;
				break;
			} else if (select == 2) {
				System.out.println("��ǻ�Ͱ� ���� �����մϴ�");
				turn = false;
				break;
			} else {
				System.out.println("�������� �ΰ������Դϴ�");
			}
		}
		System.out.println("Game Start!");

		scanf.nextLine();

		int lastNumber = 0;

		while (true) {
			if (turn) {
				// ����� ����
				// 2.���� �����ϴ� ���� ���ڸ� �θ���.
				// 3. ���ڴ� �ѹ��� �Է��ؾ��Ѵ�
				while(true) {
					System.out.println("������� �����Դϴ�");
					System.out.println("�ִ� 3���� ���ڸ� �Է����ּ���");

					String user = scanf.nextLine();
					String[] users = user.split(" ");

					System.out.println("user = " + Arrays.toString(users));
					if (users.length == 0 || users.length > 3) {
						System.out.println("���ڴ� �ִ� 3�������� �Է��� ���ִ�");
					} else {
						lastNumber = Integer.parseInt(users[users.length - 1]);

						break;
					}
				}
			} else {
				System.out.println("��ǻ���� �����Դϴ�");
				Random random = new Random();
				int roof = random.nextInt(3) + 1;

				for (int i = 1; i <= roof; i++) {
					lastNumber = lastNumber + 1;
					
					if (lastNumber <=31) {
						System.out.print(lastNumber + "");
						
					}
				}

				System.out.println();
			}

			if (lastNumber >= 31) {
				if (turn) {
					System.out.println("����ڰ� �����ϴ�");
				} else {
					System.out.println("����ڰ� �̰���ϴ�");
				}
				
				break;
			}

			turn = !turn;
		}
	}
}
