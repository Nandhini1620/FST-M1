def sum_list(nlist):
    sum=0

    for n in nlist:
        sum += n
    return sum



list = [1, 2, 3, 4, 5, 6]
res = sum_list(list)

print(res)