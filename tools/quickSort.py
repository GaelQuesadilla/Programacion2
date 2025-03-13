from typing import List

array = [19, 5, 23, 4, 6, 3, 8, 9, 9, 5]


def quicksort(arr):
    print(arr)
    if len(arr) <= 1:
        return arr
    pivot = arr[-1]
    less = [x for x in arr[:-1] if x < pivot]
    greaterOrEqual = [x for x in arr[:-1] if x >= pivot]
    return quicksort(less) + [pivot] + quicksort(greaterOrEqual)


print(quicksort(array))
