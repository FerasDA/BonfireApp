package com.bonfireapp.bonfireapp.bonfireapp;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;
import java.util.List;

public class DatabaseHandler extends SQLiteOpenHelper {
    private static final String DB_NAME = "database_bonfire.db";
    private static final int DB_VERSION = 1;

    //table names
    private static final String TABLE_EVENTS = "Events";
//    private static final String TABLE_CATEAGORIES = "Categories";

    //fields from Events table
    public static final String KEY_ROWID_EVENTS = "_id";
    public static final String KEY_EVENT_NAME = "Name";
    public static final String KEY_DESCRIPTION = "Description";
    public static final String KEY_EVENT_START = "Start";
    public static final String KEY_EVENT_END = "End";
    public static final String KEY_ADDRESS = "Address";
    public static final String KEY_CATEGORY = "Category";

    //String whit the SQL instruction Events table
    private static final String CREATE_TABLE_EVENTS = "create table " +
            TABLE_EVENTS + " (" +
            KEY_ROWID_EVENTS + " integer primary key autoincrement, " +
            KEY_EVENT_NAME + " text not null, " +
            KEY_DESCRIPTION + " text not null, " +
            KEY_EVENT_START + " text not null, " +
            KEY_EVENT_END + " text not null," +
            KEY_ADDRESS +" text not null," +
            KEY_CATEGORY + " text not null );";



    private String[] columnsEvents = new String[]{KEY_ROWID_EVENTS, KEY_EVENT_NAME,KEY_DESCRIPTION,
            KEY_EVENT_START, KEY_EVENT_END, KEY_ADDRESS, KEY_CATEGORY};



    public DatabaseHandler(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_EVENTS);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }



}
