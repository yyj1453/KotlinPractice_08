package org.techtown.kotlinpractice08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import androidx.constraintlayout.widget.ConstraintSet.Motion

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {                                       // 화면 터치 이벤트 (터치가 없을 때를 대비하여 ?키워드 사용)

        when (event?.action) {                                                                      // 이벤트(화면 터치)가 일어 났을 떄
            MotionEvent.ACTION_DOWN -> {                                                            // 화면을 누르고 있을 때
                Log.d("yyj", "Touch down event x: ${event.x}, rawX: ${event.rawX}")        // x, y 좌표 설정
                Log.d("yyj", "Touch down event y: ${event.y}, rawY: ${event.rawY}")
            }
            MotionEvent.ACTION_UP -> {                                                              // 누르던 화면을 땠을 때
                Log.d("yyj", "Touch up event x: ${event.x}, rawX: ${event.rawX}")          // x, y 좌표 설정
                Log.d("yyj", "Touch up event Y: ${event.y}, rawY: ${event.rawY}")
            }
        }

        return super.onTouchEvent(event)
    }
}