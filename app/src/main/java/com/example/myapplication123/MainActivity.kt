package com.example.myapplication123

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {
    lateinit var retrofit:PlaceHolderApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        retrofit = RetrofitClient.instance()
        var id = 1
        network.setOnClickListener{
            retrofit.getPostFromItem(id).enqueue(object: Callback<PostItemItemX>{
                override fun onFailure(call: Call<PostItemItemX>, t: Throwable) {
                    Log.d("RETROFIT",t.message)

                }

                override fun onResponse(call: Call<PostItemItemX>, response: Response<PostItemItemX>) {
                    Log.d("RETROFIT", response.body().toString())
                    Toast.makeText(this@MainActivity, response.body().toString(), Toast.LENGTH_LONG).show()

                }
            })
            id++
        }
    }
}
