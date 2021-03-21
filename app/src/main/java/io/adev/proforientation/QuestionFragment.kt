package io.adev.proforientation

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment

class QuestionFragment : Fragment(R.layout.question_fragment){
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val answer1: Button = view.findViewById(R.id.answer1)
        // у answer1 вызываем функцию setOnClickListener
        answer1.setOnClickListener {
            toQuestion()
        }

        val answer2: Button = view.findViewById(R.id.answer1)
        // у answer1 вызываем функцию setOnClickListener
        answer2.setOnClickListener {
            toQuestion()
        }

        val answer3: Button = view.findViewById(R.id.answer1)
        // у answer1 вызываем функцию setOnClickListener
        answer3.setOnClickListener {
            toQuestion()
        }

    }
    fun toQuestion() {
        requireActivity().supportFragmentManager
                // Объеденить несколько действий в одно действие
                .beginTransaction()
                // заменяет содержимое fragmenContainer на QuestionFragment
                .replace(R.id.fragmentContainer, QuestionFragment())
                // выполняет
                .commit()
    }
}