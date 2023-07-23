# DFS

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
dfs_traversal_op = []

target_node = "j"

for node in adj_list.keys():
    state[node] = "Idle"
    parent[node] = None
    trav_step[node] = [-1, -1]
    
step = 0

def dfs_func(u):
    global step
    state[u] = "Start"
    trav_step[u][0] = step
    dfs_traversal_op.append(u)
    step += 1
    
    if u == target_node:
        return True
    
    for v in adj_list[u]:
        if state[v] == "Idle":
            parent[v] = u
            if dfs_func(v):
                return True

    state[u] = "End"
    trav_step[u][1] = step
    step += 1
    return False
    
if dfs_func("A"):
    print("Target node found!")
else:
    print("Target node not found!")
print(dfs_traversal_op)