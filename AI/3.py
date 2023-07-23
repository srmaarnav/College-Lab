# DLS

from queue import Queue

adj_list = {
    "A":["B","D"],
    "B":["A","C"],
    "C":["B"],
    "D":["A","E","F"],
    "E":["D","F","G"],
    "F":["D","E","H"],
    "G":["E","H"],
    "H":["F","G"]
}


state = {}
trav_step = {}
parent = {}
dls_traversal_op = []

target_node = "F"
depth_limit = 1

for node in adj_list.keys():
    state[node] = "Idle"
    parent[node] = None
    trav_step[node] = [-1, -1]
    
step = 0

def dls_func(u, depth):
    global step
    state[u] = "Start"
    trav_step[u][0] = step
    dls_traversal_op.append(u)
    step += 1
    
    if depth == 0:
        state[u] = "End"
        trav_step[u][1] = step
        step+=1
        return False
    
    if u == target_node:
        return True
    
    for v in adj_list[u]:
        if state[v] == "Idle":
            parent[v] = u
            if dls_func(v, depth-1):
                return True

    state[u] = "End"
    trav_step[u][1] = step
    step += 1
    return False
    
if dls_func("A", depth_limit):
    print("Target node found within the depth limit!")
else:
    print("Target node not found within the depth limit.")

print(dls_traversal_op)