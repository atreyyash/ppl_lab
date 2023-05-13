#include <iostream>
#include <stack>

using namespace std;

void towersOfHanoi(int n, char fromRod, char toRod, char auxRod) {
    // Create three stacks to represent the three rods
    stack<int> s1, s2, s3;

    // Push all the disks onto the first rod
    for (int i = n; i >= 1; i--) {
        s1.push(i);
    }

    // Initialize the total number of moves and the source and destination rods
    int totalMoves = (1 << n) - 1;
    char src = fromRod, dest = toRod, aux = auxRod;

    // If the total number of disks is even, swap the destination and auxiliary rods
    if (n % 2 == 0) {
        dest = auxRod;
        aux = toRod;
    }

    // Perform the moves iteratively
    for (int i = 1; i <= totalMoves; i++) {
        if (i % 3 == 1) {
            // Move the top disk from the source rod to the destination rod or the auxiliary rod
            if (s1.empty() || (!s2.empty() && s2.top() < s1.top())) {
                cout << "Move disk " << s2.top() << " from " << src << " to " << dest << endl;
                s1.push(s2.top());
                s2.pop();
            }
            else {
                cout << "Move disk " << s1.top() << " from " << src << " to " << aux << endl;
                s2.push(s1.top());
                s1.pop();
            }
        }
        else if (i % 3 == 2) {
            // Move the top disk from the auxiliary rod to the destination rod or the source rod
            if (s1.empty() || (!s3.empty() && s3.top() < s1.top())) {
                cout << "Move disk " << s3.top() << " from " << aux << " to " << dest << endl;
                s1.push(s3.top());
                s3.pop();
            }
            else {
                cout << "Move disk " << s1.top() << " from " << aux << " to " << src << endl;
                s3.push(s1.top());
                s1.pop();
            }
        }
        else if (i % 3 == 0) {
            // Move the top disk from the destination rod to the source rod or the auxiliary rod
            if (s2.empty() || (!s3.empty() && s3.top() < s2.top())) {
                cout << "Move disk " << s3.top() << " from " << dest << " to " << src << endl;
                s2.push(s3.top());
                s3.pop();
            }
            else {
                cout << "Move disk " << s2.top() << " from " << dest << " to " << aux << endl;
                s3.push(s2.top());
                s2.pop();
            }
        }
    }
}

int main() {
    int n;
    cout << "Enter the number of disks: ";
    cin >> n;
    cout << "Disks moved using iterative method" << endl;
    towersOfHanoi(n, 'A', 'C', 'B');
    return 0;
}
