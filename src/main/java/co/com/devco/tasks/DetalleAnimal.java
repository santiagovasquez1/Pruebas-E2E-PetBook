package co.com.devco.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.devco.userinterfaces.PetBookHomePage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DetalleAnimal implements Task {

    private String idAnimal;

    public DetalleAnimal(String idAnimal) {
        this.idAnimal = idAnimal;
    }

    public static Performable GoTo(String idAnimal) {
        return instrumented(DetalleAnimal.class, idAnimal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.url(PETBOOK_HOME_PAGE),
                Click.on(GET_DETALLE_ANIMAL(idAnimal))
        );
    }
}
