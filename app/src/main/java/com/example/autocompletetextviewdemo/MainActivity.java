package com.example.autocompletetextviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.MultiAutoCompleteTextView;

public class MainActivity extends AppCompatActivity {

    private AutoCompleteTextView acTextView;
    private MultiAutoCompleteTextView macTextView;
    private String[] res = {"chengdu1", "chengdu2", "chengdu3", "shanghai1", "shanghai2"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        acTextView = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView1);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, res);
        acTextView.setAdapter(adapter);

        macTextView = (MultiAutoCompleteTextView) findViewById(R.id.multiAutoCompleteTextView1);
        macTextView.setAdapter(adapter);
        macTextView.setTokenizer(new MultiAutoCompleteTextView.CommaTokenizer());
    }
}
