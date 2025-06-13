clase node
    entero keycount = 0
    arreglo de furniture keys
    arreglo de node child
    booleano isleaf = verdadero

    metodo constructor node(grade)
        keys = nuevo arreglo de furniture con tamano grade
        child = nuevo arreglo de node con tamano grade
    fin metodo

    metodo find(valor)
        para i desde 0 hasta keycount - 1 hacer
            si keys[i].id es igual a valor entonces
                retornar i
            fin si
        fin para
        retornar -1
    fin metodo
fin clase
