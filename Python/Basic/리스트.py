# 리스트 [] : 순서를 가지는 객체의 집합

# 지하철 칸별로 10명, 20명, 30명
subway1 = 10
subway2 = 20
subway3 = 30

# 위의 값처럼 변수를 하나하나 설정안하고 아래에서 리스트를 사용하면 하나로 묶어줄 수 있다
subway = [10,20,30]
print(subway)

subway = ['유재석','조세호','박명수']
print(subway)

# 원하는 값을 호출할 수 있는 index를 사용
# 조세호가 몇 번째 칸에 호고있는가
print(subway.index('조세호'))

# 하하가 다음 정류장에서 탑승
# 값을 추가하는 append (맨 뒤에 값이 추가됨)
subway.append('하하')
print(subway)

# 정형돈을 유재석 / 조세호 사이에 태워봄
# 지정한 위치에 값을 추가함
subway.insert(1,'정형돈')
print(subway)

# 지하철에 있는 사람을 한 명씩 뒤에서 꺼냄
# pop은 뒤에서부터 하나씩 꺼내는 함수
print(subway.pop())
print(subway)

# print(subway.pop())
# print(subway)

# print(subway.pop())
# print(subway)

subway.append('유재석')
print(subway)

# count를 사용해서 몇명이있는지 확인
print(subway.count('유재석')

# sort 정렬
num_list = [5,2,4,3,1]
num_list.sort()
print(num_list)

# 역정렬
num_list.reverse()
print(num_list)

# 모두 지우기
num_list.clear()
print(num_list)

# 다양한 자료형 함께 사용
mix_list = ['조세호', 20, True]
print(mix_list)

# 리스트 확장
num_list.extend(mix_list)
print(mix_list)