package com.example.fuckinator

class Character(val name: String, private val answers: Array<Float>, _score: Float) {

    var score = _score
        private set

    fun updateScore(index: Int, markedTrue: Boolean) {
        this.score += if (markedTrue) { this.answers[index] } else { -this.answers[index] / 2 }
    }
}
