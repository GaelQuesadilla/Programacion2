clase node

    variable keycount = 0
    variable keys[]
    variable child[]
    variable isleaf = verdadero

    funcion constructor node(grade)
        keys = arreglo de enteros de tamano grade
        child = arreglo de node de tamano grade
    fin funcion

    funcion find(value)
        para i desde 0 hasta keycount - 1 hacer
            si keys[i] es igual a value entonces
                retornar i
            fin si
        fin para
        retornar -1
    fin funcion

fin clase
