package cn.com.jtv.dbflow5.db;

import com.raizlabs.android.dbflow.annotation.Database;

/**
 * Created by fangdean on 2016/6/17.
 */
@Database(name = LocationDatabase.NAME,version = LocationDatabase.VERSION)
public class LocationDatabase {
    public static final String NAME = "location";
    public static final int VERSION = 1;
}
