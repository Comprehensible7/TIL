# random값을 모두 사용

from random import *

print(random()) # 0.0 ~ 1.0 미만의 임의의 값을 생성
print(random()*10) # 0.0 ~ 10.0 미만의 임의의 값을 생성
print(int(random()* 10)) # 0 ~ 10 미만의 임의의 값을 생성
print(int(random()*10) +1) # 1부터 10 이하의 임의의 값을 생성

# 로또 생성기
# 줄바꿈 command + enter

print(int(random()*45) + 1) # 1부터 45 이하의 임의의 값을 생성
print(int(random()*45) + 1) # 1부터 45 이하의 임의의 값을 생성
print(int(random()*45) + 1) # 1부터 45 이하의 임의의 값을 생성
print(int(random()*45) + 1) # 1부터 45 이하의 임의의 값을 생성
print(int(random()*45) + 1) # 1부터 45 이하의 임의의 값을 생성
print(int(random()*45) + 1) # 1부터 45 이하의 임의의 값을 생성

# 범위값 생성(미만)
print(randrange(1,46)) # 1부터 46 미만의 값을 생성

# 범위값 생성(포함)
print(randint(1, 45)) # 1부터 45이하의 임의의 값을 생성
print(randint(1, 45)) # 1부터 45이하의 임의의 값을 생성
print(randint(1, 45)) # 1부터 45이하의 임의의 값을 생성
print(randint(1, 45)) # 1부터 45이하의 임의의 값을 생성
print(randint(1, 45)) # 1부터 45이하의 임의의 값을 생성
print(randint(1, 45)) # 1부터 45이하의 임의의 값을 생성