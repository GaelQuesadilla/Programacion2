clase furniture:
    variable name como cadena
    variable price como decimal
    variable id como entero

    metodo constructor furniture(name como cadena, price como decimal, id como entero):
        asignar this.name = name
        asignar this.price = price
        asignar this.id = id

    metodo to_string() como cadena:
        retornar "furniture [name=" + name + ", price=" + price + ", id=" + id + "]"

    metodo equals(obj como objeto) como booleano:
        si this es igual a obj entonces
            retornar verdadero
        fin si
        si obj es nulo entonces
            retornar falso
        fin si
        si la clase de this es diferente de la clase de obj entonces
            retornar falso
        fin si
        definir other como furniture y asignar a obj convertido
        si name es nulo entonces
            si other.name no es nulo entonces
                retornar falso
            fin si
        si no entonces
            si name no es igual a other.name entonces
                retornar falso
            fin si
        fin si
        si los bits del double price no son iguales a los de other.price entonces
            retornar falso
        fin si
        si id es diferente de other.id entonces
            retornar falso
        fin si
        retornar verdadero
