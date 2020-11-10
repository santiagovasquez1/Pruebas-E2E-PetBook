package co.com.devco.stepdefinitions;

import co.com.devco.tasks.BuscarVuelos;
import co.com.devco.tasks.FiltrarAnimales;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.ensure.Ensure;

import static co.com.devco.userinterfaces.PetBookHomePage.LISTA_ANIMALES_FILTRADOS;
import static co.com.devco.userinterfaces.TravelocityResultadosPage.LISTA_VUELOS_BUSCADOS;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class PetBookStepDefinitions {

    @Cuando("^(.*) ingresa a la pagina y busca animal por \"(.*)\" para filtrar los animales$")
    public void santiagoIngresaALaPaginaYHaceClickEnLosDiferentesBotonesParaFiltrarLosAnimales(String actorName,String tipoAnimal) {
        theActorCalled(actorName).attemptsTo(
                FiltrarAnimales.OnClick(tipoAnimal)
        );
    }

    @Entonces("^debe ver por lo un animal visible en la lista\\.$")
    public void debeVerPorLoUnAnimalVisibleEnLaLista() {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LISTA_ANIMALES_FILTRADOS).values().hasSizeGreaterThan(1)
        );
    }
}
