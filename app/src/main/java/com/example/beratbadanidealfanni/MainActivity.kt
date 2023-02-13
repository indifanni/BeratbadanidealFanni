package com.example.beratbadanidealfanni

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var nama: EditText
    private lateinit var tinggi:EditText
    private lateinit var rlaki: RadioButton
    private lateinit var rperempuan: RadioButton
    private lateinit var btntampil: Button
    private lateinit var hasil: TextView

    private var tb: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        nama = findViewById(R.id.nama)
        tinggi = findViewById(R.id.tinggibadan)
        rlaki = findViewById(R.id.rlaki)
        rperempuan = findViewById(R.id.rperempuan)
        btntampil = findViewById(R.id.tampil)
        hasil = findViewById(R.id.hasil)

        btntampil.setOnClickListener {
            var tinggi = tb.toString().toInt()

            if (rlaki.isChecked) {
                tb = (tinggi-100)-((tinggi - 100)*10/100)
                hasil.setText(tb.toString() + "kg")
            } else {
                tb = (tinggi-100)-((tinggi - 100)*15/100)
                hasil.setText(tb.toString() + "kg")
            }
        }
    }
}