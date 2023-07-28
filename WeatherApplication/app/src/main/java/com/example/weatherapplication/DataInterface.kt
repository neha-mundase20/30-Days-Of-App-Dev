package com.example.weatherapplication

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DataInterface {

    private lateinit var  dataInstance: ApiInterface

    init {  //'init' block is called when a object is created of the class
        //create retrofit builder obj
        if (!::dataInstance.isInitialized){
            val retrofitbuilder = Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory.create())
                .baseUrl(BASE_URL)
                .build()
            dataInstance = retrofitbuilder.create(ApiInterface::class.java)   //initialize a variable of the interface
            //with the retrofit builder and return that retrofit builder object
        }
    }

    fun getApiService(): ApiInterface {
        return dataInstance
    }
}