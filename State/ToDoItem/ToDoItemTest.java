package oo2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.Rule;
import org.junit.jupiter.api.BeforeEach;
import org.junit.rules.ExpectedException;


import ej8.*;

class ToDoItemTest {
	
	ToDoItem item;
	
	@Rule
    public ExpectedException exceptionRule = ExpectedException.none();

	@BeforeEach
	void setUp() throws Exception {
		item = new ToDoItem("Tarea 1");
	}

	@Test
	void testDuration() {	
		item.start();
		exceptionRule.expect(RuntimeException.class);
		item.workedTime();
		//thrown.expect(RuntimeException.class);
		//thrown.expectMessage("La tarea todavía no finalizó");
		//item.workedTime();
	}

}
