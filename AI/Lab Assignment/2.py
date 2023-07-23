# from queue import Queue

# adj_list = {
#     "A":["B","D"],
#     "B":["A","C"],
#     "C":["B"],
#     "D":["A","E","F"],
#     "E":["D","F","G"],
#     "F":["D","E","H"],
#     "G":["E","H"],
#     "H":["F","G"]
# }

# visited = {}
# level = {}
# parent = {}
# bfs_traversal_op = []
# queue = Queue()

# for node in adj_list.keys():
#     visited[node] = False
#     parent[node] = None
#     level[node] = -1

# s = "A"
# visited[s] = True
# level[s] = 0
# #parent[s] = none
    
# queue.put(s)
    
# while not queue.empty():
#     u = queue.get()
#     bfs_traversal_op.append(u)
    
#     if(u == "D"):
#         break
        
#     for v in adj_list[u]:
#         if not visited[v]:
#             visited[v] = True
#             parent[v] = u
#             level[v] = level[u] + 1
#             queue.put(v)
            
# print("Traverse : ",bfs_traversal_op)    
    
from queue import Queue

def bfs_search(adj_list, start_node, target_node):
    visited = {}
    level = {}
    parent = {}
    bfs_traversal_op = []
    queue = Queue()

    for node in adj_list.keys():
        visited[node] = False
        parent[node] = None
        level[node] = -1

    visited[start_node] = True
    level[start_node] = 0
    queue.put(start_node)

    while not queue.empty():
        u = queue.get()
        bfs_traversal_op.append(u)

        if u == target_node:
            return bfs_traversal_op

        for v in adj_list[u]:
            if not visited[v]:
                visited[v] = True
                parent[v] = u
                level[v] = level[u] + 1
                queue.put(v)

    # If target_node not found, return None
    return 0

if __name__ == "__main__":
    adj_list = {
        "A": ["B", "D"],
        "B": ["A", "C"],
        "C": ["B"],
        "D": ["A", "E", "F"],
        "E": ["D", "F", "G"],
        "F": ["D", "E", "H"],
        "G": ["E", "H"],
        "H": ["F", "G"]
    }

    start_node = "A"
    target_node = "D"

    result = bfs_search(adj_list, start_node, target_node)
    if result != 0:
        print(f"Target node {target_node} found. BFS Traversal: {result}")
    else:
        print(f"Target node {target_node} not reachable from {start_node}.")
