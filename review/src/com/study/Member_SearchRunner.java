package com.study;

import java.util.Scanner;

public class Member_SearchRunner {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Member_Search mr = new Member_Search();
		do {
			System.out.print("이름 입력 해줘잉 ~!  ");
			String name = sc.next();
			boolean searchResult = mr.searchMember(name); // 찾았으면 true, 못 찾았으면 false
			if (searchResult)
				break; // false면 지나가고 print 출력 후 반복
			System.out.println("검색하신 이름이 없습니다잉");
		} while (true);
	}

}
