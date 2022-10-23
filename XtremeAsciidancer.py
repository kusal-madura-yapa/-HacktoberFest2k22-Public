# a simple parser for python. use get_number() and get_word() to read
def parser():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                yield(number)   

input_parser = parser()

def get_word():
    global input_parser
    return next(input_parser)

def get_number():
    data = get_word()
    try:
        return int(data)
    except ValueError:
        return float(data)

def printman (lh,rh,ll,rl):
    lhand = [[' ','/'],['(',' '],[' ','<']]
    rhand = [[' ','\\'],[')',' '],[' ','>']]
    lleg = ['/','<']
    rleg = ['\\','>']
    print(lhand[lh][0]+'o'+rhand[rh][0])
    print(lhand[lh][1]+'|'+rhand[rh][1])
    print(lleg[ll]+' '+rleg[rl])
tests = get_number()


for _ in range(tests):
    lh,rh,ll,rl = 1,0,3,2
    state = [0,0,0,0]
    commands = get_number()
    for _ in range(commands):
        command = input().replace('\r','')
        # print(command)
        
        command = command.split(' ')

        key = command [0]
        if (key == 'say'):
            print(''.join([' '+i for i in command][1:])[1:])
        elif (key == 'turn'):
            tstate = [i for i in state]
            tstate[lh] = state[rh]
            tstate[rh] = state[lh]
            tstate[ll] = state[rl]
            tstate[rl] = state[ll]
            state = [i for i in tstate]
            t = ll
            ll = rl 
            rl = t
            t = lh
            lh = rh
            rh = t

            printman(state[0],state[1],state[2],state[3])      
        elif command [0] == 'left':
            if command[1] == 'hand':
                if command[-1] == 'head':
                    state[lh] = 1

                elif command[-1] == 'hip':
                    state[lh] = 2
                elif command[-1] == 'start':
                    state[lh] = 0    
            elif command[1] == 'leg':
                if command[-1] == 'in':
                    state[ll] = 1
                elif command[-1] == 'out':
                    state[ll] = 0

            printman(state[0],state[1],state[2],state[3])
 

        elif command [0] == 'right':
            if command[1] == 'hand':
                if command[-1] == 'head':
                    state[rh] = 1

                elif command[-1] == 'hip':
                    state[rh] = 2
                elif command[-1] == 'start':
                    state[rh] = 0    
            elif command[1] == 'leg':
                if command[-1] == 'in':
                    state[rl] = 1
                elif command[-1] == 'out':
                    state[rl] = 0

            printman(state[0],state[1],state[2],state[3])