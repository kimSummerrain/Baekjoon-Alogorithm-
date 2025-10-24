import sys
from collections import deque
input = sys.stdin.readline

n = int(input())
graph = [list(map(int, input().split())) for _ in range(n)]

dx, dy = [0, 0, 1, -1], [1, -1, 0, 0]
x = y = 0
for i in range(n):
    for j in range(n):
        if graph[i][j] == 9:
            x, y = i, j
            graph[i][j] = 0

def bfs(x, y, size):
    q = deque([(x, y, 0)])
    visited = [[False] * n for _ in range(n)]
    visited[x][y] = True
    fish = []
    min_dist = float('inf')
    while q:
        cx, cy, dist = q.popleft()
        if dist > min_dist:
            break
        for i in range(4):
            nx, ny = cx + dx[i], cy + dy[i]
            if 0 <= nx < n and 0 <= ny < n and not visited[nx][ny]:
                if graph[nx][ny] <= size:
                    visited[nx][ny] = True
                    if 0 < graph[nx][ny] < size:
                        fish.append((dist + 1, nx, ny))
                        min_dist = dist + 1
                    else:
                        q.append((nx, ny, dist + 1))
    if not fish:
        return None
    fish.sort(key=lambda x: (x[0], x[1], x[2]))
    return fish[0]

size, eaten, time = 2, 0, 0
while True:
    target = bfs(x, y, size)
    if not target:
        break
    dist, nx, ny = target
    time += dist
    eaten += 1
    graph[nx][ny] = 0
    x, y = nx, ny
    if eaten == size:
        size += 1
        eaten = 0
print(time)
