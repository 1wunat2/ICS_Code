array = [1, "a", 3, 4, 5]
data = []
data.append(array)
data.append(array)

print(array[-4])
print(array[1:4:2])
print(array[::-1])
print(array.index("f"))

#print(data)

my_list = [[0]*3]*1
print(my_list)
my_list[0].append("a")
my_list.append(data)
my_list.extend(array)

#print(my_list)

other = [[[0]*2]*5]*3
print(other)