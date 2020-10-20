package com.shamy1st.memento;

import java.util.Optional;

public class Editor {

    private String content;

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public EditorState createState() {
        return new EditorState(this.content);
    }

    public void restore(EditorState state) {
        if(Optional.ofNullable(state).isPresent())
            this.content = state.getContent();
    }
}
