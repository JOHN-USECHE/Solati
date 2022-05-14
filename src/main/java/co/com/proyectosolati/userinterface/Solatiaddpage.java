package co.com.proyectosolati.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Solatiaddpage {

    public static final Target SCODIGO = Target.the("Diligenciar  codigo")
            .located(By.xpath("/html/body/div/div/form/div[1]/div"));

    public static final Target SNOMBRES = Target.the("Diligenciar  nombres")
            .located(By.xpath("/html/body/div/div/form/div[2]/div/input"));

    public static final Target SLUGARNACIMIENTO =  Target.the("Diligenciar  lugarnacimiento")
            .located(By.xpath("/html/body/div/div/form/div[3]/div"));

   public static final Target SFECHANACIMIENTO =  Target.the("Selecioanr  fecha nacimiento")
            .located(By.xpath("/html/body/div/div/form/div[4]/div/input"));

    public static final Target SDIRECCION =  Target.the("Diligenciar  Direccion")
            .located(By.xpath("/html/body/div/div/form/div[5]/div/textarea"));

   public static final Target STELEFONO =  Target.the("Diligenciar  Telefono")
           .located(By.xpath("/html/body/div/div/form/div[5]/div/textarea"));

    public static final Target SCARGO =  Target.the("Diligenciar Cargo")
           .located(By.xpath("/html/body/div/div/form/div[8]/div/select"));

    public static final Target SESTADO =  Target.the("Seleccioanr estado")
           .located(By.xpath("/html/body/div/div/form/div[8]/div/select"));

    public static final Target GUARDARDATOS =  Target.the("Clic botton Guardardatos")
           .located(By.xpath("//a[@class='btn btn-sm btn-primary']"));

}
