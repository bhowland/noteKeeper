package com.example.notekeeper

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.ui.AppBarConfiguration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notekeeper.databinding.ActivityNoteListBinding
import kotlinx.android.synthetic.main.content_note_list.*

class NoteListActivity : AppCompatActivity() {

    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityNoteListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoteListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

//        val navController = findNavController(R.id.nav_host_fragment_content_note_list)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)

        binding.fab.setOnClickListener { view ->
            val activityIntent = Intent(this,NoteActivity::class.java)
            startActivity(activityIntent)
        }
        binding.fab.setOnClickListener { view ->
            startActivity(Intent(this,NoteActivity::class.java))
        }

        listitems.layoutManager = LinearLayoutManager(this)

        listitems.adapter = NoteRecyclerAdapter(this, DataManager.notes)
    }
        override fun onResume() {
            super.onResume()
            listitems.adapter?.notifyDataSetChanged()
        }


}