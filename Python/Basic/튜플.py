# 내용변경이나 추가가 불가능함, 리스트와 다름, 대신 속도가 빠름
# 튜플은 ()를 사용, 리스트는 {}를 사용
menu = ('돈까스','치즈까스')
print(menu[0])
print(menu[1])

# 추가 불가능
# menu.add('생선까스')

# name = '김종국'
# age = 20
# hobby = '코딩'
# print(name,age,hobby)

(name,age,hobby) = ('김종국',20,'코딩')
print(name,age,hobby)