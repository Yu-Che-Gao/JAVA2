package mvc.models;

public class Model {

    private String expression;

    public Model() {
        this.expression="";
    }

    public void setExpr(String expression) {
        this.expression=expression;
    }

    public String getExpr() {
        return this.expression;
    }
}