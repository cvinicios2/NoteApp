package br.com.fiap.noteapp.api

import br.com.fiap.noteapp.model.Nota
import retrofit2.Call
import retrofit2.http.GET

interface NotaAPI{

    @GET("/nota")
    fun getNotas():Call<List<Nota>>
}