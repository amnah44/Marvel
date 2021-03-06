package com.amnah.marvelapp.ui.home

import com.amnah.marvelapp.R
import com.amnah.marvelapp.ui.base.BaseAdapter
import com.amnah.marvelapp.data.repository.domain.models.Characters

class NestedCharactersAdapter(
    val item: List<Characters>,
    val listener: HomeInteractionListener
): BaseAdapter<Characters>(item, listener) {
    override val layoutId: Int
        get() = R.layout.item_characters_raw
}