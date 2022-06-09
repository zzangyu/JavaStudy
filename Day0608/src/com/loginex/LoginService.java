package com.loginex;

import java.util.HashMap;

public class LoginService {

	private HashMap<String, String> loginDatas;
	private HashMap<String, UserVO> userDatas;

	public LoginService() {
		loginDatas = new HashMap<String, String>();
		userDatas = new HashMap<String, UserVO>();

		loginDatas.put("hellohan95", "5252");
		userDatas.put("hellohan95",
				new UserVO("hellohan95", "****", "��⵵ ������ �߿��� �ݱ��� 2500 (�ݱ����̾Ⱦ���Ʈ 105-1502)", 28, "������")); // id�� Ű��

	}

	public UserVO login(String id, String passwd) {
		UserVO user = null;
		if (loginDatas.containsKey(id)) {
			if (loginDatas.get(id).equals(passwd)) {
				user = userDatas.get(id);
			}
		}
		return user;
	}

}
