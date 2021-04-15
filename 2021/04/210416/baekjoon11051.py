import sys
input = sys.stdin.readline

n, k = map(int, input().split())
dp = [[0] for i in range(n+2)]

for i in range(1, n+2):
  for j in range(1, i+1):
    if j == 1 or j == i:
      dp[i].append(1)
    else:
      dp[i].append(dp[i-1][j-1]+dp[i-1][j])

print((dp[n+1][k+1])%10007)