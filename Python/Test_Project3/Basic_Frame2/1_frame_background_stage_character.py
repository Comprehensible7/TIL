import os
import pygame
####################################################################################
# 기본 초기화(반드시 해야하는 것들)

# init은 초기화를 해주는 작업, 반드시 해야함
pygame.init()

# 화면 크기 설정
screen_width = 640 # 가로 크기
screen_height = 480 # 세로 크기
screen = pygame.display.set_mode((screen_width, screen_height))

# 화면 타이틀
pygame.display.set_caption('Pang Game') # 이름

# FPS
clock = pygame.time.Clock()
####################################################################################


# 1. 사용자 게임 초기화(배경 화면, 게임 이미지, 좌표, 속도, 폰트 등)
# 현재 파일의 위치를 반환해준다
current_path = os.path.dirname(__file__)
image_path = os.path.join(current_path,'images') # images 폴더 위치 반환

# 배경 만들기
background = pygame.image.load(os.path.join(image_path,'background.png'))

# 스테이지 만들기
stage = pygame.image.load(os.path.join(image_path,'stage.png'))
stage_size = stage.get_rect().size
stage_height = stage_size[1] # 스테이지의 높이 위에 캐릭터를 두기 위해 사용


# 캐릭터 만들기
character = pygame.image.load(os.path.join(image_path,'character.png'))
character_size = character.get_rect().size
character_width = character_size[0]
character_height = character_size[1]
character_x_pos = (screen_width / 2) - (character_width / 2)
character_y_pos = screen_height - character_height - stage_height



# 이벤트 루프
running = True # 게임이 진행중인지 확인
while running:
    dt = clock.tick(60) # 초당 프레임 수 설정

    # 캐릭터가 1초동안 100만큼 이동을 해야한다고 할 때
    # 10 fps : 1초 동안 10번 동작 -> 1번에 10만큼 이동해야함 -> 10*10
    # 20 fps : 1초 동안 20번 동작 - > 1번에 5만큼 이동헤야함 -> 5*20

    # print('fps : ' + str(clock.get_fps())) # 초당 프레임 수 출력


    # 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get(): # 반드시 작성되어야 하는 코드, 어떤 이벤트가 발생하였는지?
        if event.type == pygame.QUIT: # 종료 버튼을 눌렀을 경우 게임은 종료, 창이 닫히는 이벤트가 발생하였는지?
            running = False # while문 종료, 게임 진행중 아님


    # 3. 게임 캐릭터 위치 정의
    # 포지션 값을 변경해준다


    # 4. 충돌 처리
    # 충돌 처리 (실제로 위치하고 있는 rect정보를 업데이트)
   


    # 5. 화면에 그리기
    screen.blit(background,(0,0))

    screen.blit(stage,(0,screen_height - stage_height))

    screen.blit(character,(character_x_pos,character_y_pos))


    # 게임화면 다시 그리기
    pygame.display.update()



# 게임 종료
pygame.quit()