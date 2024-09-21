package com.Mohammad.Saeed.customtoast

import android.content.Context
import android.widget.Toast

object ToastLibrary {
    fun msg(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}
