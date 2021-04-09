package project4;

import java.util.ArrayList;
import java.util.List;

public class BookInfo {
	public static List<BookInfo> bookInfoList;
	static {
		bookInfoList = new ArrayList<>();
	}
	private String bookName;
	private String companyName;
	private int price;
	
	public BookInfo(String bookName, String companyName, int price) {
		this.bookName = bookName;
		this.companyName = companyName;
		this.price = price;
	}
	
	public BookInfo get(String bookName) {
		BookInfo result = null;
		for (BookInfo bookInfo : bookInfo.bookInfoList) {
			boolean nameSame = bookInfo.getBookName().equals(bookName);
			
			if (nameSame) {
				return bookInfo;
			} else {
				return null;
			}
		}
		return result;
	}
	
	public static boolean delete(String bookName) {
		boolean result = false;
		
		for (BookInfo bookInfo : bookInfo.bookInfoList) {
			boolean nameSame = bookInfo.getBookName().equals(bookName);
			
			if (nameSame) {
				BookInfo.bookInfoList.remove(index);
			}
			index++;
		}
		return resuit;
	}
	
	public static add(BookInfo bookInfo) {
		boolean same = false;
		// ������ ������ ����
		for (BookInfo bookInfo : BookInfo.bookInfoList) {
			boolean nameSame = bookInfo.getBookName().equals(bookName);
			boolean companySame = bookInfo.getCompanyName().equals(companyName);
			boolean priceSame = bookInfo.getPrice() == price;
			
			// n���� ������ ������ ���� �߰��Ϸ��� ������ ������ ������ üũ
			// ���ٸ� true, �ٸ��ٸ� false
			same = nameSame && companySame && priceSame;
			if (same) {
				break;
			}
			
			if (!same) {
				System.out.println();
			}
		}
		BookInfo.bookInfoList.add(this);
		
		// true -> ������ ���������� ����
		// false -> ������ ���������� �������� ����
		return true;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "bookName" + bookName + "companyName" + companyName + "price" + price;
		
	}

}
