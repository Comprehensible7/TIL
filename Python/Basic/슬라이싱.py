# 필요한 것 만큼 잘라서 사용하는 것이 슬라이싱
jumin = "990120-1234567"

# 필요한 것만 가져올땐 []를 사용
# index값은 0부터 시작하기때문에 위치를 계산해서 값을 입력
print('성별 : ' + jumin[7])

# 0번째 부터 몇번째 까지를 나타낼땐 : 를 사용 (직전 값까지)
print('연 : ' + jumin[0:2]) # 0부터 2직전까지 값을 가져옴

print('월 : ' + jumin[2:4])
print('일 : ' + jumin[4:6])

# 처음부터 6 직전까지의 값을 불러온다
# 처음부터 불러올때 앞의 0은 생략 가능
print('생년월일 : ' + jumin[0:6])
print('생년월일 : ' + jumin[:6])

# 마찬가지로 마지막 자리수까지 불러올땐 뒤의 자리수 생략가능
print('뒤 7자리 : ' + jumin[7:14])
print('뒤 7자리 : ' + jumin[7:])


# 맨 뒤에자리는 -1번째 자리임
# 맨 뒤에서 7번째부터 끝까지
print('뒤 7자리 (뒤에부터) : ' + jumin[-7:])