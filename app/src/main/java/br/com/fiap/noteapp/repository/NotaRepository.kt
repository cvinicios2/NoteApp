package br.com.fiap.noteapp.repository

import br.com.fiap.noteapp.api.getNotaAPI
import br.com.fiap.noteapp.model.Nota
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NotaRepository{


    fun getNotas(

            onResponse: (List<Nota>?) -> Unit,
            onError: (Throwable?) -> Unit
    ){

        getNotaAPI().getNotas().enqueue(object : Callback<List<Nota>>{
            override fun onFailure(call: Call<List<Nota>>?, t: Throwable?) {
                onError(t)
            }

            override fun onResponse(call: Call<List<Nota>>?, response: Response<List<Nota>>?) {
                if(response?.isSuccessful==true){
                    onResponse(response.body())
                }else{
                    onError(Throwable("Erro ao buscar os dados"))
                }
            }
        })
    }

    fun salvarNotas(

            onResponse: (List<Nota>?) -> Unit,
            onError: (Throwable?) -> Unit
    ){

        getNotaAPI().getNotas().enqueue(object : Callback<List<Nota>>{
            override fun onFailure(call: Call<List<Nota>>?, t: Throwable?) {
                onError(t)
            }

            override fun onResponse(call: Call<List<Nota>>?, response: Response<List<Nota>>?) {
                if(response?.isSuccessful==true){
                    onResponse(response.body())
                }else{
                    onError(Throwable("Erro ao buscar os dados"))
                }
            }
        })
    }

}