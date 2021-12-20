n = int(input())

list = []
for i in range(n):
    list.append(str(input()))

check_list = []

for v in list:
    if v not in check_list:
        check_list.append(v)

check_list.sort(key = lambda x:(len(x), x))

for i in check_list:
    print(i)