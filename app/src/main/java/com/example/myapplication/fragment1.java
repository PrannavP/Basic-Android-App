package com.example.myapplication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class fragment1 extends Fragment {

    EditText name;
    Button btn1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, container, false);
        name = view.findViewById(R.id.fragment1_name);
        btn1 = view.findViewById(R.id.button2);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = name.getText().toString();
                Fragment f = (fragment2) getFragmentManager().findFragmentById(R.id.fragment2);
                ((fragment2) f).resultChange(data);
            }
        });
        return view;
    }
}