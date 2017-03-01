package com.danielebachicchi.article.dbflow.core.db.dto;

import com.danielebachicchi.article.dbflow.core.db.MainDatabase;
import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;

import java.util.Date;

/**
 * Created by Daniele Bachicchi on 01/03/17.
 */
@Table(database = MainDatabase.class ,name = MainDatabase.Game.TABLE_NAME)
public class Game {

    @Column(name = MainDatabase.General.COLUMN_NAME_ROW_ID)
    @PrimaryKey(autoincrement = true)
    private long _rowID;

    @Column(name = MainDatabase.Game.COLUMN_NAME_NAME)
    private String _name;

    @Column(name = MainDatabase.Game.COLUMN_NAME_RELEASE_DATE)
    private Date _releaseDate;

    public long get_rowID() {
        return _rowID;
    }

    public void set_rowID(long _rowID) {
        this._rowID = _rowID;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public Date get_releaseDate() {
        return _releaseDate;
    }

    public void set_releaseDate(Date _releaseDate) {
        this._releaseDate = _releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Game game = (Game) o;

        if (_rowID != game._rowID) return false;
        if (_name != null ? !_name.equals(game._name) : game._name != null) return false;
        return _releaseDate != null ? _releaseDate.equals(game._releaseDate) : game._releaseDate == null;

    }

    @Override
    public int hashCode() {
        int result = (int) (_rowID ^ (_rowID >>> 32));
        result = 31 * result + (_name != null ? _name.hashCode() : 0);
        result = 31 * result + (_releaseDate != null ? _releaseDate.hashCode() : 0);
        return result;
    }
}
