package org.example.memento;

public class Client {
    public static void main(String[] args) {
        Program program = new Program();
        Caretaker caretaker = new Caretaker();

        program.setText("Текст первой программы");
        program.setVersion(1);
        caretaker.setSave(program.save());

        System.out.println(program);
        Helper.divider();

        program.setText("Текст второй версии программы");
        program.setVersion(2);

        System.out.println(program);
        Helper.divider();

        program.load(caretaker.getSave());

        System.out.println(program);
    }
}