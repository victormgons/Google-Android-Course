package com.example.diceroller

import org.junit.Test
import org.junit.Assert.assertTrue

class ExampleUnitTest {
    @Test
    fun generates_Number(){
        val dice = Dice(6)
        val rollResult = dice.roll()
        assertTrue("The result wasnt between 1 and 6", rollResult in 1..6)

    }
}