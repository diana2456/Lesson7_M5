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
        Assert.assertEquals("4",math?.add("6","8"))
    }

    @Test(expected = ArithmeticException::class)
    fun divide(){math?.divide("36","6") }

    @Test
    fun minus(){
        Assert.assertEquals("0",math?.add("8","8"))
    }

    @Test
    fun multiply(){
        Assert.assertEquals("24",math?.add("3","8"))
    }

    @After
    fun after(){
        math = null
    }
}