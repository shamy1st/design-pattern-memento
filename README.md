# Java Implementation of Memento Design Pattern

**Memento** design pattern provides the ability to restore an object to its previous state (undo). ([wiki](https://en.wikipedia.org/wiki/Memento_pattern))
![](https://github.com/shamy1st/design-pattern-memento-java/blob/main/memento-uml.png)
### Problem: 
You have an **Editor** class and you want to implement "**undo mechanism**".

    public class Editor {
        private String content;

        public String getContent() {
            return this.content;
        }

        public void setContent(String content) {
            this.content = content;
        }
    }

    public class Main {
        public static void main(String[] args) {
            Editor editor = new Editor();
            editor.setContent("line1");
            editor.setContent("line2");
            editor.undo(); // need to implement this feature
        }
    }
### Solution:
![](https://github.com/shamy1st/design-pattern-memento-java/blob/main/memento-solution-uml.png)
