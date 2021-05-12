package android.maikiencuong.lab4_c;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.NameViewHolder> {
    ArrayList<Product> products = new ArrayList<Product>();
    private LayoutInflater inflater;

    public ProductAdapter(Context context, ArrayList<Product> products) {
        this.products = products;
        inflater = LayoutInflater.from(context);
    }

    @NonNull
    @Override
    public ProductAdapter.NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.line_item, parent, false);
        return new NameViewHolder(view, this);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductAdapter.NameViewHolder holder, int position) {
        DecimalFormat decimalFormat = new DecimalFormat("#,### đ");
        Product product = products.get(position);
        holder.tvProductName.setText(product.getProductName());
        holder.tvDiscount.setText("-" + (int) product.getDiscount() + "%");
        holder.tvPrice.setText(decimalFormat.format(product.getPrice()));
        holder.tvNumOfReview.setText("(" + product.getNumOfReview() + ")");
        holder.imgvImageProduct.setImageResource(product.getImage());

    }

    @Override
    public int getItemCount() {
        return products.size();
    }

    public class NameViewHolder extends RecyclerView.ViewHolder {
        ProductAdapter adapter;
        public TextView tvProductName, tvDiscount, tvPrice, tvNumOfReview;
        public ImageView imgvImageProduct;

        public NameViewHolder(@NonNull View itemView, ProductAdapter adapter) {
            super(itemView);
            tvDiscount = itemView.findViewById(R.id.tvDiscout);
            tvProductName = itemView.findViewById(R.id.tvProductName);
            tvPrice = itemView.findViewById(R.id.tvPrice);
            tvNumOfReview = itemView.findViewById(R.id.tvNumOfReview);
            imgvImageProduct = itemView.findViewById(R.id.imgvImage);

            this.adapter = adapter;
        }
    }
}
