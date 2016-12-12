import mvc.views.*;
import mvc.models.*;
import mvc.controllers.*;

public class Main {
    public static void main(String[] args) {
        View view=new View("hw20161206");
        view.setVisible(true);
        Model model=new Model();
        Controller controller=new Controller(model, view);
        controller.control();
    }
}