package test.message;


import message.MessageService;
import message.NotificationService;
import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class NotificationServiceTest {

    @Test
    void NotificationServiceTest() {
        MessageService messageService = mock(MessageService.class);
        NotificationService notificationService = new NotificationService(messageService);
        notificationService.sendNotification("Привет", "Андрей");
        verify(messageService, times(1)).sendMessage("Привет", "Андрей");
    }

}