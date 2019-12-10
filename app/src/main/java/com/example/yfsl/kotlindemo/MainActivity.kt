package com.example.yfsl.kotlindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        compare()
        stringLastIndexOf()
        stringRemoveChr()
        stringIsNull()
        nullSafeSwitch()
    }

    private fun stringIsNull() {
        val str: String? = null
        val lenght = str?.length
        println(lenght)
        println(str?.toInt()?:-1)
    }

    private fun nullSafeSwitch(){
        val a: Any = "hello"
        val bInt: Int? = a as? Int
        println(bInt)
    }

    fun compare(){
        var str = "Hello World"
        var str1 = "hello world"
        var str2 = "Hello World"
        Log.e("TAG","${str.compareTo(str1)}")
        println(str.compareTo(str2))
        println(str.compareTo(str1,true))
        println(str.compareTo(str2,true))
        println(str.equals(str1))
        println(str.equals(str2))
        println(str.equals(str1,true))
        println(str.equals(str2,true))
    }

    fun stringLastIndexOf(){
        var str = "Hello, handsome boy."
        var str1 = "boy,I am not a boy."
        var lastHandsome : Int = str.lastIndexOf("handsome")
        var lastBoy : Int = str.lastIndexOf("Boy",startIndex = str.length,ignoreCase = true)
        var lastBoyInStr1 : Int = str1.lastIndexOf("boy",str1.length-5,true)
        println("lastHandsome:$lastHandsome")
        println("lastBoy:$lastBoy")
        println("lastBoyInStr1:$lastBoyInStr1")
    }

    fun stringRemoveChr(){
        var str = "PHP, the best language"
        println(removeCharAt(str,1))
    }

    fun removeCharAt(str: String,pos: Int): String{
        return str.substring(0,pos)+str.substring(pos+1)
    }

    @Suppress("UNREACHABLE_CODE")
    override fun onClick(v: View?) {
        when(v?.id){
            R.id.btn1 -> showToast("${btn1.text}")
            R.id.btn2 -> showToast("${btn2.text}")
            R.id.btn3 -> showToast("${btn3.text}")
        }
    }

    fun showToast(str: String){
        Toast.makeText(this,str,Toast.LENGTH_SHORT).show();
    }
}
