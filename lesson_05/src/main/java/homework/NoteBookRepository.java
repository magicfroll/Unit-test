package homework;

import java.util.ArrayList;
import java.util.List;

public class NoteBookRepository {
    private final List<String> notes = new ArrayList<>();

    public String addNote(String note){
        String noteWithNum = "Заметка №" + (notes.size() + 1) + ". " + note ;
        this.notes.add(noteWithNum);
        return this.notes.get(notes.size() - 1);
    }

    public String getNoteByNum(int num) {
        if (num <= notes.size()) {
            return this.notes.get(num - 1);
        }
        return "Записи с тамим порядковым номером нет!";
    }

    public String editNoteByNum(int num, String note) {
        if (num <= notes.size()) {
            String noteWithNum = "Заметка №" + num + ". " + note ;
            this.notes.set((num - 1), noteWithNum);
            return this.notes.get(num - 1);
        }
        return "Записи с тамим порядковым номером нет!";
    }

    public String deleteNoteByNum(int num) {
        if (num <= notes.size()) {
            this.notes.remove((num - 1));
            return "Заметка №" + num + "удалена";
        }
        return "Записи с тамим порядковым номером нет!";
    }

    public List<String> getAllNotes() {
        return this.notes;
    }
}
