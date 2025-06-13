clase main

    metodo main(lista de texto args)
        mTree = nuevo mTree(4)
        terminal = nuevo terminal(scanner)

        terminal.imprimir("equipo 7. elaborado por:")
        terminal.imprimir("frida alejandra mendoza martinez")
        terminal.imprimir("gael gonzalez mendez")
        terminal.imprimir("hector desiderio erasto")

        terminal.imprimir("programa que crea un arbol multi-camino de numeros enteros")

        opcion = 0
        terminal.mostrar_menu()

        mientras verdadero
            opcion = terminal.solicitar_entero("ingresa la opcion: ")

            si opcion es igual a 5 entonces
                salir del ciclo

            si opcion es igual a 1 entonces
                numero = terminal.solicitar_entero("ingrese el numero a anadir")
                mTree.insertar(numero)

            si no, si opcion es igual a 2 entonces
                numero = terminal.solicitar_entero("ingrese el numero a eliminar")
                mTree.eliminar(numero)

            si no, si opcion es igual a 3 entonces
                numero = terminal.solicitar_entero("ingrese el numero a buscar")
                mTree.buscar_con_rastro(numero)

            si no, si opcion es igual a 4 entonces
                mTree.mostrar()

        terminal.imprimir("saliendo...")

fin clase
