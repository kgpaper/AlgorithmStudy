import sys
input = sys.stdin.readline

a, b = map(int, sys.stdin.readline().split()) 
x, y = a, b 

while y > 0: 
  x = x % y 
  x, y = y, x 

print(x)
print(a*b/x)
