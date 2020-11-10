# language: es
Característica: Buscar animales en la aplicación PetBook
  Quiero ver el listado de animales
  filtrandolos por categorias.

  Escenario: Visita a PetBook para ver los animales
    Cuando Santiago ingresa a la pagina y busca animal por "perro" para filtrar los animales
    Cuando Santiago ingresa a la pagina y busca animal por "gato" para filtrar los animales
    Cuando Santiago ingresa a la pagina y busca animal por "all" para filtrar los animales
    Entonces debe ver por lo un animal visible en la lista.