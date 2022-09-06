package com.technipixl.eval2p2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.technipixl.eval2p2.databinding.CustomRowBinding

class ProductAdapter(val product: List<Product>): RecyclerView.Adapter<ProductAdapter.ProductHolder>() {

    class ProductHolder(var binding: CustomRowBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(product: Product) {
            binding.cellulTitle.text = product.name
            binding.cellulQuantit.text = product.quantité
            binding.logoImageView.setImageResource(product.image)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductHolder {
        val binding = CustomRowBinding.inflate(LayoutInflater.from(parent.context),parent, false)
        return ProductHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductHolder, position: Int) {
        val product = product[position]
        holder.bind(product)
    }

    override fun getItemCount(): Int {
        return product.size
    }
}