package project2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ThiryOne {
	public static void main(String[] args) {
		// 사용자와 컴퓨터가 서로 숫자를 부른다.
		// 숫자는 한번에 최소 1개부터 최대 3개까지 부를 수 있다.
		// 숫자는 1~31까지 증가하면서 불러야한다.
		// 마지막 31을 부른 사람이 게임에서 진다.
		// 입력예시) 숫자 : 1 2 3
		Scanner scanf = new Scanner(System.in);
		boolean turn = false;
		while (true) {
			// 1. 사용자가 먼저 할 지 컴퓨터가 먼저 할 지결정
			System.out.println("누가 먼저 할까요?");
			System.out.println("1.사용자");
			System.out.println("2.컴퓨터");

			int select = scanf.nextInt();
			if (select == 1) {
				System.out.println("사용자가 먼저 시작합니다!");
				turn = true;
				break;
			} else if (select == 2) {
				System.out.println("컴퓨터가 먼저 시작합니다");
				turn = false;
				break;
			} else {
				System.out.println("선택지는 두가지뿐입니다");
			}
		}
		System.out.println("Game Start!");

		scanf.nextLine();

		int lastNumber = 0;

		while (true) {
			if (turn) {
				// 사용자 차례
				// 2.먼저 시작하는 쪽이 숫자를 부른다.
				// 3. 숫자는 한번에 입력해야한다
				while(true) {
					System.out.println("사용자의 차례입니다");
					System.out.println("최대 3개의 숫자를 입력해주세요");

					String user = scanf.nextLine();
					String[] users = user.split(" ");

					System.out.println("user = " + Arrays.toString(users));
					if (users.length == 0 || users.length > 3) {
						System.out.println("숫자는 최대 3개까지만 입력할 수있다");
					} else {
						lastNumber = Integer.parseInt(users[users.length - 1]);

						break;
					}
				}
			} else {
				System.out.println("컴퓨터의 차례입니다");
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
					System.out.println("사용자가 졌습니다");
				} else {
					System.out.println("사용자가 이겼습니다");
				}
				
				break;
			}

			turn = !turn;
		}
	}
}
