package com.ground.zero.mergeadaptertest.ui.computer

import androidx.recyclerview.widget.RecyclerView
import com.ground.zero.mergeadaptertest.data.Computer
import com.ground.zero.mergeadaptertest.databinding.ItemComputerBinding

class ComputerViewHolder(private val binding: ItemComputerBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun bind(computer: Computer) {
        binding.computerText.text = computer.name
    }
}