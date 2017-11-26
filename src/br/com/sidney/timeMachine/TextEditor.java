package br.com.sidney.timeMachine;


public class TextEditor {
    protected String text;
    TextCaretaker caretaker;
 
    public TextEditor() {
        caretaker = new TextCaretaker();
        text = new String();
    }
 
    public void writeText(String newText) {
        caretaker.addText(new Text(this.text));
        text += newText;
    }
 
    public void undoText() {
        text = caretaker.getLastState().savedText();
    }
 
    public void showText() {
        System.out.println(text);
    }
}