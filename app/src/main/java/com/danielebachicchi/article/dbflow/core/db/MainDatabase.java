package com.danielebachicchi.article.dbflow.core.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by Daniele Bachicchi on 01/03/17.
 */

@Database(name = MainDatabase.DATABASE_NAME, version = MainDatabase.VERSION)
public class MainDatabase {

    public static final String DATABASE_NAME = "db_app";
    public static final int VERSION = 1;


    public static class General{
        public static final String COLUMN_NAME_ROW_ID = "rowID";
    }

    public static class Game{
        public static final String TABLE_NAME = "player";
        public static final String COLUMN_NAME_NAME = "name";
        public static final String COLUMN_NAME_RELEASE_DATE = "release_date";

    }
}
