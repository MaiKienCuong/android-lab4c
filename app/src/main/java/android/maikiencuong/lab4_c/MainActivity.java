package android.maikiencuong.lab4_c;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.fram_Top,FragTop.newInstance()).commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frm_Bot, FragBot.newInstance()).commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.framContent,FragContent.newInstance()).commit();
    }
}