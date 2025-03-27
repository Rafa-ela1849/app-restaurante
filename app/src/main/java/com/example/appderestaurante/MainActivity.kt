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
            imgFood = R.drawable.img11,
            foodName = "Food Nome 1",
            foodDescription = "Bateu a fome? Vem saborear os melhores lanches! Pedido rápido e sabor garantido!",
            price = "$ 120.00"


        );
        foodList.add(food1)


            val food2 = Food(
                imgFood = R.drawable.img22,
                foodName = "Food Nome 2",
                foodDescription = "Bateu a fome? Vem saborear os melhores lanches! Pedido rápido e sabor garantido!",
                price = "$ 80,00"


            );
            foodList.add(food2)


            val food3 = Food(
                imgFood = R.drawable.img33,
                foodName = "Food Nome 3",
                foodDescription = "Bateu a fome? Vem saborear os melhores lanches! Pedido rápido e sabor garantido!",
                price = "$ 45,00"


            );
            foodList.add(food3)

        val food4 = Food(
            imgFood = R.drawable.img44,
            foodName = "Food Nome 4",
            foodDescription = "Bateu a fome? Vem saborear os melhores lanches! Pedido rápido e sabor garantido!",
            price = "$ 75,00"


        );
        foodList.add(food4)
    }
}