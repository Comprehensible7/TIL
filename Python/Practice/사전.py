# 사전의 경우는 중괄호를 사용
#          key : value
# cabinet = {3:'유재석', 100:'김태호'}

# print(cabinet[3])
# print(cabinet[100])

# 값을 가져오는 다른 방법
# print(cabinet.get(3))

# print(cabinet[5])
# get을 이용해서 값을 불러오면 값이 없어도 프로그램이 종료되지 않고 none이 출력됨
# print(cabinet.get(5))
# print(cabinet.get(5, '사용가능'))
# 캐비넷에 5라는 키값이 없으면 아래의 출력구문은 실행안됨
print("hi")

#     key in cabinet
# print(3 in cabinet) # True
# print(5 in cabinet) # False

cabinet = {'A-3':'유재석','B-100':'김태호'}
print(cabinet['A-3'])
print(cabinet['B-100'])

# 새 손님
print(cabinet)
# 값을 업데이트 및 추가
cabinet['A-3'] = '김종국'
cabinet['C-20'] = '조세호'
print(cabinet)

# 간 손님
# del은 삭제
del cabinet['A-3']
print(cabinet)

# key들만 출력
print(cabinet.keys())

# value들만 출력
print(cabinet.values())

# key, values 쌍으로 출력
# 두개 다 불러올땐 items를 사용
print(cabinet.items())

# 목욕탕 폐점
# 모든 값을 비운다 -> clear
cabinet.clear()
print(cabinet)