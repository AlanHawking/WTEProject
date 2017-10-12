package com.example.administrator.wteproject

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.RatingBar
import android.widget.TextView

class FoodList : AppCompatActivity() {

    private lateinit var thisAdapter:BaseAdapterPlus<FoodBriefItem>

    private lateinit var datas:ArrayList<FoodBriefItem>

    private lateinit var listView:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_list)

        datas= ArrayList()
        listView=findViewById(R.id.foodListListView) as ListView

        thisAdapter=object :BaseAdapterPlus<FoodBriefItem>(datas,R.id.foodListListView){
            override fun bindView(viewHolder:ViewHolder,obj:FoodBriefItem?){
                viewHolder.setText(R.id.foodListItemName,obj!!.FoodName)
                viewHolder.setText(R.id.foodListItemPrice,"${obj.FoodPriceMin}-${obj.FoodPriceMax}元")
                val ratingBar: RatingBar =viewHolder.getView(R.id.foodListItemRate)
                ratingBar.max=5
                ratingBar.rating=obj.FoodRate
            }
        }

        listView.adapter=thisAdapter

        initData()
    }

    private fun initData(){
        thisAdapter.AddData(FoodBriefItem("回锅肉",20,15,4.3f))
        thisAdapter.AddData(FoodBriefItem("青椒肉丝",18,14,4.1f))
        thisAdapter.AddData(FoodBriefItem("仔姜肉丝",22,18,4.4f))
    }
}
