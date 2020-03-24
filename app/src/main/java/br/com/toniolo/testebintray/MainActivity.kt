package br.com.toniolo.testebintray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.toniolo.librarytestebintray.InitTest
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val init = InitTest()

        textView.text = init.getTest()
    }
}
