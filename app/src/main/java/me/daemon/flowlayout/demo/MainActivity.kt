package me.daemon.flowlayout.demo

import android.os.Bundle
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import me.daemon.flowlayout.FlowLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val fl = findViewById<FlowLayout>(R.id.fl)
        val tv = TextView(this)
        tv.text = "Added programmatically"
        tv.setBackgroundResource(R.drawable.bg_label)
        val lp = ViewGroup.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)
        fl.addView(tv, lp)
    }

}