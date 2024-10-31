package eaut.it.mobileappdev.customlistviewdemo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class CompanyAdapter extends ArrayAdapter<Company> {

    public CompanyAdapter(@NonNull Context context, @NonNull List<Company> companies) {
        super(context,0, companies);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Company company = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.icon);
        TextView nameTextView = convertView.findViewById(R.id.title);
        TextView subtitleTextView = convertView.findViewById(R.id.subtitle);


        imageView.setImageResource(company.getLogo());
        nameTextView.setText(company.getName());
        subtitleTextView.setText(String.valueOf(company.getDescription()));

        return convertView;
    }
}
