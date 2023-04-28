package org.techtown.keyevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.KeyEvent
import androidx.activity.OnBackPressedCallback

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        //Log.d("yyj", "onKeyDown")
        when(keyCode) {
            KeyEvent.KEYCODE_0 -> Log.d("yyj", "0 키를 눌렀네요")
            KeyEvent.KEYCODE_A -> Log.d("yyj", "A 키를 눌렀네요")
            KeyEvent.KEYCODE_BACK -> Log.d("yyj", "BACK button을 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_UP -> Log.d("yyj", "Volume Up 키를 눌렀네요")
            KeyEvent.KEYCODE_VOLUME_DOWN -> Log.d("yyj", "Volume Down 키를 눌렀네요")
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        Log.d("yyj", "onKeyUp")
        return super.onKeyUp(keyCode, event)
    }

    override fun onBackPressed() {
        Log.d("yyj", "Back Button을 눌렀네요")
    }

}