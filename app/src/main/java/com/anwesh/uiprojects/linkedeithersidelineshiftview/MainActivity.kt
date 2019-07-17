package com.anwesh.uiprojects.linkedeithersidelineshiftview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.anwesh.uiprojects.eitherlineshiftview.EitherLineShiftView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EitherLineShiftView.create(this)
    }
}
