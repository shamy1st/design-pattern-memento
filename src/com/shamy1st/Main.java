package com.shamy1st;

import com.shamy1st.memento.Editor;
import com.shamy1st.memento.History;

public class Main {
	public static void main(String[] args) {
		History history = new History();
		Editor editor = new Editor();
		editor.setContent("line1");
		history.push(editor.createState());
		editor.setContent("line2");

		System.out.println("Content: "+editor.getContent());
		editor.restore(history.pop());
		System.out.println("Content: "+editor.getContent());
		editor.restore(history.pop());
		System.out.println("Content: "+editor.getContent());
	}
}
