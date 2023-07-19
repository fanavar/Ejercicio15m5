package cl.awakelab.ejercicio15m5

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import cl.awakelab.ejercicio15m5.databinding.ItemLayoutBinding

class Adapter : RecyclerView.Adapter <Adapter.ViewHolder> (){
    val pokemones = mutableListOf<Pokemon>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       var binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent,  false)
       return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return pokemones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    class ViewHolder(binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root) {

    }
}