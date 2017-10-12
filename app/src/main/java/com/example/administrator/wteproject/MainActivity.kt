package com.example.administrator.wteproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.AttributeSet
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bindEvent()
    }

    //绑定各按钮事件
    fun bindEvent(){

        var rb = RadioButton(this)

    }

    private fun initRestaurantTypes(){
        Handler.Callback {
            msg ->
            var btnNames:Array<String> = arrayOf("全部","中餐","快餐")
            for (x in btnNames){

            }
            true
        }
    }
    //
    private fun setTypeButonStyles(btn:RadioButton,type:RadioBtnTypes){
        when(type){
            RadioBtnTypes.ResType -> {

            }
            RadioBtnTypes.RangeType -> {

            }
            RadioBtnTypes.FoodType -> {

            }
            RadioBtnTypes.FoodRateType -> {

            }
        }
    }
}
