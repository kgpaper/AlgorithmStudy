import sys
input = sys.stdin.readline

arr = []
for _ in range(int(input())):
  n = int(input())
  if n == 0:
    arr.pop()
  else:
    arr.append(n)

print(sum(arr))