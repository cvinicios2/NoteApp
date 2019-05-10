package br.com.fiap.noteapp.api

import br.com.fiap.noteapp.model.Nota
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface NotaAPI{

    @GET("/nota")
    fun getNotas():Call<List<Nota>>

    @POST("/nota")
    fun salvar(@Body nota:Nota): Call<Nota>
}