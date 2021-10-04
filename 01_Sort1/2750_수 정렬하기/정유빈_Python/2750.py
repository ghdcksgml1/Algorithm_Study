n = int(input())
numbers = []
for i in range(0,n):
    number = int(input())
    numbers.append(number)
numbers = sorted(numbers)

for i in numbers:
    print(i)
    