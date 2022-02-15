package com.beyond.practice_2022215

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener {

            var k = EDT_ID.text.toString()
            var t = EDT_PW.text.toString()

            if(k == "admin"&&t == "asdf"){

                Toast.makeText(this, "관리자님 환영합니다", Toast.LENGTH_SHORT).show()

            }

           else if(k == "admin"&&t != "asdf"){
                Toast.makeText(this, "Check your PW", Toast.LENGTH_SHORT).show()

            }
            else if(k != "admin"&&t == "asdf"){
                Toast.makeText(this, "Check your ID", Toast.LENGTH_SHORT).show()

            }
            else if(k != "admin"&&t != "asdf"){
                Toast.makeText(this, "Check your ID and PW", Toast.LENGTH_SHORT).show()

            }
            else{
                Toast.makeText(this, "오류", Toast.LENGTH_SHORT).show()

            }


        }





    }
}