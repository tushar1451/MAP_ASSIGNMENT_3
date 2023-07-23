package com.example.quizapplication;



import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Question_fragment extends Fragment {

    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private static final String ARG_PARAM3 = "param3";

    private int question;
    private int backgroundColor;
    public boolean answer;

    public Question_fragment() {
        // Required empty public constructor
    }


    public static Question_fragment newInstance(int question, int backgroundColor, boolean answer) {
        Question_fragment fragment = new Question_fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, question);
        args.putInt(ARG_PARAM2, backgroundColor);
        args.putBoolean(ARG_PARAM3, answer);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            question = getArguments().getInt(ARG_PARAM1);
            backgroundColor = getArguments().getInt(ARG_PARAM2);
            answer = getArguments().getBoolean(ARG_PARAM3);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_question_fragment, container, false);

        TextView textView = view.findViewById(R.id.fragmentTextView);
        textView.setText(question);

        view.setBackgroundColor(getResources().getColor(backgroundColor));

        return view;
    }
}
