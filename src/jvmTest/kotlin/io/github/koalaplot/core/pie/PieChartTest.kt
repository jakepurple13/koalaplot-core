package io.github.koalaplot.core.pie

import androidx.compose.ui.test.junit4.createComposeRule
import io.github.koalaplot.core.util.ExperimentalKoalaPlotApi
import org.junit.Rule
import org.junit.Test

class PieChartTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    /**
     * Test creating a pie chart with data of all zeros.
     */
    @OptIn(ExperimentalKoalaPlotApi::class)
    @Test
    fun ZeroDataTest() {
        composeTestRule.setContent {
            PieChart(listOf(0f, 0f))
        }
    }
}
