package com.improve10x.practiceandroid;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.improve10x.practiceandroid.databinding.CustomListItemBinding;
import com.squareup.picasso.Picasso;

import java.util.List;

public class CustomListViewAdapter extends ArrayAdapter<CustomList> {

    CustomListItemBinding binding;

    public CustomListViewAdapter(@NonNull Context context, int resource, @NonNull List<CustomList> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        binding = CustomListItemBinding.inflate(LayoutInflater.from(getContext()), parent, false);
        CustomList customList = getItem(position);
        Picasso.get().load(customList.imageUrl).into(binding.imageImg);
        //binding.imageImg.setImageResource(R.drawable.ic_baseline_tag_faces_24);
        binding.titleTxt.setText(customList.title);
        binding.subTitleTxt.setText(customList.subTitle);
        return binding.getRoot();
    }
}
