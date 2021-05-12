package android.maikiencuong.lab4_c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class FragBot extends Fragment {
    private ImageButton ibtBack, ibtHome, ibtView;

    public FragBot() {
    }

    public static FragBot newInstance() {
        FragBot fragment = new FragBot();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_bot, container, false);
        ibtBack = view.findViewById(R.id.ibtBackBot);
        ibtHome = view.findViewById(R.id.ibtHome);
        ibtView = view.findViewById(R.id.ibtView);
        view.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        ibtView.setBackgroundResource(R.drawable.ic_baseline_view_headline_24);
        ibtHome.setBackgroundResource(R.drawable.ic_outline_home_24);
        ibtBack.setBackgroundResource(R.drawable.ic_baseline_subdirectory_arrow_left_24);
        return view;
    }
}