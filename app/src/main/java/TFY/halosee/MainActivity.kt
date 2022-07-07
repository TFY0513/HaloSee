package TFY.halosee

import android.opengl.Visibility
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    //Module level

    //fun=function
    override fun onCreate(savedInstanceState: Bundle?) {
        //Local level
        super.onCreate(savedInstanceState)

        //Display UI
        //R = resources (res folder)
        setContentView(R.layout.activity_main)

        //Declare variable to link program and UI
        //val = value(will not change value), var = variable

        //Method 1
        val textViewMessage = findViewById<TextView>(R.id.textViewMessage)

        //Method 2
        //val textViewMessage2 : TextView = findViewById(R.id.textViewMessage)

        val buttonShowMessage: Button = findViewById(R.id.buttonShowMessage)
        val imageViewQR : ImageView = findViewById(R.id.imageViewQR)

        //press button then show message
        buttonShowMessage.setOnClickListener{
            //Method 1

            //textViewMessage.text = "Halo"

            //Method 2
            // textViewMessage.text = getString(R.string.greeting)

            //Method 3
            textViewMessage.text = String.format("%s", getString(R.string.greeting))

            imageViewQR.visibility = View.VISIBLE
        }
    }
}