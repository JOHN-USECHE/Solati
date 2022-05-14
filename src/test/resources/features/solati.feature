#Autor: John Useche
@stories
Feature: Registrar informacion

  @scenario1
    Scenario:Registro de john  en la pagina solati
    Given John quiere registrar sus datos en la pagina solati
    When El usuario ingresa los datos requeridos por el sistema
      | strCodigo | strNombres       | strLugarnacimiento | strFechanacimiento | strDireccion | strTelefono | strCargo | strEstado |
      | 12345     | JohnUsecheRondon | Florencia          | 20-05-2000         | carrera 92   | 3108156068  | Gerente  | Fijo      |
    Then El registro estara completo cuando vea el boton guardar datos.