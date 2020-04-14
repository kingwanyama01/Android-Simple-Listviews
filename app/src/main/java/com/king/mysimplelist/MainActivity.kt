package com.king.mysimplelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mList.setOnItemClickListener { parent, view, position, id ->
            //Extract each item from the list
            var item = parent.getItemAtPosition(position).toString()

            Toast.makeText(this,"$item clicked",Toast.LENGTH_LONG).show()

        }
    }
}
