import pygame

# init은 초기화를 해주는 작업, 반드시 해야함
pygame.init()

# 화면 크기 설정
screen_width = 480 # 가로 크기
screen_height = 640 # 세로 크기
screen = pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀
pygame.display.set_caption('My Game') # 이름

# 배경이미지 불러오기
background = pygame.image.load("/Users/q/Desktop/Python Workspace/Project/background.png")

# 이벤트 루프
running = True # 게임이 진행중인지 확인
while running:
    for event in pygame.event.get(): # 반드시 작성되어야 하는 코드, 어떤 이벤트가 발생하였는지?
        if event.type == pygame.QUIT: # 종료 버튼을 눌렀을 경우 게임은 종료, 창이 닫히는 이벤트가 발생하였는지?
            running = False # while문 종료, 게임 진행중 아님

    # 배경화면 좌표를 잡아준다, 그리기
    screen.blit(background, (0,0))

    # 배경이미지를 색으로 받아올 수 있다 RGB값으로
    # screen.fill((0,0,255))

    # 게임화면 다시 그리기
    pygame.display.update()

# 게임 종료
pygame.quit()