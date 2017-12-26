package com.example.hamza.lab5fragment2activitycommunication.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.hamza.lab5fragment2activitycommunication.R;

/**
 * A simple {@link Fragment} subclass.
 * Activities that contain this fragment must implement the
 * {@link OnSampleFragmentListener} interface
 * to handle interaction events.
 */
public class SampleFragment extends Fragment {

    private OnSampleFragmentListener mListener;

    public SampleFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sample, container, false);

        Button btnPress  = (Button) view.findViewById(R.id.btnPress);


        final EditText etInput = (EditText) view.findViewById(R.id.etInputMessage);

        btnPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mListener.onButtonPressed(etInput.getText().toString());

            }
        });


        return view;
    }



    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnSampleFragmentListener) {
            mListener = (OnSampleFragmentListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnSampleFragmentListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnSampleFragmentListener {

        void onButtonPressed(String message);
    }
}
