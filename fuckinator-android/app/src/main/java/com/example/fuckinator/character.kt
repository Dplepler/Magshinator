package com.example.fuckinator

class GameCharacter(val name: String, private val answers: Array<Boolean>, _score: Float = 0f) {

    var score = _score
        private set

    fun updateScore(index: Int, saidYes: Boolean) {
        this.score += if (saidYes == this.answers[index]) { 1.0f } else { -.5f }
    }
}
