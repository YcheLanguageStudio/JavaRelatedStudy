tuple1 = tuple([1, 2])
tuple2 = tuple([1, 2])
tuple3 = tuple([2, 2])

if tuple1 == tuple2:
    print 'right'
else:
    print 'not'

if tuple2 == tuple3:
    print 'not'
else:
    print 'right'

my_set = []
my_set.append(tuple1)
my_set.append(tuple2)
my_set.append(tuple3)
my_set = set(my_set)
for ele in my_set:
    print ele

my_list = [0, 1, 2, 3]
print filter(lambda ele: ele < 2, my_list)
