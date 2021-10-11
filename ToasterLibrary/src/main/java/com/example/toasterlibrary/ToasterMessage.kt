package com.example.toasterlibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {
    fun show (context: Context,){
        Toast.makeText(context,"Hello Shivansh",Toast.LENGTH_SHORT).show()
    }
}