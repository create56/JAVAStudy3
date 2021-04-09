package project1;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class UpandDown {
	// 사용자는 컴퓨터가 선택한 수를 맞춰야한다
	public static void main(String[] args) {
		// 기회는 5번
		
		// 사용자가 입력한 수가 컴퓨터가 선택한 수보다 크다면
		// 컴퓨터는 "작은 숫자를 입력해주세요!" 라고 출력하고
		
		// 사용자 입력한 수가 컴퓨터가 선택한 수보다 작다면
		// 컴퓨터 "큰 숫자를 입력해주세요!" 라고 출력하세요
		
		//사용자가 입력한 수가 컴퓨터가 선택한 수라면
		// 컴퓨터는 "정답입니다!" 라고 출력하세요.
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 고르고 있습니다");
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("숫자를 골랐어요");
		System.out.println("맞춰보세요");
		
		boolean corrent = false;
		
		Random random = new Random();
		//컴퓨터가 1~100사이의 수 중 하나의 수를 선택한다.
		int pick = random.nextInt(100) + 1;
		
		for (int i = 1; i <=5; i++) {
			System.out.println("숫자 :");
			
			int user = scanner.nextInt();
			int diff = pick - user;
			
			if (1 <= diff && diff <= 5) {
				System.out.println("제가 생각한 숫자를 비슷해요");
				System.out.println("큰숫자를 입력해주세요");
			} else if (-5 <= diff && diff <= -1) {
				System.out.println("제가 생각한 숫자와 비슷해요");
				System.out.println("큰 숫자를 입력하세요");
			} 
			 else if(user > pick) {
				System.out.println("작은 숫자를 입력해주세요 ");
			} else if (user < pick) {
				System.out.println("큰 숫자를 입력하세요");
			} else {
				System.out.println("정답입니다!");
				corrent = true;	
			}
		}
		
		if (!corrent) {
			System.out.println("제가 선택한 숫자는 ~~" + pick + "입니다");
			System.out.println("다음에 다시 도전해주세요");
					
	
		}

	}

}
