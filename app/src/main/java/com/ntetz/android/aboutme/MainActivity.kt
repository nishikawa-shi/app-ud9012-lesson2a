package com.ntetz.android.aboutme

import android.content.Context
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.done_button).setOnClickListener {
            this.addNickName(it)
        }
    }

    private fun addNickName(view: View) {
        val nickNameTextView = findViewById<TextView>(R.id.nickname_text)
        val editText = findViewById<EditText>(R.id.nickname_edit)

        nickNameTextView.text = editText.text
        editText.visibility = View.GONE
        view.visibility = View.GONE

        //キーボードを隠す
        val imn = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imn.hideSoftInputFromWindow(view.windowToken, 0)
    }
}
