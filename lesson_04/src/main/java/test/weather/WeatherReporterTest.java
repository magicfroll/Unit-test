package test.weather;


import org.junit.jupiter.api.Test;
import weather.WeatherReporter;
import weather.WeatherService;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

class WeatherReporterTest {

    @Test
    void weatherReporterTest() {
        WeatherService weatherService = mock(WeatherService.class);
        when(weatherService.getCurrentTemperature()).thenReturn(22);

        WeatherReporter weatherReporter = new WeatherReporter(weatherService);
        assertThat(weatherReporter.generateReport()).isEqualTo("Текущая температура: 22 градусов.");
        verify(weatherService, times(1)).getCurrentTemperature();

    }

}