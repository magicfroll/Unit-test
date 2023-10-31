package test;

import java.util.Iterator;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class Test {

    /**
     * 4.0. Проверка работы Mockito
     */
    @org.junit.jupiter.api.Test
    public void simpleTest() {
        // Создаем мок
        List<String> mockedList = mock(List.class);

        // Используем мок
        mockedList.add("one");
        mockedList.clear();

        // Проверяем, что методы были вызваны
        verify(mockedList).add("one");
        verify(mockedList).clear();
    }

    /**
     * 4.1. Создать мок-объект Iterator, настроить поведение так,
     * чтобы за два вызова next() Iterator вернул два слова  “Hello World”,
     * и проверить это поведение с помощью утверждений
     */
    @org.junit.jupiter.api.Test
    public void iteratorWillReturnHelloWorld() {
        // Arrange
        Iterator iteratorMock = mock(Iterator.class);
        when(iteratorMock.next()).thenReturn("Hello").thenReturn("World");
        // Act
        String result = iteratorMock.next() + " " + iteratorMock.next();
        assertThat(result).isEqualTo("Hello World");
    }
}
