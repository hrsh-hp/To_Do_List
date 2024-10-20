package com.shivprakash.to_dolist;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class TaskDBHelper extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "tasklist.db";
    private static final int DATABASE_VERSION = 2; // Incremented version

    private static final String SQL_CREATE_TASK_TABLE =
            "CREATE TABLE " + TaskContract.TaskEntry.TABLE_NAME + " ("
                    + TaskContract.TaskEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + TaskContract.TaskEntry.COLUMN_TASK + " TEXT NOT NULL, "
                    + TaskContract.TaskEntry.COLUMN_CATEGORY + " TEXT NOT NULL, "
                    + TaskContract.TaskEntry.COLUMN_PRIORITY + " TEXT NOT NULL, "
                    + TaskContract.TaskEntry.COLUMN_NOTES + " TEXT, "
                    + TaskContract.TaskEntry.COLUMN_DUE_DATE + " TEXT NOT NULL, "
                    + TaskContract.TaskEntry.COLUMN_DUE_TIME + " TEXT NOT NULL, "
                    + TaskContract.TaskEntry.COLUMN_IMAGE_URI + " TEXT,"
                    + TaskContract.TaskEntry.COLUMN_LATITUDE + " REAL NOT NULL,"
                    + TaskContract.TaskEntry.COLUMN_LONGITUDE + " REAL NOT NULL,"
                    + TaskContract.TaskEntry.COLUMN_COMPLETED + " INTEGER NOT NULL DEFAULT 0"
                    + ");";

    public TaskDBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_TASK_TABLE);
    }

    public Cursor getAllTasks() {
        SQLiteDatabase db = this.getReadableDatabase();
        return db.query(
                TaskContract.TaskEntry.TABLE_NAME,
                null,
                null,
                null,
                null,
                null,
                null
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TaskContract.TaskEntry.TABLE_NAME);
        onCreate(db);
    }
}
