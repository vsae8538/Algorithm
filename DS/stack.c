#include <stdio.h>
#include <stdlib.h>

void push(int);
int pop();
void printStack();

struct node{
    int data;
    struct node *next;
};
typedef struct node Node;

Node *top = NULL;

int main(int argc, char *argv[]){
    push(1);
    push(2);
    push(3);
    printStack();
    pop();
    pop();
    printStack();
    return 0;
}

void push(int data){
    Node *pt;

    if((pt = (Node*) malloc(sizeof(Node))) == NULL){
        printf("oom \n");
        exit(1);
    }

    pt->data = data;
    pt->next = top;
    top = pt;
}


int pop(){
    Node pt;
    
    if(top == NULL){
        printf("stack is empty \n");
        exit(1);
    }
    pt = *top;
    free(top);
    top = pt.next;
    return pt.data;
}

void printStack(){
    Node *pt = top;
    while(pt != NULL){
        printf("%d ", pt->data);
        pt = pt->next;
    }
    printf("\n");
}