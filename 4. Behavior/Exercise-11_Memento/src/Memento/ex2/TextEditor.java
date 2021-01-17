package Memento.ex2;
import java.util.Stack;
//caretaker
public class TextEditor {

    private Stack<TextWindowState> windowHistory = new Stack<>();
    
    public void hitSave(TextWindowState window) {
        windowHistory.push(window);
    }

    public void hitUndo(TextWindow window) {
        if (windowHistory.empty()) return;
        window.restore(windowHistory.pop());
    }
}
