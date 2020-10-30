from random import *

# 범위 생성
users = range(1,21) # 1부터 20까지 숫자를 생성
# print(type(users))

# 타입 변환
users = list(users)
# print(type(users))

print(users)

# 무작위 순서배정
shuffle(users)
print(users)

winners = sample(users,4) # 4명중에서 1명은 치킨, 3명은 커피
print('-- 당첨자 발표 --')
print('치킨 당첨자 : {0}'.format(winners[0]))
print('커피 당첨자 : {0}'.format(winners[1:]))

print(' -- 축하합니다 -- ')