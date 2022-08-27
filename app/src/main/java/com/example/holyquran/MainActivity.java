package com.example.holyquran;
import androidx.appcompat.app.AppCompatActivity;
import android.database.SQLException;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
    ListView surahList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        surahList=findViewById(R.id.surahList);
        DBHelper dbhelper=new DBHelper(this);
        try {
            dbhelper.createDB();
        } catch (IOException ioe) {
            throw new Error("Database not created....");
        }
        try {
            dbhelper.openDB();
        }catch(SQLException sqle){
            throw sqle;
        }

        dbhelper.checkDB();



    }
}