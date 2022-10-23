# a simple parser for python. use get_number() and get_word() to read
def parser():
    while 1:
        data = list(input().split(' '))
        for number in data:
            if len(number) > 0:
                # yield(num)

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

# numpy and scipy are available for use
from xml.etree.ElementTree import QName

from requests import get
# import numpy
# import scipy

n = get_number()
for _ in range(n):
    cuts = set()
    j = get_number()
    if j == 0:
        print(1)
        continue
    for _ in range(j):
        i =  get_number()
        if (i < 0):
            i = i%360

        d = i%180
        cuts.add(d)
    print(len(cuts)*2)

        
            
