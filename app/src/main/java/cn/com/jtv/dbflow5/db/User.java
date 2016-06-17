package cn.com.jtv.dbflow5.db;

import com.raizlabs.android.dbflow.annotation.Column;
import com.raizlabs.android.dbflow.annotation.PrimaryKey;
import com.raizlabs.android.dbflow.annotation.Table;
import com.raizlabs.android.dbflow.structure.BaseModel;

/**
 * Created by fangdean on 2016/6/17.
 */
@Table(database = LocationDatabase.class)
public class User extends BaseModel {
    @PrimaryKey
    public String vin;

    @Column
    public String make;

    @Column
    public String model;

    @Column
    public int year;
}
