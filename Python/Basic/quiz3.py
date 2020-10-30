url = "http://naver.com"

# replace를 사용해서 http://가 나오는자리를 공백으로 대체
my_str = url.replace("http://", "")
print(my_str)

# my_str에 들어가있는 문자열중에서 처음에서부터 .까지 슬라이싱
# my_str[0:5] -> 0~5 직전까지 . (0, 1, 2, 3, 4)
my_str = my_str[:my_str.index(".")]
print(my_str)

# 처음부터 3 직전까지
# 문자열을 합치기 위해서는 str로 포장
password = my_str[:3] + str(len(my_str)) + str(my_str.count("e")) + '!'
print('{0} 의 비밀번호는 {1} 입니다.'.format(url, password))
