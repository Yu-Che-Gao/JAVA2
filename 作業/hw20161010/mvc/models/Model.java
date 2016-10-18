package mvc.models;

public class Model {

    private String calculation;

    public Model() {
        this.calculation="";
    }

    public void setCal(String calculation) {
        this.calculation=calculation;
    }

    public String getCal() {
        return this.calculation;
    }
}