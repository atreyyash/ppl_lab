#include <iostream>

using namespace std;

// Node class to represent a linked list node
class Node
{
public:
    int data;
    Node *next;
    Node(int data)
    {
        this->data = data;
        next = nullptr;
    }
};

Node *createList()
{
    Node *head = nullptr;
    Node *tail = nullptr;
    int data;
    char choice;
    do
    {
        cout << "Enter a number: ";
        cin >> data;
        Node *newNode = new Node(data);
        if (head == nullptr)
        {
            head = newNode;
            tail = newNode;
        }
        else
        {
            tail->next = newNode;
            tail = newNode;
        }
        cout << "Do you want to add another number? (y/n): ";
        cin >> choice;
    } while (choice == 'y' || choice == 'Y');
    return head;
}

// Function to print a linked list
void printList(Node *head)
{
    Node *current = head;
    while (current != nullptr)
    {
        cout << current->data << " ";
        current = current->next;
    }
    cout << endl;
}

// Function to reverse a linked list iteratively
Node *reverseListIterative(Node *head)
{
    Node *current = head;
    Node *prev = nullptr;
    Node *next = nullptr;
    while (current != nullptr)
    {
        next = current->next;
        current->next = prev;
        prev = current;
        current = next;
    }
    return prev;
}

// Function to reverse a linked list recursively
Node *reverseListRecursive(Node *head)
{
    if (head == nullptr || head->next == nullptr)
    {
        return head;
    }
    Node *newHead = reverseListRecursive(head->next);
    head->next->next = head;
    head->next = nullptr;
    return newHead;
}

int main()
{
    // Create a linked list
    Node *head = createList();

    // Print the original list
    cout << "Original list: ";
    printList(head);

    // Reverse the list iteratively
    Node *reversedIterative = reverseListIterative(head);
    cout << "Reversed list (iterative): ";
    printList(reversedIterative);

    // Reverse the list recursively
    Node *reversedRecursive = reverseListRecursive(reversedIterative);
    cout << "Reversed list (recursive): ";
    printList(reversedRecursive);

    return 0;
}
