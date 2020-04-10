package com.ground.zero.mergeadaptertest.ui.footer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.ground.zero.mergeadaptertest.data.Footer
import com.ground.zero.mergeadaptertest.databinding.ItemFooterBinding

class FooterAdapter : ListAdapter<Footer, FooterViewHolder>(FooterDiffUtils()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FooterViewHolder =
        FooterViewHolder(
            ItemFooterBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: FooterViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}