# def printInformation(location):
#     print("Location " + location + " is Dirty.")
#     print("Cost for CLEANING " + location + ": 1")
#     print("Location " + location + " has been Cleaned.")


# def vacuumCleaner(goalState, currentState, location):
#     # printing necessary data
#     print("Goal State Required:", goalState)
#     print("Vacuum is placed in Location " + location)

#     # cleaning locations
#     totalCost = 0

#     while (currentState != goalState):
#         if (location == "A"):
#             # cleaning
#             if (currentState["A"] == 1):
#                 currentState["A"] = 0
#                 totalCost += 1
#                 printInformation("A")
#             # moving
#             if (currentState["B"] == 1 or currentState["C"] == 1):
#                 print("Moving right to the location B.\nCost for moving RIGHT: 1")
#                 location = "B"
#                 totalCost += 1

#         elif (location == "B"):
#             # cleaning
#             if (currentState["B"] == 1):
#                 currentState["B"] = 0
#                 totalCost += 1
#                 printInformation("B")
#             # moving
#             if (currentState["A"] == 1):
#                 print("Moving left to the location A.\nCost for moving LEFT: 1")
#                 location = "A"
#                 totalCost += 1
#             elif (currentState["C"] == 1):
#                 print("Moving right to the location C.\nCost for moving RIGHT: 1")
#                 location = "C"
#                 totalCost += 1

#         elif (location == "C"):
#             # cleaning
#             if (currentState["C"] == 1):
#                 currentState["C"] = 0
#                 totalCost += 1
#                 printInformation("C")
#             # moving
#             if (currentState["A"] == 1 or currentState["B"] == 1):
#                 print("Moving left to the location B.\nCost for moving LEFT: 1")
#                 location = "B"
#                 totalCost += 1
#     print("GOAL STATE:", currentState)
#     return totalCost


# # declaring dictionaries
# goalState = {"A": 0, "B": 0, "C": 0}
# currentState = {"A": -1, "B": -1, "C": -1}

# # taking input from user
# location = input("Enter Location of Vacuum (A/B/C): ");
# print("Value 1 represets dirty room, while value 0 represents a clean room.")
# currentState["A"] = int(input("Enter status of A (0/1): "))
# currentState["B"] = int(input("Enter status of B (0/1): "))
# currentState["C"] = int(input("Enter status of C (0/1): "))

# # calling function
# totalCost = vacuumCleaner(goalState, currentState, location)
# print("Performance Measurement:", totalCost)


# Corrected code with indentation fixed
from random import randint
from random import choice
from time import sleep

# Global Variables
env_dirty_state = {0: False, 1: False}
vaccum_location = 0

# Functions
def set_vaccum_loc():
    global vaccum_location
    vaccum_location = randint(0, 1)

def rand_state_generation():
    global env_dirty_state
    state = [True, False]
    env_dirty_state[0] = choice(state)
    env_dirty_state[1] = choice(state)

def clean_rooms(room):
    if room == 0:
        print("Room A is DIRTY. Cleaning it up....")
        sleep(3)
        env_dirty_state[room] = False
        print("Room A cleaned.\nMoving...")
        sleep(3)
    elif room == 1:
        print("Room B is DIRTY. Cleaning it up....")
        sleep(3)
        env_dirty_state[room] = False
        print("Room B cleaned.\nMoving...")
        sleep(3)

# Simple Reflex Agent
def simple_reflex_agent():
    global env_dirty_state, vaccum_location
    name_of_room = {0: 'A', 1: 'B'}
    iter_count = 0
    set_vaccum_loc()
    rand_state_generation()
    cleaned_room = 0
    sleep(2)

    while True:
        if iter_count > 10 and cleaned_room == 2:
            print("Both rooms cleaned.")
            break
        iter_count += 1

        if cleaned_room == 2:
            cleaned_room = 0
            print("Both Room's Clean. ")
            print("Robot Going to SLEEP. ")
            sleep(5)
            print("---Waking Up----\n")
            set_vaccum_loc()
            rand_state_generation()

        if cleaned_room == 0:
            print(f"----Room Stats:---------")
            print(f"Vaccum in Room {name_of_room[vaccum_location]}.\n")
            print(f"Dirty State: \nA: {env_dirty_state[0]}, B: {env_dirty_state[1]}\n\n")
            sleep(2)

        if vaccum_location == 0:
            if env_dirty_state[vaccum_location]:
                clean_rooms(vaccum_location)
            else:
                if cleaned_room != 2:
                    print("Room A is clean. Moving to Room B...")
                    vaccum_location = 1
                    cleaned_room += 1
        elif vaccum_location == 1:
            if env_dirty_state[vaccum_location]:
                clean_rooms(vaccum_location)
            else:
                if cleaned_room != 2:
                    print("Room B is clean. Moving to Room A...")
                    vaccum_location = 0
                    cleaned_room += 1

def main():
    print("\t-------Vaccum Cleaner AI Program--------\n\n")
    simple_reflex_agent()

if __name__ == "__main__":
    main()
