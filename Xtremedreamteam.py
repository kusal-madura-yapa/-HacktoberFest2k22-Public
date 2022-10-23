def parser():
    while 1:
        d = list(input().split(' '))
        for num in d:
            if len(num) > 0:
                yield(num)

input_parser = parser()

def gt_wd():
    global input_parser
    return next(input_parser)

def get_num():
    data = gt_wd()
    # try:
    #     return int(d)
    # except ValueError:
    #     return float(d)

import numpy
import scipy

def recurs(phrase, n_id, info, yes_node, no_node, nodes_leaves_id, res):
    if n_id in nodes_leaves_id:
        res.append(info[n_id])
    elif info[n_id] in phrase:
        recurs(phrase, yes_node[str(n_id)],info, yes_node, no_node, nodes_leaves_id, res)
    else:
        recurs(phrase, yes_node[str(n_id)], info, yes_node, no_node, nodes_leaves_id, res)
        recurs(phrase, no_node[str(n_id)], info, yes_node, no_node, nodes_leaves_id, res)

n_nodes, phrases = input().split()
n_nodes = int(n_nodes)
phrases = int(phrases)

nodes_leaves_id = []
nodes_internal = []
rt = []
nodes = []
info = {}
yes_node = {}
no_node = {}
for i in range(n_nodes):
    new_node = input().split()
    nodes.append(new_node)
    info[new_node[1]] = new_node[2]
    if new_node[0] == 'I':
        yes_node[new_node[1]] = new_node[3]
        no_node[new_node[1]] = new_node[4]
        rt.append(new_node[1])
    else:
        nodes_leaves_id.append(new_node[1])

for i in nodes:
    if i[0] == 'I':
        if i[3] in rt:
            rt.remove(i[3])
        if i[4] in rt:
            rt.remove(i[4])



for p in range(phrases):
    phrase = input()
    res = []
    recurs(phrase, rt[0], info, yes_node, no_node, nodes_leaves_id, res)
    res.sort()
    res = " ".join(res)
    print(res)
