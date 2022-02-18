package com.example.fuckinator.choicescreen

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.fuckinator.GameCharacter

class ChoiceViewModel: ViewModel() {

    private var questionData = arrayOf<String> ("האם הדמות שך סחית?", "האם הדמות שלך גרה מחוץ לבאר שבע?", "שיער שופע?", "גיי?", "חתיך?", "מצחיק?", "אפס?", "חבר של ליחי סוויסו?")

<<<<<<< HEAD
    private var GameCharacterList = mutableListOf<GameCharacter>()
=======
    private var curQuestion = MutableLiveData<String>()

    private var characterList = mutableListOf<Character>()
>>>>>>> 0ac7a27cca9800ecc18cbe56770f159ba2eeb44f



    init {
        
        val lihay = GameCharacter("Lihay", arrayOf<Boolean>(false, false, true, true, true, true, true, false))
        val david =  GameCharacter("David Plepler", arrayOf<Boolean>(true, true, true, false, true, true, false, true))
        val gal = GameCharacter("Gal", arrayOf<Boolean>(true, true, true, true, true, true, false, true))
        val david2 = GameCharacter("David Moscovich", arrayOf<Boolean>(false, false, false, false, true, false, false, false))
        val or = GameCharacter("Or", arrayOf<Boolean>(false, false, false, false, false, true, false, false))
        val noa = GameCharacter("Noa", arrayOf<Boolean>(true, false, true, false, true, false, false, true))
        val nehoray = GameCharacter("Nehoray", arrayOf<Boolean>(true, false, false, true, false, true, false, true))
        val amit = GameCharacter("Amit", arrayOf<Boolean>(true, false, false, false, false, false, false, false))
        val itai = GameCharacter("Itai", arrayOf<Boolean>(false, true, false, true, true, true, true, false))
        val beckman = GameCharacter("Beckman", arrayOf<Boolean>(false, true, false, false, false, true, true, false))
        val yahav = GameCharacter("Yahav", arrayOf<Boolean>(false, true, false, false, true, true, false, false))


    }

}