package br.senai.sp.jandira.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.adapter.PontosTuristicosAdapter
import br.senai.sp.jandira.turismo.dao.PontosTuristicosDao
import br.senai.sp.jandira.turismo.model.PontoTuristico

class MainActivity : AppCompatActivity() {

    lateinit var rvPontosTuristicos: RecyclerView
    lateinit var adapterPontosTuristicos: PontosTuristicosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //criar uma instância do RecyclerView
        rvPontosTuristicos = findViewById(R.id.rv_pontos_turisticos)

        //determinar o layout da RecyclerView
        rvPontosTuristicos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        //criar uma instância do adapter
        adapterPontosTuristicos = PontosTuristicosAdapter(this)
        adapterPontosTuristicos.updatePontosTuristicosList(PontosTuristicosDao.getPontosTuristicos(this))

        //ligar o adapter na RecyclerView
        rvPontosTuristicos.adapter = adapterPontosTuristicos

    }
}