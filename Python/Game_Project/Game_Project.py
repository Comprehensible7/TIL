# 모든 공을 없애면 게임 종료 (성공)
# 캐릭터는 공에 닿으면 게임 종료 (실패)
# 시간 제한 99초 초과 시 게임 종료(실패)

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

# 캐릭터 이동 방향
character_to_x = 0

# 캐릭터 이동 속도
character_speed = 5

# 무기 만들기
weapon = pygame.image.load(os.path.join(image_path,'weapon.png'))
weapon_size = weapon.get_rect().size
weapon_width = weapon_size[0]

# 무기는 한번에 여러 발 발사가능
weapons = []

# 무기 이동 속도
weapon_speed = 10

# 공 만들기 (4개 크기에 별도로 처리)
ball_images = [
    pygame.image.load(os.path.join(image_path,'ballon1.png')),
    pygame.image.load(os.path.join(image_path,'ballon2.png')),
    pygame.image.load(os.path.join(image_path,'ballon3.png')),
    pygame.image.load(os.path.join(image_path,'ballon4.png'))]

# 공 크기에 따른 최초 스피드
ball_speed_y = [-18, -15, -12, -9] # index 0,1,2,3에 해당하는 값

# 공들
balls = []

# 최초 발생하는 큰 공 추가
balls.append({
    'pos_x' : 50, # 공의 x좌표
    'pos_y' : 50, # 공의 y좌표
    'img_idx' : 0, # 공의 이미지 인덱스
    'to_x' : 3, # 공의 x축 이동 방향 -3이면 좌측 3이면 우측으로 이동
    'to_y' : -6, # 공이 -면 위로 +면 아래로
    'init_spd_y' : ball_speed_y[0] # y로 최초 속도를 정의 
    })

# 사라질 무기, 공 정보 저장 변수
weapon_to_remove = -1
ball_to_remove = -1


# Font 정의
game_font = pygame.font.Font(None, 40)
total_time = 100
start_ticks = pygame.time.get_ticks() # 시작시간 정의

# 게임 종료 메세지 / Time out(시간 초과), Mission complete(성공), Game over(캐릭터가 공에 맞음)
game_result = 'Game Over'

# 이벤트 루프
running = True # 게임이 진행중인지 확인
while running:
    dt = clock.tick(30) # 초당 프레임 수 설정

    # 캐릭터가 1초동안 100만큼 이동을 해야한다고 할 때
    # 10 fps : 1초 동안 10번 동작 -> 1번에 10만큼 이동해야함 -> 10*10
    # 20 fps : 1초 동안 20번 동작 - > 1번에 5만큼 이동헤야함 -> 5*20

    # print('fps : ' + str(clock.get_fps())) # 초당 프레임 수 출력


    # 2. 이벤트 처리 (키보드, 마우스 등)
    for event in pygame.event.get(): # 반드시 작성되어야 하는 코드, 어떤 이벤트가 발생하였는지?
        if event.type == pygame.QUIT: # 종료 버튼을 눌렀을 경우 게임은 종료, 창이 닫히는 이벤트가 발생하였는지?
            running = False # while문 종료, 게임 진행중 아님

        if event.type == pygame.KEYDOWN:
            if event.key == pygame.K_LEFT: # 캐릭터를 좌측으로
                character_to_x -= character_speed
            elif event.key == pygame.K_RIGHT: # 캐릭터를 우측으로
                character_to_x += character_speed
            elif event.key == pygame.K_SPACE: # 무기발사
                weapon_x_pos = character_x_pos + (character_width / 2) - (weapon_width / 2)
                weapon_y_pos = character_y_pos
                weapons.append([weapon_x_pos, weapon_y_pos])
            
        if event.type == pygame.KEYUP:
            if event.key == pygame.K_LEFT or event.key == pygame.K_RIGHT:
                character_to_x = 0


    # 3. 게임 캐릭터 위치 정의
    # 포지션 값을 변경해준다
    character_x_pos += character_to_x

    if character_x_pos < 0:
        character_x_pos = 0
    elif character_x_pos > screen_width - character_width:
        character_x_pos = screen_width - character_width 

    # 무기 위치 조정
    # 100, 200 -> 180, 160, 140, ...
    # 500, 200 -> 180, 160, 140, ...
    # 모든 무기에 대해서 y의 위치를 변경가능
    weapons = [ [w[0], w[1] - weapon_speed] for w in weapons] # 무기 위치를 위로 올린다

    # 천장에 닿은 무기 없애기
    weapons = [ [w[0], w[1]] for w in weapons if w[1] > 0]

    # 공 위치 정의
    for ball_idx, ball_val in enumerate(balls):
        ball_pos_x = ball_val['pos_x']
        ball_pos_y = ball_val['pos_y']
        ball_img_idx = ball_val['img_idx']

        ball_size = ball_images[ball_img_idx].get_rect().size
        ball_width = ball_size[0]
        ball_height = ball_size[1]

        # 공이 벽에 닿았을 경우 튕기도록 설정 (가로)
        if ball_pos_x < 0 or ball_pos_x > screen_width - ball_width:
            ball_val['to_x'] = ball_val['to_x'] * -1 

        # 세로 위치
        # 스테이지에 튕겨서 올라가는 처리
        if ball_pos_y >= screen_height - stage_height - ball_height:
            ball_val['to_y'] = ball_val['init_spd_y']
        else: # 그 외의 모든 경우에는 속도를 증가
            ball_val['to_y'] += 0.5

        ball_val['pos_x'] += ball_val['to_x']
        ball_val['pos_y'] += ball_val['to_y']

    # 4. 충돌 처리
    # 충돌 처리 (실제로 위치하고 있는 rect정보를 업데이트)
    
    # 캐릭터 rect정보 가져와서 업데이트
    character_rect = character.get_rect()
    character_rect.left = character_x_pos
    character_rect.right = character_y_pos

    for ball_idx, ball_val in enumerate(balls):
        ball_pos_x = ball_val['pos_x']
        ball_pos_y = ball_val['pos_y']
        ball_img_idx = ball_val['img_idx']

        # 공 rect정보 업데이트
        ball_rect = ball_images[ball_img_idx].get_rect()
        ball_rect.left = ball_pos_x
        ball_rect.top = ball_pos_y

        # 공과 캐릭터 충돌 처리
        if character_rect.colliderect(ball_rect):
            running = False
            break

        # 공과 무기들 충돌 처리
        for weapon_idx, weapon_val in enumerate(weapons):
            weapon_x_pos = weapon_val[0]
            weapon_y_pos = weapon_val[1]

            # 무기 rect정보 업데이트
            weapon_rect = weapon.get_rect()
            weapon_rect.left = weapon_x_pos
            weapon_rect.top = weapon_y_pos

            # 충돌 체크
            if weapon_rect.colliderect(ball_rect):
                weapon_to_remove = weapon_idx # 해당 무기 제거 위한 설정
                ball_to_remove = ball_idx # 해당 공 제거 위한 설정

                # 가장 작은 크기의 공이 아니라면 다음 단걔의 공으로 나눠주기
                if ball_img_idx < 3:

                    # 현재 공 크기 정보를 가지고옴
                    ball_width = ball_rect.size[0]
                    ball_height = ball_rect.size[1]

                    # 나눠진 공 정보
                    small_ball_rect = ball_images[ball_img_idx + 1].get_rect()
                    small_ball_width = small_ball_rect.size[0]
                    small_ball_height = small_ball_rect.size[1]

                    # 좌측으로 튕겨나감
                    balls.append({
                        'pos_x' : ball_pos_x + (ball_width / 2) - (small_ball_width / 2), # 공의 x좌표
                        'pos_y' : ball_pos_y + (ball_height / 2) - (small_ball_height / 2), # 공의 y좌표
                        'img_idx' : ball_img_idx + 1, # 공의 이미지 인덱스
                        'to_x' : -3, # 공의 x축 이동 방향 -3이면 좌측 3이면 우측으로 이동
                        'to_y' : -6, # 공이 -면 위로 +면 아래로
                        'init_spd_y' : ball_speed_y[ball_img_idx + 1] # y로 최초 속도를 정의 
                        })
                    # 우측으로 튕겨나감
                    balls.append({
                        'pos_x' : ball_pos_x + (ball_width / 2) - (small_ball_width / 2), # 공의 x좌표
                        'pos_y' : ball_pos_y + (ball_height / 2) - (small_ball_height / 2), # 공의 y좌표
                        'img_idx' : ball_img_idx + 1, # 공의 이미지 인덱스
                        'to_x' : 3, # 공의 x축 이동 방향 -3이면 좌측 3이면 우측으로 이동
                        'to_y' : -6, # 공이 -면 위로 +면 아래로
                        'init_spd_y' : ball_speed_y[ball_img_idx + 1] # y로 최초 속도를 정의 
                        })

                break

        else:   # 계속 게임을 진행
            continue    # 안쪽 for문 조건이 맞지 않으면 continue. 바깥 for문 계속 수행
        break   # 안쪽 for문에서 break를 만나면 여기로 진입 가능. 2중 for문을 한번에 탈출


    # 충돌된 공 or 무기 없애기
    if ball_to_remove > -1 :
        del balls[ball_to_remove]
        ball_to_remove = -1

    if weapon_to_remove > -1:
        del weapons[weapon_to_remove]
        weapon_to_remove = -1

    # 모든 공을 없앤 경우 게임 종료 (성공)
    if len(balls) == 0:
        game_result = 'Mission Complete'
        running = False

    # 5. 화면에 그리기
    screen.blit(background,(0,0))

    for weapon_x_pos, weapon_y_pos in weapons:
        screen.blit(weapon, (weapon_x_pos, weapon_y_pos))

    for idx, val in enumerate(balls):
        ball_pos_x = val['pos_x']
        ball_pos_y = val['pos_y']
        ball_img_idx = val['img_idx']
        screen.blit(ball_images[ball_img_idx],(ball_pos_x,ball_pos_y))

    screen.blit(stage,(0,screen_height - stage_height))
    screen.blit(character,(character_x_pos,character_y_pos))

    # 경과 시간 계산
    elapsed_time = (pygame.time.get_ticks() - start_ticks) / 1000 # ms -> s
    timer = game_font.render('Time : {}'.format(int(total_time - elapsed_time)), True, (255,255,255))
    screen.blit(timer, (10,10))

    # 시간 초과
    if total_time - elapsed_time <= 0:
        game_result = 'Time Out'
        running = False

    # 게임화면 다시 그리기
    pygame.display.update()

# 게임오버 메세지 
msg = game_font.render(game_result, True, (255,255,0)) # 노란색

msg_rect = msg.get_rect(center=(int(screen_width / 2), int(screen_height / 2)))
screen.blit(msg, msg_rect)
pygame.display.update()

# 2초정도 대기
pygame.time.delay(2000)

# 게임 종료
pygame.quit()

