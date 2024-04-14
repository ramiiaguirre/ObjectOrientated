package ej8;

import java.time.Duration;
import java.time.Instant;

public class ToDoItem {
	
	String name;
	ToDoItemState state;
	Duration duracion;
	Instant firstInstant, lastInstant;
	
    public ToDoItemState getState() {
		return state;
	}

	public void setState(ToDoItemState state) {
		this.state = state;
	}

	public ToDoItem(String name) {
		this.name = name;
		this.state = new PendingState();
    }

    public void start() {
    	state.start(this);
    	this.firstInstant = Instant.now();	 
    }

    public void togglePause() {
    	state.togglePause(this);
    }

    public void finish() {
    	state.finish(this);
    	this.lastInstant = Instant.now();
    }

    public Duration workedTime() {
    	if(firstInstant == null) {
    		throw new RuntimeException("La tarea todavía no comenzó");
    	}
    	if(lastInstant == null) {
    		throw new RuntimeException("La tarea todavía no finalizó");
    	}
    	return Duration.between(firstInstant, lastInstant);    		
    }

    public void addComment(String comment) {
    	//if (state.)
    }

	
}
