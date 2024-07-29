## WAP to implement Shift Reduce Parser.

# Define the grammar rules
# Example grammar:
# E -> E + E
# E -> E * E
# E -> ( E )
# E -> id

class ShiftReduceParser:
    def __init__(self, grammar):
        self.grammar = grammar
        self.stack = []
        self.input = []
        self.action = None

    def parse(self, tokens):
        self.stack = []
        self.input = tokens + ["$"]
        self.action = None

        while self.input:
            print(f"Stack: {self.stack}, Input: {self.input}, Action: {self.action}")
            if self.reduce():
                if self.stack == ["E"] and self.input == ["$"]:
                    print(f"Stack: {self.stack}, Input: {self.input}, Action: Accepted")                    
                    return True
                continue
            if self.shift():
                continue

            print("Error: No valid actions available")
            return False

        print(f"Stack: {self.stack}, Input: {self.input}, Action: {self.action}")
        if self.stack == ["E"] and self.input == ["$"]:
            print("Accepted")
            return True
        else:
            print("Rejected")
            return False

    def shift(self):
        if self.input and self.input[0] != "$":
            self.action = "Shift"
            self.stack.append(self.input.pop(0))
            return True
        return False

    def reduce(self):
        for lhs, rhs_list in self.grammar.items():
            for rhs in rhs_list:
                if self.stack[-len(rhs):] == rhs:
                    self.action = f"Reduce by {lhs} -> {' '.join(rhs)}"
                    self.stack = self.stack[:-len(rhs)]
                    self.stack.append(lhs)
                    return True
        return False


if __name__ == "__main__":
    grammar = {
        "E": [
            ["E", "+", "E"],
            ["E", "*", "E"],
            ["(", "E", ")"],
            ["id"]
        ]
    }

    parser = ShiftReduceParser(grammar)

    tokens = ["id", "+", "id"]
    parser.parse(tokens)