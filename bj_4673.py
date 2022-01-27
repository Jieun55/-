natural_num = set(range(1, 10001))
generated_num = set()

for i in range(1, 10001):
    for j in str(i):
        i += int(j)
    generated_num.add(i)

self_num = sorted(natural_num - generated_num)
for i in self_num:
    print(i)


# def d(n):
#     n = n + sum(map(int, str(n)))
#     return n


# nonSelfNum = set()
# for i in range(1, 10001):
#     nonSelfNum.add(d(i))

# for j in range(1, 10001):
#     if j not in nonSelfNum:
#         print(j)
