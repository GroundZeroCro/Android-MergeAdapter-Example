package com.ground.zero.mergeadaptertest.ui.footer

import androidx.recyclerview.widget.DiffUtil
import com.ground.zero.mergeadaptertest.data.Footer

class FooterDiffUtils : DiffUtil.ItemCallback<Footer>() {
    override fun areItemsTheSame(oldItem: Footer, newItem: Footer): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Footer, newItem: Footer): Boolean {
        return oldItem.title == newItem.title
    }
}