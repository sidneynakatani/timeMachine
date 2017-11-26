package br.com.sidney.timeMachine;

import java.util.LinkedList;

public class TextCaretaker {
	
    protected LinkedList<Text> states;
 
    public TextCaretaker() {
    	states = new LinkedList<Text>();
    }
 
    public void addText(Text text) {
        states.add(text);
    }
 
    public Text getLastState() {
    	
        if (states.isEmpty()) {
            return new Text("");
        }
        
        Text text = states.getLast();
        states.remove(states.getLast());
        return text;
    }
}
