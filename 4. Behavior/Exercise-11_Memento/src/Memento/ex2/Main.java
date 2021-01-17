package Memento.ex2;

public class Main {
    public static void main(String[] args) {
        TextWindow originator = new TextWindow();
        TextEditor text = new TextEditor();
        originator.addText("hello");
        text.hitSave(originator.save()); // save: hello
        System.out.println(originator);
        originator.addText(" to");
        originator.addText(" you");
        System.out.println(originator);
        text.hitSave(originator.save()); // save: hello to you 
        System.out.println(originator);
        text.hitUndo(originator);       // return to hello to you
        System.out.println(originator);
        text.hitUndo(originator);       // return to hello
        System.out.println(originator);
        text.hitUndo(originator);       //do nothing
        System.out.println(originator);
    }
}
