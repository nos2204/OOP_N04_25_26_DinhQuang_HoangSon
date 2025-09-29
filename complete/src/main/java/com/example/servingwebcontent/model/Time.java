package com.example.servingwebcontent.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.Duration;

public class Time {
    public static String getCurrentTime() {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        return now.format(formatter);
    }

    public static long calculateDuration(LocalDateTime start, LocalDateTime end) {
        Duration duration = Duration.between(start, end);
        return duration.toSeconds();
    }

    public static LocalDateTime addHours(LocalDateTime time, int hours) {
        return time.plusHours(hours);
    }

    public static LocalDateTime subtractHours(LocalDateTime time, int hours) {
        return time.minusHours(hours);
    }
}
