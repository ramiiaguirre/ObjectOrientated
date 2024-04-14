package ej8;

public class InProgressState extends ToDoItemState {

	@Override
	public void start(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem ya comenzó. Se encuentra en estado in progress.");	
	}

	@Override
	public void togglePause(ToDoItem item) {
		item.setState(new PausedState());		
	}

	@Override
	public void finish(ToDoItem item) {
		item.setState(new FinishedState());	
	}

}
