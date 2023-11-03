package homework;

import java.util.List;

public class NoteBookService {

    private final NoteBookRepository noteBookRepository;

    public NoteBookService(NoteBookRepository noteBookRepository) {
        this.noteBookRepository = noteBookRepository;
    }

    public String addNote(String note) {
        return noteBookRepository.addNote(note);
    }

    public String getNote(int num) {
        return noteBookRepository.getNoteByNum(num);
    }

    public String editNote(int num, String note) {
        return noteBookRepository.editNoteByNum(num, note);
    }

    public String deleteNote(int num) {
        return noteBookRepository.deleteNoteByNum(num);
    }

    public List<String> getNotes() {return noteBookRepository.getAllNotes();}
}
