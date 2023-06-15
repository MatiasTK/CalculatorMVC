# CalculatorMVC

_Este proyecto fue realizado a modo de ejemplo para mostrar el funcionamiento del popular modelo MVC(Modelo-Vista-Controlador)._
El ejercicio consiste en crear una calculadora básica con interfaz gráfica de usuario que permita realizar operaciones aritméticas simples.

## MVC

El patrón MVC (Modelo, Vista, Controlador), es un patrón de arquitectura de software que separa los datos de una aplicación, la interfaz que ve el usuario de la lógica del negocio en tres componentes distintos. Es más frecuente en aplicaciones Web que en aplicaciones de escritorio, sin embargo, es aplicable también a este, sin ningún problema.

## Porque usar MVC

La ventaja más grande a la hora de usar el patron MVC es la separación de preocupaciones (separation of concerns), dividiendo asi el código frontend y backend en componentes separados y logrando una administración más sencilla para hacer cambios a cualquiera de los lados sin que interfieran entre sí, de esta manera logramos que la aplicación sea más escalable, mantenible y fácil de expandir.

## Model 

Es donde está la lógica del negocio, la representación de todo el sistema incluido la interacción con una base de datos en caso de ser necesaria.

## View

Representa la interfaz de usuario y todas las herramientas con las cuales el usuario hace uso del programa.

## Controller

Este componente se encarga de responder a la interacción (eventos) que hace el usuario en la interfaz y realiza las peticiones al modelo para pasar a estos a la vista. Es un intermediario el cual se encarga de que el view llame al model

