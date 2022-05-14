package co.com.proyectosolati.tasks;

import co.com.proyectosolati.userinterface.SolatiOpenPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenSo implements Task {

        SolatiOpenPage solatiOpenPage;

    public static OpenSo thepage() {
        return Tasks.instrumented(OpenSo.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {actor.attemptsTo(net.serenitybdd.screenplay.actions.Open.browserOn(solatiOpenPage));
    }
}
