package ej8;

public class PausedState extends ToDoItemState {

	@Override
	public void start(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem ya comenzó. Se encuentra en estado paused.");	
	}

	@Override
	public void togglePause(ToDoItem item) {
		item.setState(new InProgressState());		
	}

	@Override
	public void finish(ToDoItem item) {
		item.setState(new FinishedState());	
	}

}
