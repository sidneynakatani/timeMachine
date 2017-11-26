package br.com.sidney.timeMachine;

public class MementoDemo {
	
	public static void main(String[] args){
		
		TextEditor textEditor = new TextEditor();
		
		textEditor.writeText("First state \n");
		textEditor.writeText("Second state \n");
		textEditor.writeText("Third state \n");
		textEditor.showText();
		
		textEditor.undoText();
		textEditor.showText();
		
		textEditor.undoText();
		textEditor.showText();
		
		textEditor.undoText();
		textEditor.showText();
		
		
	}

}
