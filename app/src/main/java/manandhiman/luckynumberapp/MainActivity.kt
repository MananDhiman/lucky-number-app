package manandhiman.luckynumberapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText: EditText = findViewById(R.id.editText)
        val button: Button = findViewById(R.id.button)

        button.setOnClickListener {
            val text = editText.text.toString()
            if(!isEditTextEmpty(text)) moveToSecondActivity(text)
        }
    }

    private fun moveToSecondActivity(name: String) {
        val intent: Intent = Intent(this, SecondActivity::class.java)
        intent.putExtra("name",name)
        startActivity(intent)
    }

    private fun isEditTextEmpty(text: String): Boolean {
        if(text == "") return true
        return false
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }
}