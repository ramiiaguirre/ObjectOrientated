package ej8;

public class FinishedState extends ToDoItemState {

	@Override
	public void start(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem ya finalizó.");		
	}

	@Override
	public void togglePause(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem no se encuentra en paused o in-progress.");
	}

	@Override
	public void finish(ToDoItem item) {
		throw new RuntimeException("El objeto ToDoItem ya finalizó.");
		
	}

}
