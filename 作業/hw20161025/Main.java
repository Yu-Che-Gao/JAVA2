import mvc.models.*;
import mvc.views.*;
import mvc.controllers.*;

public class Main {
    public static void main(String[] args) {         
        View view=new View("ID Maker");
        Model model=new Model();
        Controller controller=new Controller(model, view);
        controller.control();
    }
}