def dataMethod(data):
    # variables
    max, total = 0, 0, 0
    for x in data:
        i = data.index(x)
        # get input
        data[i] = int(input("Hole " + str(i + 1) + ": "))
        # determine if it's max
        if data[i] > max:
            max = data[i]
        # determine if it's min
        if i == 0:
            if data[i] < max:
                min = data[i]
            else:
                min = max
        else:
            if data[i] < min:
                min = data[i]
        total = total + data[i]
    # return
    return [total, max, min]


# How many holes
hole = [0] * 5
# get scores and find results
score = dataMethod(hole)
# print results
print("Total: " + str(score[0]))
print("Max: " + str(score[1]))
print("Min: " + str(score[2]))
