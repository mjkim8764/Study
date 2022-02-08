package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.dto.Member;

@WebServlet("/success")
public class SuccessView extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("SuccessView doGet()");
		process(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		//System.out.println("SuccessView doPost()");
		process(request, response);
	}

	protected void process(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		ArrayList<Member> members = new ArrayList<Member>();
		members.add(new Member("minjun Kim", "40", "M", "Climbing"));
		members.add(new Member("junseok Lee", "35", "M", "Running"));
		members.add(new Member("sohee Yoon", "30", "F", "Reading"));
		
		String name = request.getParameter("id");
		
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		for(Member member : members) {
			if(member.getName().equals(name))
				out.println(member.toString());
		}
	}

}
