package com.ntetz.android.aboutme

class BindingDirector(private val bindingBuilder: BindingBuilder) {
    fun initialize() {
        this.bindingBuilder.bindText()
        this.bindingBuilder.bindAction()
    }
}