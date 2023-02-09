package com.example.lesson7_m5

import org.junit.After
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class MathTest {

    private var math:Math? = null

    @Before
    fun before(){
        math = Math()
    }
    @Test
    fun add(){
       math?.add("2","2")
       math?.add("1","1")
    }

    @Test(expected = ArithmeticException::class)
    fun divide(){
      math?.divide("0","8")
    }

    @Test
    fun minus(){
        math?.minus("0","8")
    }

    @Test
    fun multiply(){
        math?.multiply("2","8")
    }

    @After
    fun after(){
        math = null
    }
}