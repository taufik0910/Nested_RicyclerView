package com.example.nestedricyclerview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.nestedricyclerview.R
import com.example.nestedricyclerview.databinding.ParentItemBinding
import com.example.nestedricyclerview.model.MainModel

class MainAdapter(private val collection: List<MainModel>) :
    RecyclerView.Adapter<MainAdapter.ColletionViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ColletionViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.parent_item, parent, false)
        return ColletionViewHolder(view)
    }

    override fun onBindViewHolder(holder: ColletionViewHolder, position: Int) {
        holder.binding.apply {
            val collection = collection[position]
            tvGenreMovie.text = collection.title
            val movieAdapter = MovieAdapter(collection.movieModels)
            rvMovieChild.adapter= movieAdapter
        }
    }

    override fun getItemCount() = collection.size

    inner class ColletionViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val binding = ParentItemBinding.bind(itemView)
    }
}