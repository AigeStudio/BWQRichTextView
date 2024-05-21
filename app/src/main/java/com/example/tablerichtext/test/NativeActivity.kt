package com.example.tablerichtext.test

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import androidx.core.text.HtmlCompat
import com.example.tablerichtext.App
import com.zx.richhtml.htmltext.HtmlImageLoader
import com.zx.richhtml.htmltext.OnTagClickListener
import com.zx.richhtml.table.HtmlTextView


class NativeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.tablerichtext.R.layout.activity_main)
        this.findViewById<HtmlTextView>(com.example.tablerichtext.R.id.htmlTextView)
            .setHtml(App.getSample(), HtmlCompat.FROM_HTML_MODE_LEGACY, null, null)
    }

}