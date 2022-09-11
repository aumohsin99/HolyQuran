package com.example.holyquran;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.List;
public class AyahList extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ayah_list);

        Intent intent=getIntent();
        String surahName=intent.getStringExtra("SurahName");
        DBHelper dbhelper=new DBHelper(this);

        ArrayList<GenericListItem> SurahList=dbhelper.displayAyah(dbhelper.getSurahNumber(surahName));

        ListView ayahList=findViewById(R.id.ayahList);

        CustomArrayAdapterAyah customArrayAdapter=new CustomArrayAdapterAyah(this,SurahList);

        ayahList.setAdapter(customArrayAdapter);
    }
}