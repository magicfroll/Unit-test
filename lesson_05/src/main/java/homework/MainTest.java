package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {

    private NoteBookRepository noteBookRepository;
    private NoteBookService noteBookService;

    @BeforeEach
    void setup() {
        noteBookRepository = new NoteBookRepository();
        noteBookService = new NoteBookService(noteBookRepository);
    }

    // Юнит-тестирование метода NoteBookRepository - добавления новой заметки.
    // Проверяет добавлена ли новая запись в репозиторий
    @Test
    void addNoteToRepositoryTest() {
//        NoteBookRepository noteBookRepository = new NoteBookRepository();
        noteBookRepository.addNote("Test");
        assertEquals(1, noteBookRepository.getAllNotes().size());
    }

    // Юнит-тестирование метода NoteBookRepository - получение заметки по номеру.
    // Проверяет получение заметки из репозитория по номеру
    @Test
    void getNoteByNumTest() {
//        NoteBookRepository noteBookRepository = new NoteBookRepository();
        noteBookRepository.addNote("Test");
        assertEquals("Заметка №1. Test", noteBookRepository.getNoteByNum(1));
    }

    // Юнит-тестирование метода NoteBookRepository - редактирование заметки по номеру.
    // Проверяет слхранились ли изменения в отредатированной заметке
    @Test
    void editNoteByNumTest() {
//        NoteBookRepository noteBookRepository = new NoteBookRepository();
        noteBookRepository.addNote("Test");
        noteBookRepository.editNoteByNum(1, "New note");
        assertEquals("Заметка №1. New note", noteBookRepository.getNoteByNum(1));
    }

    // Юнит-тестирование метода NoteBookRepository - удаление заметки по номеру.
    // Проверяет удалена ли запись из  репозитория
    @Test
    void deleteNoteByNumTest() {
//        NoteBookRepository noteBookRepository = new NoteBookRepository();
        noteBookRepository.addNote("Test");
        noteBookRepository.deleteNoteByNum(1);
        assertEquals(0, noteBookRepository.getAllNotes().size());
    }

    // Интеграционное-тестирование метода NoteBookService - добавления новой заметки.
    // Проверяет добавлена ли новая запись в репозиторий
    @Test
    void addNoteToRepositoryIntegrationTest() {
        noteBookService.addNote("Test");
        assertEquals(1, noteBookService.getNotes().size());
    }

    // Интеграционное-тестирование метода NoteBookService - получение заметки по номеру.
    // Проверяет получение заметки из репозитория по номеру
    @Test
    void getNoteByNumIntegrationTest() {
        noteBookService.addNote("Test");
        assertEquals("Заметка №1. Test", noteBookService.getNote(1));
    }

    // Интеграционное-тестирование метода NoteBookService - редактирование заметки по номеру.
    // Проверяет сохранились ли изменения в отредатированной заметке
    @Test
    void editNoteByNumIntegrationTest() {
        noteBookService.addNote("Test");
        noteBookService.editNote(1, "New note");
        assertEquals("Заметка №1. New note", noteBookService.getNote(1));
    }

    // Интеграционное-тестирование метода NoteBookService - удаление заметки по номеру.
    // Проверяет удалена ли запись из  репозитория
    @Test
    void deleteNoteByNumIntegrationTest() {
        noteBookService.addNote("Test");
        noteBookService.deleteNote(1);
        assertEquals(0, noteBookService.getNotes().size());
    }

}
