package co.com.proyectosolati.tasks;

import co.com.proyectosolati.model.SoliData;
import co.com.proyectosolati.userinterface.Solatiaddpage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;
import static co.com.proyectosolati.userinterface.Solatiaddpage.*;

public class Solatiadd implements Task {

    private List<SoliData> data;

    public Solatiadd(List<SoliData> data) {
        this.data = data;
    }

    public static Solatiadd thePage(List<SoliData> data) {
        return  Tasks.instrumented(Solatiadd.class, data);

    }

    @Override
    public <T extends Actor> void performAs (T actor){
        actor.attemptsTo(Enter.theValue(data.get(0).getStrCodigo()).into(SCODIGO),
                Enter.theValue(data.get(0).getStrNombres()).into(SNOMBRES),
                Enter.theValue(data.get(0).getStrLugarnacimiento()).into(SLUGARNACIMIENTO),
                SelectFromOptions.byVisibleText(data.get(0).getStrFechanacimiento()).from(SFECHANACIMIENTO),
               Enter.theValue(data.get(0).getStrDireccion()).into(SDIRECCION),
              Enter.theValue(data.get(0).getStrTelefono()).into(STELEFONO ),
               Enter.theValue(data.get(0).getStrCargo()).into(SCARGO),
               SelectFromOptions.byVisibleText(data.get(0).getStrEstado()).from(SESTADO),
              Click.on(GUARDARDATOS)


        );
    }
}

