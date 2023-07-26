package day12.practice;

import day11.practice.TaskDAO2.DAOException;

public class TaskDAO {
	public static void main(String[] args) {
		TaskDAO taskDAO = new TaskDAO();

		Task task1 = new Task("Attend meeting", 5, 12);
		Task task2 = new Task("Sleeping", 7, 10);
		try {
			taskDAO.createTask(task1);
			taskDAO.createTask(task2);

		} catch (DAOException e) {
			e.printStackTrace();
		}

		try {
			taskDAO.deleteTask(12);
		} catch (DAOException e) {
			e.printStackTrace();
		}

		try {
			task1.setName("Sleeping");
			taskDAO.updateTask(task1);
		} catch (DAOException e) {
			e.printStackTrace();
		}

	}

	private void deleteTask(int i) {
		// TODO Auto-generated method stub
		
	}
}
