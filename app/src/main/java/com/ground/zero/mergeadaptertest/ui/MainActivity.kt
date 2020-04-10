package com.ground.zero.mergeadaptertest.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.MergeAdapter
import com.ground.zero.mergeadaptertest.data.DataSource
import com.ground.zero.mergeadaptertest.databinding.ActivityMainBinding
import com.ground.zero.mergeadaptertest.ui.computer.ComputerAdapter
import com.ground.zero.mergeadaptertest.ui.footer.FooterAdapter

class MainActivity : AppCompatActivity() {

    private val dataSource = DataSource()
    private val computerAdapter = ComputerAdapter()
    private val footerAdapter = FooterAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.mainRecyclerView.adapter = MergeAdapter(computerAdapter, footerAdapter)
        computerAdapter.submitList(dataSource.computers)
        footerAdapter.submitList(dataSource.footer)
    }
}
