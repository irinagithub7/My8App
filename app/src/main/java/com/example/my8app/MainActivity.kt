package com.example.my8app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

lateinit var userRecyclerView: RecyclerView
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val userList:List<User> = listOf(
            User("Ivan",20),
        User("Yula",39),
            User("Serg",36)
        )

        userRecyclerView = findViewById(R.id.user_recycler_view)
        userRecyclerView.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        userRecyclerView.adapter = UserAdapter(userList)
        userRecyclerView.addItemDecoration(DividerItemDecoration(this,DividerItemDecoration.VERTICAL))
    }
}
//RecyclerView-Adapter-ViewHolder-Layout
//1.LayoutManager( a-LinearLayout-либо сверху вниз справа налево);Grid LM м указать количество стольцов
//2.Adapter