package com.example.appderestaurante.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.appderestaurante.databinding.FoodItemBinding
import com.example.appderestaurante.model.Food

class FoodAdapter(private val context: Context, private val foodList: MutableList<Food>):
    RecyclerView.Adapter<FoodAdapter.FoodViewHolder>() {

//criar o item de lista para exibir
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
       val listItem : FoodItemBinding = FoodItemBinding.inflate(LayoutInflater.from(context),parent,false)
    return FoodViewHolder(listItem)

    }
     // Quantidade de intems da lista
    override fun getItemCount() = foodList.size

    //Exibir o item de lista (Visualização)
    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
       holder.imgFood.setBackgroundResource(foodList[position].imgFood!!)
        holder.txtFoodName.text = foodList[position].foodName
        holder.txtFoodDescription.text = foodList[position].foodDescription
        holder.txtPrice.text = foodList[position].price
    }

    inner class FoodViewHolder(binding: FoodItemBinding): RecyclerView.ViewHolder(binding.root) {
        val imgFood = binding.imgFood
        val txtFoodName = binding.txtFoodName
        val txtFoodDescription = binding.txtFoodDescription
        val txtPrice = binding.txtPrice

    }
}