package com.example.lesson7_m5



import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.*
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withText
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith


@RunWith(AndroidJUnit4::class)
class MainActivityTest {

    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun add(){
        onView(withId(R.id.calc_first_edt)).perform(typeText("2"))
        onView(withId(R.id.calc_second_edt)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.calc_result_tv)).check(matches(withText("4")))
    }

    @Test
    fun divide(){
        onView(withId(R.id.calc_first_edt)).perform(typeText("4"))
        onView(withId(R.id.calc_second_edt)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.calc_result_tv)).check(matches(withText("2")))
    }

    @Test
    fun minus(){
        onView(withId(R.id.calc_first_edt)).perform(typeText("1"))
        onView(withId(R.id.calc_second_edt)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.calc_result_tv)).check(matches(withText("-1")))
    }

    @Test
    fun multiply(){
        onView(withId(R.id.calc_first_edt)).perform(typeText("3"))
        onView(withId(R.id.calc_second_edt)).perform(typeText("2"), closeSoftKeyboard())
        onView(withId(R.id.add)).perform(click())
        onView(withId(R.id.calc_result_tv)).check(matches(withText("6")))
    }

    @Test
    fun calcTv(){
        onView(withId(R.id.calc_tv)).check(matches(withText("kalculator")))
    }

}