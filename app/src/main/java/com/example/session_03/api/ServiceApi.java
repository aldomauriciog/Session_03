package com.example.session_03.api;

import com.example.session_03.entity.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceApi {

    @GET("users")
    public abstract Call<List<User>> listaUsuario();
}
