package ppi.notes;


import lombok.Data;

/**
 * Класс по управлению заметками
 * Created by Margo on 13.03.2022.
 */
@Data
public class Note {

    /**
     * Название заметки
     */
    private String title;

    /**
     * Содержимое заметки
     */
    private String text;

    /**
     * Создание страницы заметки
     *
     * @param title       название заметки
     * @param text        текст заметки
     * @param number      номер заметки
     * @return результат создания страницы
     */
    protected static String getPage(String title, String text, int number){
        // TODO формируется Страница, например:
        String result = title + "\n" + text + "\n===================";
        result = result + "\n" + number;
        return result;
    }

}
