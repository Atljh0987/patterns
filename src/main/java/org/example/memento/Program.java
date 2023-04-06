package org.example.memento;

public class Program {
    private int version;
    private String text;


    public Save save() {
        Program p = new Program();
        p.setVersion(this.getVersion());
        p.setText(this.getText());
        return new Save(p);
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void load(Save save) {
        this.version = save.load().getVersion();
        this.text = save.load().getText();
    }

    public int getVersion() {
        return version;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "Program{" +
                "version=" + version +
                ", text='" + text + '\'' +
                '}';
    }
}
