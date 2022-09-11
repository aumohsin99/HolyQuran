package com.example.holyquran;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class CustomArrayAdapterAyah extends ArrayAdapter {
    Activity context;
    ArrayList<String> ayahArabicArr;
    ArrayList<String> ayahTransArr;


    public CustomArrayAdapterAyah(Activity context, ArrayList<String> ayahArabicArr, ArrayList<String> ayahTransArr) {
        super(context, 0, ayahArabicArr);
        this.context=context;
        this.ayahArabicArr=ayahArabicArr;
        this.ayahTransArr=ayahTransArr;
    }
    @Override
    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View singleEntityView=inflater.inflate(
                R.layout.activity_custom_ayah_view, null,true);
        TextView ayahArabic=singleEntityView.findViewById(R.id.ayahArabic);
        TextView ayahTrans=singleEntityView.findViewById(R.id.ayahTrans);
        ayahArabic.setText(ayahArabicArr.get(position));
        ayahTrans.setText(ayahTransArr.get(position));
        return singleEntityView;
    }
}