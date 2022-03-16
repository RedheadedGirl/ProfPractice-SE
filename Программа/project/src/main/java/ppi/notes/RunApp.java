package ppi.notes;

/**
 * Class for running the app
 * Created by Margo on 13.03.2022.
 */
public class RunApp {
    /**
     * Running the App
     */
    public static void run(){
        System.out.println("running");
        String page = Note.getPage("name of note", "body", 1);
        System.out.println(page);
    }
}
