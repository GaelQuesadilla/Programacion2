clase MTree

    variable grade
    variable root

    funcion MTree(grade)
        this.grade = grade
        this.root = nuevo Node(grade)
        this.root.keyCount = 0
        this.root.isLeaf = verdadero
    fin funcion

    funcion Search(node, value)
        si node es nulo entonces
            retornar node
        fin si

        variable i = 0
        para i desde 0 hasta node.keyCount
            si value < node.keys[i].ID entonces
                romper
            fin si
            si value == node.keys[i].ID entonces
                retornar node
            fin si
        fin para

        si node.isLeaf entonces
            retornar nulo
        si no
            retornar Search(node.child[i], value)
        fin si
    fin funcion

    funcion splitChild(parent, index, childToSplit)
        variable rightNode = nuevo Node(this.grade)
        rightNode.isLeaf = childToSplit.isLeaf
        variable midIndex = (this.grade - 1) / 2

        rightNode.keyCount = childToSplit.keyCount - midIndex - 1
        para j desde 0 hasta rightNode.keyCount
            rightNode.keys[j] = childToSplit.keys[midIndex + 1 + j]
        fin para

        si no childToSplit.isLeaf entonces
            para j desde 0 hasta rightNode.keyCount
                rightNode.child[j] = childToSplit.child[midIndex + 1 + j]
            fin para
        fin si

        childToSplit.keyCount = midIndex

        para j desde parent.keyCount hasta index + 1
            parent.child[j + 1] = parent.child[j]
        fin para
        parent.child[index + 1] = rightNode

        para j desde parent.keyCount - 1 hasta index
            parent.keys[j + 1] = parent.keys[j]
        fin para
        parent.keys[index] = childToSplit.keys[midIndex]
        parent.keyCount = parent.keyCount + 1
    fin funcion

    funcion insert(key)
        si root.keyCount == this.grade - 1 entonces
            variable newRoot = nuevo Node(this.grade)
            newRoot.isLeaf = falso
            newRoot.keyCount = 0
            newRoot.child[0] = root
            splitChild(newRoot, 0, root)
            root = newRoot
            insertNonFull(newRoot, key)
        si no
            insertNonFull(root, key)
        fin si
    fin funcion

    funcion insertNonFull(node, value)
        variable i = node.keyCount - 1
        si node.isLeaf entonces
            mientras i >= 0 y value.ID < node.keys[i].ID
                node.keys[i + 1] = node.keys[i]
                i = i - 1
            fin mientras
            node.keys[i + 1] = value
            node.keyCount = node.keyCount + 1
        si no
            mientras i >= 0 y value.ID < node.keys[i].ID
                i = i - 1
            fin mientras
            i = i + 1
            si node.child[i].keyCount == this.grade - 1 entonces
                splitChild(node, i, node.child[i])
                si value.ID > node.keys[i].ID entonces
                    i = i + 1
                fin si
            fin si
            insertNonFull(node.child[i], value)
        fin si
    fin funcion

    funcion Show()
        Show(this.root)
    fin funcion

    funcion Show(node)
        assert node != nulo
        imprimir "Hoja:"
        para i desde 0 hasta node.keyCount
            imprimir node.keys[i]
        fin para

        si no node.isLeaf entonces
            imprimir "["
            para i desde 0 hasta node.keyCount
                Show(node.child[i])
            fin para
            imprimir "]"
        fin si
    fin funcion

    funcion Contain(value)
        si Search(root, value) != nulo entonces
            retornar verdadero
        si no
            retornar falso
        fin si
    fin funcion

    funcion delete(value)
        si root es nulo entonces
            retornar
        fin si
        delete(root, value)
        si root.keyCount == 0 entonces
            si no root.isLeaf entonces
                root = root.child[0]
            si no
                root = nulo
            fin si
        fin si
    fin funcion

    funcion delete(node, value)
        variable idx = findKey(node, value)
        si idx < node.keyCount y node.keys[idx].ID == value entonces
            si node.isLeaf entonces
                removeFromLeaf(node, idx)
            si no
                removeFromNonLeaf(node, idx)
            fin si
        si no
            si node.isLeaf entonces
                retornar
            fin si
            variable last = (idx == node.keyCount)
            fill(node, idx)
            si last y idx > node.keyCount entonces
                delete(node.child[idx - 1], value)
            si no
                delete(node.child[idx], value)
            fin si
        fin si
    fin funcion

    funcion findKey(node, value)
        variable idx = 0
        mientras idx < node.keyCount y node.keys[idx].ID < value
            idx = idx + 1
        fin mientras
        retornar idx
    fin funcion

    funcion removeFromLeaf(node, idx)
        para i desde idx + 1 hasta node.keyCount
            node.keys[i - 1] = node.keys[i]
        fin para
        node.keyCount = node.keyCount - 1
    fin funcion

    funcion removeFromNonLeaf(node, idx)
        variable value = node.keys[idx].ID
        variable t = (grade + 1) / 2
        variable minKeys = t - 1

        si node.child[idx].keyCount >= minKeys + 1 entonces
            variable pred = getPredecessor(node, idx)
            node.keys[idx].ID = pred
            delete(node.child[idx], pred)
        sino si node.child[idx + 1].keyCount >= minKeys + 1 entonces
            variable succ = getSuccessor(node, idx)
            node.keys[idx].ID = succ
            delete(node.child[idx + 1], succ)
        sino
            merge(node, idx)
            delete(node.child[idx], value)
        fin si
    fin funcion

    funcion getPredecessor(node, idx)
        variable cur = node.child[idx]
        mientras no cur.isLeaf
            cur = cur.child[cur.keyCount]
        fin mientras
        retornar cur.keys[cur.keyCount - 1].ID
    fin funcion

    funcion getSuccessor(node, idx)
        variable cur = node.child[idx + 1]
        mientras no cur.isLeaf
            cur = cur.child[0]
        fin mientras
        retornar cur.keys[0].ID
    fin funcion

    funcion fill(node, idx)
        variable t = (grade + 1) / 2
        variable minKeys = t - 1

        si idx > 0 y node.child[idx - 1].keyCount >= minKeys + 1 entonces
            borrowFromPrev(node, idx)
        sino si idx < node.keyCount y node.child[idx + 1].keyCount >= minKeys + 1 entonces
            borrowFromNext(node, idx)
        sino
            si idx < node.keyCount entonces
                merge(node, idx)
            sino
                merge(node, idx - 1)
            fin si
        fin si
    fin funcion

    funcion borrowFromPrev(node, idx)
        variable child = node.child[idx]
        variable sibling = node.child[idx - 1]

        para i desde child.keyCount - 1 hasta 0
            child.keys[i + 1] = child.keys[i]
        fin para

        si no child.isLeaf entonces
            para i desde child.keyCount hasta 0
                child.child[i + 1] = child.child[i]
            fin para
        fin si

        child.keys[0] = node.keys[idx - 1]

        si no child.isLeaf entonces
            child.child[0] = sibling.child[sibling.keyCount]
        fin si

        node.keys[idx - 1] = sibling.keys[sibling.keyCount - 1]
        child.keyCount = child.keyCount + 1
        sibling.keyCount = sibling.keyCount - 1
    fin funcion

    funcion borrowFromNext(node, idx)
        variable child = node.child[idx]
        variable sibling = node.child[idx + 1]

        child.keys[child.keyCount] = node.keys[idx]

        si no child.isLeaf entonces
            child.child[child.keyCount + 1] = sibling.child[0]
        fin si

        node.keys[idx] = sibling.keys[0]

        para i desde 1 hasta sibling.keyCount
            sibling.keys[i - 1] = sibling.keys[i]
        fin para

        si no sibling.isLeaf entonces
            para i desde 1 hasta sibling.keyCount
                sibling.child[i - 1] = sibling.child[i]
            fin para
        fin si

        child.keyCount = child.keyCount + 1
        sibling.keyCount = sibling.keyCount - 1
    fin funcion

    funcion merge(node, idx)
        variable child = node.child[idx]
        variable sibling = node.child[idx + 1]
        variable t = (grade + 1) / 2

        child.keys[t - 1] = node.keys[idx]

        para i desde 0 hasta sibling.keyCount
            child.keys[i + t] = sibling.keys[i]
        fin para

        si no child.isLeaf entonces
            para i desde 0 hasta sibling.keyCount
                child.child[i + t] = sibling.child[i]
            fin para
        fin si

        child.keyCount = child.keyCount + sibling.keyCount + 1

        para i desde idx + 1 hasta node.keyCount
            node.keys[i - 1] = node.keys[i]
            node.child[i] = node.child[i + 1]
        fin para

        node.keyCount = node.keyCount - 1
    fin funcion

    funcion searchWithTrace(value)
        variable trace = ""
        searchTraceRec(root, value, trace)
        si trace termina en "," entonces
            quitar ultima coma
        fin si
        imprimir trace
    fin funcion

    funcion searchTraceRec(node, value, trace)
        variable i = 0
        mientras i < node.keyCount
            si node.keys[i].ID == value entonces
                trace = trace + node.keys[i]
                retornar verdadero
            fin si
            si value > node.keys[i].ID entonces
                trace = trace + node.keys[i] + ","
                i = i + 1
                continuar
            fin si
            romper
        fin mientras

        trace = trace + "->"

        si node.isLeaf entonces
            retornar falso
        fin si

        retornar searchTraceRec(node.child[i], value, trace)
    fin funcion

fin clase
