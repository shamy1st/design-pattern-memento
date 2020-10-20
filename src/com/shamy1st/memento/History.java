package com.shamy1st.memento;

import java.util.Stack;

public class History {

	private Stack<EditorState> states = new Stack<>();
	
	public void push(EditorState state) {
		this.states.push(state);
	}
	
	public EditorState pop() {
		if(this.states.isEmpty())
			return null;
		return states.pop();
	}
}
