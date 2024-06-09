class Stack:
    def __init__(self):
        self.items = []

    def push(self, item):
        self.items.append(item)

    def pop(self):
        if not self.is_empty():
            return self.items.pop()
        else:
            raise IndexError("pop from empty stack")

    def is_empty(self):
        return len(self.items) == 0

    def peek(self):
        if not self.is_empty():
            return self.items[-1]
        else:
            raise IndexError("peek from empty stack")

# Usage of custom Stack class with user inputs
stack = Stack()

while True:
    action = input("Enter 'push' to add an element, 'pop' to remove an element, or 'quit' to exit: ").strip().lower()

    if action == 'push':
        item = input("Enter the element to push onto the stack: ")
        stack.push(item)
        print(f"Pushed {item} onto the stack.")
    elif action == 'pop':
        try:
            item = stack.pop()
            print(f"Popped {item} from the stack.")
        except IndexError as e:
            print(e)
    elif action == 'quit':
        print("Exiting.")
        break
    else:
        print("Invalid action. Please enter 'push', 'pop', or 'quit'.")

# Print the final state of the stack
print("Final stack:", stack.items)
