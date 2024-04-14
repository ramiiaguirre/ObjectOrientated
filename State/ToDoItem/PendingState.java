package ej8;

public class PendingState extends ToDoItemState{

	@Override
	public void start(ToDoItem item) {
		item.setState(new InProgressState());		
	}

	@Override
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en paused o in-progress.");
	}

	@Override
	public void finish(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en paused o in-progress.");
	}

}
