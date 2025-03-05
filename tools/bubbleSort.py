array = [20, 5, 8, 11, 45, 3, 6, 9, 1, 17]
print(array)
for i in range(len(array)):
    print(f"{i=}")
    for j in range(len(array)-1, i, -1):
        if array[j-1] > array[j]:
            aux = array[j]
            array[j] = array[j-1]
            array[j-1] = aux
        print(array)

for i in range(len(array)-1):
    print(f"{i=}")
    for j in range(len(array)-2, i-1, -1):
        if array[j] > array[j+1]:
            aux = array[j]
            array[j] = array[j+1]
            array[j+1] = aux

        print(array)
