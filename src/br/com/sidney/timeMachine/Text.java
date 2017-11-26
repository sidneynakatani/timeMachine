package br.com.sidney.timeMachine;

public class Text {
	
    protected String textState;
 
    public Text(String texto) {
    	textState = texto;
    }
 
    public String savedText() {
        return textState;
    }
}
