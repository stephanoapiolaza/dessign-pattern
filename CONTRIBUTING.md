## Quieres contribuir con algun codigo?

Siempre estamos buscando contribuciones de calidad y estaremos encantados de aceptar sus Solicitudes de Pull siempre y
cuando se adhieran a algunas reglas basicas:

* Asegurese de que su contribucion encaja bien en el contexto del proyecto:
    * Estamos apuntando a una arquitectura orientada a micro-servicios, donde cada funcionalidad debe ser micro y atomica con respecto al sistema;
    * Se debe seguir las converguencias de calidad de sonarqube.
* Asegurese de que esta enviando un codigo de calidad, especificamente asegurese de que:
    * Los servicios web tiene pruebas acompannantes y todas las pruebas estan pasando correctamente.
    * Sus commits se ajustan a las convenciones establecidas
[aqui](https://github.com/stevemao/conventional-changelog-angular/blob/master/convention.md).
* Recuerde mantener los cambios en [CHANGELOG.md](CHANGELOG.md), siempre y cuando sea de tipo feat o fix.

**NOTA:**: Se ha modificado la convencion para adecuarla a la banca:
```
<project> - <type>(scope): title
```
* **project**: proyecto asociado por el cual se gatilla el commit
* **type**: ajustarse a [convencion](https://github.com/stevemao/conventional-changelog-angular/blob/master/convention.md)
* **(scope)**: contexto que ha sufrido el cambio
* **title**: debe ser conciso

**Ej:** <code>DP01 - chore(app): Se genera convencion del proyecto</code>, **se debe respetar espacios, guion y dos puntos, sino el commit sera rechazado por el hooks configurado**

### Test

Las pruebas unitarias deben ser escritas con la siguiente nomenclatura (**recordar un assert por test y hacer pruebas mediante mocks, evitar si es posible el uso de @Autowired**) :
```
public class NombreClaseTest
```

Donde **NombreClase** es la clase evaluar y este debe estar contenido al mismo nivel de paquete en la carpeta **test**. Por otro lado, la convencion de los nombres de los metodos debe ser:
```
@Test
public void nombreMetodo_accion_modificador
```

* **nombreMetodo**: Este debe escribirse igual al metodo a evaluar.
* **accion**: Utilizar estandar **isValueRight**, **isNotNull**, etc.. donde es la accion que se espera que haga el test.
* **modificador**: Si la accion necesita un nombre secundario este es el elemento para hacerlo, evita duplicidad de nombre en los metodos.

Cualquier sugerencia, pueden hacerla al Equipo de @Evaluacion de Credito, Scotiabank 2017.


