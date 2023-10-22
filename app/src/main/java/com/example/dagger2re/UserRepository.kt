package com.example.dagger

import android.content.ContentValues.TAG
import android.util.Log
import javax.inject.Inject

class UserRepository @Inject constructor(){


    fun saveuser(email: String, password: String) {
        Log.d(TAG, "saveuser: $email, $password")

    }



}