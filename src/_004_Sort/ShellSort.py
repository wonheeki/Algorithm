def shell(arr):
  n = len(arr)
  h = n // 2

  while h > 0:
    for i in range(h, n):
      j = i - h
      tmp = arr[i]
      while j >= 0 and arr[j] > tmp:
        arr[j + h] = arr[j]
        j -= h
      arr[j + h] = tmp
    h //= 2

