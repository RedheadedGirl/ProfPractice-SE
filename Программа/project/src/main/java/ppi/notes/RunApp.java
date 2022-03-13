package ppi.notes;

public class RunApp {
    public static void run(){
        System.out.println("running");
        String page = Note.getPage("name of note", "body", 1);
        System.out.println(page);
    }
}
