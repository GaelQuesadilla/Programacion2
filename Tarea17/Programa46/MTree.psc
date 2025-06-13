clase mtree
    privado entero grade
    privado nodo root

    metodo constructor mtree(grade)
        este.grade = grade
        este.root = nuevo nodo(grade)
        este.root.keycount = 0
        este.root.isleaf = verdadero
    fin

    metodo privado search(nodo node, entero value)
        si node es nulo
            retornar node
        fin

        entero i = 0
        mientras i < node.keycount
            si value < node.keys[i]
                romper
            fin
            si value == node.keys[i]
                retornar node
            fin
            i = i + 1
        fin

        si node.isleaf
            retornar nulo
        sino
            retornar search(node.child[i], value)
        fin
    fin

    metodo privado splitchild(nodo parent, entero index, nodo childtosplit)
        nodo rightnode = nuevo nodo(este.grade)
        rightnode.isleaf = childtosplit.isleaf
        entero midindex = (este.grade - 1) / 2

        rightnode.keycount = childtosplit.keycount - midindex - 1
        para entero j = 0 hasta j < rightnode.keycount
            rightnode.keys[j] = childtosplit.keys[midindex + 1 + j]
        fin

        si no childtosplit.isleaf
            para entero j = 0 hasta j <= rightnode.keycount
                rightnode.child[j] = childtosplit.child[midindex + 1 + j]
            fin
        fin

        childtosplit.keycount = midindex

        para entero j = parent.keycount hasta j >= index + 1
            parent.child[j + 1] = parent.child[j]
        fin
        parent.child[index + 1] = rightnode

        para entero j = parent.keycount - 1 hasta j >= index
            parent.keys[j + 1] = parent.keys[j]
        fin
        parent.keys[index] = childtosplit.keys[midindex]

        parent.keycount = parent.keycount + 1
    fin

    metodo insert(entero key)
        si root.keycount == este.grade - 1
            nodo newroot = nuevo nodo(este.grade)
            newroot.isleaf = falso
            newroot.keycount = 0
            newroot.child[0] = root
            splitchild(newroot, 0, root)
            root = newroot
            insertnonfull(newroot, key)
        sino
            insertnonfull(root, key)
        fin
    fin

    metodo privado insertnonfull(nodo node, entero value)
        entero i = node.keycount - 1

        si node.isleaf
            mientras i >= 0 y value < node.keys[i]
                node.keys[i + 1] = node.keys[i]
                i = i - 1
            fin
            node.keys[i + 1] = value
            node.keycount = node.keycount + 1
        sino
            mientras i >= 0 y value < node.keys[i]
                i = i - 1
            fin
            i = i + 1

            si node.child[i].keycount == este.grade - 1
                splitchild(node, i, node.child[i])
                si value > node.keys[i]
                    i = i + 1
                fin
            fin
            insertnonfull(node.child[i], value)
        fin
    fin

    metodo show()
        show(root)
    fin

    metodo privado show(nodo node)
        afirmar node no es nulo
        imprimir "hoja:"
        para entero i = 0 hasta i < node.keycount
            imprimir node.keys[i] seguido de coma si no es el ultimo
        fin

        si no node.isleaf
            imprimir "["
            para entero i = 0 hasta i < node.keycount + 1
                show(node.child[i])
            fin
            imprimir "]"
        fin
    fin

    metodo contain(entero value)
        si search(root, value) no es nulo
            retornar verdadero
        sino
            retornar falso
        fin
    fin

    metodo delete(entero value)
        si root es nulo
            retornar
        fin
        delete(root, value)
        si root.keycount == 0
            si no root.isleaf
                root = root.child[0]
            sino
                root = nulo
            fin
        fin
    fin

    metodo privado delete(nodo node, entero value)
        entero idx = findkey(node, value)
        si idx < node.keycount y node.keys[idx] == value
            si node.isleaf
                removefromleaf(node, idx)
            sino
                removefromnonleaf(node, idx)
            fin
        sino
            si node.isleaf
                retornar
            fin
            booleano last = (idx == node.keycount)
            fill(node, idx)
            si last y idx > node.keycount
                delete(node.child[idx - 1], value)
            sino
                delete(node.child[idx], value)
            fin
        fin
    fin

    metodo privado findkey(nodo node, entero value)
        entero idx = 0
        mientras idx < node.keycount y node.keys[idx] < value
            idx = idx + 1
        fin
        retornar idx
    fin

    metodo privado removefromleaf(nodo node, entero idx)
        para entero i = idx + 1 hasta i < node.keycount
            node.keys[i - 1] = node.keys[i]
        fin
        node.keycount = node.keycount - 1
    fin

    metodo privado removefromnonleaf(nodo node, entero idx)
        entero value = node.keys[idx]
        entero t = (grade + 1) / 2
        entero minkeys = t - 1

        si node.child[idx].keycount >= minkeys + 1
            entero pred = getpredecessor(node, idx)
            node.keys[idx] = pred
            delete(node.child[idx], pred)
        sino si node.child[idx + 1].keycount >= minkeys + 1
            entero succ = getsuccessor(node, idx)
            node.keys[idx] = succ
            delete(node.child[idx + 1], succ)
        sino
            merge(node, idx)
            delete(node.child[idx], value)
        fin
    fin

    metodo privado getpredecessor(nodo node, entero idx)
        nodo cur = node.child[idx]
        mientras no cur.isleaf
            cur = cur.child[cur.keycount]
        fin
        retornar cur.keys[cur.keycount - 1]
    fin

    metodo privado getsuccessor(nodo node, entero idx)
        nodo cur = node.child[idx + 1]
        mientras no cur.isleaf
            cur = cur.child[0]
        fin
        retornar cur.keys[0]
    fin

    metodo privado fill(nodo node, entero idx)
        entero t = (grade + 1) / 2
        entero minkeys = t - 1

        si idx > 0 y node.child[idx - 1].keycount >= minkeys + 1
            borrowfromprev(node, idx)
        sino si idx < node.keycount y node.child[idx + 1].keycount >= minkeys + 1
            borrowfromnext(node, idx)
        sino
            si idx < node.keycount
                merge(node, idx)
            sino
                merge(node, idx - 1)
            fin
        fin
    fin

    metodo privado borrowfromprev(nodo node, entero idx)
        nodo child = node.child[idx]
        nodo sibling = node.child[idx - 1]
        para entero i = child.keycount - 1 hasta i >= 0
            child.keys[i + 1] = child.keys[i]
        fin
        si no child.isleaf
            para entero i = child.keycount hasta i >= 0
                child.child[i + 1] = child.child[i]
            fin
        fin
        child.keys[0] = node.keys[idx - 1]
        si no child.isleaf
            child.child[0] = sibling.child[sibling.keycount]
        fin
        node.keys[idx - 1] = sibling.keys[sibling.keycount - 1]
        child.keycount = child.keycount + 1
        sibling.keycount = sibling.keycount - 1
    fin

    metodo privado borrowfromnext(nodo node, entero idx)
        nodo child = node.child[idx]
        nodo sibling = node.child[idx + 1]

        child.keys[child.keycount] = node.keys[idx]
        si no child.isleaf
            child.child[child.keycount + 1] = sibling.child[0]
        fin
        node.keys[idx] = sibling.keys[0]

        para entero i = 1 hasta i < sibling.keycount
            sibling.keys[i - 1] = sibling.keys[i]
        fin
        si no sibling.isleaf
            para entero i = 1 hasta i <= sibling.keycount
                sibling.child[i - 1] = sibling.child[i]
            fin
        fin
        child.keycount = child.keycount + 1
        sibling.keycount = sibling.keycount - 1
    fin

    metodo privado merge(nodo node, entero idx)
        nodo child = node.child[idx]
        nodo sibling = node.child[idx + 1]
        entero t = (grade + 1) / 2

        child.keys[t - 1] = node.keys[idx]

        para entero i = 0 hasta i < sibling.keycount
            child.keys[i + t] = sibling.keys[i]
        fin

        si no child.isleaf
            para entero i = 0 hasta i <= sibling.keycount
                child.child[i + t] = sibling.child[i]
            fin
        fin

        child.keycount = child.keycount + sibling.keycount + 1

        para entero i = idx + 1 hasta i < node.keycount
            node.keys[i - 1] = node.keys[i]
            node.child[i] = node.child[i + 1]
        fin

        node.keycount = node.keycount - 1
    fin

    metodo searchwithtrace(entero value)
        texto trace = ""
        searchtracerec(root, value, trace)
        si trace termina en ","
            eliminar ultima coma
        fin
        imprimir trace
    fin

    metodo privado searchtracerec(nodo node, entero value, texto trace)
        entero i = 0
        mientras i < node.keycount
            si node.keys[i] == value
                trace + node.keys[i]
                retornar verdadero
            fin
            si value > node.keys[i]
                trace + node.keys[i] + ","
                i = i + 1
                continuar
            fin
            romper
        fin

        trace + "->"
        si node.isleaf
            retornar falso
        fin
        retornar searchtracerec(node.child[i], value, trace)
    fin
fin clase
