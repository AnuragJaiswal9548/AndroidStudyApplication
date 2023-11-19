package com.example.loginregisterfirebase

import android.app.DatePickerDialog
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Toast
import java.util.Calendar

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)


        val image1=findViewById<ImageView>(R.id.image1)
        val ed1 =findViewById<EditText>(R.id.ed1)
        val ed2 =findViewById<EditText>(R.id.ed2)
        val ed5 =findViewById<EditText>(R.id.ed2)
        ed5.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                if (!android.util.Patterns.EMAIL_ADDRESS.matcher(p0).matches())
                    ed5.setError("Invalid Email Add")
            }
            override fun afterTextChanged(p0: Editable?) {
            }
        })

        var c = Calendar.getInstance()
        val ed3 =findViewById<EditText>(R.id.ed3)
        ed3.setOnClickListener {

            DatePickerDialog(this, DatePickerDialog.OnDateSetListener { datePicker, i, i2, i3 ->
                val date= ed3.setText("$i3/${i2 + 1}/$i")
            }, c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH)).show()

        }


        val rdGroup = findViewById<RadioGroup>(R.id.radioGroup)
        //SubmitButton
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
         Toast.makeText(applicationContext,"Data is saved",Toast.LENGTH_SHORT).show()
        }


    }
}