package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetBookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class FiltrarAnimales implements Task {

    private String tipoAnimal;

    public FiltrarAnimales(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public static Performable OnClick(String tipoAnimal) {
        return instrumented(FiltrarAnimales.class, tipoAnimal);
    }


    @Override
    public <T extends Actor> void performAs(T actor) {

        Performable action = null;

        if (tipoAnimal.equals("perro")) {
            action = Click.on(TAP_PERROS);
        }
        else if(tipoAnimal.equals("gato")){
            action=Click.on(TAP_GATOS);
        }
        else{
            action=Click.on(TAP_ALL);
        }


        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                action
//                Click.on(TAP_ALL)
                //Wait.until()
        );
    }
}
