class ArrayStack {
    constructor(size) {
        this.size = size;
        this.stack = new Array(size).fill(0);
        this.top = -1;
    }

    push(item) {
        this.top++;
        this.stack[this.top] = item;
        console.log(`${this.stack[this.top]} Push!`);
    }

    pop() {
        console.log(`${this.stack[this.top]} Pop!`);
        const poppedItem = this.stack[this.top];
        this.stack[this.top] = 0;
        this.top--;
        return poppedItem;
    }

    peek() {
        console.log(`${this.stack[this.top]} Peek!`);
    }
}

// 사용 예시
const stack = new ArrayStack(5);
stack.push(1);
stack.push(2);
stack.peek();
stack.pop();
stack.peek();