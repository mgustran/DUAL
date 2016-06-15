##DOCUMENTACIÓN PROYECTO D3
###DIAGRAMA EN ARBOL

En el proyecto D3 que he realizado es un **diagrama interactivo de tipo árbol**.

Se puede apreciar que el diagrama muestra un despliegue de los módulos de la FP Dual, en este caso, las asignaturas del módulo que estamos cursando.

Los **Datos Utilizados** serian:

![](https://raw.githubusercontent.com/mgustran/DUAL/master/JavaScript/D3Project/images/indicador.png)


+ Nombre de la Asignatura 

+ Nota     -en Etiqueta ToolTip

+ Aprobado/Suspenso      -en el Color del círculo del Nodo 
  * Verde    → Aprobado            (**  +5  **)
  * Naranja → Suspenso leve    (**  [4-5]  **)
  * Rojo      → Suspenso grave (**  [0-4]  **)

+ Hijos   -Si tiene hijos no desplegados se rellena el nodo de verde claro.

<br>
####Más Información acerca del funcionamiento de la gráfica

El Diagrama en árbol es de **tipo jerárquico** y por ello muestra un padre que tendrá más hijos, que a su vez podrán tener más hijos y asi consecutivamente. Los puntos de bifurcación (que a su vez son los hijos de algún elemento) se llaman **nodos**, node en inglés y es relevante saber esto ya que las funciones que incluye la librería d3.js tienen nombres bastante intuitivos.

Otro detalle de la gráfica son los **links**, que son las líneas que apuntan a los nodos y que le dan un sentido a la información que se muestra en la gráfica.

Esta gráfica puede consumir los datos en un archivo **JSON** o en un diccionario JavaScript, pero como viene a ser bastante engorroso meter tantas líneas en un mismo archivo lo he pasado por JSON y D3 tiene una función que consume el json y me permite ir sacando datos a medida que los necesito.

En el principio del documento script.js hay tres variables que son clave en esta gráfica:
**Árbol**, que saca el modelo jerárquico D3 y lo guarda.
**Diagonal**, que guarda la información sobre el despliegue de los nodos, para que los nodos se desplieguen en árbol, y no desperdigados.
**Vis**, que será el objeto SVG.

En el enlace hay un ejemplo que viene por defecto en D3  que usa el archivo **flare.json**, bueno, pues yo me serví de ese ejemplo para saber cómo estructurar el archivo y fue cuando me di cuenta de lo sencillo que era ( el JSON ).
Me hubiese gustado usar mas CSS, pero eso le hubiese quitado interactividad.

La Documentación completa de la estructura en árbol que proporciona la librería D3 se encuentra en GitHub [en este enlace.](https://github.com/d3/d3/wiki/Tree-Layout)
Y tambien miré en  el [GitHub de Mike Bostock](https://github.com/mbostock)


                                             
