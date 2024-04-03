package com.example.assignment_no2_activites_fragments_intents;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class DetailsFragment extends Fragment {

    private static final String ARG_SELECTED_ITEM = "selectedItem";

    private String selectedItem;

    public static DetailsFragment newInstance(String selectedItem) {
        DetailsFragment fragment = new DetailsFragment();
        Bundle args = new Bundle();
        args.putString(ARG_SELECTED_ITEM, selectedItem);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            selectedItem = getArguments().getString(ARG_SELECTED_ITEM);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.set_a_question_3_details, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.text_details);
        textView.setText(selectedItem);
    }
}

