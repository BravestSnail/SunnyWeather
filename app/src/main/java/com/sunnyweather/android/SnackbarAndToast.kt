package com.sunnyweather.android

import android.content.Context
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

fun View.showSnackbar(showText: String, actionText: String? = null,
                      duration: Int = Snackbar.LENGTH_SHORT, block: (() -> Unit)? = null){
    val snackbar = Snackbar.make(this, showText, duration)
    if (actionText != null && block != null){
        snackbar.setAction(actionText){
            block()
        }
    }
    snackbar.show()
}

fun View.showSnackbar(showText: String, actionText: Int? = null,
                      duration: Int = Snackbar.LENGTH_SHORT, block: (() -> Unit)? = null){
    val snackbar = Snackbar.make(this, showText, duration)
    if (actionText != null && block != null){
        snackbar.setAction(actionText){
            block()
        }
    }
    snackbar.show()
}

fun View.showSnackbar(showText: String, duration: Int = Snackbar.LENGTH_SHORT){
    val snackbar = Snackbar.make(this, showText, duration)
    snackbar.show()
}

fun String.showToast(context: Context, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(context, this, duration).show()
}

fun Int.showToast(context: Context, duration: Int = Toast.LENGTH_SHORT){
    Toast.makeText(context, this, duration).show()
}