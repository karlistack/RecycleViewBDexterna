package com.example.recycleviewlola
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

 class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {
    var listaBicicletas: MutableList<Bicicleta>  = ArrayList()
    lateinit var contexto:Context

    fun RecyclerAdapter(listaBicicletas : MutableList<Bicicleta>, contexto: Context){
        this.listaBicicletas = listaBicicletas
        this.contexto = contexto
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = listaBicicletas.get(position)
        holder.bind(item, contexto)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.lista_bicicletas, parent, false))
    }
    override fun getItemCount(): Int {
        return listaBicicletas.size
    }
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nombre = view.findViewById(R.id.nombre) as TextView
        val marca = view.findViewById(R.id.Marca) as TextView
        val precio = view.findViewById(R.id.precio) as TextView
        val imagen = view.findViewById(R.id.Imagen) as ImageView
        val año =  view.findViewById(R.id.precio) as TextView
        fun bind(bicicleta: Bicicleta, context: Context){
            nombre.text = bicicleta.modelo
            marca.text = bicicleta.empresa
            año.text = bicicleta.año.toString()
            precio.text = bicicleta.precio.toString()
            imagen.loadUrl(bicicleta.imagen)
            itemView.setOnClickListener(View.OnClickListener { Toast.makeText(context, bicicleta.modelo, Toast.LENGTH_SHORT).show() })
        }
        fun ImageView.loadUrl(url: String) {
            Picasso.with(context).load(url).into(this)
        }
    }
















}