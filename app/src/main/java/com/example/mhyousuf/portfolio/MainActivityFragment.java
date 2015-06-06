package com.example.mhyousuf.portfolio;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main, container, false);

        final Button btn_spotifyapp = (Button) view.findViewById(R.id.btn_spotifyapp);
        btn_spotifyapp.setOnClickListener(onClickListener);

        final Button btn_scoreapp = (Button) view.findViewById(R.id.btn_scoreapp);
        btn_scoreapp.setOnClickListener(onClickListener);

        final Button btn_libraryapp = (Button) view.findViewById(R.id.btn_libraryapp);
        btn_libraryapp.setOnClickListener(onClickListener);

        final Button btn_builditbigger = (Button) view.findViewById(R.id.btn_builditbigger);
        btn_builditbigger.setOnClickListener(onClickListener);

        final Button btn_xyzreader = (Button) view.findViewById(R.id.btn_xyzreader);
        btn_xyzreader.setOnClickListener(onClickListener);

        final Button btn_myownapp = (Button) view.findViewById(R.id.btn_myownapp);
        btn_myownapp.setOnClickListener(onClickListener);

        return  view;
    }

    private View.OnClickListener onClickListener = new View.OnClickListener() {
        @Override
        public void onClick(final View v) {
            switch(v.getId()){
                case R.id.btn_spotifyapp:
                    Toast.makeText(getActivity(), "This button will launch my spotify app!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_scoreapp:
                    Toast.makeText(getActivity(), "This button will launch my score app!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_libraryapp:
                    Toast.makeText(getActivity(), "This button will launch my library app!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_builditbigger:
                    Toast.makeText(getActivity(), "This button will launch my build it bigger app!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_xyzreader:
                    Toast.makeText(getActivity(), "This button will launch my xyz reader app!", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btn_myownapp:
                    Toast.makeText(getActivity(), "This button will launch my own app!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }
    };
}
