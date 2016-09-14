package toDoList.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import toDoList.model.Chore;


@WebServlet(urlPatterns = "/ToDoList", loadOnStartup = 1)
public class ToDoList extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public ToDoList() {
        super();

    }


	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		List<Chore> chores = new ArrayList<Chore>();
		chores.add(new Chore("Take out trash","9/1/2016"));
		chores.add(new Chore("Buy milk","8/22/2016"));
		chores.add(new Chore("Watch \"Suicide Squad \"","9/11/2016"));
			
		getServletContext().setAttribute("chores", chores);
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/ToDoList.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

	}

}
