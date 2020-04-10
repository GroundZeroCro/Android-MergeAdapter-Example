package com.ground.zero.mergeadaptertest.ui.footer

import android.graphics.Color
import androidx.recyclerview.widget.RecyclerView
import com.ground.zero.mergeadaptertest.data.Footer
import com.ground.zero.mergeadaptertest.databinding.ItemFooterBinding

class FooterViewHolder(private val binding: ItemFooterBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(footer: Footer) {
        binding.footerText.text = footer.title
        binding.footerText.setBackgroundColor(Color.parseColor(footer.color))
    }
}