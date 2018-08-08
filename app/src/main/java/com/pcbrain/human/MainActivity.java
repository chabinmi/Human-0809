package com.pcbrain.human;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Human human = new Human("井上雅之", 49, "経済力");     // Humanのインスタンスを作る
        human.say();

        human.think();
    }
}




