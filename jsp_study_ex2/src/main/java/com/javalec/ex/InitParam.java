package com.javalec.ex;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InitParam
 */

@WebServlet(urlPatterns = { "/InitP" }, initParams = { @WebInitParam(name = "id", value = "aaaa"),
		@WebInitParam(name = "pw", value = "9999") })
public class InitParam extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public InitParam() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 특정한 servlet에서 사용할 때!
//		String id = getInitParameter("id"); // 반환값은 스트링!
//		String pw = getInitParameter("pw");
//		System.out.println("id = " + id);
//		System.out.println("pw = " + pw);

		// 여러 servlet에서 사용할 때
		String id = getServletContext().getInitParameter("id");
		String pw = getServletContext().getInitParameter("pw");
		System.out.println("id = " + id);
		System.out.println("pw = " + pw);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
