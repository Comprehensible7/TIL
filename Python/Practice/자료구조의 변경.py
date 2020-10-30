# 자료구조의 변경
# 타입 변경

# 카페
menu = {'커피','우유','주스'}
print(menu,type(menu))

menu = list(menu)
print(menu,type(menu))

menu = tuple(menu)
print(menu,type(menu))

menu = set(menu)
print(menu,type(menu))