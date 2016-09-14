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


@WebServlet("/AddChore")
public class AddChore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public AddChore() {
        super();

    }

	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		List<Chore>chores = (List<Chore>)getServletContext().getAttribute("chores");
		String newItem = request.getParameter("newChore");
		if(newItem.isEmpty() || newItem == null){
			response.sendRedirect("ToDoList");
			return;
		}
		//chores.add(new Chore(newItem));
		chores.add(0, new Chore(newItem,new SimpleDateFormat("MM/dd/yyyy").format(new Date())));
		
		response.sendRedirect("ToDoList");
	}

}
