package com.botob.marvelcomics.ui.main

import androidx.lifecycle.Lifecycle
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.botob.marvelcomics.MainActivity
import com.botob.marvelcomics.R
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainFragmentTest {
    @get:Rule
    var rule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun testCheckStoryLabelText() {
        rule.scenario.moveToState(Lifecycle.State.RESUMED)

        onView(withId(R.id.story_label)).check(matches(withText(R.string.label_story)))
    }

    @Test
    fun testShowPopupOnReadNowClick() {
        rule.scenario.moveToState(Lifecycle.State.RESUMED)

        onView(withId(R.id.read_now_button)).perform(click())

        onView(withText(R.string.reading)).check(matches(isDisplayed()))
    }
}