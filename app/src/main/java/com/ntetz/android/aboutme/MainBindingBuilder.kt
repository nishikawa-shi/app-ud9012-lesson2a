package com.ntetz.android.aboutme

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.view.inputmethod.InputMethodManager
import com.ntetz.android.aboutme.databinding.ActivityMainBinding

class MainBindingBuilder(private val mainBinding: ActivityMainBinding,
                         private val activity: AppCompatActivity) : BindingBuilder {
    override fun bindText() {
        val name = this.activity.getString(R.string.name_nishikawa_tetsuya)
        this.mainBinding.myName = MyName(name)

    }

    override fun bindAction() {
        this.mainBinding.doneButton.setOnClickListener {
            this.applyNickName()
            this.closeKeyboard(it)
        }
    }

    private val applyNickName: () -> Unit = {
        mainBinding.apply {
            this.myName?.nickname = nicknameEdit.text.toString()
            this.invalidateAll()
            this.nicknameEdit.visibility = View.GONE
            this.doneButton.visibility = View.GONE
            this.nicknameText.visibility = View.VISIBLE
        }
    }
    private val closeKeyboard: (View) -> Unit = {
        val imn = activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imn.hideSoftInputFromWindow(it.windowToken, 0)
    }
}