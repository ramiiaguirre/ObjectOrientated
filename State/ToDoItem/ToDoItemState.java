package ej8;

public abstract class ToDoItemState {

	public abstract void start(ToDoItem item);

    public abstract void togglePause(ToDoItem item);

    public abstract void finish(ToDoItem item);
}
