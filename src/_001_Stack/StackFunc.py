class Stack:
    def __init__(self):
        self.stack = []

    def push(self, item):
        self.stack.append(item)
        print(f"{item} Pushed!")

    def pop(self):
        if not self.is_empty():
            print(f"{self.stack.pop()} Popped!")
        else:
            print("Stack is empty. Cannot pop.")

    def peek(self):
        if not self.is_empty():
            print(f"{self.stack[-1]} Peeked!")
        else:
            print("Stack is empty. Cannot peek.")

    def is_empty(self):
        return len(self.stack) == 0

# 사용 예시
stack = Stack()
stack.push(1)
stack.push(2)
stack.push(3)
stack.pop()
stack.peek()
