package presenter;

import model.Model;
import view.View;

public class Presenter {
    private Model model;

    public Presenter() {
        this.model = new Model();
    }

    public Model getModel() {
        return this.model;
    }
}