package br.com.ada.pooii_bianca.aula03;

import java.util.List;

//Interface public declarada
//ela é Generic, pois pode trabalhar com QLQR tipo de Object
//T e U são os parâmetros genéricos aplicados
public interface RepositorioSomenteLeitura<T, U> {

    //aq é um Método de Interface q, sendo implementado, retorna uma List de Objects do tipo 'T'
    //método
    List<T> buscarTodos();

    T buscarPorId(U id);
}
