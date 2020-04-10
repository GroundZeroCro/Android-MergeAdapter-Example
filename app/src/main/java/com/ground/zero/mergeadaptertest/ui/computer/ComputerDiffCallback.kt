package com.ground.zero.mergeadaptertest.ui.computer

import androidx.recyclerview.widget.DiffUtil
import com.ground.zero.mergeadaptertest.data.Computer

class ComputerDiffCallback : DiffUtil.ItemCallback<Computer>() {
    override fun areItemsTheSame(oldItem: Computer, newItem: Computer): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: Computer, newItem: Computer): Boolean {
        return oldItem.name == newItem.name
    }
}