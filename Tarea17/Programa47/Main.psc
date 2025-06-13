inicio

    crear scanner con entrada del usuario
    crear mtree con grado 4
    crear terminal con scanner

    terminal.print("equipo 7. elaborado por:")
    terminal.print("frida alejandra mendoza martinez")
    terminal.print("gael gonzalez mendez")
    terminal.print("hector desiderio erasto")

    terminal.print("programa que crea un arbol multi-camino de numeros enteros")

    definir option como entero igual a 0
    terminal.printmenu()

    mientras verdadero hacer

        option = terminal.requestint("ingresa la opcion: ")

        si option es igual a 5 entonces
            salir del ciclo
        fin si

        si option es igual a 1 entonces
            furniture = terminal.requessfurniture("ingrese el mueble a aadir")
            mtree.insert(furniture)

        sino si option es igual a 2 entonces
            number = terminal.requestint("ingrese el id del mueble a eliminar")
            mtree.delete(number)

        sino si option es igual a 3 entonces
            number = terminal.requestint("ingrese el id del mueble a buscar")
            mtree.searchwithtrace(number)

        sino si option es igual a 4 entonces
            mtree.show()

        fin si

    fin mientras

    terminal.print("saliendo...")

fin
