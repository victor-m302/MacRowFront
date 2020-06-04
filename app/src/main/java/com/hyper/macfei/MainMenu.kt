package com.hyper.macfei


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainMenu : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_menu)


        val listView = findViewById<ListView>(R.id.listView)

        val custom_list_data = ArrayList<CList>()

        val custom_list = CListAdapter(this,custom_list_data)


        val titulos = arrayOf(
            "Pedidos",
            "Painel",
            "Prato",
            "Pagto",
            "Config",
            "Aval")

        //(bg , icon, text)

        custom_list_data.add(CList( R.drawable.burguer,R.drawable.ic_icon_pedidos ,"Pedidos"))

        custom_list_data.add(CList( R.drawable.display,R.drawable.ic_icon_painel ,"Painel"))

        custom_list_data.add(CList( R.drawable.prato,R.drawable.ic_icon_gluten ,"Prato Personalizado"))

        custom_list_data.add(CList( R.drawable.payment,R.drawable.ic_icon_pagto ,"Forma de Pagamento"))

        custom_list_data.add(CList( R.drawable.setting,R.drawable.ic_icon_config ,"Configurações"))

        custom_list_data.add(CList( R.drawable.rating,R.drawable.ic_icon_rating ,"Avaliar"))

        listView.adapter = custom_list

        listView.onItemClickListener =
            AdapterView.OnItemClickListener { parent, view, position, id ->

                Toast.makeText(this@MainMenu, " Ir para ${titulos[id.toInt()]}", Toast.LENGTH_SHORT).show()
                if (id.toInt() == 0) {//se id= 0 vai pra comp
                    startActivity(Intent(this, Pedidos::class.java))
                }
                else if (id.toInt() == 1) {//se id= 0 vai pra mapa
                    startActivity(Intent(this, Painel::class.java))
                }

                else if (id.toInt() == 2) {//se id= 0 vai pra chipset
                    startActivity(Intent(this, Prato::class.java))
                }

                else if (id.toInt() == 3) {//se id= 0 vai pra apps
                    startActivity(Intent(this, Pagto::class.java))
                }

                else if (id.toInt() == 4) {//se id= 0 vai pra Servidores
                    startActivity(Intent(this, Config::class.java))
                }

                else if (id.toInt() == 5) {//se id= 0 vai para Energia
                    startActivity(Intent(this, Aval::class.java))
                }

            }

    }
}
