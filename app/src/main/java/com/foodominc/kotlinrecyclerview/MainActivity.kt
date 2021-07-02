package com.foodominc.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.foodominc.kotlinrecyclerview.adapter.SampleDataAdapter
import com.foodominc.kotlinrecyclerview.model.SampleData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var sampledataList:ArrayList<SampleData> = ArrayList();
//        sampledataList.add(SampleData("Test 1",24))
//        sampledataList.add(SampleData("Test 2",12))
//        sampledataList.add(SampleData("Test 3",15))
//        sampledataList.add(SampleData("Test 3",15))
//        sampledataList.add(SampleData("Test 3",15))
//        sampledataList.add(SampleData("Test 4",222))
//        sampledataList.add(SampleData("Test 5",67))

        var sampledataList= arrayListOf<SampleData>(
            SampleData("asas",1),
            SampleData("asas",1),
            SampleData("asas",1),
            SampleData("asas",1),
            SampleData("asas",1),
            SampleData("asas",1)
        )


        val adapter= SampleDataAdapter(sampledataList)
        recyclerviewid.adapter=adapter

        Log.i("mainActivity",sampledataList.toString())

    }

}