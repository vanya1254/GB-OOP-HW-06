package view;

import presenter.Presenter;

import java.util.ArrayList;
import java.util.Scanner;

public class View implements Menu {
    private Presenter presenter;
    private Scanner sc;

    public void start() {
        sc = new Scanner(System.in);
        this.presenter = new Presenter();
        menu();
    }

    public String showMenu() {
        System.out.println("\nВыберете пункт:");
        System.out.println("\t1 - добавить заметку,\n\t2 - показать заметку,\n\t3 - показать все заметки,\n\t4 - удалить заметку,\n\t5 - закрыть программу.\n");
        String point = sc.nextLine();
        return point;
    }

    public String scanPoint() {
        System.out.println("\nВведите заметку:");
        String note = sc.nextLine();
        return note;
    }

    public String scanSubPoint() {
        System.out.println("\nВыберете пункт:");
        System.out.println("\t1 - выбрать заметку по индексу,\n\t2 - выбрать заметку по совпадению строки.\n");
        String point = sc.nextLine();

        return point;
    }

    public int scan1SubPoint() {
        System.out.println("\nВведите индекс:");
        int index = Integer.parseInt(sc.nextLine());
        return index;
    }

    public String scan2SubPoint() {
        System.out.println("\nВведите строку:");
        String str = sc.nextLine();
        return str;
    }

    public void show(String note) {
        System.out.println(note);
    }

    public void show(ArrayList<String> notes) {
        System.out.println(notes);
    }

    public void showBye() {
        System.out.println("\nПока!\n");
        System.out.println("p.s. программа закрыта");
        sc.close();
    }

    @Override
    public void menu() {
        boolean condition = true;
        while (condition) {
            switch (showMenu()) {
                case ("1"):
                    this.presenter.getModel().setNote(scanPoint());
                    break;
                case ("2"):
                    if (scanSubPoint().equals("1"))
                        show(this.presenter.getModel().getNote(scan1SubPoint()));
                    else show(this.presenter.getModel().getNote(scan2SubPoint()));
                    break;
                case ("3"):
                    show(this.presenter.getModel().getNotes());
                    break;
                case ("4"):
                    if (scanSubPoint().equals("1"))
                        this.presenter.getModel().removeNoteAt(scan1SubPoint());
                    else this.presenter.getModel().removeNote(scan2SubPoint());
                    break;
                case ("5"):
                    showBye();
                    condition = false;
                    break;
            }
        }
    }
}