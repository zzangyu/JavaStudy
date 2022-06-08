package com.boardex;

public class BoardVO {
	// 속성 정의, 글쓰기/목록 보기/글 삭제(비밀번호 필요)/종료 -> 이메일 내용, 작성자

	private String register;
	private String subject;
	private String email;
	private String content;
	private String pw;

	public BoardVO(String register, String subject, String email, String content, String pw) {
		this.register = register;
		this.subject = subject;
		this.email = email;
		this.content = content;
		this.pw = pw;
	}

	public String getRegister() {
		return register;
	}

	public void setRegister(String register) {
		this.register = register;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public String toString() {

		return "작성자: " + register + ", 이메일: " + email + ", 제목: " + subject + ", 글 내용: " + content;
	}

}