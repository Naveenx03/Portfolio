#include <stdio.h>
#include <string.h>
#include <ctype.h>

// Function to reverse a string
void reverseString(char str[]) {
    int n = strlen(str);
    for (int i = 0; i < n / 2; i++) {
        char temp = str[i];
        str[i] = str[n - i - 1];
        str[n - i - 1] = temp;
    }
    printf("Reversed String: %s\n", str);
}

// Function to check palindrome
void checkPalindrome(char str[]) {
    int n = strlen(str);
    int flag = 1;
    for (int i = 0; i < n / 2; i++) {
        if (tolower(str[i]) != tolower(str[n - i - 1])) {
            flag = 0;
            break;
        }
    }
    if (flag) printf("Palindrome: YES\n");
    else printf("Palindrome: NO\n");
}

// Function to count vowels and consonants
void countVowelsConsonants(char str[]) {
    int vowels = 0, consonants = 0;
    for (int i = 0; str[i] != '\0'; i++) {
        char ch = tolower(str[i]);
        if (isalpha(ch)) {
            if (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                vowels++;
            else
                consonants++;
        }
    }
    printf("Vowels: %d, Consonants: %d\n", vowels, consonants);
}

// Main
int main() {
    char str[100];
    int choice;

    printf("Enter a string: ");
    scanf("%[^\n]s", str);  // Reads entire line including spaces

    do {
        printf("\n--- String Utilities ---\n");
        printf("1. Reverse String\n");
        printf("2. Check Palindrome\n");
        printf("3. Count Vowels & Consonants\n");
        printf("4. Find String Length\n");
        printf("5. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                reverseString(str);
                break;
            case 2:
                checkPalindrome(str);
                break;
            case 3:
                countVowelsConsonants(str);
                break;
            case 4:
                printf("Length of string: %d\n", (int)strlen(str));
                break;
            case 5:
                printf("Exiting...\n");
                break;
            default:
                printf("Invalid choice!\n");
        }
    } while (choice != 5);

    return 0;
}
