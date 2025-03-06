array = [27, 1, 17, 11, 49, 2, 6, 9, 8, 3]
print(array)

for i in range(len(array) - 1):
    print(f"{i=}")
    for j in range(len(array) - 1 - i):
        if array[j] > array[j + 1]:
            aux = array[j]
            array[j] = array[j + 1]
            array[j + 1] = aux
        print(array)

print(array)
