package com.example.testingapplication

import com.example.testingapplication.data.Data
import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import org.junit.Assert.assertEquals
import java.io.File

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        val path =
            "/Users/deja/AndroidStudioProjects/Counter/app/src/test/java/com/example/counter/res.json"
        val newPath = "${System.getProperty("user.dir")}/src/test/java/com/example/testingapplication/res.json"
        val itemType = object : TypeToken<List<Data>>() {}.type
        val text = File(newPath).readText()
        val userData: List<Data> = Gson().fromJson(text, itemType)


        assertEquals("63537b39be29906db2c7d701", userData[userData.lastIndex]._id)

    }
}