package com.practice;

public class BoardVO2 {
	private String register;
	private String subject;
	private String email;
	private String content;
	private String pw;

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

	public BoardVO2(String register, String subject, String email, String content, String pw) {
		this.register = register;
		this.subject = subject;
		this.email = email;
		this.content = content;
		this.pw = pw;
	}

	@Override
	public String toString() {
		return "작성자:" + register + "\nemail:" + email + "\n제목:" + subject + "\n글내용:" + content + "\n비밀번호:" + pw;
	}
}
