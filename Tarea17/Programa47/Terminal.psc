clase terminal:
    variable scanner

    metodo terminal(scanner):
        este.scanner = scanner

    metodo clearline():
        scanner.leerLinea()

    metodo requeststring(mensaje):
        imprimir en amarillo: mensaje
        valor = scanner.leerLinea()
        retornar valor

    metodo requestint(mensaje):
        imprimir en amarillo: mensaje
        valor = scanner.leerEntero()
        retornar valor

    metodo requessfurniture(mensaje):
        imprimir en amarillo: mensaje
        imprimir en amarillo: "escribe el nombre del pueble"
        nombre = scanner.leerLinea()
        clearline()
        imprimir en amarillo: "escribe el precio del pueble"
        precio = scanner.leerDecimal()
        imprimir en amarillo: "escribe el id del mueble"
        id = scanner.leerEntero()
        retornar nuevo furniture(nombre, precio, id)

    metodo print(mensaje):
        imprimir mensaje

    metodo print(numero):
        imprimir numero

    metodo print(arreglo):
        para i desde 0 hasta longitud de arreglo:
            imprimir: arreglo[i] + " -> "
        imprimir: "null"

    metodo printmenu():
        imprimir: "menu"
        imprimir en morado: "|\topcion\t|\taccion\t\t\t|"
        imprimir: "|\t1\t|\tadir\t\t\t|"
        imprimir: "|\t2\t|\teliminar\t\t|"
        imprimir: "|\t3\t|\tbuscar\t\t\t|"
        imprimir: "|\t4\t|\tmostrar orden\t\t|"
        imprimir: "|\t5\t|\tsalir\t\t\t|"

    metodo close():
        scanner.cerrar()
