package co.com.devco.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

//Aqui se hacen los mampeos de la pagina web
public class PetBookHomePage {
    public static final String PETBOOK_HOME_PAGE = "http://localhost:4200/";

    // /html/body/app-root/div/app-imagegallery/div/div[2]/div[3]/button
    public static final Target TAP_PERROS = Target.the("Boton de filtrar solo perros").located(By.xpath("//button[@id='ButtonDog']"));
    public static final Target TAP_GATOS = Target.the("Boton de filtrar solo gatos").located(By.xpath("//button[@id='ButtonCat']"));
    public static final Target TAP_ALL = Target.the("Boton para mostrar todos los animales").located(By.xpath("//button[@id='ButtonAll']"));
    public static final Target LISTA_ANIMALES_FILTRADOS = Target.the("Lista de animales filtrados").located(By.xpath("//ul[@id='ListaDeAnimales']/li"));

//    //*[@id="ListaDeAnimales"]/li[1]/a
//    //*[@id="ListaDeAnimales"]/li[3]/a
//    public static final Target DETALLE_ANIMAL = Target.the("Lista de animales filtrados").located(By.xpath("//*[@id=\"ListaDeAnimales\"]/li[1]/a"));


    public static Target GET_DETALLE_ANIMAL(String id) {

        String cadenaBusqueda = "//*[@id=\"ListaDeAnimales\"]/li[" + id + "]/a";
        return Target.the("Lista de animales filtrados").located(By.xpath(cadenaBusqueda));
    }
}