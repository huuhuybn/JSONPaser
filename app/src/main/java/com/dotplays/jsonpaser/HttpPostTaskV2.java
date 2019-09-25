package com.dotplays.jsonpaser;

import android.os.AsyncTask;
import android.util.Log;

import com.dotplays.jsonpaser.gson.Login;
import com.dotplays.jsonpaser.model.Access;
import com.dotplays.jsonpaser.model.Item;
import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HttpPostTaskV2 extends AsyncTask<String, Long, String> {

    @Override
    protected String doInBackground(String... strings) {
        try {
            URL url = new URL(strings[0]);

            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            httpURLConnection.setRequestMethod("POST");

            // khoi tao param
            StringBuilder params = new StringBuilder();

            params.append("&");
            params.append("username");
            params.append("=");
            params.append(strings[1]);
            params.append("&");
            params.append("password");
            params.append("=");
            params.append(strings[2]);

            OutputStream os = httpURLConnection.getOutputStream();
            BufferedWriter writer = new BufferedWriter
                    (new OutputStreamWriter(os, "UTF-8"));

            // dua param vao body cua request
            writer.append(params);

            // giai phong bo nho
            writer.flush();
            // ket thuc truyen du lieu vao output
            writer.close();
            os.close();


            // lay du lieu tra ve
            StringBuilder response = new StringBuilder();

            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                String line;
                BufferedReader br = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                while ((line = br.readLine()) != null) {
                    response.append(line);
                }
            } else {
                return httpURLConnection.getResponseCode() + "";
            }


            return response.toString();


        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);


        Login login = new Gson().fromJson(s,Login.class);
        boolean thanhCong = login.getSuccess();

        

    }
}
