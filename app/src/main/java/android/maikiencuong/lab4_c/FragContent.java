package android.maikiencuong.lab4_c;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FragContent extends Fragment {
    private ArrayList<Product> products = new ArrayList<Product>();
    private RecyclerView recyclerView;
    private ProductAdapter adapter;

    public FragContent() {
    }

    public static FragContent newInstance() {
        FragContent fragment = new FragContent();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
        products.add(new Product("1","Lorem Ipsum is simply dummy",15,79900,30,R.drawable.nam1));
        products.add(new Product("2","Lorem Ipsum is simply dummy",35,59900,10,R.drawable.nam1));
        products.add(new Product("3","Lorem Ipsum is simply dummy",55,39900,40,R.drawable.nam1));
        products.add(new Product("4","Lorem Ipsum is simply dummy",10,43900,50,R.drawable.nam1));
        products.add(new Product("5","Lorem Ipsum is simply dummy",5,179900,75,R.drawable.nam1));
        products.add(new Product("6","Lorem Ipsum is simply dummy",115,19900,30,R.drawable.nam1));
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_frag_content, container, false);
        recyclerView = view.findViewById(R.id.rcyFrag);
        adapter = new ProductAdapter(view.getContext(),products);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new GridLayoutManager(view.getContext(),2));
        return view;
    }
}