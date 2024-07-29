class IntermediateCodeGenerator:
    def __init__(self):
        self.temp_counter = 0
        self.instructions = []
        self.label_counter = 0

    def generate_temp(self):
        self.temp_counter += 1
        return f"t{self.temp_counter - 1}"

    def generate_label(self):
        self.label_counter += 1
        return f"L{self.label_counter - 1}"

    def add_instruction(self, instruction):
        self.instructions.append(instruction)

    def generate_code(self, ast):
        self.visit(ast)
        return self.instructions

    def visit(self, node):
        if isinstance(node, BinOp):
            return self.visit_binop(node)
        elif isinstance(node, Num):
            return node.value
        elif isinstance(node, Variable):
            return node.name

    def visit_binop(self, node):
        left = self.visit(node.left)
        right = self.visit(node.right)
        result = self.generate_temp()
        self.add_instruction(f"{result} = {left} {node.op} {right}")
        return result


class ASTNode:
    pass


class BinOp(ASTNode):
    def __init__(self, left, op, right):
        self.left = left
        self.op = op
        self.right = right


class Num(ASTNode):
    def __init__(self, value):
        self.value = value


class Variable(ASTNode):
    def __init__(self, name):
        self.name = name


# Example usage
if __name__ == "__main__":
    # Constructing AST for the expression: (3 + 5) * 2
    ast = BinOp(
        left=BinOp(left=Num(3), op='*', right=Num(5)),
        op='*',
        right=Num(2)
    )

    # Generate intermediate code
    generator = IntermediateCodeGenerator()
    intermediate_code = generator.generate_code(ast)

    # Print intermediate code
    for instruction in intermediate_code:
        print(instruction)
