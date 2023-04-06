package org.example.memento;

public class Save {
    private Program program;
    public Save(Program program) {
        this.program = program;
    }

    public void save(Program program) {
        this.program = program;
    }

    public Program load() {
        return program;
    }
}
