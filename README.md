# Invernadero


Documentacion

¿Qué es un Ivernadero?

Un invernadero tiene varias funciones pero entre ellas esta la de protección de las plantas de factores adversos a su desarrollo. Algunos de estos factores son altas y bajas temperaturas, lluvias y vientos fuertes, granizadas e inclusive heladas. Sin embargo, dada su característica de ser una estructura cerrada, también pueden mantenerse las plagas a raya.


¿Qué se puede encontrar en nuestro invernadero?

En nuestro invernadero encontramos plantas clasificadas por el metodo tradicional:

Primero las Algas, éstas son organismos con capacidad de realizar la fotosíntesis oxigénica y obtener el carbono orgánico con la energía de la luz del Sol, estas se dividen en dos:

- Algas Rojas: Se caracterizan por su inmovilidad debido a la carencia o pérdida evolutiva de flagelos en todas las etapas de su ciclo vital.

- Algas Verdes: Se caracterizan por ser muchas no unicelulares, frecuentemente flageladas, pero otras desarrollan formas pluricelulares que nunca son muy complejas.

Luego tenemos las Plantas Terrestres, estas se dividen en 3 grupos:

- La Bryophyta: Su principal caracteristica es que son No Vasculares y pueden tener o no semilla.

- La Pteridophyta: Su principal caracteristica es que son Vasculares y no poseen semilla.

- La Spermatophyta: Su principal caracteristica es que son Vasculares y poseen semilla.

Las Sprematophyta por sus caracteristicas, se dividen en mas grupos donde se diferencian por el tipo de semilla que producen, se dividen en:

- Gimnospermas: No tiene frutos y su semillas estan expuestas. Ej: Cipreses, Araucaria y Tsuga.

- Angiospermae: Contiene frutos y su semillas se encuentran envasadas en ellas. Ej: Orquidea, Lirios, Margaritas.


¿Como agregar plantas en el invernadero creado?


Para agregar una planta al invernadero lo que tenemos que hacer es:

1ro Crear el objeto:

        Angiospermas Rosa = new Angiospermas("Rosa", 2);

2do Luego colocar la información deseada en cada atributo correspondiente a la planta:

        Rosa.setFamily("Rosaceae");
        Rosa.setGenus("Blanda");
        Rosa.setOrder("Rosales");

3ro A continuación debemos añadir a la lista Array el objeto que acabamos de crear:


        ArrayList<Planta> Plantas = new ArrayList<>();
        Plantas.add(Rosa);
      

4to Repetimos el paso los tres pasos anteriores con todas las plantas que se quieran agregar:

        Gimnospermas Cipres = new Gimnospermas("Cipres", "Pinales", "Cipreses","Cedro", 1);
        Plantas.add(Cipres);

5to paso, mostrar los resultados

        mostrarPlantas();

Cuyo resultado sera :
            
        Tienes todas estas plantas en el hibernadero:
        -----------------------------
        Nombre:Rosa
        Familia:Rosaceae
        Genero:Blanda
        Orden:Rosales
        Cantidad:2
        -----------------------------
        Nombre:Cipres
        Familia:Cipreses
        Genero:Cedro
        Orden:Pinales
        Cantidad:1
        -----------------------------
