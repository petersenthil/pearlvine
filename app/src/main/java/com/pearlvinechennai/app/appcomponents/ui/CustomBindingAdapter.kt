package com.pearlvinechennai.app.appcomponents.ui

import android.graphics.drawable.Drawable
import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.CenterCrop
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.pearlvinechennai.app.R

@BindingAdapter(value = ["viewVisibility", "isInvisible"], requireAll = false)
fun setVisibility(view: View, isVisible: Boolean, isInvisible: Boolean) {
    view.visibility =
        if (isVisible) View.VISIBLE else if (isInvisible) View.INVISIBLE else View.GONE
}

@BindingAdapter(
    value = ["imageUrl", "placeHolder", "placeHolderError", "cornerRadius"], requireAll = false
)
fun loadImageFromNetwork(
    imageView: ImageView, url: String?, placeHolder: Drawable?,
    placeHolderError: Drawable?,
    cornerRadius: Float
) {
    var imageURL = url

    if (imageURL != null && !imageURL.isEmpty() && !imageURL.equals(
            "",
            ignoreCase = true
        )
    ) {
        imageURL = imageURL.trim { it <= ' ' }
        if (imageURL.startsWith("/"))
            imageURL = "" + url

        val options = RequestOptions()
            .placeholder(placeHolder)
            .error(placeHolderError)
        if (cornerRadius > 0)
            options.transform(CenterCrop(),RoundedCorners(cornerRadius.toInt()))

        Glide.with(imageView).load(imageURL).apply(options).into(imageView)
    } else {
        imageView.setImageDrawable(placeHolder)
    }
}


@BindingAdapter(
    value = ["imageRes", "cornerRadius", "circular"], requireAll = false
)
fun loadImageFromResource(
    imageView: ImageView, imageRes: Drawable?, cornerRadius: Float, circular: Boolean
) {
    if (imageRes == null) {
        imageView.setImageResource(R.drawable.image_not_found)
    } else {
        val options = RequestOptions()
        if (circular)
            options.circleCrop()
        if (cornerRadius > 0)
            options.transform(CenterCrop(),RoundedCorners(cornerRadius.toInt()))
        Glide.with(imageView).load(imageRes).apply(options).into(imageView)
    }
}

@BindingAdapter(value = ["itemSpace"], requireAll = true)
fun addSpaceBetweenRecyclerItem(
    recyclerView: RecyclerView,
    itemSpace: Double,
) {
    recyclerView.addItemDecoration(
       RecyclerItemDecoration(itemSpace.toInt())
    )
}

