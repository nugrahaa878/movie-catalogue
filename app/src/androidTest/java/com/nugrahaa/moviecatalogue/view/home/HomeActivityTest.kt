package com.nugrahaa.moviecatalogue.view.home

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
<<<<<<< HEAD
import androidx.test.espresso.IdlingPolicies
import androidx.test.espresso.IdlingRegistry
=======
>>>>>>> parent of fb6fe1a... refactor
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.contrib.RecyclerViewActions
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import com.nugrahaa.moviecatalogue.R
import com.nugrahaa.moviecatalogue.utils.DataDummy
import org.junit.Rule
import org.junit.Test
<<<<<<< HEAD
import org.junit.runner.RunWith
import java.util.concurrent.TimeUnit
=======
>>>>>>> parent of fb6fe1a... refactor

class HomeActivityTest {

    private val dummyMovies = DataDummy.generateDummyMovies()
    private val dummyTvShow = DataDummy.generateDummyTvShows()

    @get:Rule
    var activityRule = ActivityTestRule(HomeActivity::class.java)

<<<<<<< HEAD
    @Before
    fun setUp() {
        IdlingRegistry.getInstance().register(EspressoIdlingResource.idlingResource)
        IdlingPolicies.setIdlingResourceTimeout(5, TimeUnit.SECONDS)
    }

    @After
    fun tearDown() {
        IdlingRegistry.getInstance().unregister(EspressoIdlingResource.idlingResource)

    }

=======
>>>>>>> parent of fb6fe1a... refactor
    @Test
    fun loadDetailTvShows() {
        onView(withText("TV SHOWS")).perform(click())
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
    }

    @Test
    fun loadDetailMovies() {
<<<<<<< HEAD
        onView(withText("MOVIES")).perform(click())
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
=======
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(withText(dummyMovies[2].title)))
        onView(withId(R.id.tv_genre_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_detail)).check(matches(withText(dummyMovies[2].genre)))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(withText(dummyMovies[2].description)))
>>>>>>> parent of fb6fe1a... refactor
    }

    @Test
    fun loadMovies() {
        onView(withId(R.id.rv_movies)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_movies)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyMovies.size))
    }

    @Test
    fun loadTvShow() {
        onView(withText("TV SHOWS")).perform(click())
<<<<<<< HEAD
        onView(withId(R.id.rv_tvshow)).check(matches(isDisplayed()))
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.scrollToPosition<RecyclerView.ViewHolder>(dummyTvShow.size))
=======
        onView(withId(R.id.rv_tvshow)).perform(RecyclerViewActions.actionOnItemAtPosition<RecyclerView.ViewHolder>(2, click()))
        onView(withId(R.id.tv_title_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_title_detail)).check(matches(withText(dummyTvShow[2].title)))
        onView(withId(R.id.tv_genre_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_genre_detail)).check(matches(withText(dummyTvShow[2].genre)))
        onView(withId(R.id.tv_description_detail)).check(matches(isDisplayed()))
        onView(withId(R.id.tv_description_detail)).check(matches(withText(dummyTvShow[2].description)))
>>>>>>> parent of fb6fe1a... refactor
    }

}