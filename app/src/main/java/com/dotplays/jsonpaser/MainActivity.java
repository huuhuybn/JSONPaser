package com.dotplays.jsonpaser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    String url = "http://113.190.232.235:30100/idocNet.Test.Logistic.WMS/Services/Login";
    String username = "wms.csc";
    String password = "0StFbim5pSrmBncQU0RpnA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void login(View view) {

        HttpPostTaskV1 httpPostTask = new HttpPostTaskV1();
        httpPostTask.execute(url, username, password);

    }
}
