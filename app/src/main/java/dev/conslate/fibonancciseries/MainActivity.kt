package dev.conslate.fibonancciseries

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import dev.conslate.fibonancciseries.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        fibonacci()

    }

    fun fibonacci() {
        var firstNumber = 0
        var secondNumber = 1
        var numbers = mutableListOf<Int>()

        for (i in 1..100) {
            numbers.add(firstNumber)
            val sum = firstNumber + secondNumber
            firstNumber = secondNumber
            secondNumber = sum
        }
        var numberAdapter = NumberRecyclerViewAdapter(numbers)
        binding.rvNumber.layoutManager = LinearLayoutManager(this)
        binding.rvNumber.adapter = numberAdapter
    }
}
