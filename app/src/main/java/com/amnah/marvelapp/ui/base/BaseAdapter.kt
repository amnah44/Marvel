package com.amnah.marvelapp.ui.base

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.amnah.marvelapp.BR

interface BaseInteractionListener

abstract class BaseAdapter<T>(
    private var items: List<T>,
    private var listener: BaseInteractionListener?
    ) : RecyclerView.Adapter<BaseAdapter.BaseViewHolder>() {

    abstract val layoutId : Int

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder {
        return ItemViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                layoutId,
                parent,
                false
        ))
    }

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val currentItem = items[position]
        when(holder) {
            is ItemViewHolder ->{
                holder.binding.setVariable(BR.item, currentItem)
                holder.binding.setVariable(BR.listener, listener)
            }
        }
    }

    fun setItems(newItems : List<T>){
        val marvelDiffUtil = DiffUtil.calculateDiff(MarvelDiffUtils(items, newItems))
        items = newItems
        marvelDiffUtil.dispatchUpdatesTo(this)

    }

    fun getItems() = items

    override fun getItemCount() = items.size

    class ItemViewHolder(val binding: ViewDataBinding) : BaseViewHolder(binding)

    abstract class BaseViewHolder(binding : ViewDataBinding) : RecyclerView.ViewHolder(binding.root)

    }