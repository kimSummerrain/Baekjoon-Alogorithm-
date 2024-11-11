def skyline(buildings):
    if len(buildings) == 1:
        start, height, end = buildings[0]
        return [(start, height), (end, 0)]

    mid = len(buildings) // 2
    left_skyline = skyline(buildings[:mid])
    right_skyline = skyline(buildings[mid:])

    return merge_skylines(left_skyline, right_skyline)


def merge_skylines(left, right):
    merged = []
    h1, h2 = 0, 0
    i, j = 0, 0

    while i < len(left) and j < len(right):
        if left[i][0] < right[j][0]:
            x, h1 = left[i]
            max_height = max(h1, h2)
            i += 1
        elif left[i][0] > right[j][0]:
            x, h2 = right[j]
            max_height = max(h1, h2)
            j += 1
        else:
            x, h1 = left[i]
            h2 = right[j][1]
            max_height = max(h1, h2)
            i += 1
            j += 1

        if not merged or merged[-1][1] != max_height:
            merged.append((x, max_height))

    merged.extend(left[i:])
    merged.extend(right[j:])

    return merged

num_buildings = int(input())
buildings = [list(map(int, input().split())) for _ in range(num_buildings)]
result = skyline(buildings)
print(" ".join(f"{x} {y}" for x, y in result))