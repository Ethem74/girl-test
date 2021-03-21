package io.adev.proforientation

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Какая верстка будет использоваться в данном коде, то что в скобках хратися ссылка на этот xml код)
        setContentView(R.layout.main_activity)

        toQuestion()

        val answer1: Button = findViewById(R.id.answer1)
        // у answer1 вызываем функцию setOnClickListener
        answer1.setOnClickListener {
            toQuestion()
        }

        val answer2: Button = findViewById(R.id.answer1)
        // у answer1 вызываем функцию setOnClickListener
        answer2.setOnClickListener {
            toQuestion()
        }

        val answer3: Button = findViewById(R.id.answer1)
        // у answer1 вызываем функцию setOnClickListener
        answer3.setOnClickListener {
            toQuestion()
        }
    }

    fun toQuestion() {
        supportFragmentManager
                // Объеденить несколько действий в одно действие
                .beginTransaction()
                // заменяет содержимое fragmenContainer на QuestionFragment
                .replace(R.id.fragmentContainer, QuestionFragment())
                // выполняет
                .commit()
    }
}

