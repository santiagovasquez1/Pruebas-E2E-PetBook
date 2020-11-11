package co.com.devco.stepdefinitions;

import co.com.devco.tasks.DetalleAnimal;
import co.com.devco.tasks.FiltrarAnimales;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.PetBookHomePage.LISTA_ANIMALES_FILTRADOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PetBookStepDefinitions {

    @Cuando("^(.*) ingresa a la pagina y busca animal por \"(.*)\" para filtrar los animales$")
    public void santiagoIngresaALaPaginaYHaceClickEnLosDiferentesBotonesParaFiltrarLosAnimales(String actorName, String tipoAnimal) {
        theActorCalled(actorName).attemptsTo(
                FiltrarAnimales.OnClick(tipoAnimal)
        );
    }

    @Entonces("^debe ver por lo menos un animal visible en la lista\\.$")
    public void debeVerPorLoUnAnimalVisibleEnLaLista() {
        
        Object listaAnimales=Ensure.that(LISTA_ANIMALES_FILTRADOS).value();
        
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LISTA_ANIMALES_FILTRADOS).values().hasSizeGreaterThan(1)
        );
    }

    @Cuando("^(.*) ingrese a la pagina y quiere ver los detalles del  animal \"(.*)\" que le llama la atencion")
    public void santiago_ingrese_a_la_pagina_y_quiere_ver_los_detalles_del_animal_que_le_llama_la_atencion(String actorName,String id) {
        theActorCalled(actorName).attemptsTo(
                DetalleAnimal.GoTo(id)
        );
    }

//    @Entonces("debe retornar los detalles del {string} seleccionado por Santiago.")
//    public void debe_retornar_los_detalles_del_seleccionado_por_santiago(String string) {
//        // Write code here that turns the phrase above into concrete actions
////        throw new io.cucumber.java.PendingException();
//    }
}
