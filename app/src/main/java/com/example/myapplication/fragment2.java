package com.example.myapplication;

import org.w3c.dom.Text;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.*;

public class fragment2 extends Fragment {

    TextView result;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, container, false);
        result = view.findViewById(R.id.fragment2_result);
        return view; // dynamic
    }

    public void resultChange(String data) {
        if (data != null) {
            result.setText(data);
        }
    }
}