package com.example.appderestaurante

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.appderestaurante.adapter.FoodAdapter
import com.example.appderestaurante.databinding.ActivityMainBinding
import com.example.appderestaurante.model.Food

class MainActivity : AppCompatActivity() {

    private  lateinit var binding: ActivityMainBinding
    private lateinit var foodAdapter: FoodAdapter
    private val foodList: MutableList<Food> = mutableListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        enableEdgeToEdge()
        setContentView(binding.root)

        val recyclerViewFood = binding.RecyclerViewFood
        recyclerViewFood.layoutManager = LinearLayoutManager(this)
        recyclerViewFood.setHasFixedSize(true)
        foodAdapter = FoodAdapter(this,foodList)
        recyclerViewFood.adapter = foodAdapter
        getFood()

    }
    private fun getFood(){

        val food1 = Food(
            imgFood = R.drawable.imagem1,
            foodName = "Food Nome 1",
            foodDescription = "",
            price = "$ 120.00"


        );
        foodList.add(food1)


            val food2 = Food(
                imgFood = R.drawable.imagem2,
                foodName = "Food Nome 2",
                foodDescription = "",
                price = "$ 80,00"


            );
            foodList.add(food1)


            val food3 = Food(
                imgFood = R.drawable.imagen3,
                foodName = "Food Nome 3",
                foodDescription = "",
                price = "$ 45,00"


            );
            foodList.add(food1)
    }
}