import pygame

# init은 초기화를 해주는 작업, 반드시 해야함
pygame.init()

# 화면 크기 설정
screen_width = 480 # 가로 크기
screen_height = 640 # 세로 크기
screen = pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀
pygame.display.set_caption('My Game') # 이름

# FPS
clock = pygame.time.Clock()

# 배경이미지 불러오기
background = pygame.image.load("/Users/q/Desktop/Python Workspace/Project/background.png")

# 캐릭터(스프라이트) 불러오기
character = pygame.image.load("/Users/q/Desktop/Python Workspace/Project/character.png")

character_size = character.get_rect().size # 이미지의 크기를 구해옴
character_width = character_size[0] # 캐릭터 가로크기
character_height = character_size[1] # 캐릭터 세로크기

# 가로축 절반크기 맞춰서 위치하게 만들기
character_x_pos = (screen_width / 2) - (character_width / 2)
# 화면 세로크기 가장 하단에 배치
character_y_pos = screen_height - character_height

# 이동 할 좌표
to_x = 0
to_y = 0

# 이동 속도
character_speed = 0.6

# 적 캐릭터 생성
enemy = pygame.image.load("/Users/q/Desktop/Python Workspace/Project/enemy.png")

enemy_size = enemy.get_rect().size # 이미지의 크기를 구해옴
enemy_width = enemy_size[0] # 캐릭터 가로크기
enemy_height = enemy_size[1] # 캐릭터 세로크기

# 가로축 절반크기 맞춰서 위치하게 만들기
enemy_x_pos = (screen_width / 2) - (enemy_width / 2)
# 화면 세로크기 가장 하단에 배치
enemy_y_pos = (screen_height / 2) - (enemy_height / 2)


# 이벤트 루프
running = True # 게임이 진행중인지 확인
while running:
    dt = clock.tick(60) # 초당 프레임 수 설정

    # 캐릭터가 1초동안 100만큼 이동을 해야한다고 할 때
    # 10 fps : 1초 동안 10번 동작 -> 1번에 10만큼 이동해야함 -> 10*10
    # 20 fps : 1초 동안 20번 동작 - > 1번에 5만큼 이동헤야함 -> 5*20

    # print('fps : ' + str(clock.get_fps())) # 초당 프레임 수 출력

    for event in pygame.event.get(): # 반드시 작성되어야 하는 코드, 어떤 이벤트가 발생하였는지?
        if event.type == pygame.QUIT: # 종료 버튼을 눌렀을 경우 게임은 종료, 창이 닫히는 이벤트가 발생하였는지?
            running = False # while문 종료, 게임 진행중 아님

        if event.type == pygame.KEYDOWN: # 키가 눌렸는지 확인
            if event.key == pygame.K_LEFT: # 캐릭터 좌측이동
                to_x -= character_speed # to_x = to_x -5
            elif event.key == pygame.K_RIGHT: # 우측 이동
                to_x += character_speed
            elif event.key == pygame.K_UP: # 위로 이동
                to_y -= character_speed
            elif event.key == pygame.K_DOWN: # 아래로 이동
                to_y += character_speed

        if event.type == pygame.KEYUP: # 방향키 떼면 멈춤
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                to_x = 0 # x좌표 기준으로 좌 우 이동 중 키보드 동작 없으면 값을 0으로 지정(움직이지 마라는 소리)
            elif event.key == pygame.K_UP or event.key == pygame.K_DOWN:
                to_y = 0 # y좌표 기준으로 위 아래 이동 중 키보드 동작 없으면 값을 0으로 지정

    # 포지션 값을 변경해준다
    character_x_pos += to_x * dt
    character_y_pos += to_y * dt

    # 화면 밖으로 벗어났을 때 (가로 경계 값 처리)
    if character_x_pos < 0:
        character_x_pos = 0
    elif character_x_pos > screen_width - character_width: #우측 끝일경우
        character_x_pos = screen_width - character_width

    # 화면 밖으로 벗어났을 때 (세로 경계 값 처리)
    if character_y_pos < 0:
        character_y_pos = 0
    elif character_y_pos > screen_height - character_height:
        character_y_pos = screen_height - character_height

    # print(character)

    # 충돌 처리 (실제로 위치하고 있는 rect정보를 업데이트)
    character_rect = character.get_rect()
    character_rect.left = character_x_pos
    character_rect.top = character_y_pos

    # 충돌 처리를 위한 rect 정보 업데이트 (실제로 위치하고 있는 rect정보를 업데이트)
    enemy_rect = enemy.get_rect()
    enemy_rect.left = enemy_x_pos
    enemy_rect.top = enemy_y_pos

    # 충돌 체크 (사각형 부분에 충돌을 했는지)
    if character_rect.colliderect(enemy_rect):
        print('충돌했어요...')
        running = False



    # 배경화면 좌표를 잡아준다, 그리기
    screen.blit(background, (0,0))

    # 캐릭터 그리기
    screen.blit(character, (character_x_pos,character_y_pos))

    # 적 캐릭터 그리기
    screen.blit(enemy, (enemy_x_pos,enemy_y_pos))

    # 게임화면 다시 그리기
    pygame.display.update()

# 게임 종료
pygame.quit()