package com.yoonji.book.chap03;

public class MemberMain {

	public static void main(String[] args) {
		MemberDao memberDao = new MemberDao();
		MemberRegisterService regService = new MemberRegisterService();
		regService.setMemberDao(memberDao);

		// registerRequest 초기화
		RegisterRequest req = new RegisterRequest();
		req.setEmail("tlsdbswl0615@naver.com");
		req.setPassword("0615");
		req.setName("Yoonji");

		// 회원 등록
		regService.regist(req);
	}
}