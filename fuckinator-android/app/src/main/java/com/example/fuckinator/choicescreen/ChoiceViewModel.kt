package com.example.fuckinator.choicescreen

import androidx.lifecycle.ViewModel

class ChoiceViewModel: ViewModel() {

    private var questionData = arrayOf<String> ("האם הדמות שך סחית?", "האם הדמות שלך גרה מחוץ לבאר שבע?", "שיער שופע?", "גיי?", "חתיך?", "מצחיק?", "אפס?", "חבר של ליחי סוויסו?")

    private var characterList = mutableListOf<Character>()

    init{
        
    }

}