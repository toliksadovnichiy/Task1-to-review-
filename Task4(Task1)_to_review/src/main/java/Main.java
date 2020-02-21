import controller.Controller;
import model.Model;
import view.View;

/**
 * @author Anatoliy Sadovnichiy
 * @version 1.0
 * @since 20.02.2020
 */
public class Main {
    public static void main(String [] args){
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        controller.runProcess();
    }
}
