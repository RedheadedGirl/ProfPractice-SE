package ppi.notes;


import lombok.Data;

/**
 * Class for managing notes
 * Created by Margo on 13.03.2022.
 */
@Data
public class Note {

    /**
     * name of the note
     */
    private String title;

    /**
     * text of the note
     */
    private String text;

    /**
     * Creating the page
     *
     * @param title       title of the note
     * @param text        text of the note
     * @param number      number of the note
     * @return result of creating a page
     */
    protected static String getPage(String title, String text, int number){
        // TODO creating the page, e.g:
        String result = title + "\n" + text + "\n===================";
        result = result + "\n" + number;
        return result;
    }

}
