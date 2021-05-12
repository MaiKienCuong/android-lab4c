package android.maikiencuong.lab4_c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.fragment.app.Fragment;

public class FragTop extends Fragment {
    private ImageButton ibtBack,ibtMore,ibtShopping;

    public FragTop() {
    }

    public static FragTop newInstance() {
        FragTop fragment = new FragTop();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_top, container, false);
        ibtBack =view.findViewById(R.id.ibtBackTop);
        ibtMore =view.findViewById(R.id.ibtMore);
        ibtShopping=view.findViewById(R.id.ibtShopping);
        view.setBackgroundColor(getResources().getColor(R.color.lightBlue));
        ibtMore.setBackgroundResource(R.drawable.ic_baseline_more_horiz_24);
        ibtShopping.setBackgroundResource(R.drawable.ic_outline_shopping_cart_24);
        ibtBack.setBackgroundResource(R.drawable.ic_baseline_arrow_back_24);
        return view;
    }
}