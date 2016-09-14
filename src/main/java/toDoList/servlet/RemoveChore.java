package toDoList.servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import toDoList.model.Chore;


@WebServlet("/RemoveChore")
public class RemoveChore extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
    public RemoveChore() {
        super();

    }


	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		List<Chore> chores = (List<Chore>)getServletContext().getAttribute("chores");
		int index = Integer.parseInt(request.getParameter("index"));
		chores.get(index).setComplete(true);
		//reorder
		Chore temp = chores.get(index);
		chores.remove(index);
		chores.add(temp);
		getServletContext().setAttribute("dc",new SimpleDateFormat("MM/dd/yyyy").format(new Date()));
		response.sendRedirect("ToDoList");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		doGet(request, response);
	}

}
