package manandhiman.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val header: TextView = findViewById(R.id.textView)
        val luckyNumberTextView: TextView = findViewById(R.id.textViewLuckyNumber)
        val shareButton: Button = findViewById(R.id.button)

        val luckyNumber: Int = (0..500).random()
        val name: String = intent.getStringExtra("name")!!
        header.text = "Hi $name, your lucky number is: "

        luckyNumberTextView.text = luckyNumber.toString()

        shareButton.setOnClickListener {
            shareLuckyNumber(name, luckyNumber)
        }
    }

    private fun shareLuckyNumber(name: String, luckyNumber: Int) {
        val intent = Intent(Intent.ACTION_SEND)
        intent.type = "text/plain"
        intent.putExtra(Intent.EXTRA_SUBJECT, "$name is lucky today")
        intent.putExtra(Intent.EXTRA_TEXT, "Their lucky number is ${luckyNumber.toString()}")
        startActivity(intent)
    }
}