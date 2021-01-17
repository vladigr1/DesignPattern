package Memento.ex2;
//originator
public class TextWindow {

    private StringBuilder currentText;

    public TextWindow() {
        this.currentText = new StringBuilder();
    }

    public void addText(String text) {
        currentText.append(text);
    }
    public TextWindowState save() {
     return new TextWindowState(currentText);
    }
    public void restore(TextWindowState save) {
        currentText = save.getCurrentText();
    }

    @Override
    public String toString(){
        return currentText.toString();
    }
    public void insertText(String str) {
        currentText.append(str);

    }
 
    public void setCurrentText(StringBuilder currentText){
        this.currentText=currentText;
    }
}
