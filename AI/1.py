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

visited = {}
level = {}
parent = {}
bfs_traversal_op = []
queue = Queue()

for node in adj_list.keys():
    visited[node] = False
    parent[node] = None
    level[node] = -1

s = "A"
visited[s] = True
level[s] = 0
#parent[s] = none
    
queue.put(s)
    
while not queue.empty():
    u = queue.get()
    bfs_traversal_op.append(u)
    
    if(u == "D"):
        break
        
    for v in adj_list[u]:
        if not visited[v]:
            visited[v] = True
            parent[v] = u
            level[v] = level[u] + 1
            queue.put(v)
            

print("Traverse : ",bfs_traversal_op)    
    