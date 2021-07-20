package com.example.homework5androidstudio;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment1 extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    private TextView txt_item, txt_description;
    private ImageView pic_1;


    private String mParam1;
    private String mParam2;

    public fragment1() {

    }

    public static fragment1 newInstance(String param1, String param2, int image) {
        fragment1 fragment = new fragment1();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            String mItem = getArguments().getString(ARG_PARAM1);
            String mDescription = getArguments().getString(ARG_PARAM2);
            String mImage = getArguments().getString(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fragment1, container, false);
        txt_item = view.findViewById(R.id.txt_item);
        txt_description = view.findViewById(R.id.txt_description);
        pic_1 = view.findViewById(R.id.pic_1);

        txtItem.setText(mItem);
        txtDescription.setText(mDescription);
        itemImage.setImageResource(mImage);
        return view;
    }
}