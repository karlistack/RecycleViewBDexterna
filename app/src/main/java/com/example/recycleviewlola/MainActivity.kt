package com.example.recycleviewlola
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONArray
import org.json.JSONObject

class MainActivity : AppCompatActivity() {
    lateinit var miRecycleView : RecyclerView
    private val miAdaptador : RecyclerAdapter = RecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        conectarJson()
    }


    fun conectarJson(){  // conecta con una url y devuelve su contenido
        val url="http://iesayala.ddns.net/mariadolores/Bicicletas.php"
        val queue=Volley.newRequestQueue(this)
        val stringRequest=StringRequest(Request.Method.GET, url, Response.Listener { response ->
            //conectó correctamente
            val jsonArray = JSONArray(response)
            for (i in 0 until jsonArray.length()) {
                val jsonObject = JSONObject(jsonArray.getString(i))
                val marca = jsonObject.get("marca")
                val modelo = jsonObject.get("modelo")
                resultado.text = resultado.text.toString() + marca + " " + modelo + "\n"
            }


        }, Response.ErrorListener {
            Toast.makeText("ERROR", Toast.LENGTH_SHORT).show().text
        })

        queue.add(stringRequest)







    }