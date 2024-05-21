package com.zx.richhtml.table


import android.content.Context
import android.text.Html
import android.view.View
import androidx.core.content.ContextCompat
import com.zx.richhtml.formula.RichTextView
import com.zx.richhtml.htmltext.HtmlImageLoader
import com.zx.richhtml.htmltext.OnTagClickListener

class CustomRichText(
    override val context: Context, public override val source: String,
    private val imageLoader: HtmlImageLoader?, private val onTagClickListener: OnTagClickListener?,
) :
    TypeRichView(context, source) {

    override fun getRenderView(
        flags: Int,
        imageGetter: Html.ImageGetter?,
        tagHandler: Html.TagHandler?,
        textColor: Int
    ): View {
        val mLaTexTextView=
            RichTextView(context)
        mLaTexTextView.setTextColor(ContextCompat.getColor(
            context, textColor
        ))
        mLaTexTextView.setMathText(source, imageLoader, onTagClickListener)
        return mLaTexTextView
    }
}