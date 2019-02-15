package com.antonio.formvalidation;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DbHelper extends SQLiteOpenHelper{

    public static final String TBL_USERS = "users",
        TBL_USER_ID = "id",
        TBL_USER_USERNAME = "username",
        TBL_USER_PASSWORD = "password",
        TBL_USER_NAME = "name",
        TBL_USER_GENDER = "gender";


    public DbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, "db_databasing", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sql_create_users_table = String.format("CREATE TABLE %s" +
                "(%s INTEGER PRIMARY KEY AUTOINCREMENT, " +
                " %s TEXT," +
                " %s TEXT ," +
                " %s TEXT, " +
                "%sTEXT)",
                TBL_USERS, TBL_USER_ID,
                TBL_USER_USERNAME,
                TBL_USER_PASSWORD,
                TBL_USER_NAME,
                TBL_USER_GENDER);
    SQLiteDatabase dbReadable = getReadableDatabase();
    SQLiteDatabase dbWritable = getWritableDatabase();

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
