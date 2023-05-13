#include <iostream>

using namespace std;

// Function to calculate the length of a string
int string_length(char str[]) {
    int i;
    for (i = 0; str[i] != '\0'; i++);
    return i;
}

// Function to concatenate two strings
void string_concatenate(char str1[], char str2[]) {
    int i, j;
    i = string_length(str1);
    for (j = 0; str2[j] != '\0'; j++) {
        str1[i] = str2[j];
        i++;
    }
    str1[i] = '\0';
}

// Function to copy a string
void string_copy(char dest[], char src[]) {
    int i;
    for (i = 0; src[i] != '\0'; i++) {
        dest[i] = src[i];
    }
    dest[i] = '\0';
}

// Function to compare two strings
int string_compare(char str1[], char str2[]) {
    int i;
    for (i = 0; str1[i] != '\0' && str2[i] != '\0'; i++) {
        if (str1[i] != str2[i]) {
            return str1[i] - str2[i];
        }
    }
    return str1[i] - str2[i];
}

// Function to reverse a string
void string_reverse(char str[]) {
    int i, j;
    char temp;
    j = string_length(str) - 1;
    for (i = 0; i < j; i++, j--) {
        temp = str[i];
        str[i] = str[j];
        str[j] = temp;
    }
}

int main() {
    char str1[100], str2[100];
    int choice;

    cout << "Enter a string: ";
    cin.getline(str1, 100);

    cout << "Select a function:\n";
    cout << "1. strlen\n";
    cout << "2. strcat\n";
    cout << "3. strcpy\n";
    cout << "4. strcmp\n";
    cout << "5. strrev\n";
    cout << "Enter your choice: ";
    cin >> choice;

    switch (choice) {
    case 1: // strlen
        cout << "Length of string: " << string_length(str1) << endl;
        break;

    case 2: // strcat
        cout << "Enter a string to concatenate: ";
        cin.ignore(); // Ignore newline character
        cin.getline(str2, 100);
        string_concatenate(str1, str2);
        cout << "Concatenated string: " << str1 << endl;
        break;

    case 3: // strcpy
        cout << "Enter a string to copy: ";
        cin.ignore(); // Ignore newline character
        cin.getline(str2, 100);
        string_copy(str1, str2);
        cout << "Copied string: " << str1 << endl;
        break;

    case 4: // strcmp
        cout << "Enter a string to compare: ";
        cin.ignore(); // Ignore newline character
        cin.getline(str2, 100);
        if (string_compare(str1, str2) == 0)
            cout << "Strings are equal" << endl;
        else
            cout << "Strings are not equal" << endl;
        break;

    case 5: // strrev
        string_reverse(str1);
        cout << str1 << endl;
        break;

    default:
        cout << "Wrong Input Choice!";
        break;
    }

}