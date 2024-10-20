package com.shivprakash.to_dolist;
import android.provider.BaseColumns;

public class TaskContract {

    private TaskContract() {
    }

    public static final class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "tasks";
        public static final String COLUMN_TASK = "task";
        public static final String COLUMN_CATEGORY = "category";
        public static final String COLUMN_PRIORITY = "priority";
        public static final String COLUMN_NOTES = "notes";
        public static final String COLUMN_DUE_DATE = "due_date";
        public static final String COLUMN_DUE_TIME = "due_time";
        public static final String COLUMN_IMAGE_URI = "image_uri";
        public static final String COLUMN_COMPLETED = "completed";
        public static final String COLUMN_LATITUDE = "latitude";
        public static final String COLUMN_LONGITUDE = "longitude";

    }
}



