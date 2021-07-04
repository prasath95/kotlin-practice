package com.foodominc.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.foodominc.kotlinrecyclerview.adapter.SampleDataAdapter
import com.foodominc.kotlinrecyclerview.model.Post
import com.foodominc.kotlinrecyclerview.model.SampleData
import com.foodominc.kotlinrecyclerview.service.ApiServiceImplementation
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var sampledataList : ArrayList<SampleData> = ArrayList()

        sampledataList.add(SampleData("Test 1",24))
        sampledataList.add(SampleData("Test 2",12))
        sampledataList.add(SampleData("Test 3",15))
        sampledataList.add(SampleData("Test 3",15))
        sampledataList.add(SampleData("Test 3",15))
        sampledataList.add(SampleData("Test 4",222))
        sampledataList.add(SampleData("Test 5",67))


//        var sampledataList= arrayListOf<SampleData>(
//            SampleData("asas",1),
//            SampleData("asas",1),
//            SampleData("asas",1),
//            SampleData("asas",1),
//            SampleData("asas",1),
//            SampleData("asas",1)
//        )


        val adapter= SampleDataAdapter(sampledataList)
        recyclerviewid.adapter=adapter

     //   Log.i("mainActivity",sampledataList.toString())

        var call: Call<List<Post>>? = ApiServiceImplementation.getInstance().getPost()

        if (call != null) {
            call.enqueue(object : Callback<List<Post>> {
                override fun onFailure(call: Call<List<Post>>, t: Throwable) {
                   // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    Log.d(TAG, "onFailure: ")
                }

                override fun onResponse(call: Call<List<Post>>, response: Response<List<Post>>) {
                   // TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                    Log.d(TAG, "onResponse: "+response.body())
                }

            })
        }else
        {
            Log.d(TAG, "onCreate: call is null")
        }





    }

}

