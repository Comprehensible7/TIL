python = 'Python is Amazing'

# 소문자 출력하기
print(python.lower)
print(python.upper)

# 대문자인지 확인하는 구문 isupper
# 첫번쩨 값이 대문자인가?
print(python[0].isupper())
# 첫번째 값이 소문자인가?
print(python[0].islower())

# 길이 len
# 길이의 값을 반환해준다
print(len(python))

# 원하는 문자열을 찾아서 바꿔준다
print(python.replace('Python', 'Java'))

# 파이썬이라는 변수에서 어떤문자가 어느위치에 있는지 확인이 가능하다
index = python.index('n')
print(index)

# 기존에 n에대해서 찾고, 찾은값의 기준+1을해서 뒤에서 조건값을 찾아준다
index = python.index('n', index + 1)
print(index)

# 원하는 값의 위치를 찾아준다
# -1이 나오는 이유는 원하는 값이 변수에 포함되어있지 않을땐 -1을 반환해준다
print(python.find('Java'))

# index를 사용 할 경우 원하는 값이 없으면 오류가 나면서 프로그램을 종료한다
# print(python.index('Java'))

print('Hi')

# 원하는 값이 총 몇개 있는지 나타내준다
print(python.count('n'))


