package co.com.devco.questions;

import co.com.devco.userinterfaces.PetBookHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.annotations.Subject;
import net.serenitybdd.screenplay.questions.Attribute;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.targets.TargetAttributes;

import java.util.List;

import static co.com.devco.userinterfaces.PetBookHomePage.LISTA_ANIMALES_FILTRADOS;

@Subject("Muestra los animales de la lista")
public class DisplayAnimalsByList implements Question<List<String>> {

    @Override
    public List<String> answeredBy(Actor actor) {

        List<String> textValues = Attribute.of(LISTA_ANIMALES_FILTRADOS)
                .named("innerText")
                .viewedBy(actor)
                .asList();

        return textValues;
//        return textValues.stream()
//                .map( value -> renderElement.apply(value))
//                .collect(Collectors.toList());
    }
}
