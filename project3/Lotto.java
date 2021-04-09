package project3;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Lotto {
	public static void main(String[] args) {
		// �ζ� 1~45���� ���ڰ� �ִ�
		// 6���� ���ڸ� �̴´�
		// ��÷ ��ȣ�� �ߺ��Ǽ� ���� �� ����..
		
		// 1 ~ 45������ 6�� ���ڸ� ������ �ߺ����� �ʰ� �̴´�.
		// List�÷��� �����ӟp�� ����ؼ� �����ϼ���.
		
		List<Integer> lotto = new ArrayList<Integer>();
		
		Random random  = new Random();
		
		for (int i = 0; i<6; i++) {
			// n���� ���ڸ� ����
			lotto.add(random.nextInt(45)+1);
			// 0~ n-1���� ���� ���� ������ ���ڰ� ����ִ��� üũ
			for (int j = 0; j < lotto.size()-1; j++) {
				if ( i == j) 	break;
				
				if(lotto.get(j) == lotto.get(i));
					lotto.remove(i);
					i = i - 1;
					break;
			}
		}
		
//		Set<Integer> lotto = new HashSet<Integer>();
//		Random random = new Random();
//		while (true) {
//			lotto.add(random.nextInt(45)+1);
//			
//			if (lotto.size() == 6) {
//				break;
//		}
//	}
		
		System.out.println("��÷��ȣ�� ~~~");
		System.out.println(lotto);
		
	

	}

}
