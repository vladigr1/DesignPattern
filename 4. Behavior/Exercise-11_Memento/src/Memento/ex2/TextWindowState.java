package Memento.ex2;
// momento
public class TextWindowState {
    private StringBuilder currentText;

    public TextWindowState(StringBuilder currentText) {
        //must add because you save it by refrence - in case you dont do it you will save same entity
        this.currentText= new StringBuilder();
        this.currentText.append(currentText);
    }

    public StringBuilder getCurrentText() {
        return currentText;
    }

    public void setCurrentText(StringBuilder currentText) {
        this.currentText = currentText;
    }

   

    

}
