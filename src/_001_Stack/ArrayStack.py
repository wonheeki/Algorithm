class ArrayStack:
    def __init__(self, size):
        self.size = size
        self.stack = [0] * size
        self.top = -1

    def push(self, item):
        self.top += 1
        self.stack[self.top] = item
        print(str(self.stack[self.top]) + " Push!")

    def pop(self):
        print(str(self.stack[self.top]) + " Pop!")
        pop_item = self.stack[self.top]
        self.stack[self.top] = 0
        self.top -= 1
        return pop_item

    def peek(self):
        print(str(self.stack[self.top]) + " Peek!")

# 사용 예시
stack = ArrayStack(5)
stack.push(1)
stack.push(2)
stack.peek()
stack.pop()
stack.peek()