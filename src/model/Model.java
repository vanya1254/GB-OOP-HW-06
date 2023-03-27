package model;

import presenter.Presenter;

import java.util.ArrayList;

public class Model {
    private ArrayList<String> notes = new ArrayList<>();

    public Model() {
        this.notes = notes;
    }

    public Model(ArrayList<String> notes) {
        this.notes = notes;
    }

    public ArrayList<String> getNotes() {
        return this.notes;
    }

    public String getNote(int index) {
        return this.notes.get(index);
    }

    public String getNote(String str) {
        for (int i = 0; i < this.notes.size(); i++) {
            if (this.notes.get(i).contains(str)) {
                return this.notes.get(i);
            }
        }
        return null;
    }

    public void setNote(String str) {
        this.notes.add(str);
    }

    public void removeNoteAt(int index) {
        this.notes.remove(index);
    }

    public void removeNote(String str) {
        for (int i = 0; i < this.notes.size(); i++) {
            if (this.notes.get(i).equals(str)) {
                this.notes.remove(i);
            }
        }
    }
}
