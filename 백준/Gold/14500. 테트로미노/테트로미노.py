import sys
input = sys.stdin.readline

N, M = map(int, input().split())
arr = [list(map(int, input().split())) for _ in range(N)]
v = [[0] * M for _ in range(N)]

dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

ans = 0

def dfs(x, y, cnt, total):
    global ans
    if cnt == 4:
        ans = max(ans, total)
        return
    
    for i in range(4):
        nx, ny = x + dx[i], y + dy[i]
        if 0 <= nx < N and 0 <= ny < M and not v[nx][ny]:
            v[nx][ny] = 1
            dfs(nx, ny, cnt + 1, total + arr[nx][ny])
            v[nx][ny] = 0

def check_T_shape(x, y):
    global ans
    for removed in range(4):
        total = arr[x][y]
        valid = True
        for i in range(4):
            if i == removed:
                continue
            nx, ny = x + dx[i], y + dy[i]
            if not (0 <= nx < N and 0 <= ny < M):
                valid = False
                break
            total += arr[nx][ny]
        if valid:
            ans = max(ans, total)

for i in range(N):
    for j in range(M):
        v[i][j] = 1
        dfs(i, j, 1, arr[i][j])
        v[i][j] = 0
        check_T_shape(i, j)

print(ans)