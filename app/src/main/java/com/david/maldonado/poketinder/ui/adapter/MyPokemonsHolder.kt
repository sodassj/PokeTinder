package com.david.maldonado.poketinder.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.david.maldonado.poketinder.data.database.entities.MyPokemonEntity
import com.david.maldonado.poketinder.databinding.ItemPokemonSavedBinding

class MyPokemonsHolder(view: View): RecyclerView.ViewHolder(view) {

    private val binding = ItemPokemonSavedBinding.bind(view)

    fun bind(pokemon: MyPokemonEntity) {
        binding.tvName.text = pokemon.name
        binding.tvType.text = if (pokemon.isLegendary) "Legendary" else "Normal"
        binding.tvIndex.text = formatNumberTo3Digits(pokemon.idPokemon.toInt())
        Glide
            .with(itemView)
            .load(pokemon.image)
            .into(binding.ivPokemonLogo)
    }

    fun formatNumberTo3Digits(number: Int): String = "#${"%03d".format(number)}"
}
