package com.mewebstudio.javaspringbootboilerplate.util;

import java.time.format.DateTimeFormatter;

/**
 * Shared constants that can be reused across modules.
 */
public final class Constants {

    public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    public static final DateTimeFormatter DATE_TIME_FORMAT = DateTimeFormatter.ISO_OFFSET_DATE_TIME;

    private Constants() {
    }
}
