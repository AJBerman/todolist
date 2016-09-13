package toDoList.model;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Chore {

	private String chore;
	private String date;
	private boolean complete;
	
	
	public Chore(String chore){
		this.chore = chore;
		this.date = new SimpleDateFormat("MM/dd/yyyy").format(new Date());
		complete = false;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public String getChore() {
		return chore;
	}


	public void setChore(String chore) {
		this.chore = chore;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}
	
	
}
