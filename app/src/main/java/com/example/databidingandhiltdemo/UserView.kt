package com.example.databidingandhiltdemo

import android.content.Context
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatTextView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class UserView(context: Context, attrs: AttributeSet?) : AppCompatTextView(context, attrs) {
    @Inject lateinit var user: User

    override fun onAttachedToWindow() {
        super.onAttachedToWindow()

        text = "${user.name}的心情是${user.mode}"
    }
}