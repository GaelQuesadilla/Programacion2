clase terminal
    variable scanner

    metodo terminal(scanner)
        asignar this.scanner = scanner
    fin metodo

    metodo requestint(mensaje)
        mostrar en consola con color amarillo: mensaje
        valor = leer entero desde scanner
        retornar valor
    fin metodo

    metodo print(mensaje)
        mostrar en consola: mensaje
    fin metodo

    metodo print(mensaje)
        mostrar en consola: mensaje
    fin metodo

    metodo print(arreglo)
        para i desde 0 hasta longitud de arreglo - 1 hacer
            mostrar en consola: arreglo[i] seguido de " -> "
        fin para
        mostrar en consola: "null"
    fin metodo

    metodo printmenu()
        mostrar en consola: "        menu"
        mostrar en consola con color morado: "|\topcion\t|\taccion\t\t\t|"
        mostrar en consola: "|\t1\t|\tagregar\t\t\t|"
        mostrar en consola: "|\t2\t|\teliminar\t\t|"
        mostrar en consola: "|\t3\t|\tbuscar\t\t\t|"
        mostrar en consola: "|\t4\t|\tmostrar orden\t\t|"
        mostrar en consola: "|\t5\t|\tsalir\t\t\t|"
    fin metodo

    metodo close()
        cerrar scanner
    fin metodo
fin clase
