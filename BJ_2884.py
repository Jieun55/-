H, M = map(int, input().split())

if M >= 45:
    M -= 45
else:
    if (H == 0):
        H = 24
    H -= 1
    M = M + 15

print(H, M)
