package com.example.android.guesstheword.screens.score

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ScoreViewModel(private val finalScore : Int) : ViewModel() {

    // The score
    private val _score = MutableLiveData<Int>()
    val score: LiveData<Int>
        get() = _score

    // The play again Event
    private val _playAgainEvent = MutableLiveData<Boolean>()
    val playAgainEvent: LiveData<Boolean>
        get() = _playAgainEvent

    init {
        _score.value = finalScore
    }

    fun onPlayAgain() {
        _playAgainEvent.value = true
    }

    fun onPlayAgainFinished() {
        _playAgainEvent.value = false
    }
}