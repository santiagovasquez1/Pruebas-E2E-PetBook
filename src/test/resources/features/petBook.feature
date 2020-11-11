# language: es
Característica: Buscar animales en la aplicación PetBook
  Quiero ver el listado de animales y los animales en detalle

  Escenario: Visitar a PetBook para filtrar los animales por perro
    Cuando Santiago ingresa a la pagina y busca animal por "perro" para filtrar los animales
    Entonces debe ver por lo menos un animal visible en la lista.

  Escenario: Visitar a PetBook para filtrar los animales por gato
    Cuando Santiago ingresa a la pagina y busca animal por "gato" para filtrar los animales
    Entonces debe ver por lo menos un animal visible en la lista.

  Escenario: Visitar a PetBook para filtrar los animales por gato
    Cuando Santiago ingresa a la pagina y busca animal por "all" para filtrar los animales
    Entonces debe ver por lo menos un animal visible en la lista.

  Escenario: Visitar PetBook y ver los animales en detalle
    Cuando Santiago ingrese a la pagina y quiere ver los detalles del  animal "4" que le llama la atencion
#    Entonces debe retornar los detalles del "animal" seleccionado por Santiago.