package cn.com.jtv.dbflow5;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.raizlabs.android.dbflow.config.FlowManager;
import com.raizlabs.android.dbflow.sql.language.SQLite;

import java.util.List;

import cn.com.jtv.dbflow5.db.User;
import cn.com.jtv.dbflow5.db.User_Table;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_add).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                User venza = new User();
                venza.vin = "499499449";
                venza.make = "Toyota";
                venza.model = "Venza";
                venza.year = 2013;
                venza.save();
            }
        });

        findViewById(R.id.btn_get).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                List<User> users = SQLite.select().from(User.class).where(User_Table.vin.eq("499499449")).queryList();
                Toast.makeText(MainActivity.this,users.get(0).make,Toast.LENGTH_SHORT).show();
            }
        });

        FlowManager.getConfig();
    }
}
