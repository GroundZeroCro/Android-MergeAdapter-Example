package com.ground.zero.mergeadaptertest.ui.computer

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.ground.zero.mergeadaptertest.data.Computer
import com.ground.zero.mergeadaptertest.databinding.ItemComputerBinding

class ComputerAdapter : ListAdapter<Computer, ComputerViewHolder>(
    ComputerDiffCallback()
) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ComputerViewHolder =
        ComputerViewHolder(
            ItemComputerBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )

    override fun onBindViewHolder(holder: ComputerViewHolder, position: Int) {
        holder.bind(getItem(position))
    }
}