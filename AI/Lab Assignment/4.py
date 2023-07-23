# ## water jug problem

# print("Water Jug Problem")
# x = int(input("Enter x: "))
# y = int(input("Enter y: "))
# while True:
#     r = int(input("Enter the rule no: "))
#     if r== 1:
#         if x<4:
#             x=4
#     if r== 2:
#         if y<3:
#             y=3
#     if r== 5:
#         if x>0:
#             x=0
#     if r==-6:
#         if y>0:
#             y=0
#     if r== 7:
#         if x+y>=4 and y>0:
#             x,y=4,y-(4-x)
#     if r== 8:
#         if x+y>=3 and x>0:
#             x,y=x-(3-y),3
#     if r== 9:
#         if x+y<=4 and y>0:
#             x,y=x+y,0
#     if r== 10:
#         if x+y<=3 and x>0:
#             x, y = 0, x + y
#     print("x = ", x)
#     print("y = ", y)
#     if (x == 2):
#         print("The result is a Goal State")
#     break

def water_jug_problem(x, y):
    while True:
        r = int(input("Enter the rule no: "))
        if r == 1:
            if x < 4:
                x = 4
        elif r == 2:
            if y < 3:
                y = 3
        elif r == 5:
            if x > 0:
                x = 0
        elif r == -6:
            if y > 0:
                y = 0
        elif r == 7:
            if x + y >= 4 and y > 0:
                x, y = 4, y - (4 - x)
        elif r == 8:
            if x + y >= 3 and x > 0:
                x, y = x - (3 - y), 3
        elif r == 9:
            if x + y <= 4 and y > 0:
                x, y = x + y, 0
        elif r == 10:
            if x + y <= 3 and x > 0:
                x, y = 0, x + y

        print("x =", x)
        print("y =", y)

        if x == 2:
            print("The result is a Goal State")
            return x, y, True

if __name__ == "__main__":
    print("Water Jug Problem")
    x = int(input("Enter x: "))
    y = int(input("Enter y: "))
    result_x, result_y, is_goal_state = water_jug_problem(x, y)

    if not is_goal_state:
        print("Goal state not reached.")

# def water_jug_problem(x, y):
#     while True:
#         r = int(input("Enter the rule no: "))
#         # Rule 1: Fill the first jug (x) to its maximum capacity (4 liters)
#         if r == 1:
#             if x < 4:
#                 x = 4
#         # Rule 2: Fill the second jug (y) to its maximum capacity (3 liters)
#         elif r == 2:
#             if y < 3:
#                 y = 3
#         # Rule 5: Empty the first jug (x) completely
#         elif r == 5:
#             if x > 0:
#                 x = 0
#         # Rule -6: Empty the second jug (y) completely (negative sign indicates emptying)
#         elif r == -6:
#             if y > 0:
#                 y = 0
#         # Rule 7: Pour water from the second jug (y) to the first jug (x) until the first jug is full (4 liters), but the second jug still has water (y > 0)
#         elif r == 7:
#             if x + y >= 4 and y > 0:
#                 x, y = 4, y - (4 - x)
#         # Rule 8: Pour water from the first jug (x) to the second jug (y) until the second jug is full (3 liters), but the first jug still has water (x > 0)
#         elif r == 8:
#             if x + y >= 3 and x > 0:
#                 x, y = x - (3 - y), 3
#         # Rule 9: Pour water from both jugs (x and y) until the sum of water in both jugs is 4 liters or less, and the second jug is empty (y = 0)
#         elif r == 9:
#             if x + y <= 4 and y > 0:
#                 x, y = x + y, 0
#         # Rule 10: Pour water from both jugs (x and y) until the sum of water in both jugs is 3 liters or less, and the first jug is empty (x = 0)
#         elif r == 10:
#             if x + y <= 3 and x > 0:
#                 x, y = 0, x + y

#         print("x =", x)
#         print("y =", y)

#         if x == 2:
#             print("The result is a Goal State")
#             return x, y, True

# if __name__ == "__main__":
#     print("Water Jug Problem")
#     x = int(input("Enter x: "))  # Capacity of the first jug
#     y = int(input("Enter y: "))  # Capacity of the second jug
#     result_x, result_y, is_goal_state = water_jug_problem(x, y)

#     if not is_goal_state:
#         print("Goal state not reached.")
