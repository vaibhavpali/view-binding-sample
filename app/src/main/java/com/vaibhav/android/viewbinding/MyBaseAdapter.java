package com.vaibhav.android.viewbinding;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import com.vaibhav.android.viewbinding.databinding.ListItemBinding;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;

public class MyBaseAdapter extends RecyclerView.Adapter<MyBaseAdapter.MyViewHolder> {
    private List<TemperatureData> data;

    public MyBaseAdapter(List<TemperatureData> data) {
        this.data = data;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private ViewDataBinding binding;

        MyViewHolder(ViewDataBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
        void bind(Object obj) {
            binding.setVariable(BR.obj, obj);
            binding.executePendingBindings();
        }
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        ListItemBinding binding = DataBindingUtil.inflate(layoutInflater, R.layout.list_item, parent, false);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.bind(data.get(position));
    }

    @Override
    public int getItemCount() {
        return data.size();
    }
}
