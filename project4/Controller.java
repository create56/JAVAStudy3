package project4;

import java.util.Scanner;

public class Controller {
	
	public static void main(String[] args) {
		while (true) {
			System.out.println("===== [���� ���� ���� ���α׷�] =====");
			System.out.println("1. �߰�");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.println("4. ���");
			System.out.println("5. ����");
			
			Scanner scanf = new Scanner(System.in);
			int menu_i =scanf.nextInt();
			scanf.nextLine();
			
			Menu menus[] = Menu.values();
			Menu menu = menus[menu_i];
			System.out.println(menu);
//			Menu menu = Menu.values()[menu_i]; 
			
		switch (menu) {
			case insert: System.out.println("�߰� ��� ����"); 
				System.out.println("���� ���� �߰� ����� �����մϴ�");
				System.out.println("������ :");
				bookName = scanf.nextLine();
				System.out.println("ȸ��� :");
				String companyName =  scanf.nextLine();
				System.out.println("���� :");
				int pirce = scanf.nextInt();
				BookInfo  bookeInfo = new BookInfo(bookName, companyName, price);
				if (bookInfo.add()) {
					System.out.println("������ ������ �߰��߽��ϴ�!");
				} else {
					System.out.println("������ ������ �ߺ��Ǿ� �߰����� ���߽��ϴ�");
				}
				
				break;
				
			case update: System.out.println("���� ��� ����"); break;
			case delete: System.out.println("���� ��� ����"); break;
				System.out.println("���� ���� ���� ����� �����մϴ�!");
				
				System.out.println("������ ������ :");
				String bookName = scanf.nextLine();
				
				BookInfo deleteTarget = BookInfo.get(bookName);
				if (deleteTarget == null) {
					System.out.println("������ ������ �����ϴ�");
				} else {
					if (BookInfo.delete(bookName)) {
						System.out.println("���� ���� ����");
					}else {
						System.out.println("������ �߻��Ͽ� ������ ������ ������ ���߽��ϴ�!");
					}
					 System.out.println("����");
				}
			case list: System.out.println("��� ��� ����"); break;
				System.out.println("����� ������ ����� ����մϴ�");
				
				for (BookInfo bookInfo1 : BookInfo.bookInfoList) {
					System.out.println(bookInfo1);
				}
			case exit: System.out.println("���� ��� ����"); break;		
			}		
		}	

	}

}
