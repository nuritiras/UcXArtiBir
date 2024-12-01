package tr.com.nuritiras.ucxartibir

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun onClickBasla(view: View) {
        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val editTextTextMultiLine = findViewById<EditText>(R.id.editTextTextMultiLine)
        var sayi = editTextNumber.text.toString().toInt()
        editTextTextMultiLine.setText("")
        while (sayi!=1) {
            if (sayi % 2 == 0) {
                sayi /= 2
                editTextTextMultiLine.append("$sayi\n")
            } else {
                sayi = 3 * sayi + 1
                editTextTextMultiLine.append("$sayi\n")
            }
        }
    }

}